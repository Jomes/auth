package com.wx.auth.filter;

import com.wx.auth.*;

/**
 * Created by jomeslu on 18-7-25.
 */

public class RegisterFilter implements Filter<RegRequest> {
    @Override
    public boolean isLegalRequest(RegRequest message) {
        //过滤非法字符 TODO
        //验证sing是否合法 TODO
        return false;
    }
}
