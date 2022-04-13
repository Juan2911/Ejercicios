package com.Medisoft.Medisoft.Entities;

import lombok.Data;

@Data
public class Item {
    private int id;
    private String name;
    private String description;
    //uno y solo uno
    private ItemSize itemSize;

}
