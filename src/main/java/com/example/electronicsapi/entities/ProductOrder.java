package com.example.electronicsapi.entities;

import java.util.List;

public class ProductOrder {
    private long id;
    private String title;
    private double price;
    private int quantity;
    private String category;
    private String color;

    public ProductOrder(long id, String title, double price, int quantity, String category, String color) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.color = color;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }
}
