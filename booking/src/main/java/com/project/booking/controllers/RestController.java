package com.project.booking.controllers;


import com.project.booking.dto.ReservationDTO;
import com.project.booking.entities.Chambre;
import com.project.booking.entities.Preference;
import com.project.booking.entities.Reservation;
import com.project.booking.services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/rest")
@RequiredArgsConstructor
public class RestController {

    private final ReservationService reservationService;

    @GetMapping("/reservations/all")
    public ResponseEntity<List<Reservation>> getAllReservations(){
        return ResponseEntity.ok(reservationService.findAllReservations());
    }

    @GetMapping("/reservations/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable("id") Long id){
        return ResponseEntity.ok(reservationService.findReservationById(id));
    }

    @GetMapping("/chambres/all")
    public ResponseEntity<List<Chambre>> getAllChambres(){
        return ResponseEntity.ok(reservationService.getAllchambres());
    }

    @GetMapping("/preferences/all")
    public ResponseEntity<List<Preference>> getAllPreferences(){
        return ResponseEntity.ok(reservationService.getAllPreferences());
    }

    @PostMapping("/reservations/create")
    public ResponseEntity<Reservation> createReservation(@RequestBody ReservationDTO reservationDTO){
        System.out.println(reservationDTO.toString());
        return ResponseEntity.ok(reservationService.saveReservation(reservationDTO));
    }

    @PatchMapping("/reservations/edit/{id}")
    public ResponseEntity<Reservation> editReservation(@PathVariable("id")Long id,
                                                        @RequestBody ReservationDTO reservationDTO){
        return ResponseEntity.ok(reservationService.updateReservation(reservationDTO,id));
    }
    @DeleteMapping("/reservations/delete/{id}")
    public ResponseEntity<String> deleteReservationById(@PathVariable("id")Long id){
        boolean result = reservationService.deleteReservationById(id);
        return result?ResponseEntity.ok("Reservation deleted successfully"):ResponseEntity.status(404).body("Reservation doesn't exist");
    }
}
