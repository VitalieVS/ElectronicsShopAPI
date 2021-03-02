package com.example.electronicsapi.services;

import com.example.electronicsapi.entities.Category;
import com.example.electronicsapi.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product getProduct(long productId);

    String addProduct(Product product);

    List<Category> getCategories();

    int removeCategory(String category);

}
