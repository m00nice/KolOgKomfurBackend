package com.example.kologkomfurbackend.Repository;

import com.example.kologkomfurbackend.Model.Brand;
import com.example.kologkomfurbackend.Model.Products.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BrandRepository extends CrudRepository<Brand, Long> {

    List<Brand> findAllByName(String name);


    @Query("From Brand WHERE id = 1 ")
    List<Brand> findProductsByBrand();






}
