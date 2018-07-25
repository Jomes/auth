package com.wx.auth.filter;

import com.wx.auth.LoginRequest;

/**
 * Created by jomeslu on 18-7-25.
 */

public class LoginFilter implements Filter<LoginRequest> {

    @Override
    public boolean isLegalRequest(LoginRequest message) {
        //过滤非法字符 TODO
        //验证sing是否合法 TODO
        return false;
    }
}
