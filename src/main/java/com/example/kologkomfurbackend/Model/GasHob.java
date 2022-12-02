package com.example.kologkomfurbackend.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "gasHob")
public class GasHob extends Hob{

    private int hobAmount;
    private boolean electricIgnite;
    private boolean adjustableFlame;
    private boolean safetyValve;
    private boolean fryPlate;
    private String hobDescription;



}
