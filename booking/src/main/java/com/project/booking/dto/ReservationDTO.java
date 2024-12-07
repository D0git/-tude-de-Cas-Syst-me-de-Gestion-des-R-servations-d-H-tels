package com.project.booking.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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

@Data
@Getter
@Setter

public class ReservationDTO {

    @JsonProperty("date_debut")
    private Date dateDebut;

    @JsonProperty("date_fin")
    private Date dateFin;

    @JsonProperty("client_id")
    private Long clientId;

    @JsonProperty("chambre_id")
    private Long chambreId;

    @JsonProperty("preferences")
    private List<PreferenceDTO> preferences;
}
