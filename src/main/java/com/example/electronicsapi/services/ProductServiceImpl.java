package com.example.electronicsapi.services;

import com.example.electronicsapi.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    List<Product> DB;

    public ProductServiceImpl() {
        DB = new ArrayList<>();
        DB.add(new Product(1,"Iphone 12 Pro Max", "This is new iph 12 pro max...", 500, 10));
        DB.add(new Product(1,"Iphone 11 Pro Max", "This is iphone 11 pro max...", 500, 7));

    }

    @Override
    public List<Product> getProducts() {
        return DB;
    }
}
