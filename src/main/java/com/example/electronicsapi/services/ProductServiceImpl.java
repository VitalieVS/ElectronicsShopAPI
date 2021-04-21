package com.example.electronicsapi.services;

import com.example.electronicsapi.entities.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    List<Product> DB;
    List<Category> categoriesDB;
    List<Color> iph12Colors;
    List<Capacity> iph12MemSize;
    List<Color> iphone7Colors;
    List<Capacity> iphone7memSize;
    List<Color> iph11maxColors;
    List<Color> cablesColors;
    List<Discount> discountDB;
    List<Color> iph11CaseDB;
    List<Color> iphXCaseDB;
    List<Color> iph11BatteryCaseDB;
    List<Color> iphXBatteryCaseDB;
    List<Capacity> iph11maxMemSize;
    List<Color> iph11Colors;
    List<Capacity> iph11MemSize;
    List<Capacity> ipxMemSize;
    List<Color> iphxColors;
    List<Orders> ORDERDB;

    public ProductServiceImpl() {
        DB = new ArrayList<>();
        categoriesDB = new ArrayList<>();
        iph12Colors = new ArrayList<>();
        iph12MemSize = new ArrayList<>();
        iphone7Colors = new ArrayList<>();
        iphone7memSize = new ArrayList<>();
        iph11maxColors = new ArrayList<>();
        cablesColors = new ArrayList<>();
        discountDB = new ArrayList<>();
        iph11CaseDB = new ArrayList<>();
        iphXCaseDB = new ArrayList<>();
        iph11BatteryCaseDB = new ArrayList<>();
        iphXBatteryCaseDB = new ArrayList<>();
        iph11maxMemSize = new ArrayList<>();
        iph11Colors = new ArrayList<>();
        iph11MemSize = new ArrayList<>();
        ipxMemSize = new ArrayList<>();
        iphxColors = new ArrayList<>();
        ORDERDB = new ArrayList<>();

        ipxMemSize.add(
                new Capacity("64GB", true, 499, 2)
        );
        ipxMemSize.add(
                new Capacity("256GB", true, 599, 1)
        );
        ipxMemSize.add(
                new Capacity("512GB", true, 699, 2)
        );

        iphxColors.add(
                new Color("black", true, 3)
        );
        iphxColors.add(
                new Color("gold", true, 2)
        );
        iphxColors.add(
                new Color("white", true, 3)
        );


        iph11Colors.add(
                new Color("black", true, 3)
        );
        iph11Colors.add(
                new Color("white", true, 5)
        );

        iph11MemSize.add(
                new Capacity("64GB", true, 699, 4)
        );
        iph11MemSize.add(
                new Capacity("256GB", true, 750, 2)
        );
        iph11MemSize.add(
                new Capacity("256GB", true, 799, 3)
        );

        discountDB.add(
                new Discount("d1", 5, "XQUJMNT6SUVE")
        );
        discountDB.add(
                new Discount("d2", 5, "TIJSOFRDVIL0")
        );
        discountDB.add(
                new Discount("d3", 5, "DMDOABEQJOQH")
        );
        discountDB.add(
                new Discount("d4", 5, "6KO10AV8ABW2")
        );
        discountDB.add(
                new Discount("d5", 5, "Y1WC0QPAJDXC")
        );

        discountDB.add(
                new Discount("d6", 10, "44RP37GMIV99")
        );
        discountDB.add(
                new Discount("d7", 10, "TXIZ1TER0YWB")
        );
        discountDB.add(
                new Discount("d8", 10, "700KQQZ6KO3O")
        );
        discountDB.add(
                new Discount("d9", 10, "QXJ5SJEUHLV9")
        );
        discountDB.add(
                new Discount("d10", 10, "AKPPN9CBCU3L")
        );

        discountDB.add(
                new Discount("d11", 15, "IDOR71LUDS2J")
        );
        discountDB.add(
                new Discount("d12", 15, "WUVZZQZPEJN9")
        );
        discountDB.add(
                new Discount("d13", 15, "JRRZQUEM301Q")
        );
        discountDB.add(
                new Discount("d14", 15, "KXT91FVA34HA")
        );
        discountDB.add(
                new Discount("d15", 15, "13W6FDI97HTI")
        );

        iph11maxMemSize.add(
                new Capacity("64GB", true, 799, 2)
        );

        iph11maxMemSize.add(
                new Capacity("256GB", true, 899, 3)
        );

        iph11maxMemSize.add(
                new Capacity("512GB", true, 899, 4)
        );

        cablesColors.add(
                new Color("white", true, 10)
        );

        cablesColors.add(
                new Color("black", true, 10)
        );

        cablesColors.add(
                new Color("red", true, 10)
        );

        iph12Colors.add(
                new Color("silver", true, 2)
        );
        iph12Colors.add(
                new Color("purple", true, 1)
        );
        iph12Colors.add(
                new Color("blue", true, 1)
        );

        iph11maxColors.add(
                new Color("gray", true, 3)
        );

        iph11maxColors.add(
                new Color("white", true, 2)
        );

        iph11maxColors.add(
                new Color("gold", true, 3)
        );

        iphone7Colors.add(
                new Color("black", true, 1)
        );
        iphone7Colors.add(
                new Color("red", true, 2)
        );
        iphone7Colors.add(
                new Color("silver", true, 3)
        );
        iphone7Colors.add(
                new Color("gold", true, 2)
        );

        iphone7memSize.add(
                new Capacity(
                        "32GB", true, 299, 6
                )
        );

        iphone7memSize.add(
                new Capacity(
                        "128GB", true, 349, 3
                )
        );

        iphone7memSize.add(
                new Capacity(
                        "256GB", true, 399, 4
                )
        );

        iph12MemSize.add(
                new Capacity("128GB", true, 699, 2)
        );

        iph12MemSize.add(
                new Capacity("256GB", true, 799, 5)
        );

        iph12MemSize.add(
                new Capacity("512GB", true, 899, 3)
        );

        DB.add(
                new Product(
                        1,
                        "Iphone 12",
                        699, "iph12_mini_blue.png",
                        "iphone",
                        iph12Colors,
                        iph12MemSize));
        DB.add(
                new Product(
                        2,
                        "Iphone 12 Pro Max",
                        900, "iph12_mini_purple.png",
                        "iphone",
                        iph12Colors,
                        iph12MemSize));

        DB.add(
                new Product(5,
                        "Iphone 7",
                        299,
                        "iph7_mini_black.png",
                        "iphone",
                        iphone7Colors,
                        iphone7memSize));
        DB.add(
                new Product(6,
                        "Iphone 11 Pro Max",
                        799,
                        "iph11max_mini_gray.png",
                        "iphone",
                        iph11maxColors,
                        iph11maxMemSize));

        DB.add(
                new Product(7,
                        "Iphone 11",
                        599,
                        "iph11_mini_white.png",
                        "iphone",
                        iph11Colors,
                        iph11MemSize));

        DB.add(
                new Product(8,
                        "Iphone X",
                        499,
                        "iphx_mini_black.png",
                        "iphone",
                        iphxColors,
                        ipxMemSize
                ));


        DB.add(
                new Product(30,
                        "Lightning Cable",
                        22,
                        "light_mini_white.png",
                        40,
                        "cables",
                        cablesColors,
                        null));
        DB.add(
                new Product(31,
                        "HDMI Cable",
                        25,
                        "hdmi_mini.png",
                        35,
                        "cables",
                        null,
                        null));


        iph11CaseDB.add(
                new Color("black", true, 5)
        );

        iph11CaseDB.add(
                new Color("green", true, 3)
        );
        iph11CaseDB.add(
                new Color("pink", true, 6)
        );

        iphXCaseDB.add(
                new Color("black", true, 5)
        );

        iphXCaseDB.add(
                new Color("blue", true, 2)
        );

        iphXCaseDB.add(
                new Color("red", true, 4)
        );

        iph11BatteryCaseDB.add(
                new Color("black", true, 4)
        );
        iph11BatteryCaseDB.add(
                new Color("pink", true, 2)
        );
        iph11BatteryCaseDB.add(
                new Color("white", true, 1)
        );

        iphXBatteryCaseDB.add(
                new Color("black", true, 2)
        );

        iphXBatteryCaseDB.add(
                new Color("white", true, 3)
        );

        DB.add(
                new Product(40,
                        "Iphone 11 Case",
                        30,
                        "iph11_mini_black.png",
                        20,
                        "cases",
                        iph11CaseDB,
                        null)
        );

        DB.add(
                new Product(41,
                        "Iphone X Case",
                        29,
                        "iphx_mini_black.png",
                        30,
                        "cases",
                        iphXCaseDB,
                        null)
        );

        DB.add(
                new Product(42,
                        "Iphone 11 Battery Case",
                        59,
                        "iph11battery_mini_black.png",
                        20,
                        "cases",
                        iph11BatteryCaseDB,
                        null)
        );
        DB.add(
                new Product(43,
                        "Iphone X Battery Case",
                        49,
                        "iphxbattery_mini_black.png",
                        20,
                        "cases",
                        iphXBatteryCaseDB,
                        null)
        );

        categoriesDB.add(
                new Category("Iphone"));
        categoriesDB.add(
                new Category("Cables"));
        categoriesDB.add(
                new Category("Cases"));
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

    @Override
    public Discount getDiscount(String coupon) {
        for (Discount discount : discountDB) {
            if (discount.getCode().equalsIgnoreCase(coupon)) {
                return discount;
            }
        }
        return new Discount(null, 0, null);
    }

    @Override
    public Map<String, Boolean> removeDiscount(String id) {
        Map<String, Boolean> response = new HashMap<>();
        for (Discount discount : discountDB) {
            if (discount.getId().equalsIgnoreCase(id)) {
                discountDB.remove(discount);
                response.put("deleted", Boolean.TRUE);
                return response;
            }
        }
        return response;
    }

    @Override
    public int addOrders(Orders order) {
        ORDERDB.add(order);
//        for (Orders item: ORDERDB) {
//            System.out.println(item.getTotalPrice());
//        }
        return 1;
    }

    @Override
    public List<Orders> getOrders() {
        return ORDERDB;
    }

}
