package com.project.booking.services;

import com.project.booking.dto.ReservationDTO;
import com.project.booking.entities.Chambre;
import com.project.booking.entities.Preference;
import com.project.booking.entities.Reservation;
import com.project.booking.repositories.ChambreRepository;
import com.project.booking.repositories.ClientRepository;
import com.project.booking.repositories.PreferenceRepository;
import com.project.booking.repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final ChambreRepository chambreRepository;
    private final PreferenceRepository preferenceRepository;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation findReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }


    public boolean deleteReservation(Long id) {
        if(reservationRepository.existsById(id)){
            reservationRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public Reservation saveReservation(ReservationDTO reservationDTO) {
        Reservation res = new Reservation();


        LocalDate startDate = LocalDate.parse(reservationDTO.getDateDebut(), formatter);
        LocalDate endDate = LocalDate.parse(reservationDTO.getDateFin(), formatter);

        // Convert LocalDate to java.util.Date
        Date startDateUtil = Date.from(startDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date endDateUtil = Date.from(endDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        res.setDateDebut(startDateUtil);
        res.setDateFin(endDateUtil);
        res.setClient(clientRepository.findById(reservationDTO.getClientId()).get());
        res.setChambre(chambreRepository.findById(reservationDTO.getChambreId()).get());

        List<Preference> preferences = new ArrayList<>();
        reservationDTO.getPreferences().forEach(preferenceDTO -> {
           preferences.add(preferenceRepository.findByNom(preferenceDTO.getNom()));
        });
        res.setPreferences(preferences);

        return reservationRepository.save(res);

    }

    public Reservation updateReservation(ReservationDTO reservationDTO, Long id) {
        Reservation res = reservationRepository.findById(id).get();

        if(reservationDTO.getDateDebut()!= null) {
            LocalDate startDate = LocalDate.parse(reservationDTO.getDateDebut(), formatter);
            Date startDateUtil = Date.from(startDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            res.setDateDebut(startDateUtil);
        }
        if(reservationDTO.getDateFin()!= null) {
            LocalDate endDate = LocalDate.parse(reservationDTO.getDateFin(), formatter);
            Date endDateUtil = Date.from(endDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            res.setDateFin(endDateUtil);
        }
        if(reservationDTO.getChambreId()!= null) res.setChambre(chambreRepository.findById(reservationDTO.getChambreId()).get());
        if(!reservationDTO.getPreferences().isEmpty()) {
            List<Preference> p = new ArrayList<Preference>();
            reservationDTO.getPreferences().forEach( preferenceDTO -> {
                p.add(preferenceRepository.findByNom(preferenceDTO.getNom()));
            });
            res.setPreferences(p);
        }
        return reservationRepository.save(res);
    }

    public List <Chambre> getAllchambres(){
        return chambreRepository.findAll();
    }

    public List <Preference> getAllPreferences(){
        return preferenceRepository.findAll();
    }

}
