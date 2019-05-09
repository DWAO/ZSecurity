package com.zorpz.zclient.service;

import com.zorpz.zclient.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * @author Punk
 * @date 2019/05/09
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient{


    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        return null;
    }
}
