package com.example.kologkomfurbackend.Model.Products;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "stove")
public class Stove extends Product{

    private int maxHeat;//maximum temperatur
    private int minHeat;//minimum temperatur
    private int volume;//komfur ovn volume
    private String doorGlass;

}
