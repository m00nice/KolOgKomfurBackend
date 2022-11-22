package com.example.kologkomfurbackend.Model;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String skuId;
    private Double price;
    private String description;

}
