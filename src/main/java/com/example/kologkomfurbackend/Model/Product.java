package com.example.kologkomfurbackend.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "product_id")

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
    @JoinColumn(name = "brand_id")
    @ManyToOne //Many Products to One Brand
    private Brand brand;

    public Product() {
    }

    public Product(Long id, String name, String skuId, Double price, Double height, Double length, Double width, String description, Brand brand) {
        this.id = id;
        this.name = name;
        this.skuId = skuId;
        this.price = price;
        this.height = height;
        this.length = length;
        this.width = width;
        this.description = description;
        this.brand = brand;
    }

}
