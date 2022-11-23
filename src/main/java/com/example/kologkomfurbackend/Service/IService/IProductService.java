package com.example.kologkomfurbackend.Service.IService;

import com.example.kologkomfurbackend.Model.Product;

import java.util.List;

public interface IProductService extends CrudService<Product,Long> {
    List<Product> findAllOrderByPriceAsc();
    List<Product> findAllOrderByPriceDesc();

    List<Product> findByAlphabeticOrderAsc();
    List<Product> findByAlphabeticOrderDesc();
}
