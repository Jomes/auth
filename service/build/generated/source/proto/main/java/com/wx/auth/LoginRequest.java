// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wx_authservice.proto

package com.wx.auth;

/**
 * Protobuf type {@code AuthService.LoginRequest}
 */
public  final class LoginRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AuthService.LoginRequest)
    LoginRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoginRequest.newBuilder() to construct.
  private LoginRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoginRequest() {
    phone_ = "";
    verifycode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoginRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.wx.auth.CommRequest.Builder subBuilder = null;
            if (comm_ != null) {
              subBuilder = comm_.toBuilder();
            }
            comm_ = input.readMessage(com.wx.auth.CommRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(comm_);
              comm_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            phone_ = s;
            break;
          }
          case 24: {

            verifycode_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wx.auth.AuthServiceProto.internal_static_AuthService_LoginRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wx.auth.AuthServiceProto.internal_static_AuthService_LoginRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wx.auth.LoginRequest.class, com.wx.auth.LoginRequest.Builder.class);
  }

  public static final int COMM_FIELD_NUMBER = 1;
  private com.wx.auth.CommRequest comm_;
  /**
   * <code>.AuthService.CommRequest comm = 1;</code>
   */
  public boolean hasComm() {
    return comm_ != null;
  }
  /**
   * <code>.AuthService.CommRequest comm = 1;</code>
   */
  public com.wx.auth.CommRequest getComm() {
    return comm_ == null ? com.wx.auth.CommRequest.getDefaultInstance() : comm_;
  }
  /**
   * <code>.AuthService.CommRequest comm = 1;</code>
   */
  public com.wx.auth.CommRequestOrBuilder getCommOrBuilder() {
    return getComm();
  }

  public static final int PHONE_FIELD_NUMBER = 2;
  private volatile java.lang.Object phone_;
  /**
   * <code>string phone = 2;</code>
   */
  public java.lang.String getPhone() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phone_ = s;
      return s;
    }
  }
  /**
   * <code>string phone = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPhoneBytes() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERIFYCODE_FIELD_NUMBER = 3;
  private int verifycode_;
  /**
   * <code>int32 verifycode = 3;</code>
   */
  public int getVerifycode() {
    return verifycode_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (comm_ != null) {
      output.writeMessage(1, getComm());
    }
    if (!getPhoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, phone_);
    }
    if (verifycode_ != 0) {
      output.writeInt32(3, verifycode_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (comm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getComm());
    }
    if (!getPhoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, phone_);
    }
    if (verifycode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, verifycode_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wx.auth.LoginRequest)) {
      return super.equals(obj);
    }
    com.wx.auth.LoginRequest other = (com.wx.auth.LoginRequest) obj;

    boolean result = true;
    result = result && (hasComm() == other.hasComm());
    if (hasComm()) {
      result = result && getComm()
          .equals(other.getComm());
    }
    result = result && getPhone()
        .equals(other.getPhone());
    result = result && (getVerifycode()
        == other.getVerifycode());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasComm()) {
      hash = (37 * hash) + COMM_FIELD_NUMBER;
      hash = (53 * hash) + getComm().hashCode();
    }
    hash = (37 * hash) + PHONE_FIELD_NUMBER;
    hash = (53 * hash) + getPhone().hashCode();
    hash = (37 * hash) + VERIFYCODE_FIELD_NUMBER;
    hash = (53 * hash) + getVerifycode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wx.auth.LoginRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wx.auth.LoginRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wx.auth.LoginRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wx.auth.LoginRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wx.auth.LoginRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wx.auth.LoginRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wx.auth.LoginRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wx.auth.LoginRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wx.auth.LoginRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wx.auth.LoginRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wx.auth.LoginRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wx.auth.LoginRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wx.auth.LoginRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code AuthService.LoginRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AuthService.LoginRequest)
      com.wx.auth.LoginRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wx.auth.AuthServiceProto.internal_static_AuthService_LoginRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wx.auth.AuthServiceProto.internal_static_AuthService_LoginRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wx.auth.LoginRequest.class, com.wx.auth.LoginRequest.Builder.class);
    }

    // Construct using com.wx.auth.LoginRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (commBuilder_ == null) {
        comm_ = null;
      } else {
        comm_ = null;
        commBuilder_ = null;
      }
      phone_ = "";

      verifycode_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wx.auth.AuthServiceProto.internal_static_AuthService_LoginRequest_descriptor;
    }

    public com.wx.auth.LoginRequest getDefaultInstanceForType() {
      return com.wx.auth.LoginRequest.getDefaultInstance();
    }

    public com.wx.auth.LoginRequest build() {
      com.wx.auth.LoginRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wx.auth.LoginRequest buildPartial() {
      com.wx.auth.LoginRequest result = new com.wx.auth.LoginRequest(this);
      if (commBuilder_ == null) {
        result.comm_ = comm_;
      } else {
        result.comm_ = commBuilder_.build();
      }
      result.phone_ = phone_;
      result.verifycode_ = verifycode_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wx.auth.LoginRequest) {
        return mergeFrom((com.wx.auth.LoginRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wx.auth.LoginRequest other) {
      if (other == com.wx.auth.LoginRequest.getDefaultInstance()) return this;
      if (other.hasComm()) {
        mergeComm(other.getComm());
      }
      if (!other.getPhone().isEmpty()) {
        phone_ = other.phone_;
        onChanged();
      }
      if (other.getVerifycode() != 0) {
        setVerifycode(other.getVerifycode());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wx.auth.LoginRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wx.auth.LoginRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.wx.auth.CommRequest comm_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wx.auth.CommRequest, com.wx.auth.CommRequest.Builder, com.wx.auth.CommRequestOrBuilder> commBuilder_;
    /**
     * <code>.AuthService.CommRequest comm = 1;</code>
     */
    public boolean hasComm() {
      return commBuilder_ != null || comm_ != null;
    }
    /**
     * <code>.AuthService.CommRequest comm = 1;</code>
     */
    public com.wx.auth.CommRequest getComm() {
      if (commBuilder_ == null) {
        return comm_ == null ? com.wx.auth.CommRequest.getDefaultInstance() : comm_;
      } else {
        return commBuilder_.getMessage();
      }
    }
    /**
     * <code>.AuthService.CommRequest comm = 1;</code>
     */
    public Builder setComm(com.wx.auth.CommRequest value) {
      if (commBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        comm_ = value;
        onChanged();
      } else {
        commBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.AuthService.CommRequest comm = 1;</code>
     */
    public Builder setComm(
        com.wx.auth.CommRequest.Builder builderForValue) {
      if (commBuilder_ == null) {
        comm_ = builderForValue.build();
        onChanged();
      } else {
        commBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.AuthService.CommRequest comm = 1;</code>
     */
    public Builder mergeComm(com.wx.auth.CommRequest value) {
      if (commBuilder_ == null) {
        if (comm_ != null) {
          comm_ =
            com.wx.auth.CommRequest.newBuilder(comm_).mergeFrom(value).buildPartial();
        } else {
          comm_ = value;
        }
        onChanged();
      } else {
        commBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.AuthService.CommRequest comm = 1;</code>
     */
    public Builder clearComm() {
      if (commBuilder_ == null) {
        comm_ = null;
        onChanged();
      } else {
        comm_ = null;
        commBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.AuthService.CommRequest comm = 1;</code>
     */
    public com.wx.auth.CommRequest.Builder getCommBuilder() {
      
      onChanged();
      return getCommFieldBuilder().getBuilder();
    }
    /**
     * <code>.AuthService.CommRequest comm = 1;</code>
     */
    public com.wx.auth.CommRequestOrBuilder getCommOrBuilder() {
      if (commBuilder_ != null) {
        return commBuilder_.getMessageOrBuilder();
      } else {
        return comm_ == null ?
            com.wx.auth.CommRequest.getDefaultInstance() : comm_;
      }
    }
    /**
     * <code>.AuthService.CommRequest comm = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wx.auth.CommRequest, com.wx.auth.CommRequest.Builder, com.wx.auth.CommRequestOrBuilder> 
        getCommFieldBuilder() {
      if (commBuilder_ == null) {
        commBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.wx.auth.CommRequest, com.wx.auth.CommRequest.Builder, com.wx.auth.CommRequestOrBuilder>(
                getComm(),
                getParentForChildren(),
                isClean());
        comm_ = null;
      }
      return commBuilder_;
    }

    private java.lang.Object phone_ = "";
    /**
     * <code>string phone = 2;</code>
     */
    public java.lang.String getPhone() {
      java.lang.Object ref = phone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string phone = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      java.lang.Object ref = phone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string phone = 2;</code>
     */
    public Builder setPhone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string phone = 2;</code>
     */
    public Builder clearPhone() {
      
      phone_ = getDefaultInstance().getPhone();
      onChanged();
      return this;
    }
    /**
     * <code>string phone = 2;</code>
     */
    public Builder setPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phone_ = value;
      onChanged();
      return this;
    }

    private int verifycode_ ;
    /**
     * <code>int32 verifycode = 3;</code>
     */
    public int getVerifycode() {
      return verifycode_;
    }
    /**
     * <code>int32 verifycode = 3;</code>
     */
    public Builder setVerifycode(int value) {
      
      verifycode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 verifycode = 3;</code>
     */
    public Builder clearVerifycode() {
      
      verifycode_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AuthService.LoginRequest)
  }

  // @@protoc_insertion_point(class_scope:AuthService.LoginRequest)
  private static final com.wx.auth.LoginRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wx.auth.LoginRequest();
  }

  public static com.wx.auth.LoginRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoginRequest>
      PARSER = new com.google.protobuf.AbstractParser<LoginRequest>() {
    public LoginRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoginRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoginRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoginRequest> getParserForType() {
    return PARSER;
  }

  public com.wx.auth.LoginRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
