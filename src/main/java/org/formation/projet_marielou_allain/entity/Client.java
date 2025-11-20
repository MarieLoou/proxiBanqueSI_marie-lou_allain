package org.formation.projet_marielou_allain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public Client(String name, String firstName, String phoneNumber, String address, String postalCode, String city) {
        this.name = name;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
    }
}
