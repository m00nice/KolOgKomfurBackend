package com.example.kologkomfurbackend.Repository;

import com.example.kologkomfurbackend.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
