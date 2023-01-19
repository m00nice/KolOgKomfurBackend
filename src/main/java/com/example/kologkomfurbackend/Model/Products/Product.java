package com.example.kologkomfurbackend.Model.Products;

import com.example.kologkomfurbackend.Model.Brand;
import com.example.kologkomfurbackend.Model.Function;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )


    private Long id;
    private String name;
    private String skuId;
    private Double price;
    private String productHardware;
    //evt lav composition
    private Double height;
    private Double length;
    private Double width;
    //

    private String description;

    private String energyClass;//hvilken energiklasse har produktet


    private String imgURL;

    private String colour;

    private String fittings;//beslag


    @ManyToOne (fetch = FetchType.LAZY, optional = false)//Many Products to One Brand
    //@JsonManagedReference
    @JsonBackReference
    @JoinColumn(name = "brand_id")
    private Brand brand;



    @ManyToMany(targetEntity = Function.class,fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })//many product to many functions vice versa
    @JoinTable(
            name = "productFunctions",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "function_id")
    )
    @JsonManagedReference
    private List<Function> functions;


}
