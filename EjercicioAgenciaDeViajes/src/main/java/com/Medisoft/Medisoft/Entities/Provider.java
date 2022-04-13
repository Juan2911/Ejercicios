package com.Medisoft.Medisoft.Entities;

import lombok.Data;

@Data
public class Provider {
    private int id;
    private String name;
    private String email;
    private String telephoneName;
    private String telephone;
    //uno o muchos
    private ItemCategory itemCategory;
}
