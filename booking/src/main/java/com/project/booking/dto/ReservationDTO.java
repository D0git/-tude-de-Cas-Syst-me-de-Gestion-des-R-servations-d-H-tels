package com.project.booking.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.booking.entities.Chambre;
import com.project.booking.entities.Client;
import com.project.booking.entities.Preference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
public class ReservationDTO {

    private Date dateDebut;

    private Date dateFin;

    private Long clientId;

    private Long chambreId;

    private List<PreferenceDTO> preferences;
}
