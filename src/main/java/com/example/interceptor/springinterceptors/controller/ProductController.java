package com.example.interceptor.springinterceptors.controller;

import com.example.interceptor.springinterceptors.model.Product;
import com.example.interceptor.springinterceptors.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products")
    public Product save(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> findById(@PathVariable(value = "id") Integer id)
    {
        Product product = productRepository.findById(id).get();
        return ResponseEntity.ok().body(product);
    }


}
