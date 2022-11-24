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


    private int maxHeat;
    private int minHeat;
    private int volume;
    private String doorGlass;





}
