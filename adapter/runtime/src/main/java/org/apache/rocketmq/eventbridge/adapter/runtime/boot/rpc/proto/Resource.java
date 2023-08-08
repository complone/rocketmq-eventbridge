package org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto;

public final class Resource {
  private Resource() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code AllocateStrategy}
   */
  public enum AllocateStrategy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ROUND_ROBIN = 0;</code>
     */
    ROUND_ROBIN(0),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ROUND_ROBIN = 0;</code>
     */
    public static final int ROUND_ROBIN_VALUE = 0;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static AllocateStrategy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AllocateStrategy forNumber(int value) {
      switch (value) {
        case 0: return ROUND_ROBIN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AllocateStrategy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AllocateStrategy> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AllocateStrategy>() {
            public AllocateStrategy findValueByNumber(int number) {
              return AllocateStrategy.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Resource.getDescriptor().getEnumTypes().get(0);
    }

    private static final AllocateStrategy[] VALUES = values();

    public static AllocateStrategy valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AllocateStrategy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AllocateStrategy)
  }

  public interface RequireResourceRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequireResourceRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string requireId = 1;</code>
     * @return The requireId.
     */
    String getRequireId();
    /**
     * <code>string requireId = 1;</code>
     * @return The bytes for requireId.
     */
    com.google.protobuf.ByteString
        getRequireIdBytes();

    /**
     * <code>int32 workersNum = 2;</code>
     * @return The workersNum.
     */
    int getWorkersNum();

    /**
     * <code>.AllocateStrategy allocStrategy = 3;</code>
     * @return The enum numeric value on the wire for allocStrategy.
     */
    int getAllocStrategyValue();
    /**
     * <code>.AllocateStrategy allocStrategy = 3;</code>
     * @return The allocStrategy.
     */
    AllocateStrategy getAllocStrategy();
  }
  /**
   * Protobuf type {@code RequireResourceRequest}
   */
  public static final class RequireResourceRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequireResourceRequest)
      RequireResourceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequireResourceRequest.newBuilder() to construct.
    private RequireResourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequireResourceRequest() {
      requireId_ = "";
      allocStrategy_ = 0;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new RequireResourceRequest();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequireResourceRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              String s = input.readStringRequireUtf8();

              requireId_ = s;
              break;
            }
            case 16: {

              workersNum_ = input.readInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              allocStrategy_ = rawValue;
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
      return Resource.internal_static_RequireResourceRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Resource.internal_static_RequireResourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequireResourceRequest.class, Builder.class);
    }

    public static final int REQUIREID_FIELD_NUMBER = 1;
    private volatile Object requireId_;
    /**
     * <code>string requireId = 1;</code>
     * @return The requireId.
     */
    @Override
    public String getRequireId() {
      Object ref = requireId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        requireId_ = s;
        return s;
      }
    }
    /**
     * <code>string requireId = 1;</code>
     * @return The bytes for requireId.
     */
    @Override
    public com.google.protobuf.ByteString
        getRequireIdBytes() {
      Object ref = requireId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        requireId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WORKERSNUM_FIELD_NUMBER = 2;
    private int workersNum_;
    /**
     * <code>int32 workersNum = 2;</code>
     * @return The workersNum.
     */
    @Override
    public int getWorkersNum() {
      return workersNum_;
    }

    public static final int ALLOCSTRATEGY_FIELD_NUMBER = 3;
    private int allocStrategy_;
    /**
     * <code>.AllocateStrategy allocStrategy = 3;</code>
     * @return The enum numeric value on the wire for allocStrategy.
     */
    @Override public int getAllocStrategyValue() {
      return allocStrategy_;
    }
    /**
     * <code>.AllocateStrategy allocStrategy = 3;</code>
     * @return The allocStrategy.
     */
    @Override public AllocateStrategy getAllocStrategy() {
      @SuppressWarnings("deprecation")
      AllocateStrategy result = AllocateStrategy.valueOf(allocStrategy_);
      return result == null ? AllocateStrategy.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getRequireIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requireId_);
      }
      if (workersNum_ != 0) {
        output.writeInt32(2, workersNum_);
      }
      if (allocStrategy_ != AllocateStrategy.ROUND_ROBIN.getNumber()) {
        output.writeEnum(3, allocStrategy_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRequireIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requireId_);
      }
      if (workersNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, workersNum_);
      }
      if (allocStrategy_ != AllocateStrategy.ROUND_ROBIN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, allocStrategy_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequireResourceRequest)) {
        return super.equals(obj);
      }
      RequireResourceRequest other = (RequireResourceRequest) obj;

      if (!getRequireId()
          .equals(other.getRequireId())) return false;
      if (getWorkersNum()
          != other.getWorkersNum()) return false;
      if (allocStrategy_ != other.allocStrategy_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REQUIREID_FIELD_NUMBER;
      hash = (53 * hash) + getRequireId().hashCode();
      hash = (37 * hash) + WORKERSNUM_FIELD_NUMBER;
      hash = (53 * hash) + getWorkersNum();
      hash = (37 * hash) + ALLOCSTRATEGY_FIELD_NUMBER;
      hash = (53 * hash) + allocStrategy_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequireResourceRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequireResourceRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequireResourceRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequireResourceRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequireResourceRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequireResourceRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequireResourceRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequireResourceRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequireResourceRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequireResourceRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequireResourceRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequireResourceRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequireResourceRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequireResourceRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequireResourceRequest)
        RequireResourceRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Resource.internal_static_RequireResourceRequest_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Resource.internal_static_RequireResourceRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequireResourceRequest.class, Builder.class);
      }

      // Construct using com.antgroup.geaflow.rpc.proto.Resource.RequireResourceRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        requireId_ = "";

        workersNum_ = 0;

        allocStrategy_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Resource.internal_static_RequireResourceRequest_descriptor;
      }

      @Override
      public RequireResourceRequest getDefaultInstanceForType() {
        return RequireResourceRequest.getDefaultInstance();
      }

      @Override
      public RequireResourceRequest build() {
        RequireResourceRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequireResourceRequest buildPartial() {
        RequireResourceRequest result = new RequireResourceRequest(this);
        result.requireId_ = requireId_;
        result.workersNum_ = workersNum_;
        result.allocStrategy_ = allocStrategy_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequireResourceRequest) {
          return mergeFrom((RequireResourceRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequireResourceRequest other) {
        if (other == RequireResourceRequest.getDefaultInstance()) return this;
        if (!other.getRequireId().isEmpty()) {
          requireId_ = other.requireId_;
          onChanged();
        }
        if (other.getWorkersNum() != 0) {
          setWorkersNum(other.getWorkersNum());
        }
        if (other.allocStrategy_ != 0) {
          setAllocStrategyValue(other.getAllocStrategyValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequireResourceRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequireResourceRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object requireId_ = "";
      /**
       * <code>string requireId = 1;</code>
       * @return The requireId.
       */
      public String getRequireId() {
        Object ref = requireId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          requireId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string requireId = 1;</code>
       * @return The bytes for requireId.
       */
      public com.google.protobuf.ByteString
          getRequireIdBytes() {
        Object ref = requireId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          requireId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string requireId = 1;</code>
       * @param value The requireId to set.
       * @return This builder for chaining.
       */
      public Builder setRequireId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        requireId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string requireId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequireId() {
        
        requireId_ = getDefaultInstance().getRequireId();
        onChanged();
        return this;
      }
      /**
       * <code>string requireId = 1;</code>
       * @param value The bytes for requireId to set.
       * @return This builder for chaining.
       */
      public Builder setRequireIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        requireId_ = value;
        onChanged();
        return this;
      }

      private int workersNum_ ;
      /**
       * <code>int32 workersNum = 2;</code>
       * @return The workersNum.
       */
      @Override
      public int getWorkersNum() {
        return workersNum_;
      }
      /**
       * <code>int32 workersNum = 2;</code>
       * @param value The workersNum to set.
       * @return This builder for chaining.
       */
      public Builder setWorkersNum(int value) {
        
        workersNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 workersNum = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearWorkersNum() {
        
        workersNum_ = 0;
        onChanged();
        return this;
      }

      private int allocStrategy_ = 0;
      /**
       * <code>.AllocateStrategy allocStrategy = 3;</code>
       * @return The enum numeric value on the wire for allocStrategy.
       */
      @Override public int getAllocStrategyValue() {
        return allocStrategy_;
      }
      /**
       * <code>.AllocateStrategy allocStrategy = 3;</code>
       * @param value The enum numeric value on the wire for allocStrategy to set.
       * @return This builder for chaining.
       */
      public Builder setAllocStrategyValue(int value) {
        
        allocStrategy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.AllocateStrategy allocStrategy = 3;</code>
       * @return The allocStrategy.
       */
      @Override
      public AllocateStrategy getAllocStrategy() {
        @SuppressWarnings("deprecation")
        AllocateStrategy result = AllocateStrategy.valueOf(allocStrategy_);
        return result == null ? AllocateStrategy.UNRECOGNIZED : result;
      }
      /**
       * <code>.AllocateStrategy allocStrategy = 3;</code>
       * @param value The allocStrategy to set.
       * @return This builder for chaining.
       */
      public Builder setAllocStrategy(AllocateStrategy value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        allocStrategy_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.AllocateStrategy allocStrategy = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAllocStrategy() {
        
        allocStrategy_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequireResourceRequest)
    }

    // @@protoc_insertion_point(class_scope:RequireResourceRequest)
    private static final RequireResourceRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequireResourceRequest();
    }

    public static RequireResourceRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequireResourceRequest>
        PARSER = new com.google.protobuf.AbstractParser<RequireResourceRequest>() {
      @Override
      public RequireResourceRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequireResourceRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequireResourceRequest> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequireResourceRequest> getParserForType() {
      return PARSER;
    }

    @Override
    public RequireResourceRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequireResourceResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequireResourceResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string requireId = 1;</code>
     * @return The requireId.
     */
    String getRequireId();
    /**
     * <code>string requireId = 1;</code>
     * @return The bytes for requireId.
     */
    com.google.protobuf.ByteString
        getRequireIdBytes();

    /**
     * <code>bool success = 2;</code>
     * @return The success.
     */
    boolean getSuccess();

    /**
     * <code>string msg = 3;</code>
     * @return The msg.
     */
    String getMsg();
    /**
     * <code>string msg = 3;</code>
     * @return The bytes for msg.
     */
    com.google.protobuf.ByteString
        getMsgBytes();

    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    java.util.List<Worker>
        getWorkerList();
    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    Worker getWorker(int index);
    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    int getWorkerCount();
    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    java.util.List<? extends WorkerOrBuilder>
        getWorkerOrBuilderList();
    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    WorkerOrBuilder getWorkerOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code RequireResourceResponse}
   */
  public static final class RequireResourceResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequireResourceResponse)
      RequireResourceResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequireResourceResponse.newBuilder() to construct.
    private RequireResourceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequireResourceResponse() {
      requireId_ = "";
      msg_ = "";
      worker_ = java.util.Collections.emptyList();
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new RequireResourceResponse();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequireResourceResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              requireId_ = s;
              break;
            }
            case 16: {

              success_ = input.readBool();
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              msg_ = s;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                worker_ = new java.util.ArrayList<Worker>();
                mutable_bitField0_ |= 0x00000001;
              }
              worker_.add(
                  input.readMessage(Worker.parser(), extensionRegistry));
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
          worker_ = java.util.Collections.unmodifiableList(worker_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Resource.internal_static_RequireResourceResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Resource.internal_static_RequireResourceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequireResourceResponse.class, Builder.class);
    }

    public static final int REQUIREID_FIELD_NUMBER = 1;
    private volatile Object requireId_;
    /**
     * <code>string requireId = 1;</code>
     * @return The requireId.
     */
    @Override
    public String getRequireId() {
      Object ref = requireId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        requireId_ = s;
        return s;
      }
    }
    /**
     * <code>string requireId = 1;</code>
     * @return The bytes for requireId.
     */
    @Override
    public com.google.protobuf.ByteString
        getRequireIdBytes() {
      Object ref = requireId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        requireId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUCCESS_FIELD_NUMBER = 2;
    private boolean success_;
    /**
     * <code>bool success = 2;</code>
     * @return The success.
     */
    @Override
    public boolean getSuccess() {
      return success_;
    }

    public static final int MSG_FIELD_NUMBER = 3;
    private volatile Object msg_;
    /**
     * <code>string msg = 3;</code>
     * @return The msg.
     */
    @Override
    public String getMsg() {
      Object ref = msg_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      }
    }
    /**
     * <code>string msg = 3;</code>
     * @return The bytes for msg.
     */
    @Override
    public com.google.protobuf.ByteString
        getMsgBytes() {
      Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WORKER_FIELD_NUMBER = 4;
    private java.util.List<Worker> worker_;
    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    @Override
    public java.util.List<Worker> getWorkerList() {
      return worker_;
    }
    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    @Override
    public java.util.List<? extends WorkerOrBuilder>
        getWorkerOrBuilderList() {
      return worker_;
    }
    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    @Override
    public int getWorkerCount() {
      return worker_.size();
    }
    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    @Override
    public Worker getWorker(int index) {
      return worker_.get(index);
    }
    /**
     * <code>repeated .Worker worker = 4;</code>
     */
    @Override
    public WorkerOrBuilder getWorkerOrBuilder(
        int index) {
      return worker_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getRequireIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requireId_);
      }
      if (success_ != false) {
        output.writeBool(2, success_);
      }
      if (!getMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msg_);
      }
      for (int i = 0; i < worker_.size(); i++) {
        output.writeMessage(4, worker_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRequireIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requireId_);
      }
      if (success_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, success_);
      }
      if (!getMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msg_);
      }
      for (int i = 0; i < worker_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, worker_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequireResourceResponse)) {
        return super.equals(obj);
      }
      RequireResourceResponse other = (RequireResourceResponse) obj;

      if (!getRequireId()
          .equals(other.getRequireId())) return false;
      if (getSuccess()
          != other.getSuccess()) return false;
      if (!getMsg()
          .equals(other.getMsg())) return false;
      if (!getWorkerList()
          .equals(other.getWorkerList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REQUIREID_FIELD_NUMBER;
      hash = (53 * hash) + getRequireId().hashCode();
      hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSuccess());
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
      if (getWorkerCount() > 0) {
        hash = (37 * hash) + WORKER_FIELD_NUMBER;
        hash = (53 * hash) + getWorkerList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequireResourceResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequireResourceResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequireResourceResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequireResourceResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequireResourceResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequireResourceResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequireResourceResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequireResourceResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequireResourceResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequireResourceResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequireResourceResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequireResourceResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequireResourceResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RequireResourceResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequireResourceResponse)
        RequireResourceResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Resource.internal_static_RequireResourceResponse_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Resource.internal_static_RequireResourceResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequireResourceResponse.class, Builder.class);
      }

      // Construct using com.antgroup.geaflow.rpc.proto.Resource.RequireResourceResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getWorkerFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        requireId_ = "";

        success_ = false;

        msg_ = "";

        if (workerBuilder_ == null) {
          worker_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          workerBuilder_.clear();
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Resource.internal_static_RequireResourceResponse_descriptor;
      }

      @Override
      public RequireResourceResponse getDefaultInstanceForType() {
        return RequireResourceResponse.getDefaultInstance();
      }

      @Override
      public RequireResourceResponse build() {
        RequireResourceResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RequireResourceResponse buildPartial() {
        RequireResourceResponse result = new RequireResourceResponse(this);
        int from_bitField0_ = bitField0_;
        result.requireId_ = requireId_;
        result.success_ = success_;
        result.msg_ = msg_;
        if (workerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            worker_ = java.util.Collections.unmodifiableList(worker_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.worker_ = worker_;
        } else {
          result.worker_ = workerBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequireResourceResponse) {
          return mergeFrom((RequireResourceResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequireResourceResponse other) {
        if (other == RequireResourceResponse.getDefaultInstance()) return this;
        if (!other.getRequireId().isEmpty()) {
          requireId_ = other.requireId_;
          onChanged();
        }
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        if (!other.getMsg().isEmpty()) {
          msg_ = other.msg_;
          onChanged();
        }
        if (workerBuilder_ == null) {
          if (!other.worker_.isEmpty()) {
            if (worker_.isEmpty()) {
              worker_ = other.worker_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureWorkerIsMutable();
              worker_.addAll(other.worker_);
            }
            onChanged();
          }
        } else {
          if (!other.worker_.isEmpty()) {
            if (workerBuilder_.isEmpty()) {
              workerBuilder_.dispose();
              workerBuilder_ = null;
              worker_ = other.worker_;
              bitField0_ = (bitField0_ & ~0x00000001);
              workerBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getWorkerFieldBuilder() : null;
            } else {
              workerBuilder_.addAllMessages(other.worker_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequireResourceResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequireResourceResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object requireId_ = "";
      /**
       * <code>string requireId = 1;</code>
       * @return The requireId.
       */
      public String getRequireId() {
        Object ref = requireId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          requireId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string requireId = 1;</code>
       * @return The bytes for requireId.
       */
      public com.google.protobuf.ByteString
          getRequireIdBytes() {
        Object ref = requireId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          requireId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string requireId = 1;</code>
       * @param value The requireId to set.
       * @return This builder for chaining.
       */
      public Builder setRequireId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        requireId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string requireId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequireId() {
        
        requireId_ = getDefaultInstance().getRequireId();
        onChanged();
        return this;
      }
      /**
       * <code>string requireId = 1;</code>
       * @param value The bytes for requireId to set.
       * @return This builder for chaining.
       */
      public Builder setRequireIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        requireId_ = value;
        onChanged();
        return this;
      }

      private boolean success_ ;
      /**
       * <code>bool success = 2;</code>
       * @return The success.
       */
      @Override
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>bool success = 2;</code>
       * @param value The success to set.
       * @return This builder for chaining.
       */
      public Builder setSuccess(boolean value) {
        
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool success = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuccess() {
        
        success_ = false;
        onChanged();
        return this;
      }

      private Object msg_ = "";
      /**
       * <code>string msg = 3;</code>
       * @return The msg.
       */
      public String getMsg() {
        Object ref = msg_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string msg = 3;</code>
       * @return The bytes for msg.
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string msg = 3;</code>
       * @param value The msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsg(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsg() {
        
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 3;</code>
       * @param value The bytes for msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msg_ = value;
        onChanged();
        return this;
      }

      private java.util.List<Worker> worker_ =
        java.util.Collections.emptyList();
      private void ensureWorkerIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          worker_ = new java.util.ArrayList<Worker>(worker_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          Worker, Worker.Builder, WorkerOrBuilder> workerBuilder_;

      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public java.util.List<Worker> getWorkerList() {
        if (workerBuilder_ == null) {
          return java.util.Collections.unmodifiableList(worker_);
        } else {
          return workerBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public int getWorkerCount() {
        if (workerBuilder_ == null) {
          return worker_.size();
        } else {
          return workerBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Worker getWorker(int index) {
        if (workerBuilder_ == null) {
          return worker_.get(index);
        } else {
          return workerBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Builder setWorker(
          int index, Worker value) {
        if (workerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWorkerIsMutable();
          worker_.set(index, value);
          onChanged();
        } else {
          workerBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Builder setWorker(
          int index, Worker.Builder builderForValue) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          worker_.set(index, builderForValue.build());
          onChanged();
        } else {
          workerBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Builder addWorker(Worker value) {
        if (workerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWorkerIsMutable();
          worker_.add(value);
          onChanged();
        } else {
          workerBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Builder addWorker(
          int index, Worker value) {
        if (workerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWorkerIsMutable();
          worker_.add(index, value);
          onChanged();
        } else {
          workerBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Builder addWorker(
          Worker.Builder builderForValue) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          worker_.add(builderForValue.build());
          onChanged();
        } else {
          workerBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Builder addWorker(
          int index, Worker.Builder builderForValue) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          worker_.add(index, builderForValue.build());
          onChanged();
        } else {
          workerBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Builder addAllWorker(
          Iterable<? extends Worker> values) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, worker_);
          onChanged();
        } else {
          workerBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Builder clearWorker() {
        if (workerBuilder_ == null) {
          worker_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          workerBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Builder removeWorker(int index) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          worker_.remove(index);
          onChanged();
        } else {
          workerBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Worker.Builder getWorkerBuilder(
          int index) {
        return getWorkerFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public WorkerOrBuilder getWorkerOrBuilder(
          int index) {
        if (workerBuilder_ == null) {
          return worker_.get(index);  } else {
          return workerBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public java.util.List<? extends WorkerOrBuilder>
           getWorkerOrBuilderList() {
        if (workerBuilder_ != null) {
          return workerBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(worker_);
        }
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Worker.Builder addWorkerBuilder() {
        return getWorkerFieldBuilder().addBuilder(
            Worker.getDefaultInstance());
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public Worker.Builder addWorkerBuilder(
          int index) {
        return getWorkerFieldBuilder().addBuilder(
            index, Worker.getDefaultInstance());
      }
      /**
       * <code>repeated .Worker worker = 4;</code>
       */
      public java.util.List<Worker.Builder>
           getWorkerBuilderList() {
        return getWorkerFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          Worker, Worker.Builder, WorkerOrBuilder>
          getWorkerFieldBuilder() {
        if (workerBuilder_ == null) {
          workerBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              Worker, Worker.Builder, WorkerOrBuilder>(
                  worker_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          worker_ = null;
        }
        return workerBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RequireResourceResponse)
    }

    // @@protoc_insertion_point(class_scope:RequireResourceResponse)
    private static final RequireResourceResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequireResourceResponse();
    }

    public static RequireResourceResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequireResourceResponse>
        PARSER = new com.google.protobuf.AbstractParser<RequireResourceResponse>() {
      @Override
      public RequireResourceResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequireResourceResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequireResourceResponse> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RequireResourceResponse> getParserForType() {
      return PARSER;
    }

    @Override
    public RequireResourceResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReleaseResourceRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReleaseResourceRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string releaseId = 1;</code>
     * @return The releaseId.
     */
    String getReleaseId();
    /**
     * <code>string releaseId = 1;</code>
     * @return The bytes for releaseId.
     */
    com.google.protobuf.ByteString
        getReleaseIdBytes();

    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    java.util.List<Worker>
        getWorkerList();
    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    Worker getWorker(int index);
    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    int getWorkerCount();
    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    java.util.List<? extends WorkerOrBuilder>
        getWorkerOrBuilderList();
    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    WorkerOrBuilder getWorkerOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ReleaseResourceRequest}
   */
  public static final class ReleaseResourceRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReleaseResourceRequest)
      ReleaseResourceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReleaseResourceRequest.newBuilder() to construct.
    private ReleaseResourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReleaseResourceRequest() {
      releaseId_ = "";
      worker_ = java.util.Collections.emptyList();
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReleaseResourceRequest();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReleaseResourceRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              releaseId_ = s;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                worker_ = new java.util.ArrayList<Worker>();
                mutable_bitField0_ |= 0x00000001;
              }
              worker_.add(
                  input.readMessage(Worker.parser(), extensionRegistry));
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
          worker_ = java.util.Collections.unmodifiableList(worker_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Resource.internal_static_ReleaseResourceRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Resource.internal_static_ReleaseResourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReleaseResourceRequest.class, Builder.class);
    }

    public static final int RELEASEID_FIELD_NUMBER = 1;
    private volatile Object releaseId_;
    /**
     * <code>string releaseId = 1;</code>
     * @return The releaseId.
     */
    @Override
    public String getReleaseId() {
      Object ref = releaseId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        releaseId_ = s;
        return s;
      }
    }
    /**
     * <code>string releaseId = 1;</code>
     * @return The bytes for releaseId.
     */
    @Override
    public com.google.protobuf.ByteString
        getReleaseIdBytes() {
      Object ref = releaseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        releaseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WORKER_FIELD_NUMBER = 2;
    private java.util.List<Worker> worker_;
    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    @Override
    public java.util.List<Worker> getWorkerList() {
      return worker_;
    }
    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    @Override
    public java.util.List<? extends WorkerOrBuilder>
        getWorkerOrBuilderList() {
      return worker_;
    }
    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    @Override
    public int getWorkerCount() {
      return worker_.size();
    }
    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    @Override
    public Worker getWorker(int index) {
      return worker_.get(index);
    }
    /**
     * <code>repeated .Worker worker = 2;</code>
     */
    @Override
    public WorkerOrBuilder getWorkerOrBuilder(
        int index) {
      return worker_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getReleaseIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, releaseId_);
      }
      for (int i = 0; i < worker_.size(); i++) {
        output.writeMessage(2, worker_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getReleaseIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, releaseId_);
      }
      for (int i = 0; i < worker_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, worker_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ReleaseResourceRequest)) {
        return super.equals(obj);
      }
      ReleaseResourceRequest other = (ReleaseResourceRequest) obj;

      if (!getReleaseId()
          .equals(other.getReleaseId())) return false;
      if (!getWorkerList()
          .equals(other.getWorkerList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RELEASEID_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseId().hashCode();
      if (getWorkerCount() > 0) {
        hash = (37 * hash) + WORKER_FIELD_NUMBER;
        hash = (53 * hash) + getWorkerList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ReleaseResourceRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReleaseResourceRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReleaseResourceRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReleaseResourceRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReleaseResourceRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReleaseResourceRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReleaseResourceRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReleaseResourceRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReleaseResourceRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ReleaseResourceRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReleaseResourceRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReleaseResourceRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ReleaseResourceRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ReleaseResourceRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReleaseResourceRequest)
        ReleaseResourceRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Resource.internal_static_ReleaseResourceRequest_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Resource.internal_static_ReleaseResourceRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ReleaseResourceRequest.class, Builder.class);
      }

      // Construct using com.antgroup.geaflow.rpc.proto.Resource.ReleaseResourceRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getWorkerFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        releaseId_ = "";

        if (workerBuilder_ == null) {
          worker_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          workerBuilder_.clear();
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Resource.internal_static_ReleaseResourceRequest_descriptor;
      }

      @Override
      public ReleaseResourceRequest getDefaultInstanceForType() {
        return ReleaseResourceRequest.getDefaultInstance();
      }

      @Override
      public ReleaseResourceRequest build() {
        ReleaseResourceRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ReleaseResourceRequest buildPartial() {
        ReleaseResourceRequest result = new ReleaseResourceRequest(this);
        int from_bitField0_ = bitField0_;
        result.releaseId_ = releaseId_;
        if (workerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            worker_ = java.util.Collections.unmodifiableList(worker_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.worker_ = worker_;
        } else {
          result.worker_ = workerBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ReleaseResourceRequest) {
          return mergeFrom((ReleaseResourceRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ReleaseResourceRequest other) {
        if (other == ReleaseResourceRequest.getDefaultInstance()) return this;
        if (!other.getReleaseId().isEmpty()) {
          releaseId_ = other.releaseId_;
          onChanged();
        }
        if (workerBuilder_ == null) {
          if (!other.worker_.isEmpty()) {
            if (worker_.isEmpty()) {
              worker_ = other.worker_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureWorkerIsMutable();
              worker_.addAll(other.worker_);
            }
            onChanged();
          }
        } else {
          if (!other.worker_.isEmpty()) {
            if (workerBuilder_.isEmpty()) {
              workerBuilder_.dispose();
              workerBuilder_ = null;
              worker_ = other.worker_;
              bitField0_ = (bitField0_ & ~0x00000001);
              workerBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getWorkerFieldBuilder() : null;
            } else {
              workerBuilder_.addAllMessages(other.worker_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ReleaseResourceRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ReleaseResourceRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object releaseId_ = "";
      /**
       * <code>string releaseId = 1;</code>
       * @return The releaseId.
       */
      public String getReleaseId() {
        Object ref = releaseId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          releaseId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string releaseId = 1;</code>
       * @return The bytes for releaseId.
       */
      public com.google.protobuf.ByteString
          getReleaseIdBytes() {
        Object ref = releaseId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          releaseId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string releaseId = 1;</code>
       * @param value The releaseId to set.
       * @return This builder for chaining.
       */
      public Builder setReleaseId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        releaseId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string releaseId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReleaseId() {
        
        releaseId_ = getDefaultInstance().getReleaseId();
        onChanged();
        return this;
      }
      /**
       * <code>string releaseId = 1;</code>
       * @param value The bytes for releaseId to set.
       * @return This builder for chaining.
       */
      public Builder setReleaseIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        releaseId_ = value;
        onChanged();
        return this;
      }

      private java.util.List<Worker> worker_ =
        java.util.Collections.emptyList();
      private void ensureWorkerIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          worker_ = new java.util.ArrayList<Worker>(worker_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          Worker, Worker.Builder, WorkerOrBuilder> workerBuilder_;

      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public java.util.List<Worker> getWorkerList() {
        if (workerBuilder_ == null) {
          return java.util.Collections.unmodifiableList(worker_);
        } else {
          return workerBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public int getWorkerCount() {
        if (workerBuilder_ == null) {
          return worker_.size();
        } else {
          return workerBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Worker getWorker(int index) {
        if (workerBuilder_ == null) {
          return worker_.get(index);
        } else {
          return workerBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Builder setWorker(
          int index, Worker value) {
        if (workerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWorkerIsMutable();
          worker_.set(index, value);
          onChanged();
        } else {
          workerBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Builder setWorker(
          int index, Worker.Builder builderForValue) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          worker_.set(index, builderForValue.build());
          onChanged();
        } else {
          workerBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Builder addWorker(Worker value) {
        if (workerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWorkerIsMutable();
          worker_.add(value);
          onChanged();
        } else {
          workerBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Builder addWorker(
          int index, Worker value) {
        if (workerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWorkerIsMutable();
          worker_.add(index, value);
          onChanged();
        } else {
          workerBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Builder addWorker(
          Worker.Builder builderForValue) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          worker_.add(builderForValue.build());
          onChanged();
        } else {
          workerBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Builder addWorker(
          int index, Worker.Builder builderForValue) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          worker_.add(index, builderForValue.build());
          onChanged();
        } else {
          workerBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Builder addAllWorker(
          Iterable<? extends Worker> values) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, worker_);
          onChanged();
        } else {
          workerBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Builder clearWorker() {
        if (workerBuilder_ == null) {
          worker_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          workerBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Builder removeWorker(int index) {
        if (workerBuilder_ == null) {
          ensureWorkerIsMutable();
          worker_.remove(index);
          onChanged();
        } else {
          workerBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Worker.Builder getWorkerBuilder(
          int index) {
        return getWorkerFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public WorkerOrBuilder getWorkerOrBuilder(
          int index) {
        if (workerBuilder_ == null) {
          return worker_.get(index);  } else {
          return workerBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public java.util.List<? extends WorkerOrBuilder>
           getWorkerOrBuilderList() {
        if (workerBuilder_ != null) {
          return workerBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(worker_);
        }
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Worker.Builder addWorkerBuilder() {
        return getWorkerFieldBuilder().addBuilder(
            Worker.getDefaultInstance());
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public Worker.Builder addWorkerBuilder(
          int index) {
        return getWorkerFieldBuilder().addBuilder(
            index, Worker.getDefaultInstance());
      }
      /**
       * <code>repeated .Worker worker = 2;</code>
       */
      public java.util.List<Worker.Builder>
           getWorkerBuilderList() {
        return getWorkerFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          Worker, Worker.Builder, WorkerOrBuilder>
          getWorkerFieldBuilder() {
        if (workerBuilder_ == null) {
          workerBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              Worker, Worker.Builder, WorkerOrBuilder>(
                  worker_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          worker_ = null;
        }
        return workerBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ReleaseResourceRequest)
    }

    // @@protoc_insertion_point(class_scope:ReleaseResourceRequest)
    private static final ReleaseResourceRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ReleaseResourceRequest();
    }

    public static ReleaseResourceRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReleaseResourceRequest>
        PARSER = new com.google.protobuf.AbstractParser<ReleaseResourceRequest>() {
      @Override
      public ReleaseResourceRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReleaseResourceRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReleaseResourceRequest> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ReleaseResourceRequest> getParserForType() {
      return PARSER;
    }

    @Override
    public ReleaseResourceRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReleaseResourceResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReleaseResourceResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string releaseId = 1;</code>
     * @return The releaseId.
     */
    String getReleaseId();
    /**
     * <code>string releaseId = 1;</code>
     * @return The bytes for releaseId.
     */
    com.google.protobuf.ByteString
        getReleaseIdBytes();

    /**
     * <code>bool success = 2;</code>
     * @return The success.
     */
    boolean getSuccess();

    /**
     * <code>string msg = 3;</code>
     * @return The msg.
     */
    String getMsg();
    /**
     * <code>string msg = 3;</code>
     * @return The bytes for msg.
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * Protobuf type {@code ReleaseResourceResponse}
   */
  public static final class ReleaseResourceResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReleaseResourceResponse)
      ReleaseResourceResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReleaseResourceResponse.newBuilder() to construct.
    private ReleaseResourceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReleaseResourceResponse() {
      releaseId_ = "";
      msg_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReleaseResourceResponse();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReleaseResourceResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              String s = input.readStringRequireUtf8();

              releaseId_ = s;
              break;
            }
            case 16: {

              success_ = input.readBool();
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              msg_ = s;
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
      return Resource.internal_static_ReleaseResourceResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Resource.internal_static_ReleaseResourceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReleaseResourceResponse.class, Builder.class);
    }

    public static final int RELEASEID_FIELD_NUMBER = 1;
    private volatile Object releaseId_;
    /**
     * <code>string releaseId = 1;</code>
     * @return The releaseId.
     */
    @Override
    public String getReleaseId() {
      Object ref = releaseId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        releaseId_ = s;
        return s;
      }
    }
    /**
     * <code>string releaseId = 1;</code>
     * @return The bytes for releaseId.
     */
    @Override
    public com.google.protobuf.ByteString
        getReleaseIdBytes() {
      Object ref = releaseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        releaseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUCCESS_FIELD_NUMBER = 2;
    private boolean success_;
    /**
     * <code>bool success = 2;</code>
     * @return The success.
     */
    @Override
    public boolean getSuccess() {
      return success_;
    }

    public static final int MSG_FIELD_NUMBER = 3;
    private volatile Object msg_;
    /**
     * <code>string msg = 3;</code>
     * @return The msg.
     */
    @Override
    public String getMsg() {
      Object ref = msg_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      }
    }
    /**
     * <code>string msg = 3;</code>
     * @return The bytes for msg.
     */
    @Override
    public com.google.protobuf.ByteString
        getMsgBytes() {
      Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getReleaseIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, releaseId_);
      }
      if (success_ != false) {
        output.writeBool(2, success_);
      }
      if (!getMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, msg_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getReleaseIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, releaseId_);
      }
      if (success_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, success_);
      }
      if (!getMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, msg_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ReleaseResourceResponse)) {
        return super.equals(obj);
      }
      ReleaseResourceResponse other = (ReleaseResourceResponse) obj;

      if (!getReleaseId()
          .equals(other.getReleaseId())) return false;
      if (getSuccess()
          != other.getSuccess()) return false;
      if (!getMsg()
          .equals(other.getMsg())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RELEASEID_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseId().hashCode();
      hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getSuccess());
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ReleaseResourceResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReleaseResourceResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReleaseResourceResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReleaseResourceResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReleaseResourceResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReleaseResourceResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReleaseResourceResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReleaseResourceResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReleaseResourceResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ReleaseResourceResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReleaseResourceResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReleaseResourceResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ReleaseResourceResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ReleaseResourceResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReleaseResourceResponse)
        ReleaseResourceResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Resource.internal_static_ReleaseResourceResponse_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Resource.internal_static_ReleaseResourceResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ReleaseResourceResponse.class, Builder.class);
      }

      // Construct using com.antgroup.geaflow.rpc.proto.Resource.ReleaseResourceResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        releaseId_ = "";

        success_ = false;

        msg_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Resource.internal_static_ReleaseResourceResponse_descriptor;
      }

      @Override
      public ReleaseResourceResponse getDefaultInstanceForType() {
        return ReleaseResourceResponse.getDefaultInstance();
      }

      @Override
      public ReleaseResourceResponse build() {
        ReleaseResourceResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ReleaseResourceResponse buildPartial() {
        ReleaseResourceResponse result = new ReleaseResourceResponse(this);
        result.releaseId_ = releaseId_;
        result.success_ = success_;
        result.msg_ = msg_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ReleaseResourceResponse) {
          return mergeFrom((ReleaseResourceResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ReleaseResourceResponse other) {
        if (other == ReleaseResourceResponse.getDefaultInstance()) return this;
        if (!other.getReleaseId().isEmpty()) {
          releaseId_ = other.releaseId_;
          onChanged();
        }
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        if (!other.getMsg().isEmpty()) {
          msg_ = other.msg_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ReleaseResourceResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ReleaseResourceResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object releaseId_ = "";
      /**
       * <code>string releaseId = 1;</code>
       * @return The releaseId.
       */
      public String getReleaseId() {
        Object ref = releaseId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          releaseId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string releaseId = 1;</code>
       * @return The bytes for releaseId.
       */
      public com.google.protobuf.ByteString
          getReleaseIdBytes() {
        Object ref = releaseId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          releaseId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string releaseId = 1;</code>
       * @param value The releaseId to set.
       * @return This builder for chaining.
       */
      public Builder setReleaseId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        releaseId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string releaseId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReleaseId() {
        
        releaseId_ = getDefaultInstance().getReleaseId();
        onChanged();
        return this;
      }
      /**
       * <code>string releaseId = 1;</code>
       * @param value The bytes for releaseId to set.
       * @return This builder for chaining.
       */
      public Builder setReleaseIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        releaseId_ = value;
        onChanged();
        return this;
      }

      private boolean success_ ;
      /**
       * <code>bool success = 2;</code>
       * @return The success.
       */
      @Override
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>bool success = 2;</code>
       * @param value The success to set.
       * @return This builder for chaining.
       */
      public Builder setSuccess(boolean value) {
        
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool success = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSuccess() {
        
        success_ = false;
        onChanged();
        return this;
      }

      private Object msg_ = "";
      /**
       * <code>string msg = 3;</code>
       * @return The msg.
       */
      public String getMsg() {
        Object ref = msg_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string msg = 3;</code>
       * @return The bytes for msg.
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string msg = 3;</code>
       * @param value The msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsg(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsg() {
        
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>string msg = 3;</code>
       * @param value The bytes for msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msg_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ReleaseResourceResponse)
    }

    // @@protoc_insertion_point(class_scope:ReleaseResourceResponse)
    private static final ReleaseResourceResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ReleaseResourceResponse();
    }

    public static ReleaseResourceResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReleaseResourceResponse>
        PARSER = new com.google.protobuf.AbstractParser<ReleaseResourceResponse>() {
      @Override
      public ReleaseResourceResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReleaseResourceResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReleaseResourceResponse> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ReleaseResourceResponse> getParserForType() {
      return PARSER;
    }

    @Override
    public ReleaseResourceResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface WorkerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Worker)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string host = 1;</code>
     * @return The host.
     */
    String getHost();
    /**
     * <code>string host = 1;</code>
     * @return The bytes for host.
     */
    com.google.protobuf.ByteString
        getHostBytes();

    /**
     * <code>int32 processId = 2;</code>
     * @return The processId.
     */
    int getProcessId();

    /**
     * <code>int32 rpcPort = 3;</code>
     * @return The rpcPort.
     */
    int getRpcPort();

    /**
     * <code>int32 shufflePort = 4;</code>
     * @return The shufflePort.
     */
    int getShufflePort();

    /**
     * <code>int32 workerId = 5;</code>
     * @return The workerId.
     */
    int getWorkerId();

    /**
     * <code>string containerId = 6;</code>
     * @return The containerId.
     */
    String getContainerId();
    /**
     * <code>string containerId = 6;</code>
     * @return The bytes for containerId.
     */
    com.google.protobuf.ByteString
        getContainerIdBytes();
  }
  /**
   * Protobuf type {@code Worker}
   */
  public static final class Worker extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Worker)
      WorkerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Worker.newBuilder() to construct.
    private Worker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Worker() {
      host_ = "";
      containerId_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Worker();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Worker(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
              String s = input.readStringRequireUtf8();

              host_ = s;
              break;
            }
            case 16: {

              processId_ = input.readInt32();
              break;
            }
            case 24: {

              rpcPort_ = input.readInt32();
              break;
            }
            case 32: {

              shufflePort_ = input.readInt32();
              break;
            }
            case 40: {

              workerId_ = input.readInt32();
              break;
            }
            case 50: {
              String s = input.readStringRequireUtf8();

              containerId_ = s;
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
      return Resource.internal_static_Worker_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Resource.internal_static_Worker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Worker.class, Builder.class);
    }

    public static final int HOST_FIELD_NUMBER = 1;
    private volatile Object host_;
    /**
     * <code>string host = 1;</code>
     * @return The host.
     */
    @Override
    public String getHost() {
      Object ref = host_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        host_ = s;
        return s;
      }
    }
    /**
     * <code>string host = 1;</code>
     * @return The bytes for host.
     */
    @Override
    public com.google.protobuf.ByteString
        getHostBytes() {
      Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PROCESSID_FIELD_NUMBER = 2;
    private int processId_;
    /**
     * <code>int32 processId = 2;</code>
     * @return The processId.
     */
    @Override
    public int getProcessId() {
      return processId_;
    }

    public static final int RPCPORT_FIELD_NUMBER = 3;
    private int rpcPort_;
    /**
     * <code>int32 rpcPort = 3;</code>
     * @return The rpcPort.
     */
    @Override
    public int getRpcPort() {
      return rpcPort_;
    }

    public static final int SHUFFLEPORT_FIELD_NUMBER = 4;
    private int shufflePort_;
    /**
     * <code>int32 shufflePort = 4;</code>
     * @return The shufflePort.
     */
    @Override
    public int getShufflePort() {
      return shufflePort_;
    }

    public static final int WORKERID_FIELD_NUMBER = 5;
    private int workerId_;
    /**
     * <code>int32 workerId = 5;</code>
     * @return The workerId.
     */
    @Override
    public int getWorkerId() {
      return workerId_;
    }

    public static final int CONTAINERID_FIELD_NUMBER = 6;
    private volatile Object containerId_;
    /**
     * <code>string containerId = 6;</code>
     * @return The containerId.
     */
    @Override
    public String getContainerId() {
      Object ref = containerId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        containerId_ = s;
        return s;
      }
    }
    /**
     * <code>string containerId = 6;</code>
     * @return The bytes for containerId.
     */
    @Override
    public com.google.protobuf.ByteString
        getContainerIdBytes() {
      Object ref = containerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        containerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getHostBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, host_);
      }
      if (processId_ != 0) {
        output.writeInt32(2, processId_);
      }
      if (rpcPort_ != 0) {
        output.writeInt32(3, rpcPort_);
      }
      if (shufflePort_ != 0) {
        output.writeInt32(4, shufflePort_);
      }
      if (workerId_ != 0) {
        output.writeInt32(5, workerId_);
      }
      if (!getContainerIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, containerId_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getHostBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, host_);
      }
      if (processId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, processId_);
      }
      if (rpcPort_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, rpcPort_);
      }
      if (shufflePort_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, shufflePort_);
      }
      if (workerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, workerId_);
      }
      if (!getContainerIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, containerId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Worker)) {
        return super.equals(obj);
      }
      Worker other = (Worker) obj;

      if (!getHost()
          .equals(other.getHost())) return false;
      if (getProcessId()
          != other.getProcessId()) return false;
      if (getRpcPort()
          != other.getRpcPort()) return false;
      if (getShufflePort()
          != other.getShufflePort()) return false;
      if (getWorkerId()
          != other.getWorkerId()) return false;
      if (!getContainerId()
          .equals(other.getContainerId())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
      hash = (37 * hash) + PROCESSID_FIELD_NUMBER;
      hash = (53 * hash) + getProcessId();
      hash = (37 * hash) + RPCPORT_FIELD_NUMBER;
      hash = (53 * hash) + getRpcPort();
      hash = (37 * hash) + SHUFFLEPORT_FIELD_NUMBER;
      hash = (53 * hash) + getShufflePort();
      hash = (37 * hash) + WORKERID_FIELD_NUMBER;
      hash = (53 * hash) + getWorkerId();
      hash = (37 * hash) + CONTAINERID_FIELD_NUMBER;
      hash = (53 * hash) + getContainerId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Worker parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Worker parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Worker parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Worker parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Worker parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Worker parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Worker parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Worker parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Worker parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Worker parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Worker parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Worker parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Worker prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Worker}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Worker)
        WorkerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Resource.internal_static_Worker_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Resource.internal_static_Worker_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Worker.class, Builder.class);
      }

      // Construct using com.antgroup.geaflow.rpc.proto.Resource.Worker.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        host_ = "";

        processId_ = 0;

        rpcPort_ = 0;

        shufflePort_ = 0;

        workerId_ = 0;

        containerId_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Resource.internal_static_Worker_descriptor;
      }

      @Override
      public Worker getDefaultInstanceForType() {
        return Worker.getDefaultInstance();
      }

      @Override
      public Worker build() {
        Worker result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Worker buildPartial() {
        Worker result = new Worker(this);
        result.host_ = host_;
        result.processId_ = processId_;
        result.rpcPort_ = rpcPort_;
        result.shufflePort_ = shufflePort_;
        result.workerId_ = workerId_;
        result.containerId_ = containerId_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Worker) {
          return mergeFrom((Worker)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Worker other) {
        if (other == Worker.getDefaultInstance()) return this;
        if (!other.getHost().isEmpty()) {
          host_ = other.host_;
          onChanged();
        }
        if (other.getProcessId() != 0) {
          setProcessId(other.getProcessId());
        }
        if (other.getRpcPort() != 0) {
          setRpcPort(other.getRpcPort());
        }
        if (other.getShufflePort() != 0) {
          setShufflePort(other.getShufflePort());
        }
        if (other.getWorkerId() != 0) {
          setWorkerId(other.getWorkerId());
        }
        if (!other.getContainerId().isEmpty()) {
          containerId_ = other.containerId_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Worker parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Worker) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object host_ = "";
      /**
       * <code>string host = 1;</code>
       * @return The host.
       */
      public String getHost() {
        Object ref = host_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          host_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string host = 1;</code>
       * @return The bytes for host.
       */
      public com.google.protobuf.ByteString
          getHostBytes() {
        Object ref = host_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          host_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string host = 1;</code>
       * @param value The host to set.
       * @return This builder for chaining.
       */
      public Builder setHost(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        host_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string host = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHost() {
        
        host_ = getDefaultInstance().getHost();
        onChanged();
        return this;
      }
      /**
       * <code>string host = 1;</code>
       * @param value The bytes for host to set.
       * @return This builder for chaining.
       */
      public Builder setHostBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        host_ = value;
        onChanged();
        return this;
      }

      private int processId_ ;
      /**
       * <code>int32 processId = 2;</code>
       * @return The processId.
       */
      @Override
      public int getProcessId() {
        return processId_;
      }
      /**
       * <code>int32 processId = 2;</code>
       * @param value The processId to set.
       * @return This builder for chaining.
       */
      public Builder setProcessId(int value) {
        
        processId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 processId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearProcessId() {
        
        processId_ = 0;
        onChanged();
        return this;
      }

      private int rpcPort_ ;
      /**
       * <code>int32 rpcPort = 3;</code>
       * @return The rpcPort.
       */
      @Override
      public int getRpcPort() {
        return rpcPort_;
      }
      /**
       * <code>int32 rpcPort = 3;</code>
       * @param value The rpcPort to set.
       * @return This builder for chaining.
       */
      public Builder setRpcPort(int value) {
        
        rpcPort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 rpcPort = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRpcPort() {
        
        rpcPort_ = 0;
        onChanged();
        return this;
      }

      private int shufflePort_ ;
      /**
       * <code>int32 shufflePort = 4;</code>
       * @return The shufflePort.
       */
      @Override
      public int getShufflePort() {
        return shufflePort_;
      }
      /**
       * <code>int32 shufflePort = 4;</code>
       * @param value The shufflePort to set.
       * @return This builder for chaining.
       */
      public Builder setShufflePort(int value) {
        
        shufflePort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 shufflePort = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearShufflePort() {
        
        shufflePort_ = 0;
        onChanged();
        return this;
      }

      private int workerId_ ;
      /**
       * <code>int32 workerId = 5;</code>
       * @return The workerId.
       */
      @Override
      public int getWorkerId() {
        return workerId_;
      }
      /**
       * <code>int32 workerId = 5;</code>
       * @param value The workerId to set.
       * @return This builder for chaining.
       */
      public Builder setWorkerId(int value) {
        
        workerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 workerId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearWorkerId() {
        
        workerId_ = 0;
        onChanged();
        return this;
      }

      private Object containerId_ = "";
      /**
       * <code>string containerId = 6;</code>
       * @return The containerId.
       */
      public String getContainerId() {
        Object ref = containerId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          containerId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string containerId = 6;</code>
       * @return The bytes for containerId.
       */
      public com.google.protobuf.ByteString
          getContainerIdBytes() {
        Object ref = containerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          containerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string containerId = 6;</code>
       * @param value The containerId to set.
       * @return This builder for chaining.
       */
      public Builder setContainerId(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        containerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string containerId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearContainerId() {
        
        containerId_ = getDefaultInstance().getContainerId();
        onChanged();
        return this;
      }
      /**
       * <code>string containerId = 6;</code>
       * @param value The bytes for containerId to set.
       * @return This builder for chaining.
       */
      public Builder setContainerIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        containerId_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Worker)
    }

    // @@protoc_insertion_point(class_scope:Worker)
    private static final Worker DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Worker();
    }

    public static Worker getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Worker>
        PARSER = new com.google.protobuf.AbstractParser<Worker>() {
      @Override
      public Worker parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Worker(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Worker> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Worker> getParserForType() {
      return PARSER;
    }

    @Override
    public Worker getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequireResourceRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequireResourceRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequireResourceResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequireResourceResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReleaseResourceRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReleaseResourceRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReleaseResourceResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReleaseResourceResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Worker_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Worker_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016resource.proto\"i\n\026RequireResourceReque" +
      "st\022\021\n\trequireId\030\001 \001(\t\022\022\n\nworkersNum\030\002 \001(" +
      "\005\022(\n\rallocStrategy\030\003 \001(\0162\021.AllocateStrat" +
      "egy\"c\n\027RequireResourceResponse\022\021\n\trequir" +
      "eId\030\001 \001(\t\022\017\n\007success\030\002 \001(\010\022\013\n\003msg\030\003 \001(\t\022" +
      "\027\n\006worker\030\004 \003(\0132\007.Worker\"D\n\026ReleaseResou" +
      "rceRequest\022\021\n\treleaseId\030\001 \001(\t\022\027\n\006worker\030" +
      "\002 \003(\0132\007.Worker\"J\n\027ReleaseResourceRespons" +
      "e\022\021\n\treleaseId\030\001 \001(\t\022\017\n\007success\030\002 \001(\010\022\013\n" +
      "\003msg\030\003 \001(\t\"v\n\006Worker\022\014\n\004host\030\001 \001(\t\022\021\n\tpr" +
      "ocessId\030\002 \001(\005\022\017\n\007rpcPort\030\003 \001(\005\022\023\n\013shuffl" +
      "ePort\030\004 \001(\005\022\020\n\010workerId\030\005 \001(\005\022\023\n\013contain" +
      "erId\030\006 \001(\t*#\n\020AllocateStrategy\022\017\n\013ROUND_" +
      "ROBIN\020\0002\241\001\n\017ResourceService\022F\n\017requireRe" +
      "source\022\027.RequireResourceRequest\032\030.Requir" +
      "eResourceResponse\"\000\022F\n\017releaseResource\022\027" +
      ".ReleaseResourceRequest\032\030.ReleaseResourc" +
      "eResponse\"\000B\"\n\036com.antgroup.geaflow.rpc." +
      "protoP\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RequireResourceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RequireResourceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequireResourceRequest_descriptor,
        new String[] { "RequireId", "WorkersNum", "AllocStrategy", });
    internal_static_RequireResourceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RequireResourceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequireResourceResponse_descriptor,
        new String[] { "RequireId", "Success", "Msg", "Worker", });
    internal_static_ReleaseResourceRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ReleaseResourceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReleaseResourceRequest_descriptor,
        new String[] { "ReleaseId", "Worker", });
    internal_static_ReleaseResourceResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ReleaseResourceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReleaseResourceResponse_descriptor,
        new String[] { "ReleaseId", "Success", "Msg", });
    internal_static_Worker_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Worker_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Worker_descriptor,
        new String[] { "Host", "ProcessId", "RpcPort", "ShufflePort", "WorkerId", "ContainerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
