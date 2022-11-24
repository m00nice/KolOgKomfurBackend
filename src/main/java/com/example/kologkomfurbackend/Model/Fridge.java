package com.example.kologkomfurbackend.Model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "fridge")
public class Fridge extends Product{

    private int doorAmount;//mængden af døre

    private int drawerAmount;//mængden af skuffer

    private int tempAmount;//mængden af døre

    private int minTemp;//minimum temperatur

    private String climateClass;//Hvilket klima passer til køleskabet

    private int noiseLevel;//Støjniveau

    private boolean glassdoor;//om køleskab har glassdør

    private boolean leftDoor;//om køleskab har glassdør







}
