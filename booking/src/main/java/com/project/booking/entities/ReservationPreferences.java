package com.project.booking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservation_preferences")
public class ReservationPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "preference_id")
    private Preference preference;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
}
