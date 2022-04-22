package com.feguzman.comercio.Entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "costToBuy")
    private double costToBuy;

    @OneToOne
    private Supplier supplier;

    @OneToOne
    private TypeOfTheArticle typeOfTheArticle;

    @Column(name = "measurementUnit")
    private String measurementUnit;
}