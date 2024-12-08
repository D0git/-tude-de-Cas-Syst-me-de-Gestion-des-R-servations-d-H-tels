package com.project.booking.controllers;


import com.project.booking.dto.ReservationDTO;
import com.project.booking.entities.Chambre;
import com.project.booking.entities.Preference;
import com.project.booking.entities.Reservation;
import com.project.booking.services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GraphQLService {

    /*private final ReservationService reservationService;

    // Query to fetch all reservations
    @QueryMapping
    public List<Reservation> findAllReservations() {
        return reservationService.findAllReservations();
    }

    // Query to fetch a reservation by ID
    @QueryMapping
    public Reservation findReservationById(@Argument Long id) {
        return reservationService.findReservationById(id);
    }

    // Mutation to delete a reservation
    @MutationMapping
    public boolean deleteReservation(@Argument Long id) {
        return reservationService.deleteReservation(id);
    }

    // Mutation to create/save a reservation
    @MutationMapping
    public Reservation saveReservation(@Argument ReservationDTO reservationDTO) {

        return reservationService.saveReservation(reservationDTO);
    }

    // Mutation to update an existing reservation
    @MutationMapping
    public Reservation updateReservation(@Argument ReservationDTO reservationDTO, @Argument Long id) {
        return reservationService.updateReservation(reservationDTO, id);
    }

    @QueryMapping
    public List<Chambre> getAllChambres() {
        return reservationService.getAllchambres();
    }

    @QueryMapping
    public List<Preference> getAllPreferences(){
        return reservationService.getAllPreferences();
    }
*/

}

