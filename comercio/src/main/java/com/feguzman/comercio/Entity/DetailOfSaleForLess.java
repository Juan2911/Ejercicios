package com.feguzman.comercio.Entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "DetailOfSaleForLess")
public class DetailOfSaleForLess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    private Item item;

    @Column(name = "unitQuantity")
    private int unitQuantity;

    @Column(name = "cost")
    private int cost;

    @Column(name = "totalCost")
    private int totalCost;
}
