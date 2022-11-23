package com.example.kologkomfurbackend.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String skuId;
    private Double price;
    //evt lav composition
    private Double height;
    private Double length;
    private Double width;
    //
    private String description;

    @JsonBackReference
    @ManyToOne //Many Products to One Brand
    private Brand brand;
}
