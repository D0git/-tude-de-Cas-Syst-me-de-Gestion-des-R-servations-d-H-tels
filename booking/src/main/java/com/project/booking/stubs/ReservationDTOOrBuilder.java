// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.project.booking.stubs;

public interface ReservationDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ReservationDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string dateDebut = 1;</code>
   * @return The dateDebut.
   */
  java.lang.String getDateDebut();
  /**
   * <code>string dateDebut = 1;</code>
   * @return The bytes for dateDebut.
   */
  com.google.protobuf.ByteString
      getDateDebutBytes();

  /**
   * <code>string dateFin = 2;</code>
   * @return The dateFin.
   */
  java.lang.String getDateFin();
  /**
   * <code>string dateFin = 2;</code>
   * @return The bytes for dateFin.
   */
  com.google.protobuf.ByteString
      getDateFinBytes();

  /**
   * <code>int64 chambreId = 3;</code>
   * @return The chambreId.
   */
  long getChambreId();

  /**
   * <code>int64 clientId = 4;</code>
   * @return The clientId.
   */
  long getClientId();

  /**
   * <pre>
   * Champ repeated pour les préférences
   * </pre>
   *
   * <code>repeated .PreferenceDTO preferences = 5;</code>
   */
  java.util.List<com.project.booking.stubs.PreferenceDTO> 
      getPreferencesList();
  /**
   * <pre>
   * Champ repeated pour les préférences
   * </pre>
   *
   * <code>repeated .PreferenceDTO preferences = 5;</code>
   */
  com.project.booking.stubs.PreferenceDTO getPreferences(int index);
  /**
   * <pre>
   * Champ repeated pour les préférences
   * </pre>
   *
   * <code>repeated .PreferenceDTO preferences = 5;</code>
   */
  int getPreferencesCount();
  /**
   * <pre>
   * Champ repeated pour les préférences
   * </pre>
   *
   * <code>repeated .PreferenceDTO preferences = 5;</code>
   */
  java.util.List<? extends com.project.booking.stubs.PreferenceDTOOrBuilder> 
      getPreferencesOrBuilderList();
  /**
   * <pre>
   * Champ repeated pour les préférences
   * </pre>
   *
   * <code>repeated .PreferenceDTO preferences = 5;</code>
   */
  com.project.booking.stubs.PreferenceDTOOrBuilder getPreferencesOrBuilder(
      int index);
}