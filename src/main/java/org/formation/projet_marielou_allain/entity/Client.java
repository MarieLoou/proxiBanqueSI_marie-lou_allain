package org.formation.projet_marielou_allain.entity;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String firstName;
    private String phoneNumber;

    private String address;
    private String postalCode;
    private String city;

    @ManyToOne
    private Advisor advisor;

    @OneToOne
    private BankAccount currentAccount;

    @OneToOne
    private BankAccount savingAccount;
}
