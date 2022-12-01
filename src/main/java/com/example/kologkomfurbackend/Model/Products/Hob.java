package com.example.kologkomfurbackend.Model.Products;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class Hob extends Product{

    private int hobAmount;//mængden af kogeplader/zones

    private String controls;//beskrivelse af kontrolsystem(knapper eller touch)

    private String hobDescription;//yderligere info


}
