package com.example.electronicsapi.entities;

public class ProductOrder {
    private long id;
    private double price;
    private int quantity;
    private String color;

    private String size;

    public ProductOrder(long id, double price, int quantity, String color, String size) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }
}
