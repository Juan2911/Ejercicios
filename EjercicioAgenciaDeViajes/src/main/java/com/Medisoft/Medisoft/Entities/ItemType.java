package com.Medisoft.Medisoft.Entities;

import lombok.Data;

@Data
public class ItemType {
    private int id;
    private String description;
    //uno o muchos
    private Item item;
}
