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
    List<Color> iph12Colors;
    List<Capacity> iph12MemSize;
    List<Color> iphone7Colors;
    List<Capacity> iphone7memSize;
    List<Color> iph11Colors;
    List<Color> cablesColors;

    public ProductServiceImpl() {
        DB = new ArrayList<>();
        categoriesDB = new ArrayList<>();
        iph12Colors = new ArrayList<>();
        iph12MemSize = new ArrayList<>();
        iphone7Colors = new ArrayList<>();
        iphone7memSize = new ArrayList<>();
        iph11Colors = new ArrayList<>();
        cablesColors = new ArrayList<>();

        cablesColors.add(
                new Color("white", true)
        );

        cablesColors.add(
                new Color("black", true)
        );
        cablesColors.add(
                new Color("red", true)
        );

        iph12Colors.add(
                new Color("silver", true)
        );
        iph12Colors.add(
                new Color("purple", true)
        );
        iph12Colors.add(
                new Color("blue", true)
        );

        iph11Colors.add(
                new Color("gray",true )
        );

        iph11Colors.add(
                new Color("gold",true )
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

        iph12MemSize.add(
                new Capacity("128GB", true, 699)
        );

        iph12MemSize.add(
                new Capacity("256GB", true, 799)
        );

        iph12MemSize.add(
                new Capacity("512GB", true, 899)
        );

        DB.add(
                new Product(
                        1,
                        "Iphone 12",
                        "This is iphone 12 Blue...",
                        699, "iph12_mini_blue.png",
                        10,
                        "iphone",
                        iph12Colors,
                        iph12MemSize));

        DB.add(
                new Product(
                        2,
                        "Iphone 12 Pro Max",
                        "This is new iph 12 pro max...",
                        900, "iph12_mini_purple.png",
                        10,
                        "iphone",
                        iph12Colors,
                        iph12MemSize));

        DB.add(
                new Product(3,
                        "Iphone 11 Pro Max Gold",
                        "This is iphone 11 pro max...",
                        800,
                        "iph11_mini_gold.png",
                        20,
                        "iphone",
                        iph11Colors,
                        iph12MemSize));

        DB.add(
                new Product(4,
                        "Iphone 11 Pro Gray",
                        "This is iphone 11 pro max...",
                        650,
                        "iph11_mini_gray.png",
                        20,
                        "iphone",
                        iph11Colors,
                        iph12MemSize));

        DB.add(
                new Product(
                        5,
                        "Iphone 7 Black",
                        "This is iphone 7.. red",
                        200,
                        "iph7_mini_black.png",
                        12,
                        "iphone",
                        iphone7Colors, iphone7memSize));

        DB.add(
                new Product(
                        6,
                        "Iphone 7 Red",
                        "This is iphone 7..",
                        200,
                        "iph7_mini_red.png",
                        12,
                        "iphone",
                        iphone7Colors, iphone7memSize));

        DB.add(
                new Product(
                        7,
                        "Iphone 7 Silver",
                        "This is iphone seven",
                        200,
                        "iph7_mini_black.png",
                        12,
                        "iphone",
                        iphone7Colors, iphone7memSize));

        DB.add(
                new Product(
                        8,
                        "Iphone 7 Rose",
                        "This is iphone 7.",
                        200,
                        "iph7_mini_black.png",
                        12,
                        "iphone",
                        iphone7Colors, iphone7memSize));

        DB.add(
                new Product(
                        9,
                        "Iphone 7 Gold",
                        "This is iphone 7.. dummy text",
                        200,
                        "iph7_mini_gold.png",
                        12,
                        "iphone",
                        iphone7Colors, iphone7memSize));

        DB.add(
                new Product(30,
                        "Lightning Cable",
                        "Light cable",
                        22,
                        "light_mini_white.png",
                        40,
                        "cables",
                        cablesColors,
                        null));
        DB.add(
                new Product(31,
                        "HDMI Cable",
                        "HDMI",
                        25,
                        "light_mini_white.png",
                        35,
                        "cables",
                        null,
                        null));

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
