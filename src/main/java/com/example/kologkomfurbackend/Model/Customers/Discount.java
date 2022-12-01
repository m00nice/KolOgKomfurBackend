package com.example.kologkomfurbackend.Model.Customers;

import com.example.kologkomfurbackend.Model.Brand;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

public class Discount {

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("customerId")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("brandId")
    private Brand brand;

    private double discountAmount;

}
