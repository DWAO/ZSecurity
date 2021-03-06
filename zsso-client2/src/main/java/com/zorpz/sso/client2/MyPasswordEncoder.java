package com.zorpz.sso.client2;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Punk
 * @date 2019/05/11
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
