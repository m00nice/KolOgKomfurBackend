package com.example.kologkomfurbackend.Repository;

import com.example.kologkomfurbackend.Model.Products.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    @Query("From Product ORDER BY price ASC")
    List<Product> findAllOrderByPriceAsc();
    @Query("From Product ORDER BY price DESC")
    List<Product> findAllOrderByPriceDesc();
    @Query("From Product ORDER BY name ASC")
    List<Product> findByAlphabeticOrderAsc();
    @Query("From Product ORDER BY name DESC")
    List<Product> findByAlphabeticOrderDesc();
}
