// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.project.booking.stubs;

/**
 * <pre>
 * Requete pour ajouer une reservation
 * </pre>
 *
 * Protobuf type {@code deleteReservationByIdResponse}
 */
public  final class deleteReservationByIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:deleteReservationByIdResponse)
    deleteReservationByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use deleteReservationByIdResponse.newBuilder() to construct.
  private deleteReservationByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private deleteReservationByIdResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new deleteReservationByIdResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private deleteReservationByIdResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            com.project.booking.stubs.DeleteReservationResult.Builder subBuilder = null;
            if (deleted_ != null) {
              subBuilder = deleted_.toBuilder();
            }
            deleted_ = input.readMessage(com.project.booking.stubs.DeleteReservationResult.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(deleted_);
              deleted_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.project.booking.stubs.ReservationOuterClass.internal_static_deleteReservationByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.project.booking.stubs.ReservationOuterClass.internal_static_deleteReservationByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.project.booking.stubs.deleteReservationByIdResponse.class, com.project.booking.stubs.deleteReservationByIdResponse.Builder.class);
  }

  public static final int DELETED_FIELD_NUMBER = 1;
  private com.project.booking.stubs.DeleteReservationResult deleted_;
  /**
   * <code>.DeleteReservationResult deleted = 1;</code>
   * @return Whether the deleted field is set.
   */
  public boolean hasDeleted() {
    return deleted_ != null;
  }
  /**
   * <code>.DeleteReservationResult deleted = 1;</code>
   * @return The deleted.
   */
  public com.project.booking.stubs.DeleteReservationResult getDeleted() {
    return deleted_ == null ? com.project.booking.stubs.DeleteReservationResult.getDefaultInstance() : deleted_;
  }
  /**
   * <code>.DeleteReservationResult deleted = 1;</code>
   */
  public com.project.booking.stubs.DeleteReservationResultOrBuilder getDeletedOrBuilder() {
    return getDeleted();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (deleted_ != null) {
      output.writeMessage(1, getDeleted());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deleted_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeleted());
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
    if (!(obj instanceof com.project.booking.stubs.deleteReservationByIdResponse)) {
      return super.equals(obj);
    }
    com.project.booking.stubs.deleteReservationByIdResponse other = (com.project.booking.stubs.deleteReservationByIdResponse) obj;

    if (hasDeleted() != other.hasDeleted()) return false;
    if (hasDeleted()) {
      if (!getDeleted()
          .equals(other.getDeleted())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDeleted()) {
      hash = (37 * hash) + DELETED_FIELD_NUMBER;
      hash = (53 * hash) + getDeleted().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.project.booking.stubs.deleteReservationByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.project.booking.stubs.deleteReservationByIdResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Requete pour ajouer une reservation
   * </pre>
   *
   * Protobuf type {@code deleteReservationByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:deleteReservationByIdResponse)
      com.project.booking.stubs.deleteReservationByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.project.booking.stubs.ReservationOuterClass.internal_static_deleteReservationByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.project.booking.stubs.ReservationOuterClass.internal_static_deleteReservationByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.project.booking.stubs.deleteReservationByIdResponse.class, com.project.booking.stubs.deleteReservationByIdResponse.Builder.class);
    }

    // Construct using com.project.booking.stubs.deleteReservationByIdResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deletedBuilder_ == null) {
        deleted_ = null;
      } else {
        deleted_ = null;
        deletedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.project.booking.stubs.ReservationOuterClass.internal_static_deleteReservationByIdResponse_descriptor;
    }

    @java.lang.Override
    public com.project.booking.stubs.deleteReservationByIdResponse getDefaultInstanceForType() {
      return com.project.booking.stubs.deleteReservationByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.project.booking.stubs.deleteReservationByIdResponse build() {
      com.project.booking.stubs.deleteReservationByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.project.booking.stubs.deleteReservationByIdResponse buildPartial() {
      com.project.booking.stubs.deleteReservationByIdResponse result = new com.project.booking.stubs.deleteReservationByIdResponse(this);
      if (deletedBuilder_ == null) {
        result.deleted_ = deleted_;
      } else {
        result.deleted_ = deletedBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.project.booking.stubs.deleteReservationByIdResponse) {
        return mergeFrom((com.project.booking.stubs.deleteReservationByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.project.booking.stubs.deleteReservationByIdResponse other) {
      if (other == com.project.booking.stubs.deleteReservationByIdResponse.getDefaultInstance()) return this;
      if (other.hasDeleted()) {
        mergeDeleted(other.getDeleted());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.project.booking.stubs.deleteReservationByIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.project.booking.stubs.deleteReservationByIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.project.booking.stubs.DeleteReservationResult deleted_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.project.booking.stubs.DeleteReservationResult, com.project.booking.stubs.DeleteReservationResult.Builder, com.project.booking.stubs.DeleteReservationResultOrBuilder> deletedBuilder_;
    /**
     * <code>.DeleteReservationResult deleted = 1;</code>
     * @return Whether the deleted field is set.
     */
    public boolean hasDeleted() {
      return deletedBuilder_ != null || deleted_ != null;
    }
    /**
     * <code>.DeleteReservationResult deleted = 1;</code>
     * @return The deleted.
     */
    public com.project.booking.stubs.DeleteReservationResult getDeleted() {
      if (deletedBuilder_ == null) {
        return deleted_ == null ? com.project.booking.stubs.DeleteReservationResult.getDefaultInstance() : deleted_;
      } else {
        return deletedBuilder_.getMessage();
      }
    }
    /**
     * <code>.DeleteReservationResult deleted = 1;</code>
     */
    public Builder setDeleted(com.project.booking.stubs.DeleteReservationResult value) {
      if (deletedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deleted_ = value;
        onChanged();
      } else {
        deletedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.DeleteReservationResult deleted = 1;</code>
     */
    public Builder setDeleted(
        com.project.booking.stubs.DeleteReservationResult.Builder builderForValue) {
      if (deletedBuilder_ == null) {
        deleted_ = builderForValue.build();
        onChanged();
      } else {
        deletedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.DeleteReservationResult deleted = 1;</code>
     */
    public Builder mergeDeleted(com.project.booking.stubs.DeleteReservationResult value) {
      if (deletedBuilder_ == null) {
        if (deleted_ != null) {
          deleted_ =
            com.project.booking.stubs.DeleteReservationResult.newBuilder(deleted_).mergeFrom(value).buildPartial();
        } else {
          deleted_ = value;
        }
        onChanged();
      } else {
        deletedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.DeleteReservationResult deleted = 1;</code>
     */
    public Builder clearDeleted() {
      if (deletedBuilder_ == null) {
        deleted_ = null;
        onChanged();
      } else {
        deleted_ = null;
        deletedBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.DeleteReservationResult deleted = 1;</code>
     */
    public com.project.booking.stubs.DeleteReservationResult.Builder getDeletedBuilder() {
      
      onChanged();
      return getDeletedFieldBuilder().getBuilder();
    }
    /**
     * <code>.DeleteReservationResult deleted = 1;</code>
     */
    public com.project.booking.stubs.DeleteReservationResultOrBuilder getDeletedOrBuilder() {
      if (deletedBuilder_ != null) {
        return deletedBuilder_.getMessageOrBuilder();
      } else {
        return deleted_ == null ?
            com.project.booking.stubs.DeleteReservationResult.getDefaultInstance() : deleted_;
      }
    }
    /**
     * <code>.DeleteReservationResult deleted = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.project.booking.stubs.DeleteReservationResult, com.project.booking.stubs.DeleteReservationResult.Builder, com.project.booking.stubs.DeleteReservationResultOrBuilder> 
        getDeletedFieldBuilder() {
      if (deletedBuilder_ == null) {
        deletedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.project.booking.stubs.DeleteReservationResult, com.project.booking.stubs.DeleteReservationResult.Builder, com.project.booking.stubs.DeleteReservationResultOrBuilder>(
                getDeleted(),
                getParentForChildren(),
                isClean());
        deleted_ = null;
      }
      return deletedBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:deleteReservationByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:deleteReservationByIdResponse)
  private static final com.project.booking.stubs.deleteReservationByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.project.booking.stubs.deleteReservationByIdResponse();
  }

  public static com.project.booking.stubs.deleteReservationByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<deleteReservationByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<deleteReservationByIdResponse>() {
    @java.lang.Override
    public deleteReservationByIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new deleteReservationByIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<deleteReservationByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<deleteReservationByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.project.booking.stubs.deleteReservationByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

