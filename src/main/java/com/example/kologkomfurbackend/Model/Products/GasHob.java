package com.example.kologkomfurbackend.Model.Products;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "gasHob")
public class GasHob extends Hob{

    private double diameter;
    private String gasType;


}
