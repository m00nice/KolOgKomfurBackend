package com.example.kologkomfurbackend.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.lang.reflect.Array;


@Getter
@Setter
@Entity
@Table(name = "oven")
public class Oven extends Product{


    private int maxHeat;
    private int minHeat;

    private String energyClass;
    private String programmer;
    private boolean elecTempContr;
    private String lighting;
    private boolean autoLight;
    private String doorGlass;
    private boolean highDensInsul;
    private String coolingVent;
    private boolean childSafety;
    private String muffle;
    private int capacity;
    private boolean steamDisch;
    private String thermostat;
    private int consumption;
    private boolean cookingProbe;
    private boolean softCloseDoor;
    private boolean foldGrillHeatElement;
    private String rotisserieSpit;

}
