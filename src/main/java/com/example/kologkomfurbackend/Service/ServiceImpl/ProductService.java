package com.example.kologkomfurbackend.Service.ServiceImpl;

import com.example.kologkomfurbackend.Model.Product;
import com.example.kologkomfurbackend.Repository.ProductRepository;
import com.example.kologkomfurbackend.Service.IService.IProductService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductService implements IProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Set<Product> findAll() {
        Set<Product> activities = new HashSet<>();
        productRepository.findAll().forEach(activities::add);
        return activities;
    }

    @Override
    public Product save(Product object) {
        return productRepository.save(object);
    }

    @Override
    public void delete(Product object) {
        productRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        productRepository.deleteById(aLong);

    }

    @Override
    public Optional<Product> findById(Long aLong) {
        return productRepository.findById(aLong);
    }


}
