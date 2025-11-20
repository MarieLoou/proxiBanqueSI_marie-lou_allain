package org.formation.projet_marielou_allain.controller;

import lombok.RequiredArgsConstructor;
import org.formation.projet_marielou_allain.entity.Client;
import org.formation.projet_marielou_allain.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService service;

    @GetMapping("/clients")
    List<Client> getClients(){
        return service.getClients();
    };
    @PostMapping("/clients")
    Client createClient(@RequestBody Client coffee){
        return service.createClient(coffee);
    };

    @GetMapping("/clients/{id}")
    ResponseEntity<Client> getClientById(@PathVariable Long id){
        return service.getClient(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    };

    @PutMapping("/clients/{id}")
    ResponseEntity<Client> updateClientById(@PathVariable Long id, @RequestBody Client newData){
        return service.updateClient(id, newData).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    };
}
