package com.project.booking.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Définition du service correspondant aux requêtes et mutations GraphQL
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class CompteServiceGrpc {

  private CompteServiceGrpc() {}

  public static final String SERVICE_NAME = "CompteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.project.booking.stubs.getAllReservationsRequest,
      com.project.booking.stubs.getAllReservationsResponse> getAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllReservations",
      requestType = com.project.booking.stubs.getAllReservationsRequest.class,
      responseType = com.project.booking.stubs.getAllReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.booking.stubs.getAllReservationsRequest,
      com.project.booking.stubs.getAllReservationsResponse> getAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.project.booking.stubs.getAllReservationsRequest, com.project.booking.stubs.getAllReservationsResponse> getAllReservationsMethod;
    if ((getAllReservationsMethod = CompteServiceGrpc.getAllReservationsMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getAllReservationsMethod = CompteServiceGrpc.getAllReservationsMethod) == null) {
          CompteServiceGrpc.getAllReservationsMethod = getAllReservationsMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.getAllReservationsRequest, com.project.booking.stubs.getAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "AllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("AllReservations"))
                  .build();
          }
        }
     }
     return getAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.project.booking.stubs.getReservationByIdRequest,
      com.project.booking.stubs.getReservationByIdResponse> getReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReservationById",
      requestType = com.project.booking.stubs.getReservationByIdRequest.class,
      responseType = com.project.booking.stubs.getReservationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.booking.stubs.getReservationByIdRequest,
      com.project.booking.stubs.getReservationByIdResponse> getReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.project.booking.stubs.getReservationByIdRequest, com.project.booking.stubs.getReservationByIdResponse> getReservationByIdMethod;
    if ((getReservationByIdMethod = CompteServiceGrpc.getReservationByIdMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getReservationByIdMethod = CompteServiceGrpc.getReservationByIdMethod) == null) {
          CompteServiceGrpc.getReservationByIdMethod = getReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.getReservationByIdRequest, com.project.booking.stubs.getReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "ReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("ReservationById"))
                  .build();
          }
        }
     }
     return getReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.project.booking.stubs.saveReservationRequest,
      com.project.booking.stubs.saveReservationResponse> getSaveReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveReservation",
      requestType = com.project.booking.stubs.saveReservationRequest.class,
      responseType = com.project.booking.stubs.saveReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.booking.stubs.saveReservationRequest,
      com.project.booking.stubs.saveReservationResponse> getSaveReservationMethod() {
    io.grpc.MethodDescriptor<com.project.booking.stubs.saveReservationRequest, com.project.booking.stubs.saveReservationResponse> getSaveReservationMethod;
    if ((getSaveReservationMethod = CompteServiceGrpc.getSaveReservationMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getSaveReservationMethod = CompteServiceGrpc.getSaveReservationMethod) == null) {
          CompteServiceGrpc.getSaveReservationMethod = getSaveReservationMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.saveReservationRequest, com.project.booking.stubs.saveReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "SaveReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.saveReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.saveReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("SaveReservation"))
                  .build();
          }
        }
     }
     return getSaveReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.project.booking.stubs.deleteReservationByIdRequest,
      com.project.booking.stubs.deleteReservationByIdResponse> getDeleteReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservationById",
      requestType = com.project.booking.stubs.deleteReservationByIdRequest.class,
      responseType = com.project.booking.stubs.deleteReservationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.booking.stubs.deleteReservationByIdRequest,
      com.project.booking.stubs.deleteReservationByIdResponse> getDeleteReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.project.booking.stubs.deleteReservationByIdRequest, com.project.booking.stubs.deleteReservationByIdResponse> getDeleteReservationByIdMethod;
    if ((getDeleteReservationByIdMethod = CompteServiceGrpc.getDeleteReservationByIdMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getDeleteReservationByIdMethod = CompteServiceGrpc.getDeleteReservationByIdMethod) == null) {
          CompteServiceGrpc.getDeleteReservationByIdMethod = getDeleteReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.deleteReservationByIdRequest, com.project.booking.stubs.deleteReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "DeleteReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.deleteReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.deleteReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("DeleteReservationById"))
                  .build();
          }
        }
     }
     return getDeleteReservationByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteServiceStub newStub(io.grpc.Channel channel) {
    return new CompteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompteServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static abstract class CompteServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Équivalent de la requête allReservations
     * </pre>
     */
    public void allReservations(com.project.booking.stubs.getAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.getAllReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllReservationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête reservationById
     * </pre>
     */
    public void reservationById(com.project.booking.stubs.getReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.getReservationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReservationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveReservation
     * </pre>
     */
    public void saveReservation(com.project.booking.stubs.saveReservationRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.saveReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation deleteReservationById
     * </pre>
     */
    public void deleteReservationById(com.project.booking.stubs.deleteReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.deleteReservationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.booking.stubs.getAllReservationsRequest,
                com.project.booking.stubs.getAllReservationsResponse>(
                  this, METHODID_ALL_RESERVATIONS)))
          .addMethod(
            getReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.booking.stubs.getReservationByIdRequest,
                com.project.booking.stubs.getReservationByIdResponse>(
                  this, METHODID_RESERVATION_BY_ID)))
          .addMethod(
            getSaveReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.booking.stubs.saveReservationRequest,
                com.project.booking.stubs.saveReservationResponse>(
                  this, METHODID_SAVE_RESERVATION)))
          .addMethod(
            getDeleteReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.booking.stubs.deleteReservationByIdRequest,
                com.project.booking.stubs.deleteReservationByIdResponse>(
                  this, METHODID_DELETE_RESERVATION_BY_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceStub extends io.grpc.stub.AbstractStub<CompteServiceStub> {
    private CompteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allReservations
     * </pre>
     */
    public void allReservations(com.project.booking.stubs.getAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.getAllReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête reservationById
     * </pre>
     */
    public void reservationById(com.project.booking.stubs.getReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.getReservationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveReservation
     * </pre>
     */
    public void saveReservation(com.project.booking.stubs.saveReservationRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.saveReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation deleteReservationById
     * </pre>
     */
    public void deleteReservationById(com.project.booking.stubs.deleteReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.deleteReservationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceBlockingStub extends io.grpc.stub.AbstractStub<CompteServiceBlockingStub> {
    private CompteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allReservations
     * </pre>
     */
    public com.project.booking.stubs.getAllReservationsResponse allReservations(com.project.booking.stubs.getAllReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la requête reservationById
     * </pre>
     */
    public com.project.booking.stubs.getReservationByIdResponse reservationById(com.project.booking.stubs.getReservationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveReservation
     * </pre>
     */
    public com.project.booking.stubs.saveReservationResponse saveReservation(com.project.booking.stubs.saveReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation deleteReservationById
     * </pre>
     */
    public com.project.booking.stubs.deleteReservationByIdResponse deleteReservationById(com.project.booking.stubs.deleteReservationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceFutureStub extends io.grpc.stub.AbstractStub<CompteServiceFutureStub> {
    private CompteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allReservations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.booking.stubs.getAllReservationsResponse> allReservations(
        com.project.booking.stubs.getAllReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la requête reservationById
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.booking.stubs.getReservationByIdResponse> reservationById(
        com.project.booking.stubs.getReservationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveReservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.booking.stubs.saveReservationResponse> saveReservation(
        com.project.booking.stubs.saveReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation deleteReservationById
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.booking.stubs.deleteReservationByIdResponse> deleteReservationById(
        com.project.booking.stubs.deleteReservationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_RESERVATIONS = 0;
  private static final int METHODID_RESERVATION_BY_ID = 1;
  private static final int METHODID_SAVE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION_BY_ID = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_RESERVATIONS:
          serviceImpl.allReservations((com.project.booking.stubs.getAllReservationsRequest) request,
              (io.grpc.stub.StreamObserver<com.project.booking.stubs.getAllReservationsResponse>) responseObserver);
          break;
        case METHODID_RESERVATION_BY_ID:
          serviceImpl.reservationById((com.project.booking.stubs.getReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.project.booking.stubs.getReservationByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_RESERVATION:
          serviceImpl.saveReservation((com.project.booking.stubs.saveReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.project.booking.stubs.saveReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION_BY_ID:
          serviceImpl.deleteReservationById((com.project.booking.stubs.deleteReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.project.booking.stubs.deleteReservationByIdResponse>) responseObserver);
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

  private static abstract class CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.booking.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompteService");
    }
  }

  private static final class CompteServiceFileDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier {
    CompteServiceFileDescriptorSupplier() {}
  }

  private static final class CompteServiceMethodDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompteServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CompteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteServiceFileDescriptorSupplier())
              .addMethod(getAllReservationsMethod())
              .addMethod(getReservationByIdMethod())
              .addMethod(getSaveReservationMethod())
              .addMethod(getDeleteReservationByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
