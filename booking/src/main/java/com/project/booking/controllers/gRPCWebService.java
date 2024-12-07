package com.project.booking.controllers;

import com.project.booking.services.ReservationService;
import com.project.booking.stubs.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;


@GrpcService
public class gRPCWebService extends ReservationServiceGrpc.ReservationServiceImplBase {

    private final ReservationService reservationService;

    public gRPCWebService(ReservationService reservationService){
        this.reservationService = reservationService;
    }



    @Override
    public void allReservations(getAllReservationsRequest request, StreamObserver<getAllReservationsResponse> responseObserver) {
        List<Reservation> reservations = reservationService.findAllReservations().stream()
                .map(reservation -> Reservation.newBuilder()
                        .setId(reservation.getId())
                        .setDateDebut(reservation.getDateDebut().toString())
                        .setDateFin(reservation.getDateFin().toString())
                        .setChambre(Chambre.newBuilder()
                                .setId(reservation.getChambre().getId())
                                .setPrix(String.valueOf(reservation.getChambre().getPrix()))
                                .setDisponible(reservation.getChambre().isDisponible())
                                .setType(TypeChambre.valueOf(reservation.getChambre().getType().name()))
                                .build())
                        .setClient(Client.newBuilder()
                                .setId(reservation.getClient().getId())
                                .setNom(reservation.getClient().getNom())
                                .setPrenom(reservation.getClient().getPrenom())
                                .setEmail(reservation.getClient().getEmail())
                                .setTelephone(reservation.getClient().getTelephone())
                                .build())
                        .addAllPreferences(reservation.getPreferences().stream()
                                .map(pref -> Preference.newBuilder()
                                        .setId(pref.getId())
                                        .setNom(pref.getNom())
                                        .build())
                                .collect(Collectors.toList()))
                        .build())
                .collect(Collectors.toList());

        responseObserver.onNext(getAllReservationsResponse.newBuilder()
                .addAllReservations(reservations)
                .build());
        responseObserver.onCompleted();


    }

}
