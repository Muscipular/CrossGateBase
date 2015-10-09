// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Skill.proto

package cg.base.io.proto;

public final class SkillProtos {
  private SkillProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RESPONSE_DOUBLE_EXP_UPDATEOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required bool isDouble = 1;
    /**
     * <code>required bool isDouble = 1;</code>
     */
    boolean hasIsDouble();
    /**
     * <code>required bool isDouble = 1;</code>
     */
    boolean getIsDouble();

    // required int32 time = 2;
    /**
     * <code>required int32 time = 2;</code>
     */
    boolean hasTime();
    /**
     * <code>required int32 time = 2;</code>
     */
    int getTime();
  }
  /**
   * Protobuf type {@code RESPONSE_DOUBLE_EXP_UPDATE}
   */
  public static final class RESPONSE_DOUBLE_EXP_UPDATE extends
      com.google.protobuf.GeneratedMessage
      implements RESPONSE_DOUBLE_EXP_UPDATEOrBuilder {
    // Use RESPONSE_DOUBLE_EXP_UPDATE.newBuilder() to construct.
    private RESPONSE_DOUBLE_EXP_UPDATE(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RESPONSE_DOUBLE_EXP_UPDATE(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RESPONSE_DOUBLE_EXP_UPDATE defaultInstance;
    public static RESPONSE_DOUBLE_EXP_UPDATE getDefaultInstance() {
      return defaultInstance;
    }

    public RESPONSE_DOUBLE_EXP_UPDATE getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RESPONSE_DOUBLE_EXP_UPDATE(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              isDouble_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              time_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cg.base.io.proto.SkillProtos.internal_static_RESPONSE_DOUBLE_EXP_UPDATE_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cg.base.io.proto.SkillProtos.internal_static_RESPONSE_DOUBLE_EXP_UPDATE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE.class, cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE.Builder.class);
    }

    public static com.google.protobuf.Parser<RESPONSE_DOUBLE_EXP_UPDATE> PARSER =
        new com.google.protobuf.AbstractParser<RESPONSE_DOUBLE_EXP_UPDATE>() {
      public RESPONSE_DOUBLE_EXP_UPDATE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RESPONSE_DOUBLE_EXP_UPDATE(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RESPONSE_DOUBLE_EXP_UPDATE> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required bool isDouble = 1;
    public static final int ISDOUBLE_FIELD_NUMBER = 1;
    private boolean isDouble_;
    /**
     * <code>required bool isDouble = 1;</code>
     */
    public boolean hasIsDouble() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool isDouble = 1;</code>
     */
    public boolean getIsDouble() {
      return isDouble_;
    }

    // required int32 time = 2;
    public static final int TIME_FIELD_NUMBER = 2;
    private int time_;
    /**
     * <code>required int32 time = 2;</code>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 time = 2;</code>
     */
    public int getTime() {
      return time_;
    }

    private void initFields() {
      isDouble_ = false;
      time_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasIsDouble()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, isDouble_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, time_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isDouble_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, time_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RESPONSE_DOUBLE_EXP_UPDATE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cg.base.io.proto.SkillProtos.internal_static_RESPONSE_DOUBLE_EXP_UPDATE_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cg.base.io.proto.SkillProtos.internal_static_RESPONSE_DOUBLE_EXP_UPDATE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE.class, cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE.Builder.class);
      }

      // Construct using cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        isDouble_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cg.base.io.proto.SkillProtos.internal_static_RESPONSE_DOUBLE_EXP_UPDATE_descriptor;
      }

      public cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE getDefaultInstanceForType() {
        return cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE.getDefaultInstance();
      }

      public cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE build() {
        cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE buildPartial() {
        cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE result = new cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isDouble_ = isDouble_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.time_ = time_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE) {
          return mergeFrom((cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE other) {
        if (other == cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE.getDefaultInstance()) return this;
        if (other.hasIsDouble()) {
          setIsDouble(other.getIsDouble());
        }
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasIsDouble()) {
          
          return false;
        }
        if (!hasTime()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cg.base.io.proto.SkillProtos.RESPONSE_DOUBLE_EXP_UPDATE) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required bool isDouble = 1;
      private boolean isDouble_ ;
      /**
       * <code>required bool isDouble = 1;</code>
       */
      public boolean hasIsDouble() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool isDouble = 1;</code>
       */
      public boolean getIsDouble() {
        return isDouble_;
      }
      /**
       * <code>required bool isDouble = 1;</code>
       */
      public Builder setIsDouble(boolean value) {
        bitField0_ |= 0x00000001;
        isDouble_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool isDouble = 1;</code>
       */
      public Builder clearIsDouble() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isDouble_ = false;
        onChanged();
        return this;
      }

      // required int32 time = 2;
      private int time_ ;
      /**
       * <code>required int32 time = 2;</code>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 time = 2;</code>
       */
      public int getTime() {
        return time_;
      }
      /**
       * <code>required int32 time = 2;</code>
       */
      public Builder setTime(int value) {
        bitField0_ |= 0x00000002;
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 time = 2;</code>
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        time_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:RESPONSE_DOUBLE_EXP_UPDATE)
    }

    static {
      defaultInstance = new RESPONSE_DOUBLE_EXP_UPDATE(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RESPONSE_DOUBLE_EXP_UPDATE)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_RESPONSE_DOUBLE_EXP_UPDATE_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RESPONSE_DOUBLE_EXP_UPDATE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Skill.proto\";\n\031RESPONSE_DOUBLE_EXP_UPDA" +
      "TE\022\020\n\010isDouble\030\001 \002(\010\022\014\n\004time\030\002 \002(\005B\037\n\020cg" +
      ".base.io.protoB\013SkillProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_RESPONSE_DOUBLE_EXP_UPDATE_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_RESPONSE_DOUBLE_EXP_UPDATE_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_RESPONSE_DOUBLE_EXP_UPDATE_descriptor,
              new java.lang.String[] { "IsDouble", "Time", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}