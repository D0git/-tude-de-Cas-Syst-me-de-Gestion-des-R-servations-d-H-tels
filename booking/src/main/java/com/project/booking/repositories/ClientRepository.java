package com.project.booking.repositories;

import com.project.booking.entities.Chambre;
import com.project.booking.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {
}
