package com.example.electronicsapi.services;

import com.example.electronicsapi.entities.Capacity;
import com.example.electronicsapi.entities.Category;
import com.example.electronicsapi.entities.Color;
import com.example.electronicsapi.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    List<Product> DB;
    List<Category> categoriesDB;
    List<Color> colors;
    List<Capacity> memSize;
    List<Color> iphone7Colors;
    List<Capacity> iphone7memSize;

    public ProductServiceImpl() {
        DB = new ArrayList<>();
        categoriesDB = new ArrayList<>();
        colors = new ArrayList<>();
        memSize = new ArrayList<>();
        iphone7Colors = new ArrayList<>();
        iphone7memSize = new ArrayList<>();

        colors.add(
                new Color("black", true)
        );
        colors.add(
                new Color("green", true)
        );
        colors.add(
                new Color("white", true)
        );

        iphone7Colors.add(
                new Color("black", true)
        );
        iphone7Colors.add(
                new Color("red", true)
        );
        iphone7Colors.add(
                new Color("silver", true)
        );

        iphone7memSize.add(
                new Capacity(
                        "32GB", true, 0
                )
        );

        iphone7memSize.add(
                new Capacity(
                        "128GB", true, 2
                )
        );

        iphone7memSize.add(
                new Capacity(
                        "256GB", true, 3
                )
        );


        memSize.add(
                new Capacity("128GB", true, 0)
        );

        memSize.add(
                new Capacity("256GB", true, 70)
        );

        memSize.add(
                new Capacity("512GB", true, 120)
        );

        DB.add(
                new Product(
                        1,
                        "Iphone 12 Pro Max Purple",
                        "This is new iph 12 pro max...",
                        900, "iph12_purple_mini.png",
                        10,
                        "iphone",
                        colors,
                        memSize));
        DB.add(
                new Product(2,
                        "Iphone 11 Pro Max Gold",
                        "This is iphone 11 pro max...",
                        800,
                        "iph11_gold_mini.png",
                        20,
                        "iphone",
                        colors,
                        memSize));

        DB.add(
                new Product(3,
                        "Iphone 11 Pro Gray",
                        "This is iphone 11 pro max...",
                        650,
                        "iph11_gray_mini.png",
                        20,
                        "iphone",
                        colors, memSize));

        DB.add(
                new Product(
                        4,
                        "Iphone 7 Black",
                        "This is iphone 7.. dummy text",
                        200,
                        "iph7_black_mini.png",
                        12,
                        "iphone",
                        iphone7Colors, iphone7memSize));

        DB.add(
                new Product(
                        5,
                        "Iphone 7 Red",
                        "This is iphone 7.. dummy text",
                        200,
                        "iph7_black_mini.png",
                        12,
                        "iphone",
                        iphone7Colors, iphone7memSize));

        DB.add(
                new Product(
                        6,
                        "Iphone 7 Silver",
                        "This is iphone 7.. dummy text",
                        200,
                        "iph7_black_mini.png",
                        12,
                        "iphone",
                        iphone7Colors, iphone7memSize));

        DB.add(
                new Product(
                        7,
                        "Iphone 7 Rose",
                        "This is iphone 7.. dummy text",
                        200,
                        "iph7_black_mini.png",
                        12,
                        "iphone",
                        iphone7Colors, iphone7memSize));

        DB.add(
                new Product(30,
                        "Lightning Cable",
                        "Light cable",
                        20,
                        "test4.png",
                        35,
                        "cables"));

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
