package com.example.kologkomfurbackend.Model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "inductionHob")
public class InductionHob extends Hob{

    private int hobAmount;
    private double maxPower;
    private String controls;
    private boolean panSensor;
    private boolean boosterFunction;
    private boolean residualHeatIndicator;
    private boolean overheatProtec;
    private boolean liquidProtec;

}
