package org.formation.projet_marielou_allain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class BankAccount {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Client owner;

}
