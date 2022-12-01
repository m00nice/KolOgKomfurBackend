package com.example.kologkomfurbackend.Model.Customers;

import com.example.kologkomfurbackend.Model.Brand;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;


    private String username;
    private String password;

    @ManyToMany
    @JoinTable(
            name = "customerDiscount",
            joinColumns = @JoinColumn(name = "userCustomer_id"),

            inverseJoinColumns = @JoinColumn(name = "brand_id")
    )
    private Set<Brand> brands;

}
