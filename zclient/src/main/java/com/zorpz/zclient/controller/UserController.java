package com.zorpz.zclient.controller;

import com.zorpz.zclient.dto.UserLoginDTO;
import com.zorpz.zclient.entity.SysUser;
import com.zorpz.zclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Punk
 * @date 2019/05/09
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public SysUser postUser(@RequestParam("username") String username,
                            @RequestParam("password") String password) {
        return userService.register(username, password);
    }

    @PostMapping("/login")
    public UserLoginDTO login( @RequestParam("username") String username,
                               @RequestParam("password") String password) {
        return userService.login(username, password);
    }
}
