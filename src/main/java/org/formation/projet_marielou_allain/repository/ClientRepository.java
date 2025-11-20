package org.formation.projet_marielou_allain.repository;

import org.formation.projet_marielou_allain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
