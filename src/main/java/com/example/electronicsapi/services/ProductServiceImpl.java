package com.example.electronicsapi.services;

import com.example.electronicsapi.entities.Capacity;
import com.example.electronicsapi.entities.Category;
import com.example.electronicsapi.entities.Colors;
import com.example.electronicsapi.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    List<Product> DB;
    List<Category> categoriesDB;
    List<Colors> colors;
    List<Capacity> memSize;

    public ProductServiceImpl() {
        DB = new ArrayList<>();
        categoriesDB = new ArrayList<>();
        colors = new ArrayList<>();
        memSize = new ArrayList<>();

        colors.add(
                new Colors("black", true)
        );
        colors.add(
                new Colors("green", true)
        );
        colors.add(
                new Colors("white", true)
        );

        memSize.add(
                new Capacity("128GB", true)
        );

        memSize.add(
                new Capacity("256GB", true)
        );

        memSize.add(
                new Capacity("512GB", true)
        );

        DB.add(
                new Product(
                        1,
                        "Iphone 12 Pro Max",
                        "This is new iph 12 pro max...",
                        500, "iph12_purple_mini.png",
                        10,
                        "iphone",
                        colors,
                        memSize));
        DB.add(
                new Product(2,
                        "Iphone 11 Pro Max",
                        "This is iphone 11 pro max...",
                        500,
                        "iph11_gold_mini.png",
                        20,
                        "iphone",
                        colors,
                        memSize));

        DB.add(
                new Product(4,
                        "Iphone 11 Pro",
                        "This is iphone 11 pro max...",
                        500,
                        "iph11_gray_mini.png",
                        20,
                        "iphone",
                        colors,
                        memSize));

        DB.add(
                new Product(3,
                        "Lightning Cable",
                        "Light cable",
                        20,
                        "test4.png",
                        35,
                        "cable",
                        colors,
                        memSize));


        categoriesDB.add(
                new Category("Iphone"));
        categoriesDB.add(
                new Category("Power Bank"));
        categoriesDB.add(
                new Category("Cables"));
        categoriesDB.add(
                new Category("Cases"));
        categoriesDB.add(
                new Category("Adapters"));
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

    @Override
    public List<Product> getCategoryProducts(String category) {
        List<Product> temp = new ArrayList<>();

        for (Product product : DB) {
            if (product.getCategory().equals(category)) {
                temp.add(product);
            }
        }
        return temp;
    }

}
