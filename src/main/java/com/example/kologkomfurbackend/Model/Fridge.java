package com.example.kologkomfurbackend.Model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "fridge")
public class Fridge extends Product{

    private int doorAmount;
    private int drawerAmount;
    private int tempAmount;
    private int maxTemp;
    private int minTemp;
    private boolean icemaker;
    private boolean glassdoor;
    private boolean leftDoor;
    private String energyClass;

}
