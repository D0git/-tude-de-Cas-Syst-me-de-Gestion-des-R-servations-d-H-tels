// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.project.booking.stubs;

/**
 * Protobuf enum {@code TypeChambre}
 */
public enum TypeChambre
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SIMPLE = 0;</code>
   */
  SIMPLE(0),
  /**
   * <code>DOUBLE = 1;</code>
   */
  DOUBLE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SIMPLE = 0;</code>
   */
  public static final int SIMPLE_VALUE = 0;
  /**
   * <code>DOUBLE = 1;</code>
   */
  public static final int DOUBLE_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TypeChambre valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TypeChambre forNumber(int value) {
    switch (value) {
      case 0: return SIMPLE;
      case 1: return DOUBLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TypeChambre>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TypeChambre> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TypeChambre>() {
          public TypeChambre findValueByNumber(int number) {
            return TypeChambre.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.project.booking.stubs.ReservationOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final TypeChambre[] VALUES = values();

  public static TypeChambre valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TypeChambre(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:TypeChambre)
}

