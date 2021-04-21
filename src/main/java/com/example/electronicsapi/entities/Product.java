package com.example.electronicsapi.entities;

import java.util.List;

public class Product {
    private long id;
    private String title;
    private double price;
    private String imageUrl;
    private int quantity;
    private String category;
    private List<Color> colors;

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public List<Capacity> getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(List<Capacity> memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    private List<Capacity> memoryCapacity;

    public Product(long id,
                   String title,
                   double price,
                   String imageUrl,
                   int quantity,
                   String category,
                   List<Color> colors,
                   List<Capacity> memoryCapacity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
        this.category = category;
        this.colors = colors;
        this.memoryCapacity = memoryCapacity;
    }

    public Product(long id,
                   String title,
                   double price,
                   String imageUrl,
                   int quantity,
                   String category) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
        this.category = category;
    }

    public Product(long id,
                   String title,
                   double price,
                   String imageUrl,
                   String category,
                   List<Color> colors,
                   List<Capacity> memoryCapacity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.imageUrl = imageUrl;
        this.category = category;
        this.colors = colors;
        this.memoryCapacity = memoryCapacity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<Color> getColors() { return colors;}
}
