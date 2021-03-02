package com.example.electronicsapi.services;

import com.example.electronicsapi.entities.Category;
import com.example.electronicsapi.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    List<Product> DB;
    List<Category> categoriesDB;

    public ProductServiceImpl() {
        DB = new ArrayList<>();
        DB.add(
                new Product(1, "Iphone 12 Pro Max", "This is new iph 12 pro max...", 500, 10, "test.png"));
        DB.add(
                new Product(2, "Iphone 11 Pro Max", "This is iphone 11 pro max...", 500, 7, "test2.png"));
        categoriesDB = new ArrayList<>();

        categoriesDB.add(new Category(
                "Phones"
        ));
        categoriesDB.add(new Category(
                "Cases"
        ));
        categoriesDB.add(new Category(
                "Power Banks"
        ));
        categoriesDB.add(new Category(
                "Power Adapters"
        ));
        categoriesDB.add(new Category(
                "Cables"
        ));

    }

    @Override
    public List<Product> getProducts() {
        return DB;
    }

    @Override
    public Product getProduct(long productId) {
        Product foundProduct = null;

        for (Product product : DB) {
            if (product.getId() == productId) {
                foundProduct = product;
                break;
            }
        }
        return foundProduct;
    }

    @Override
    public String addProduct(Product product) {
        for (Product item : DB) {
            if (item.getId() == product.getId()) {
                return "ID already exists in database";
            }
        }
        this.DB.add(product);
        return "Added with success!!";
    }

    @Override
    public List<Category> getCategories() {
        return categoriesDB;
    }

    @Override
    public int removeCategory(String category) {
        for (Category currCategory : categoriesDB) {
            if (currCategory.getName().equals(category)) {
                categoriesDB.remove(currCategory);
                return 1;
            }
        }
        return 0;
    }

}
