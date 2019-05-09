package com.zorpz.zclient.entity;

import lombok.Data;

/**
 * @author Punk
 * @date 2019/05/09
 */
@Data
public class JWT {

    private String accessToken;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private String jti;
}
