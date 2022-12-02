package com.example.kologkomfurbackend.Controller;

import com.example.kologkomfurbackend.Model.*;
import com.example.kologkomfurbackend.Service.ServiceImpl.BrandService;
import com.example.kologkomfurbackend.Service.ServiceImpl.ProductService;
import com.example.kologkomfurbackend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.color.ProfileDataException;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/product")
public class ProductController {


    private ProductService productService;
    private BrandService brandService;

    public ProductController(ProductService productService, BrandService brandService) {
        this.productService = productService;
        this.brandService = brandService;
    }

    @GetMapping
    public ResponseEntity<Set<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.findAll(),HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/create/fridge")
    public ResponseEntity<Product> addFridge(@RequestBody Fridge newFridge) {
        return new ResponseEntity<>(productService.save(newFridge), HttpStatus.OK);
    }

    @PostMapping("/create/oven")
    public ResponseEntity<Product> addOven(@RequestBody Oven newOven) {
        return new ResponseEntity<>(productService.save(newOven), HttpStatus.OK);
    }

    @PostMapping("/create/stove")
    public ResponseEntity<Product> createStove(@RequestParam Long brandId, @RequestBody Stove stove) {
        Product product = brandService.findById(brandId).map(brand -> {
            stove.setBrand(brand);
            return productService.save(stove);
        }).orElseThrow(() -> new ResourceNotFoundException("Brand Id " + brandId + " not found"));

        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @PostMapping("/create/induHob")
    public ResponseEntity<Product> addInduHob(@RequestBody InductionHob newHob) {
        return new ResponseEntity<>(productService.save(newHob), HttpStatus.OK);
    }

    @PostMapping("/create/gasHob")
    public ResponseEntity<Product> addGasHob(@RequestBody GasHob newHob) {
        return new ResponseEntity<>(productService.save(newHob), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Set<Product>> deleteProduct(@PathVariable Product product) {
        productService.delete(product);
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/sku")
    public ResponseEntity<List<Product>> getSku(@RequestParam String sku){
      return new ResponseEntity<>(productService.findAllBySkuId(sku), HttpStatus.OK);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Product> editProduct(@PathVariable Product product) {
        Optional<Product> productTemp = productService.findById(product.getId());
        if (productTemp.isPresent()) {
            if (product.getId() == null) {
                product.setId(product.getId());
            }
            if (product.getName() == null) {
                product.setName(product.getName());
            }
            if (product.getSkuId() == null) {
                product.setSkuId(product.getSkuId());
            }
            if (product.getPrice() == 0) {
                product.setPrice(product.getPrice());
            }
            if (product.getDescription() == null) {
                product.setDescription(product.getDescription());
            }
            productService.save(product);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(product, HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/priceAsc")
    public ResponseEntity<List<Product>> getPriceAsc() {
        return new ResponseEntity<>(productService.findAllOrderByPriceAsc(), HttpStatus.OK);
    }

    @GetMapping("/priceDesc")
    public ResponseEntity<List<Product>> getPriceDesc() {
        return new ResponseEntity<>(productService.findAllOrderByPriceDesc(), HttpStatus.OK);
    }

    @GetMapping("/nameAsc")
    public ResponseEntity<List<Product>> getNameAsc() {
        return new ResponseEntity<>(productService.findByAlphabeticOrderAsc(), HttpStatus.OK);
    }

    @GetMapping("/nameDesc")
    public ResponseEntity<List<Product>> getNameDesc() {
        return new ResponseEntity<>(productService.findByAlphabeticOrderDesc(), HttpStatus.OK);
    }
}
