package com.zorpz.zclient.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Punk
 * @date 2019/05/09
 */
@RestController
@RequestMapping("/foo")
public class WebController {

    @GetMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String getFoo() {
        return "admin page";
    }
}
