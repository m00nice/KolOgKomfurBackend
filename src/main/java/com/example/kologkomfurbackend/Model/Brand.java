package com.example.kologkomfurbackend.Model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "brand")
public class Brand  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true)    // One brand To Many Products
    private Set<Product> productList = new HashSet<>();

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }
}
