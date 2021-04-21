package com.example.electronicsapi.services;

import com.example.electronicsapi.entities.Category;
import com.example.electronicsapi.entities.Discount;
import com.example.electronicsapi.entities.Orders;
import com.example.electronicsapi.entities.Product;

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
    public int addOrders(Orders order);

}
