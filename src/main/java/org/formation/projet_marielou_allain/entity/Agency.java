package org.formation.projet_marielou_allain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Agency {
    @Id
    @GeneratedValue
    private Long id;

    private String short_id;
    private Date created_at;

    @OneToOne
    private Manager manager;

    @ManyToOne
    private Advisor[] advisors;
}
