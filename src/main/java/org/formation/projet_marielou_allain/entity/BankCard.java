package org.formation.projet_marielou_allain.entity;

import jakarta.persistence.*;

import java.util.Date;

enum BankCardType {
    VISA_ELECTRON,
    VISA_PREMIER
}

enum BankCardStatus{
    ACTIVE,
    EXPIRED,
    DISABLED
}

@Entity
public class BankCard {
    @Id
    @GeneratedValue
    private Long id;

    private BankCardType type;
    private BankCardStatus status;
    private Date expiration_ate;

    @OneToOne
    private Client owner;

    @ManyToOne
    private BankAccount bankAccount;
}
