package com.testspring.controller;

import com.testspring.model.Product;
import com.testspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("") // http://localhost:8080/api/v1/Products
    List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
