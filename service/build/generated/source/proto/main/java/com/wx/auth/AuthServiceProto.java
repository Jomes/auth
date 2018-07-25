// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wx_authservice.proto

package com.wx.auth;

public final class AuthServiceProto {
  private AuthServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthService_CommRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthService_CommRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthService_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthService_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthService_RegRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthService_RegRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthService_UserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthService_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthService_CommomReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthService_CommomReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024wx_authservice.proto\022\013AuthService\";\n\013C" +
      "ommRequest\022\014\n\004time\030\001 \001(\t\022\014\n\004sign\030\002 \001(\t\022\020" +
      "\n\010deviceid\030\003 \001(\t\"Y\n\014LoginRequest\022&\n\004comm" +
      "\030\001 \001(\0132\030.AuthService.CommRequest\022\r\n\005phon" +
      "e\030\002 \001(\t\022\022\n\nverifycode\030\003 \001(\005\"\177\n\nRegReques" +
      "t\022&\n\004comm\030\001 \001(\0132\030.AuthService.CommReques" +
      "t\022\r\n\005phone\030\002 \001(\t\022\022\n\nverifycode\030\003 \001(\005\022\014\n\004" +
      "name\030\004 \001(\t\022\n\n\002pw\030\005 \001(\t\022\014\n\004repw\030\006 \001(\t\"y\n\010" +
      "UserInfo\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\r\n\005ph" +
      "one\030\003 \001(\t\022\r\n\005alias\030\004 \001(\t\022\013\n\003sex\030\005 \001(\t\022(\n" +
      "\006common\030\006 \001(\0132\030.AuthService.CommomReply\"" +
      "F\n\013CommomReply\022\r\n\005token\030\001 \001(\t\022\014\n\004time\030\002 " +
      "\001(\t\022\014\n\004sign\030\003 \001(\t\022\014\n\004type\030\004 \001(\0052\210\001\n\013Auth" +
      "Service\022;\n\005Login\022\031.AuthService.LoginRequ" +
      "est\032\025.AuthService.UserInfo\"\000\022<\n\010register" +
      "\022\027.AuthService.RegRequest\032\025.AuthService." +
      "UserInfo\"\000B\'\n\013com.wx.authB\020AuthServicePr" +
      "otoP\001\242\002\003HLWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_AuthService_CommRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AuthService_CommRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthService_CommRequest_descriptor,
        new java.lang.String[] { "Time", "Sign", "Deviceid", });
    internal_static_AuthService_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AuthService_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthService_LoginRequest_descriptor,
        new java.lang.String[] { "Comm", "Phone", "Verifycode", });
    internal_static_AuthService_RegRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AuthService_RegRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthService_RegRequest_descriptor,
        new java.lang.String[] { "Comm", "Phone", "Verifycode", "Name", "Pw", "Repw", });
    internal_static_AuthService_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AuthService_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthService_UserInfo_descriptor,
        new java.lang.String[] { "Id", "Name", "Phone", "Alias", "Sex", "Common", });
    internal_static_AuthService_CommomReply_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_AuthService_CommomReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthService_CommomReply_descriptor,
        new java.lang.String[] { "Token", "Time", "Sign", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}