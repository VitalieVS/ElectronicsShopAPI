package com.example.electronicsapi.services;

import com.example.electronicsapi.entities.*;

import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> getProducts();

    Product getProduct(long productId);

    String addProduct(Product product);

    List<Category> getCategories();

    int removeCategory(String category);

    List<Product> getCategoryProducts(String category);

    Discount getDiscount(String coupon);

    Map<String, Boolean> removeDiscount(String id);

    int addOrders(Orders order);

    List<Orders> getOrders();

}
