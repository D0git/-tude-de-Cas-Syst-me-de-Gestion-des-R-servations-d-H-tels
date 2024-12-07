package com.project.booking.controllers;

import com.project.booking.dto.ReservationDTO;
import com.project.booking.entities.Reservation;
import com.project.booking.services.ReservationService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "ReservationWS")
@RequiredArgsConstructor
public class SoapService {

    private final ReservationService reservationService;

    @WebMethod
    public List<Reservation> getReservation(){
        return reservationService.findAllReservations();
    }

    @WebMethod
    public Reservation getReservationById(@WebParam(name = "id") Long id){
        return reservationService.findReservationById(id);
    }

    @WebMethod
    public Reservation createReservation(@WebParam(name = "reservation")ReservationDTO reservation){
        return reservationService.saveReservation(reservation);
    }

    @WebMethod
    public Reservation editReservation(@WebParam(name = "reservation")ReservationDTO reservation,@WebParam(name = "id") Long id){
        return reservationService.updateReservation(reservation,id);
    }

    @WebMethod
    public boolean deleteReservationById(@WebParam(name = "id") Long id){
        return reservationService.deleteReservation(id);
    }

}
