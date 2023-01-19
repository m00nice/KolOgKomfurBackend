package com.example.kologkomfurbackend.Service.ServiceImpl;

import com.example.kologkomfurbackend.Model.Brand;
import com.example.kologkomfurbackend.Model.Products.Product;
import com.example.kologkomfurbackend.Repository.BrandRepository;
import com.example.kologkomfurbackend.Service.IService.IBrandService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BrandService implements IBrandService {
    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    @Override
    public Set<Brand> findAll() {
        Set<Brand> brands = new HashSet<>();
        brandRepository.findAll().forEach(brands::add);
        return brands;
    }

    @Override
    public Brand save(Brand object) {
        return brandRepository.save(object);
    }

    @Override
    public void delete(Brand object) {
        brandRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        brandRepository.deleteById(aLong);

    }

    @Override
    public Optional<Brand> findById(Long aLong) {
        return brandRepository.findById(aLong);
    }


    @Override
    public List<Brand> findAllByName(String name) {
        return brandRepository.findAllByName(name);
    }

    @Override
    public List<Brand> findProductsByBrand() {
        return brandRepository.findProductsByBrand();
    }

}

