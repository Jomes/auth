// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wx_authservice.proto

package com.wx.auth;

public interface RegRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AuthService.RegRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.AuthService.CommRequest comm = 1;</code>
   */
  boolean hasComm();
  /**
   * <code>.AuthService.CommRequest comm = 1;</code>
   */
  com.wx.auth.CommRequest getComm();
  /**
   * <code>.AuthService.CommRequest comm = 1;</code>
   */
  com.wx.auth.CommRequestOrBuilder getCommOrBuilder();

  /**
   * <code>string phone = 2;</code>
   */
  java.lang.String getPhone();
  /**
   * <code>string phone = 2;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <code>int32 verifycode = 3;</code>
   */
  int getVerifycode();

  /**
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string pw = 5;</code>
   */
  java.lang.String getPw();
  /**
   * <code>string pw = 5;</code>
   */
  com.google.protobuf.ByteString
      getPwBytes();

  /**
   * <code>string repw = 6;</code>
   */
  java.lang.String getRepw();
  /**
   * <code>string repw = 6;</code>
   */
  com.google.protobuf.ByteString
      getRepwBytes();
}