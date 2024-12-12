package com.project.booking.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.booking.entities.Chambre;
import com.project.booking.entities.Client;
import com.project.booking.entities.Preference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {


    @JsonProperty("dateDebut")
    private String dateDebut;

    @JsonProperty("dateFin")
    private String dateFin;

    @JsonProperty("clientId")
    private Long clientId;

    @JsonProperty("chambreId")
    private Long chambreId;

    @JsonProperty("preferences")
    private List<PreferenceDTO> preferences = new ArrayList<>();
}
