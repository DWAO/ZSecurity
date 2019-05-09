package com.zorpz.zclient.dto;

import com.zorpz.zclient.entity.JWT;
import com.zorpz.zclient.entity.SysUser;
import lombok.Data;

/**
 * @author Punk
 * @date 2019/05/09
 */
@Data
public class UserLoginDTO {
    private JWT jwt;
    private SysUser user;
}
