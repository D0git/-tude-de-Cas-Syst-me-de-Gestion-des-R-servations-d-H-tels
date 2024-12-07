package com.project.booking.repositories;

import com.project.booking.entities.Chambre;
import com.project.booking.entities.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenceRepository  extends JpaRepository<Preference, Long> {

    Preference findByNom(String nom);
}
