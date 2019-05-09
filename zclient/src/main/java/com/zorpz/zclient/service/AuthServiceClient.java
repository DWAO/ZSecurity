package com.zorpz.zclient.service;

import com.zorpz.zclient.entity.JWT;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Punk
 * @date 2019/05/09
 */
@FeignClient(value = "service-auth-jwt", fallback = AuthServiceHystrix.class)
public interface AuthServiceClient {

    @PostMapping("/uaa-jwt/oauth/token")
    JWT getToken(@RequestHeader(value = "Authorization") String authorization,
                 @RequestParam("grant_type") String type,
                 @RequestParam("username") String username,
                 @RequestParam("password") String password) ;
}
