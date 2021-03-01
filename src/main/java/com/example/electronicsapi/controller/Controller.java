package com.example.electronicsapi.controller;

import com.example.electronicsapi.entities.Product;
import com.example.electronicsapi.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final ProductService productService;

    public Controller(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to electronics API";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return this.productService.getProducts();
    }

    @GetMapping("/product/{productId}")
    public Product getProduct(@PathVariable String productId) {
        return this.productService.getProduct(Long.parseLong(productId));
    }
}
