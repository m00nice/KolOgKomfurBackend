package com.example.kologkomfurbackend.Controller;

import com.example.kologkomfurbackend.Model.Brand;
import com.example.kologkomfurbackend.Service.ServiceImpl.BrandService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/brand")
public class BrandController {
    BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping
    public ResponseEntity<Set<Brand>> getAllBrands() {
        return new ResponseEntity<>(brandService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Brand> addBrand(Brand newBrand) {
        return new ResponseEntity<>(brandService.save(newBrand), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Set<Brand>> deleteBrands(@PathVariable Brand brand) {
        brandService.delete(brand);
        return new ResponseEntity<>(brandService.findAll(), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Brand> editBrands(@PathVariable Brand brand) {
        Optional<Brand> brandTemp = brandService.findById(brand.getId());
        if (brandTemp.isPresent()) {
            if (brand.getId() == null) {
                brand.setId(brand.getId());
            }
            if (brand.getName() == null) {
                brand.setName(brand.getName());
            }
            brandService.save(brand);
            return new ResponseEntity<>(brand,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(brand, HttpStatus.NOT_FOUND);
        }
    }
}
