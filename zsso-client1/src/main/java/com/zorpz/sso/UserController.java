package com.zorpz.sso;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Punk
 * @date 2019/05/11
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PreAuthorize("hasAuthority('ROLE_USER')")
    @RequestMapping("/test1")
    public String test1() {
        return "test1";
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping("/test2")
    public String test2() {
        return "test2";
    }
}