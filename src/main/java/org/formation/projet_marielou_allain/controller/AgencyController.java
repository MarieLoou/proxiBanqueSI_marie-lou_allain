package org.formation.projet_marielou_allain.controller;

import lombok.RequiredArgsConstructor;
import org.formation.projet_marielou_allain.entity.Agency;
import org.formation.projet_marielou_allain.service.AgencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AgencyController {
    private final AgencyService service;

    @GetMapping("/agencies")
    List<Agency> getAgencies(){
        return service.getAgencies();
    };
    @PostMapping("/agencies")
    Agency createAgency(@RequestBody Agency client){
        return service.createAgency(client);
    };

    @GetMapping("/agencies/{id}")
    ResponseEntity<Agency> getAgencyById(@PathVariable Long id){
        return service.getAgency(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    };

    @PutMapping("/agencies/{id}")
    ResponseEntity<Agency> updateAgencyById(@PathVariable Long id, @RequestBody Agency newData){
        return service.updateAgency(id, newData).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    };
}
