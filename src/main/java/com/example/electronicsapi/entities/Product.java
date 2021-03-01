package com.example.electronicsapi.entities;

public class Product {

    private long id;
    private String title;
    private String description;
    private double price;
    private String imageUrl;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public void setId(long id) {
        this.id = id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public Product(long id, String title, String description, double price, int quantity, String imageUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }
}
