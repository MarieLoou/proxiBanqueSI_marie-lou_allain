package org.formation.projet_marielou_allain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Advisor extends Employee{

    @OneToMany
    private List<Client> clients;

}
