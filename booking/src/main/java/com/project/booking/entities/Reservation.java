package com.project.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateDebut;
    private Date dateFin;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonIgnoreProperties("reservation")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "chambre_id")
    @JsonIgnoreProperties("reservation")
    private Chambre chambre;

    @ManyToMany
    @JoinTable(
            name = "reservation_preferences",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "preference_id")
    )

    @JsonIgnoreProperties("reservation")
    private List<Preference> preferences;
}
