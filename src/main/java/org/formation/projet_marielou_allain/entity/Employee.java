package org.formation.projet_marielou_allain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToOne
    private Agency agency;

}
