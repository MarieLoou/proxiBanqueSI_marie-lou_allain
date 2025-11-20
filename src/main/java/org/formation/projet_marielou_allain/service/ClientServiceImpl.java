package org.formation.projet_marielou_allain.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.formation.projet_marielou_allain.entity.Client;
import org.formation.projet_marielou_allain.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository repository;

    @PostConstruct
    private void initDb(){
        repository.saveAll(
                List.of(
                        new Client(),
                        new Client(),
                        new Client(),
                        new Client(),
                        new Client()
                )
        );
    }

    @Override
    public List<Client> getClients() {
        return repository.findAll();
    }

    @Override
    public Client createClient(Client client) {
        return repository.save(client);
    }

    @Override
    public Optional<Client> getClient(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteClient(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Client> updateClient(Long id, Client newData) {
        Client client = repository.findById(id).orElseThrow();
        client.setName(newData.getName());
        return Optional.of(repository.save(client));
    }


}
