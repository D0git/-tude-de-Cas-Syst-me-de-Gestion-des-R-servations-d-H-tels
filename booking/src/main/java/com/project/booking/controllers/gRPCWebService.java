package com.project.booking.controllers;

import com.project.booking.dto.PreferenceDTO;
import com.project.booking.dto.ReservationDTO;
import com.project.booking.repositories.ChambreRepository;
import com.project.booking.repositories.ClientRepository;
import com.project.booking.repositories.PreferenceRepository;
import com.project.booking.services.ReservationService;
import com.project.booking.stubs.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;


import java.util.List;

import java.util.stream.Collectors;


@GrpcService
public class gRPCWebService extends ReservationServiceGrpc.ReservationServiceImplBase {

    private final ReservationService reservationService;
    private final ChambreRepository chambreRepository;
    private final ClientRepository clientRepository;
    private final PreferenceRepository preferenceRepository;

    public gRPCWebService(ReservationService reservationService, ChambreRepository chambreRepository, ClientRepository clientRepository, PreferenceRepository preferenceRepository){
        this.reservationService = reservationService;
        this.chambreRepository = chambreRepository;
        this.clientRepository = clientRepository;
        this.preferenceRepository = preferenceRepository;
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
                                .filter(pref -> pref != null)
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

    @Override
    public void reservationById(getReservationByIdRequest request, StreamObserver<getReservationByIdResponse> responseObserver) {
        try {
            // Rechercher la réservation par ID
            com.project.booking.entities.Reservation reservationEntity = reservationService.findReservationById(Long.parseLong(request.getId()));

            if (reservationEntity == null) {
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Reservation with ID " + request.getId() + " not found")
                        .asRuntimeException());
                return;
            }

            // Transformer la réservation en objet gRPC
            Reservation reservationGrpc = Reservation.newBuilder()
                    .setId(reservationEntity.getId())
                    .setDateDebut(reservationEntity.getDateDebut().toString())
                    .setDateFin(reservationEntity.getDateFin().toString())
                    .setChambre(Chambre.newBuilder()
                            .setId(reservationEntity.getChambre().getId())
                            .setPrix(String.valueOf(reservationEntity.getChambre().getPrix()))
                            .setDisponible(reservationEntity.getChambre().isDisponible())
                            .setType(TypeChambre.valueOf(reservationEntity.getChambre().getType().name()))
                            .build())
                    .setClient(Client.newBuilder()
                            .setId(reservationEntity.getClient().getId())
                            .setNom(reservationEntity.getClient().getNom())
                            .setPrenom(reservationEntity.getClient().getPrenom())
                            .setEmail(reservationEntity.getClient().getEmail())
                            .setTelephone(reservationEntity.getClient().getTelephone())
                            .build())
                    .addAllPreferences(reservationEntity.getPreferences().stream()
                            .map(pref -> Preference.newBuilder()
                                    .setId(pref.getId())
                                    .setNom(pref.getNom())
                                    .build())
                            .collect(Collectors.toList()))
                    .build();

            // Envoyer la réponse
            responseObserver.onNext(getReservationByIdResponse.newBuilder()
                    .setReservation(reservationGrpc)
                    .build());
            responseObserver.onCompleted();

        } catch (Exception e) {
            // Gestion des erreurs
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error retrieving reservation: " + e.getMessage())
                    .augmentDescription("Cause: " + e.getCause())
                    .asRuntimeException());
        }
    }

    @Override
    public void deleteReservationById(deleteReservationByIdRequest request, StreamObserver<deleteReservationByIdResponse> responseObserver) {
        try {
            // Récupérer l'ID de la réservation à supprimer
            Long reservationId = Long.parseLong(request.getId());

            // Supprimer la réservation
            reservationService.deleteReservationById(reservationId);

            // Construire une réponse de succès
            deleteReservationByIdResponse response = deleteReservationByIdResponse.newBuilder()
                    .setDeleted(DeleteReservationResult.newBuilder()
                            .setResult("Reservation with ID " + reservationId + " deleted successfully")
                            .build())
                    .build();

            // Envoyer la réponse
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            // Gestion des erreurs
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error deleting reservation: " + e.getMessage())
                    .augmentDescription("Cause: " + e.getCause())
                    .asRuntimeException());
        }
    }


    @Override
    public void allChambres(getAllChambresRequest request, StreamObserver<getAllChambresResponse> responseObserver) {
        try {
            // Récupérer toutes les chambres
            List<Chambre> chambres = chambreRepository.findAll().stream()
                    .map(chambre -> Chambre.newBuilder()
                            .setId(chambre.getId())
                            .setPrix(String.valueOf(chambre.getPrix()))
                            .setDisponible(chambre.isDisponible())
                            .setType(TypeChambre.valueOf(chambre.getType().name())) // Assurez-vous que TypeChambre correspond à vos types de chambres
                            .build())
                    .collect(Collectors.toList());

            // Construire la réponse et l'envoyer
            getAllChambresResponse response = getAllChambresResponse.newBuilder()
                    .addAllChambres(chambres)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Gestion des erreurs
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error retrieving chambres: " + e.getMessage())
                    .augmentDescription("Cause: " + e.getCause())
                    .asRuntimeException());
        }
    }


    @Override
    public void allPreferences(getAllPreferencesRequest request, StreamObserver<getAllPreferencesResponse> responseObserver) {
        try {
            // Récupérer toutes les préférences
            List<Preference> preferences = preferenceRepository.findAll().stream()
                    .map(pref -> Preference.newBuilder()
                            .setId(pref.getId())
                            .setNom(pref.getNom())
                            .build())
                    .collect(Collectors.toList());

            // Construire la réponse et l'envoyer
            getAllPreferencesResponse response = getAllPreferencesResponse.newBuilder()
                    .addAllPreferences(preferences)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            // Gestion des erreurs
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error retrieving preferences: " + e.getMessage())
                    .augmentDescription("Cause: " + e.getCause())
                    .asRuntimeException());
        }
    }

    private Reservation convertToGrpcReservation(com.project.booking.entities.Reservation reservation) {
        // Convertir les chambres et les préférences en leur représentation gRPC
        Chambre grpcChambre = Chambre.newBuilder()
                .setId(reservation.getChambre().getId())
                .setPrix(String.valueOf(reservation.getChambre().getPrix()))
                .setDisponible(reservation.getChambre().isDisponible())
                .setType(TypeChambre.valueOf(reservation.getChambre().getType().name()))  // Utilisation de l'énumération gRPC
                .build();

        Client grpcClient = Client.newBuilder()
                .setId(reservation.getClient().getId())
                .setNom(reservation.getClient().getNom())
                .setPrenom(reservation.getClient().getPrenom())
                .setEmail(reservation.getClient().getEmail())
                .setTelephone(reservation.getClient().getTelephone())
                .build();

        List<Preference> grpcPreferences = reservation.getPreferences().stream()
                .map(pref -> Preference.newBuilder()
                        .setId(pref.getId())
                        .setNom(pref.getNom())
                        .build())
                .collect(Collectors.toList());

        // Retourner l'objet Reservation avec tous ses sous-objets convertis
        return Reservation.newBuilder()
                .setId(reservation.getId())
                .setDateDebut(reservation.getDateDebut().toString())
                .setDateFin(reservation.getDateFin().toString())
                .setChambre(grpcChambre)
                .setClient(grpcClient)
                .addAllPreferences(grpcPreferences)
                .build();
    }


    @Override
    public void saveReservation(saveReservationRequest request, StreamObserver<saveReservationResponse> responseObserver) {
        try {
            // Transformer le request gRPC en DTO
            ReservationDTO reservationDTO = new ReservationDTO();
            reservationDTO.setDateDebut(request.getReservation().getDateDebut());
            reservationDTO.setDateFin(request.getReservation().getDateFin());
            reservationDTO.setClientId(request.getReservation().getClientId());
            reservationDTO.setChambreId(request.getReservation().getChambreId());
            reservationDTO.setPreferences(request.getReservation().getPreferencesList().stream()
                    .map(pref -> new PreferenceDTO(pref.getNom()))  // S'assurer que PreferenceDTO accepte une String ou autre type attendu
                    .collect(Collectors.toList()));

            // Appeler la méthode saveReservation du service
            com.project.booking.entities.Reservation reservation = reservationService.saveReservation(reservationDTO);

            // Convertir l'objet Reservation en Reservation (stub gRPC)
            com.project.booking.stubs.Reservation grpcReservation = convertToGrpcReservation(reservation);

            // Construire la réponse en utilisant les stubs de gRPC
            saveReservationResponse response = saveReservationResponse.newBuilder()
                    .setReservation(grpcReservation)  // Utilisez l'objet converti
                    .build();

            // Envoyer la réponse
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error saving reservation: " + e.getMessage())
                    .augmentDescription("Cause: " + e.getCause())
                    .asRuntimeException());
        }
    }

    @Override
    public void updateReservation(updateReservationRequest request, StreamObserver<updateReservationResponse> responseObserver) {
        try {
            // Convertir la demande gRPC en DTO
            System.out.println(request.getReservation().toString());
            ReservationDTO reservationDTO = new ReservationDTO();
            reservationDTO.setDateDebut(request.getReservation().getDateDebut());
            reservationDTO.setDateFin(request.getReservation().getDateFin());
            reservationDTO.setClientId(request.getReservation().getClientId());
            reservationDTO.setChambreId(request.getReservation().getChambreId());
            request.getReservation().getPreferencesList().forEach(pref ->{
                com.project.booking.dto.PreferenceDTO pre = new com.project.booking.dto.PreferenceDTO(pref.getNom());

                reservationDTO.getPreferences().add(pre);
            });
            // Appeler la méthode updateReservation du service
            com.project.booking.entities.Reservation reservation = reservationService.updateReservation(reservationDTO, request.getId());
            // Convertir la réservation mise à jour en réponse gRPC
            Reservation grpcReservation = convertToGrpcReservation(reservation);

            // Construire la réponse et l'envoyer
            updateReservationResponse response = updateReservationResponse.newBuilder()
                    .setReservation(grpcReservation)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Error updating reservation: " + e.getMessage())
                    .augmentDescription("Cause: " + e.getCause())
                    .asRuntimeException());
        }
    }
}
