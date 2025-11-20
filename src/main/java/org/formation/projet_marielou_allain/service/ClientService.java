package org.formation.projet_marielou_allain.service;

import org.formation.projet_marielou_allain.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Client> getClient ();

    Client createClient(Client agency);

    Optional<Client> getClient(Long id);

    Optional<Client> deleteClient(Long id);

    Optional<Client> updateClient(Long id, Client newData);
}
