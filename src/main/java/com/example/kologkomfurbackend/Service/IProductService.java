package com.example.kologkomfurbackend.Service;

import com.example.kologkomfurbackend.Model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductService extends CrudService<Product,Long> {
}
