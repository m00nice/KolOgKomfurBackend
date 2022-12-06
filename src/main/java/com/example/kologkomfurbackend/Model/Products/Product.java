package com.example.kologkomfurbackend.Model.Products;

import com.example.kologkomfurbackend.Model.Brand;
import com.example.kologkomfurbackend.Model.Colour;
import com.example.kologkomfurbackend.Model.Function;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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
    //evt lav composition
    private Double height;
    private Double length;
    private Double width;
    //
    private double weight;
    private String description;

    private String energyClass;//hvilken energiklasse har produktet
    private int maxEnergyConsumption;//energiforbrug

    private String imgURL;




    @ManyToOne//Many Products to One Brand
    @JsonManagedReference
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


    @ManyToMany(targetEntity = Colour.class,fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })//many product to many colours vice versa
    @JoinTable(
            name = "productColour",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "colour_id")
    )
    @JsonManagedReference
    private List<Colour> colours;

}
