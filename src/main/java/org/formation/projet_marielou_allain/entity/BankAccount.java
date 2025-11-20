package org.formation.projet_marielou_allain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

enum BankAccountType {
    CURRENT_ACCOUNT,
    SAVINGS_ACCOUNT
}

@Entity
public class BankAccount {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Client owner;

    private int balance;
    private int authorized_overdraft_in_cents;
    private float remuneration_rate;
    private BankAccountType type;

}
