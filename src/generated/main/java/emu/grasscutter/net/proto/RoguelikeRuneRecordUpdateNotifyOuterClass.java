// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeRuneRecordUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class RoguelikeRuneRecordUpdateNotifyOuterClass {
  private RoguelikeRuneRecordUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeRuneRecordUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeRuneRecordUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord> 
        getRuneRecordListList();
    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord getRuneRecordList(int index);
    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    int getRuneRecordListCount();
    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder> 
        getRuneRecordListOrBuilderList();
    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder getRuneRecordListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 8615
   * Obf: LCHKGPJIKIF
   * </pre>
   *
   * Protobuf type {@code RoguelikeRuneRecordUpdateNotify}
   */
  public static final class RoguelikeRuneRecordUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeRuneRecordUpdateNotify)
      RoguelikeRuneRecordUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeRuneRecordUpdateNotify.newBuilder() to construct.
    private RoguelikeRuneRecordUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeRuneRecordUpdateNotify() {
      runeRecordList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeRuneRecordUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeRuneRecordUpdateNotify(
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
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                runeRecordList_ = new java.util.ArrayList<emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord>();
                mutable_bitField0_ |= 0x00000001;
              }
              runeRecordList_.add(
                  input.readMessage(emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          runeRecordList_ = java.util.Collections.unmodifiableList(runeRecordList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.internal_static_RoguelikeRuneRecordUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.internal_static_RoguelikeRuneRecordUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify.class, emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify.Builder.class);
    }

    public static final int RUNE_RECORD_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord> runeRecordList_;
    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord> getRuneRecordListList() {
      return runeRecordList_;
    }
    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder> 
        getRuneRecordListOrBuilderList() {
      return runeRecordList_;
    }
    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    @java.lang.Override
    public int getRuneRecordListCount() {
      return runeRecordList_.size();
    }
    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord getRuneRecordList(int index) {
      return runeRecordList_.get(index);
    }
    /**
     * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder getRuneRecordListOrBuilder(
        int index) {
      return runeRecordList_.get(index);
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
      for (int i = 0; i < runeRecordList_.size(); i++) {
        output.writeMessage(7, runeRecordList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < runeRecordList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, runeRecordList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify other = (emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify) obj;

      if (!getRuneRecordListList()
          .equals(other.getRuneRecordListList())) return false;
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
      if (getRuneRecordListCount() > 0) {
        hash = (37 * hash) + RUNE_RECORD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRuneRecordListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify prototype) {
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
     * CmdId: 8615
     * Obf: LCHKGPJIKIF
     * </pre>
     *
     * Protobuf type {@code RoguelikeRuneRecordUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeRuneRecordUpdateNotify)
        emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.internal_static_RoguelikeRuneRecordUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.internal_static_RoguelikeRuneRecordUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify.class, emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify.newBuilder()
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
          getRuneRecordListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (runeRecordListBuilder_ == null) {
          runeRecordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          runeRecordListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.internal_static_RoguelikeRuneRecordUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify build() {
        emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify result = new emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        if (runeRecordListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            runeRecordList_ = java.util.Collections.unmodifiableList(runeRecordList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.runeRecordList_ = runeRecordList_;
        } else {
          result.runeRecordList_ = runeRecordListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify.getDefaultInstance()) return this;
        if (runeRecordListBuilder_ == null) {
          if (!other.runeRecordList_.isEmpty()) {
            if (runeRecordList_.isEmpty()) {
              runeRecordList_ = other.runeRecordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRuneRecordListIsMutable();
              runeRecordList_.addAll(other.runeRecordList_);
            }
            onChanged();
          }
        } else {
          if (!other.runeRecordList_.isEmpty()) {
            if (runeRecordListBuilder_.isEmpty()) {
              runeRecordListBuilder_.dispose();
              runeRecordListBuilder_ = null;
              runeRecordList_ = other.runeRecordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              runeRecordListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRuneRecordListFieldBuilder() : null;
            } else {
              runeRecordListBuilder_.addAllMessages(other.runeRecordList_);
            }
          }
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
        emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord> runeRecordList_ =
        java.util.Collections.emptyList();
      private void ensureRuneRecordListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          runeRecordList_ = new java.util.ArrayList<emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord>(runeRecordList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder> runeRecordListBuilder_;

      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord> getRuneRecordListList() {
        if (runeRecordListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(runeRecordList_);
        } else {
          return runeRecordListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public int getRuneRecordListCount() {
        if (runeRecordListBuilder_ == null) {
          return runeRecordList_.size();
        } else {
          return runeRecordListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord getRuneRecordList(int index) {
        if (runeRecordListBuilder_ == null) {
          return runeRecordList_.get(index);
        } else {
          return runeRecordListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public Builder setRuneRecordList(
          int index, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord value) {
        if (runeRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRuneRecordListIsMutable();
          runeRecordList_.set(index, value);
          onChanged();
        } else {
          runeRecordListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public Builder setRuneRecordList(
          int index, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder builderForValue) {
        if (runeRecordListBuilder_ == null) {
          ensureRuneRecordListIsMutable();
          runeRecordList_.set(index, builderForValue.build());
          onChanged();
        } else {
          runeRecordListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public Builder addRuneRecordList(emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord value) {
        if (runeRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRuneRecordListIsMutable();
          runeRecordList_.add(value);
          onChanged();
        } else {
          runeRecordListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public Builder addRuneRecordList(
          int index, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord value) {
        if (runeRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRuneRecordListIsMutable();
          runeRecordList_.add(index, value);
          onChanged();
        } else {
          runeRecordListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public Builder addRuneRecordList(
          emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder builderForValue) {
        if (runeRecordListBuilder_ == null) {
          ensureRuneRecordListIsMutable();
          runeRecordList_.add(builderForValue.build());
          onChanged();
        } else {
          runeRecordListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public Builder addRuneRecordList(
          int index, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder builderForValue) {
        if (runeRecordListBuilder_ == null) {
          ensureRuneRecordListIsMutable();
          runeRecordList_.add(index, builderForValue.build());
          onChanged();
        } else {
          runeRecordListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public Builder addAllRuneRecordList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord> values) {
        if (runeRecordListBuilder_ == null) {
          ensureRuneRecordListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, runeRecordList_);
          onChanged();
        } else {
          runeRecordListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public Builder clearRuneRecordList() {
        if (runeRecordListBuilder_ == null) {
          runeRecordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          runeRecordListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public Builder removeRuneRecordList(int index) {
        if (runeRecordListBuilder_ == null) {
          ensureRuneRecordListIsMutable();
          runeRecordList_.remove(index);
          onChanged();
        } else {
          runeRecordListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder getRuneRecordListBuilder(
          int index) {
        return getRuneRecordListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder getRuneRecordListOrBuilder(
          int index) {
        if (runeRecordListBuilder_ == null) {
          return runeRecordList_.get(index);  } else {
          return runeRecordListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder> 
           getRuneRecordListOrBuilderList() {
        if (runeRecordListBuilder_ != null) {
          return runeRecordListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(runeRecordList_);
        }
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder addRuneRecordListBuilder() {
        return getRuneRecordListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder addRuneRecordListBuilder(
          int index) {
        return getRuneRecordListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .RoguelikeRuneRecord rune_record_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder> 
           getRuneRecordListBuilderList() {
        return getRuneRecordListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder> 
          getRuneRecordListFieldBuilder() {
        if (runeRecordListBuilder_ == null) {
          runeRecordListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder, emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder>(
                  runeRecordList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          runeRecordList_ = null;
        }
        return runeRecordListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeRuneRecordUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeRuneRecordUpdateNotify)
    private static final emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify();
    }

    public static emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeRuneRecordUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeRuneRecordUpdateNotify>() {
      @java.lang.Override
      public RoguelikeRuneRecordUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeRuneRecordUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeRuneRecordUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeRuneRecordUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RoguelikeRuneRecordUpdateNotifyOuterClass.RoguelikeRuneRecordUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeRuneRecordUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeRuneRecordUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%RoguelikeRuneRecordUpdateNotify.proto\032" +
      "\031RoguelikeRuneRecord.proto\"Q\n\037RoguelikeR" +
      "uneRecordUpdateNotify\022.\n\020rune_record_lis" +
      "t\030\007 \003(\0132\024.RoguelikeRuneRecordB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.getDescriptor(),
        });
    internal_static_RoguelikeRuneRecordUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeRuneRecordUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeRuneRecordUpdateNotify_descriptor,
        new java.lang.String[] { "RuneRecordList", });
    emu.grasscutter.net.proto.RoguelikeRuneRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}