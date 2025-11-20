package org.formation.projet_marielou_allain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Advisor extends Employee{

    @OneToMany
    private List<Client> clients;

}
