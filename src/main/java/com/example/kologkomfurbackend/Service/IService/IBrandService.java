package com.example.kologkomfurbackend.Service.IService;

import com.example.kologkomfurbackend.Model.Brand;
import com.example.kologkomfurbackend.Model.Products.Product;

import java.util.List;

public interface IBrandService extends CrudService<Brand,Long> {
    List<Brand> findAllByName(String name);
    List<Brand> findProductsByBrand();



}
