package org.formation.projet_marielou_allain.service;

import org.formation.projet_marielou_allain.entity.Agency;

import java.util.List;
import java.util.Optional;

public interface AgencyService {

    List<Agency> getAgencies ();

    Agency createAgency(Agency agency);

    Optional<Agency> getAgency(Long id);

    Optional<Agency> updateAgency(Long id, Agency newData);
}
