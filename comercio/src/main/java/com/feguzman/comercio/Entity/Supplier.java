package com.feguzman.comercio.Entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "Supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "locality")
    private String locality;

    @OneToOne
    private Direction direction;

    @Column(name = "telephone")
    private int telephone;
}