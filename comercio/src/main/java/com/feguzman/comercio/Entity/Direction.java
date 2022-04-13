package com.feguzman.comercio.Entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "Direction")
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "street")
    private String street;

    @Column(name = "altitude")
    private int altitude;

    @Column(name = "district")
    private String district;
}
