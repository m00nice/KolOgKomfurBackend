package com.example.kologkomfurbackend.Service.IService;

import com.example.kologkomfurbackend.Model.Products.Product;

import java.util.List;

public interface IProductService extends CrudService<Product,Long> {
    List<Product> findAllOrderByPriceAsc();
    List<Product> findAllOrderByPriceDesc();

    List<Product> findByAlphabeticOrderAsc();
    List<Product> findByAlphabeticOrderDesc();

    List<Product> findAllBySkuId(String sku);
}
