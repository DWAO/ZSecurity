package com.zorpz.securiy.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Punk
 * @date 2019/05/08
 */
@Controller
public class SecurityController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

//    @PreAuthorize("hasAuthority('ADMIN')")
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }

    @RequestMapping("/content")
    public String content() {
        return "content";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping("/401")
    public String accessDenied() {
        return "401";
    }
}