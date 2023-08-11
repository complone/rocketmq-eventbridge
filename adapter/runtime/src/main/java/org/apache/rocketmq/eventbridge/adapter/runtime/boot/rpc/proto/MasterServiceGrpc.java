package org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: master.proto")
public class MasterServiceGrpc {

  private MasterServiceGrpc() {}

  public static final String SERVICE_NAME = "MasterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds,
      org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> METHOD_GET_CONTAINER_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "MasterService", "getContainerInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> METHOD_GET_ALL_CONTAINER_INFOS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "MasterService", "getAllContainerInfos"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest,
      org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> METHOD_REGISTER_CONTAINER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "MasterService", "registerContainer"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest,
      org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> METHOD_REGISTER_DRIVER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "MasterService", "registerDriver"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest,
      com.google.protobuf.Empty> METHOD_RECEIVE_HEARTBEAT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "MasterService", "receiveHeartbeat"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest,
      com.google.protobuf.Empty> METHOD_RECEIVE_EXCEPTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "MasterService", "receiveException"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> METHOD_CLOSE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "MasterService", "close"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MasterServiceStub newStub(io.grpc.Channel channel) {
    return new MasterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MasterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MasterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MasterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MasterServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface MasterService {

    /**
     * <pre>
     *根据id获取container信息
     * </pre>
     */
    public void getContainerInfo(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> responseObserver);

    /**
     */
    public void getAllContainerInfos(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> responseObserver);

    /**
     * <pre>
     *提交注册container
     * </pre>
     */
    public void registerContainer(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> responseObserver);

    /**
     * <pre>
     *提交注册container
     * </pre>
     */
    public void registerDriver(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> responseObserver);

    /**
     * <pre>
     *处理executor/driver发送的心跳信息
     * </pre>
     */
    public void receiveHeartbeat(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     *处理executor/driver发送的异常信息
     * </pre>
     */
    public void receiveException(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * 关闭结束master
     * </pre>
     */
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class MasterServiceImplBase implements MasterService, io.grpc.BindableService {

    @java.lang.Override
    public void getContainerInfo(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CONTAINER_INFO, responseObserver);
    }

    @java.lang.Override
    public void getAllContainerInfos(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_CONTAINER_INFOS, responseObserver);
    }

    @java.lang.Override
    public void registerContainer(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_CONTAINER, responseObserver);
    }

    @java.lang.Override
    public void registerDriver(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_DRIVER, responseObserver);
    }

    @java.lang.Override
    public void receiveHeartbeat(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RECEIVE_HEARTBEAT, responseObserver);
    }

    @java.lang.Override
    public void receiveException(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RECEIVE_EXCEPTION, responseObserver);
    }

    @java.lang.Override
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CLOSE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return MasterServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface MasterServiceBlockingClient {

    /**
     * <pre>
     *根据id获取container信息
     * </pre>
     */
    public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos getContainerInfo(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds request);

    /**
     */
    public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos getAllContainerInfos(com.google.protobuf.Empty request);

    /**
     * <pre>
     *提交注册container
     * </pre>
     */
    public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse registerContainer(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request);

    /**
     * <pre>
     *提交注册container
     * </pre>
     */
    public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse registerDriver(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request);

    /**
     * <pre>
     *处理executor/driver发送的心跳信息
     * </pre>
     */
    public com.google.protobuf.Empty receiveHeartbeat(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request);

    /**
     * <pre>
     *处理executor/driver发送的异常信息
     * </pre>
     */
    public com.google.protobuf.Empty receiveException(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request);

    /**
     * <pre>
     * 关闭结束master
     * </pre>
     */
    public com.google.protobuf.Empty close(com.google.protobuf.Empty request);
  }

  /**
   */
  @java.lang.Deprecated public static interface MasterServiceFutureClient {

    /**
     * <pre>
     *根据id获取container信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> getContainerInfo(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> getAllContainerInfos(
        com.google.protobuf.Empty request);

    /**
     * <pre>
     *提交注册container
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> registerContainer(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request);

    /**
     * <pre>
     *提交注册container
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> registerDriver(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request);

    /**
     * <pre>
     *处理executor/driver发送的心跳信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> receiveHeartbeat(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request);

    /**
     * <pre>
     *处理executor/driver发送的异常信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> receiveException(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request);

    /**
     * <pre>
     * 关闭结束master
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> close(
        com.google.protobuf.Empty request);
  }

  public static class MasterServiceStub extends io.grpc.stub.AbstractStub<MasterServiceStub>
      implements MasterService {
    private MasterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MasterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MasterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MasterServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getContainerInfo(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CONTAINER_INFO, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getAllContainerInfos(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CONTAINER_INFOS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void registerContainer(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_CONTAINER, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void registerDriver(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request,
        io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_DRIVER, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void receiveHeartbeat(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECEIVE_HEARTBEAT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void receiveException(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECEIVE_EXCEPTION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void close(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CLOSE, getCallOptions()), request, responseObserver);
    }
  }

  public static class MasterServiceBlockingStub extends io.grpc.stub.AbstractStub<MasterServiceBlockingStub>
      implements MasterServiceBlockingClient {
    private MasterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MasterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MasterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MasterServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos getContainerInfo(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CONTAINER_INFO, getCallOptions(), request);
    }

    @java.lang.Override
    public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos getAllContainerInfos(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_CONTAINER_INFOS, getCallOptions(), request);
    }

    @java.lang.Override
    public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse registerContainer(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_CONTAINER, getCallOptions(), request);
    }

    @java.lang.Override
    public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse registerDriver(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_DRIVER, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty receiveHeartbeat(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RECEIVE_HEARTBEAT, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty receiveException(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RECEIVE_EXCEPTION, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty close(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CLOSE, getCallOptions(), request);
    }
  }

  public static class MasterServiceFutureStub extends io.grpc.stub.AbstractStub<MasterServiceFutureStub>
      implements MasterServiceFutureClient {
    private MasterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MasterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MasterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MasterServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> getContainerInfo(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CONTAINER_INFO, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos> getAllContainerInfos(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CONTAINER_INFOS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> registerContainer(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_CONTAINER, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse> registerDriver(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_DRIVER, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> receiveHeartbeat(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECEIVE_HEARTBEAT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> receiveException(
        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECEIVE_EXCEPTION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> close(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CLOSE, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractMasterService extends MasterServiceImplBase {}

  private static final int METHODID_GET_CONTAINER_INFO = 0;
  private static final int METHODID_GET_ALL_CONTAINER_INFOS = 1;
  private static final int METHODID_REGISTER_CONTAINER = 2;
  private static final int METHODID_REGISTER_DRIVER = 3;
  private static final int METHODID_RECEIVE_HEARTBEAT = 4;
  private static final int METHODID_RECEIVE_EXCEPTION = 5;
  private static final int METHODID_CLOSE = 6;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MasterService serviceImpl;
    private final int methodId;

    public MethodHandlers(MasterService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONTAINER_INFO:
          serviceImpl.getContainerInfo((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds) request,
              (io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos>) responseObserver);
          break;
        case METHODID_GET_ALL_CONTAINER_INFOS:
          serviceImpl.getAllContainerInfos((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos>) responseObserver);
          break;
        case METHODID_REGISTER_CONTAINER:
          serviceImpl.registerContainer((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse>) responseObserver);
          break;
        case METHODID_REGISTER_DRIVER:
          serviceImpl.registerDriver((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse>) responseObserver);
          break;
        case METHODID_RECEIVE_HEARTBEAT:
          serviceImpl.receiveHeartbeat((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RECEIVE_EXCEPTION:
          serviceImpl.receiveException((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_CONTAINER_INFO,
        METHOD_GET_ALL_CONTAINER_INFOS,
        METHOD_REGISTER_CONTAINER,
        METHOD_REGISTER_DRIVER,
        METHOD_RECEIVE_HEARTBEAT,
        METHOD_RECEIVE_EXCEPTION,
        METHOD_CLOSE);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final MasterService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_GET_CONTAINER_INFO,
          asyncUnaryCall(
            new MethodHandlers<
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds,
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos>(
                serviceImpl, METHODID_GET_CONTAINER_INFO)))
        .addMethod(
          METHOD_GET_ALL_CONTAINER_INFOS,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos>(
                serviceImpl, METHODID_GET_ALL_CONTAINER_INFOS)))
        .addMethod(
          METHOD_REGISTER_CONTAINER,
          asyncUnaryCall(
            new MethodHandlers<
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest,
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse>(
                serviceImpl, METHODID_REGISTER_CONTAINER)))
        .addMethod(
          METHOD_REGISTER_DRIVER,
          asyncUnaryCall(
            new MethodHandlers<
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest,
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse>(
                serviceImpl, METHODID_REGISTER_DRIVER)))
        .addMethod(
          METHOD_RECEIVE_HEARTBEAT,
          asyncUnaryCall(
            new MethodHandlers<
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_RECEIVE_HEARTBEAT)))
        .addMethod(
          METHOD_RECEIVE_EXCEPTION,
          asyncUnaryCall(
            new MethodHandlers<
              org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_RECEIVE_EXCEPTION)))
        .addMethod(
          METHOD_CLOSE,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_CLOSE)))
        .build();
  }
}
