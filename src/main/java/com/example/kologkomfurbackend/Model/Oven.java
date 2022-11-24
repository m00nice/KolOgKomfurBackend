package com.example.kologkomfurbackend.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.lang.reflect.Array;


@Data
@Entity
@Table(name = "oven")
public class Oven extends Product{


    private int maxHeat;//maximum temperatur
    private int minHeat;//minimum temperatur
    private int volume;//ovns volume
    private String doorGlass;





}
