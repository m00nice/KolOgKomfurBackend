package com.example.kologkomfurbackend.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {

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
    private double weight;
    private String description;

    private String energyClass;//hvilken energiklasse har produktet
    private int maxEnergyConsumption;//energiforbrug


    @JsonBackReference
    @ManyToOne //Many Products to One Brand
    private Brand brand;

    @ManyToMany//many product to many functions vice versa
    @JoinTable(
            name = "productFunctions",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "function_id")
    )
    private Set<Function> functions;

}
