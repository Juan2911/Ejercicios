package com.Medisoft.Medisoft.Entities;

import lombok.Data;

@Data
public class ItemCategory {
    private int id;
    private String name;
    private String description;
    //uno o muchos
    private ItemType itemType;
}
