package com.example.kologkomfurbackend.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "GasHob")
public class GasHob extends Hob{

    private boolean electricIgnite;
    private boolean adjustableFlame;
    private boolean safetyValve;
    private boolean fryPlate;
    private String hobDescription;



}
