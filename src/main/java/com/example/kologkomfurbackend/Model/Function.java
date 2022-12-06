package com.example.kologkomfurbackend.Model;


import com.example.kologkomfurbackend.Model.Products.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "functions")
public class Function {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;
    private String description;//yderligere info

    @ManyToMany(targetEntity = Product.class,fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JsonBackReference
    private List<Product> product;

}
