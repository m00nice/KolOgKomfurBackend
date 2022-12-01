package com.example.kologkomfurbackend.Service.ServiceImpl;

import com.example.kologkomfurbackend.Model.Products.Product;
import com.example.kologkomfurbackend.Repository.ProductRepository;
import com.example.kologkomfurbackend.Service.IService.IProductService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
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
        Set<Product> products = new HashSet<>();
        productRepository.findAll().forEach(products::add);
        return products;
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

    @Override
    public List<Product> findAllOrderByPriceAsc(){
        return productRepository.findAllOrderByPriceAsc();
    }
    @Override
    public  List<Product> findAllOrderByPriceDesc(){
       return productRepository.findAllOrderByPriceDesc();
    }
    @Override
    public  List<Product> findByAlphabeticOrderAsc(){
        return productRepository.findByAlphabeticOrderAsc();
    }
    @Override
    public   List<Product> findByAlphabeticOrderDesc(){
        return productRepository.findByAlphabeticOrderDesc();
    }
}
