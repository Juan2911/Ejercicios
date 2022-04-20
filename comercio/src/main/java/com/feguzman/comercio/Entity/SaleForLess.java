package com.feguzman.comercio.Entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@Data
@Entity
@Table(name = "SaleForLess")
public class SaleForLess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "distributorName")
    private String distributorName;

    @OneToOne
    private User user;

    @OneToOne
    private Client client;

    @Column(name = "factureNumber")
    private int factureNumber;

    @Column(name = "factureDate")
    private Date factureDate;

    @OneToMany
    private List<DetailOfSaleForLess> detailOfSaleForLess;

    @Column(name = "totalOfSaleForLess")
    private int totalOfSaleForLess;
}