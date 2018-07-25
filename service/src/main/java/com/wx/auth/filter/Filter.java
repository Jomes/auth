package com.wx.auth.filter;

/**
 * Created by jomeslu on 18-7-25.
 */

public interface Filter<T extends com.google.protobuf.GeneratedMessageV3> {
    boolean isLegalRequest(T message);
}
