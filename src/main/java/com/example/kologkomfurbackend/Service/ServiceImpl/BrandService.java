package com.example.kologkomfurbackend.Service.ServiceImpl;

import com.example.kologkomfurbackend.Model.Brand;
import com.example.kologkomfurbackend.Repository.BrandRepository;
import com.example.kologkomfurbackend.Service.IService.IBrandService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class BrandService implements IBrandService {
    private BrandRepository brandRepository;
    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    @Override
    public Set<Brand> findAll() {
        Set<Brand> activities = new HashSet<>();
        brandRepository.findAll().forEach(activities::add);
        return activities;
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


}

