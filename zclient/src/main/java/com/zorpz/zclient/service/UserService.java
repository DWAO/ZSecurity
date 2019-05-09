package com.zorpz.zclient.service;

import com.zorpz.zclient.dto.UserLoginDTO;
import com.zorpz.zclient.entity.JWT;
import com.zorpz.zclient.entity.SysUser;
import com.zorpz.zclient.exception.UserLoginException;
import com.zorpz.zclient.repository.UserRepository;
import com.zorpz.zclient.util.PasswordEncodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;

/**
 * @author Punk
 * @date 2019/04/24
 */
@Service
public class UserService  {

    @Autowired
    private UserRepository repository;

    public SysUser register(String username, String password) {
        SysUser user = new SysUser();
        user.setUsername(username);
        user.setPassword(PasswordEncodeUtil.encode(password));
        return repository.save(user);
    }

    // feign 的客户端
    @Autowired
    private AuthServiceClient client;

    public UserLoginDTO login(String username, String password) {
        SysUser user = repository.findSysUserByUsername(username);
        if (null == user) {
            throw new UserLoginException("error username");
        }
        if (!PasswordEncodeUtil.matches(password, user.getPassword())) {
            throw new UserLoginException("error password");
        }
        // 第一个参数用 clientname:secret 做base 64 加密
        JWT jwt = client.getToken("Basic dXNlci1zZXJ2aWNlOjEyMzQ1Ng==", "password", username, password);
        if (jwt==null) {
            throw new UserLoginException("error Internal");
        }
        UserLoginDTO userLoginDTO = new UserLoginDTO();
        userLoginDTO.setJwt(jwt);
        userLoginDTO.setUser(user);
        return userLoginDTO;
    }

    public static void main(String[] args) {
        System.out.println(new String(Base64.getEncoder().encode("user-service:123456".getBytes())));
    }
}
