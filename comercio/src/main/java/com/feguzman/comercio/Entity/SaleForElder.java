package com.feguzman.comercio.Entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@Data
@Entity
@Table(name = "SaleForElder")
public class SaleForElder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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
    private List<DetailOfSaleForElder> detailOfSaleForElder;

    @Column(name = "totalOfSaleForElder")
    private double totalOfSaleForElder;
}
