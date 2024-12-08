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
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

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
    if ((getAllReservationsMethod = ReservationServiceGrpc.getAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getAllReservationsMethod = ReservationServiceGrpc.getAllReservationsMethod) == null) {
          ReservationServiceGrpc.getAllReservationsMethod = getAllReservationsMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.getAllReservationsRequest, com.project.booking.stubs.getAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "AllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("AllReservations"))
                  .build();
          }
        }
     }
     return getAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.project.booking.stubs.getAllChambresRequest,
      com.project.booking.stubs.getAllChambresResponse> getAllChambresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllChambres",
      requestType = com.project.booking.stubs.getAllChambresRequest.class,
      responseType = com.project.booking.stubs.getAllChambresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.booking.stubs.getAllChambresRequest,
      com.project.booking.stubs.getAllChambresResponse> getAllChambresMethod() {
    io.grpc.MethodDescriptor<com.project.booking.stubs.getAllChambresRequest, com.project.booking.stubs.getAllChambresResponse> getAllChambresMethod;
    if ((getAllChambresMethod = ReservationServiceGrpc.getAllChambresMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getAllChambresMethod = ReservationServiceGrpc.getAllChambresMethod) == null) {
          ReservationServiceGrpc.getAllChambresMethod = getAllChambresMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.getAllChambresRequest, com.project.booking.stubs.getAllChambresResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "AllChambres"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getAllChambresRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getAllChambresResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("AllChambres"))
                  .build();
          }
        }
     }
     return getAllChambresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.project.booking.stubs.getAllPreferencesRequest,
      com.project.booking.stubs.getAllPreferencesResponse> getAllPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllPreferences",
      requestType = com.project.booking.stubs.getAllPreferencesRequest.class,
      responseType = com.project.booking.stubs.getAllPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.booking.stubs.getAllPreferencesRequest,
      com.project.booking.stubs.getAllPreferencesResponse> getAllPreferencesMethod() {
    io.grpc.MethodDescriptor<com.project.booking.stubs.getAllPreferencesRequest, com.project.booking.stubs.getAllPreferencesResponse> getAllPreferencesMethod;
    if ((getAllPreferencesMethod = ReservationServiceGrpc.getAllPreferencesMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getAllPreferencesMethod = ReservationServiceGrpc.getAllPreferencesMethod) == null) {
          ReservationServiceGrpc.getAllPreferencesMethod = getAllPreferencesMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.getAllPreferencesRequest, com.project.booking.stubs.getAllPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "AllPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getAllPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getAllPreferencesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("AllPreferences"))
                  .build();
          }
        }
     }
     return getAllPreferencesMethod;
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
    if ((getReservationByIdMethod = ReservationServiceGrpc.getReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getReservationByIdMethod = ReservationServiceGrpc.getReservationByIdMethod) == null) {
          ReservationServiceGrpc.getReservationByIdMethod = getReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.getReservationByIdRequest, com.project.booking.stubs.getReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "ReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.getReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("ReservationById"))
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
    if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
          ReservationServiceGrpc.getSaveReservationMethod = getSaveReservationMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.saveReservationRequest, com.project.booking.stubs.saveReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "SaveReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.saveReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.saveReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("SaveReservation"))
                  .build();
          }
        }
     }
     return getSaveReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.project.booking.stubs.updateReservationRequest,
      com.project.booking.stubs.updateReservationResponse> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = com.project.booking.stubs.updateReservationRequest.class,
      responseType = com.project.booking.stubs.updateReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.project.booking.stubs.updateReservationRequest,
      com.project.booking.stubs.updateReservationResponse> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<com.project.booking.stubs.updateReservationRequest, com.project.booking.stubs.updateReservationResponse> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
          ReservationServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.updateReservationRequest, com.project.booking.stubs.updateReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.updateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.updateReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("UpdateReservation"))
                  .build();
          }
        }
     }
     return getUpdateReservationMethod;
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
    if ((getDeleteReservationByIdMethod = ReservationServiceGrpc.getDeleteReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationByIdMethod = ReservationServiceGrpc.getDeleteReservationByIdMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationByIdMethod = getDeleteReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.project.booking.stubs.deleteReservationByIdRequest, com.project.booking.stubs.deleteReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "DeleteReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.deleteReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.project.booking.stubs.deleteReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservationById"))
                  .build();
          }
        }
     }
     return getDeleteReservationByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

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
     * Équivalent de la requête allReservations
     * </pre>
     */
    public void allChambres(com.project.booking.stubs.getAllChambresRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.getAllChambresResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllChambresMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête allReservations
     * </pre>
     */
    public void allPreferences(com.project.booking.stubs.getAllPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.getAllPreferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllPreferencesMethod(), responseObserver);
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
     * Équivalent de la mutation updateReservation
     * </pre>
     */
    public void updateReservation(com.project.booking.stubs.updateReservationRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.updateReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
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
            getAllChambresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.booking.stubs.getAllChambresRequest,
                com.project.booking.stubs.getAllChambresResponse>(
                  this, METHODID_ALL_CHAMBRES)))
          .addMethod(
            getAllPreferencesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.booking.stubs.getAllPreferencesRequest,
                com.project.booking.stubs.getAllPreferencesResponse>(
                  this, METHODID_ALL_PREFERENCES)))
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
            getUpdateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.project.booking.stubs.updateReservationRequest,
                com.project.booking.stubs.updateReservationResponse>(
                  this, METHODID_UPDATE_RESERVATION)))
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
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
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
     * Équivalent de la requête allReservations
     * </pre>
     */
    public void allChambres(com.project.booking.stubs.getAllChambresRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.getAllChambresResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllChambresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête allReservations
     * </pre>
     */
    public void allPreferences(com.project.booking.stubs.getAllPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.getAllPreferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllPreferencesMethod(), getCallOptions()), request, responseObserver);
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
     * Équivalent de la mutation updateReservation
     * </pre>
     */
    public void updateReservation(com.project.booking.stubs.updateReservationRequest request,
        io.grpc.stub.StreamObserver<com.project.booking.stubs.updateReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
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
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
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
     * Équivalent de la requête allReservations
     * </pre>
     */
    public com.project.booking.stubs.getAllChambresResponse allChambres(com.project.booking.stubs.getAllChambresRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllChambresMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la requête allReservations
     * </pre>
     */
    public com.project.booking.stubs.getAllPreferencesResponse allPreferences(com.project.booking.stubs.getAllPreferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllPreferencesMethod(), getCallOptions(), request);
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
     * Équivalent de la mutation updateReservation
     * </pre>
     */
    public com.project.booking.stubs.updateReservationResponse updateReservation(com.project.booking.stubs.updateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
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
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
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
     * Équivalent de la requête allReservations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.booking.stubs.getAllChambresResponse> allChambres(
        com.project.booking.stubs.getAllChambresRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllChambresMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la requête allReservations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.booking.stubs.getAllPreferencesResponse> allPreferences(
        com.project.booking.stubs.getAllPreferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllPreferencesMethod(), getCallOptions()), request);
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
     * Équivalent de la mutation updateReservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.project.booking.stubs.updateReservationResponse> updateReservation(
        com.project.booking.stubs.updateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
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
  private static final int METHODID_ALL_CHAMBRES = 1;
  private static final int METHODID_ALL_PREFERENCES = 2;
  private static final int METHODID_RESERVATION_BY_ID = 3;
  private static final int METHODID_SAVE_RESERVATION = 4;
  private static final int METHODID_UPDATE_RESERVATION = 5;
  private static final int METHODID_DELETE_RESERVATION_BY_ID = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_ALL_CHAMBRES:
          serviceImpl.allChambres((com.project.booking.stubs.getAllChambresRequest) request,
              (io.grpc.stub.StreamObserver<com.project.booking.stubs.getAllChambresResponse>) responseObserver);
          break;
        case METHODID_ALL_PREFERENCES:
          serviceImpl.allPreferences((com.project.booking.stubs.getAllPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.project.booking.stubs.getAllPreferencesResponse>) responseObserver);
          break;
        case METHODID_RESERVATION_BY_ID:
          serviceImpl.reservationById((com.project.booking.stubs.getReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.project.booking.stubs.getReservationByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_RESERVATION:
          serviceImpl.saveReservation((com.project.booking.stubs.saveReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.project.booking.stubs.saveReservationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((com.project.booking.stubs.updateReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.project.booking.stubs.updateReservationResponse>) responseObserver);
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

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.project.booking.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getAllReservationsMethod())
              .addMethod(getAllChambresMethod())
              .addMethod(getAllPreferencesMethod())
              .addMethod(getReservationByIdMethod())
              .addMethod(getSaveReservationMethod())
              .addMethod(getUpdateReservationMethod())
              .addMethod(getDeleteReservationByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
