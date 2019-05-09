package com.zorpz.zuaajwt.service;

import com.zorpz.zuaajwt.entity.SysUser;
import com.zorpz.zuaajwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Punk
 * @date 2019/04/24
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findSysUserByUsername(username);
    }

    public void save(SysUser user) {
        repository.save(user);
    }
}
