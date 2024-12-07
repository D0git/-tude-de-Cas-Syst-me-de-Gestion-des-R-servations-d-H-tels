package com.project.booking.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PreferenceDTO {

    @JsonProperty("nom")
    private String nom;
}
