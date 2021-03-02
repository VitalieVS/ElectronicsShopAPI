package com.example.electronicsapi.controller;

import com.example.electronicsapi.entities.Category;
import com.example.electronicsapi.entities.Product;
import com.example.electronicsapi.services.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class Controller {

    private final ProductService productService;

    public Controller(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return this.productService.getProducts();
    }

    @GetMapping("/product/{productId}")
    public Product getProduct(@PathVariable String productId) {
        return this.productService.getProduct(Long.parseLong(productId));
    }

    @PostMapping(path="/products/{category}")
    public String addProduct(@RequestBody Product product, @PathVariable String category) {
        System.out.println(category);
        return this.productService.addProduct(product);
    }

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return this.productService.getCategories();
    }
}
