package com.example.electronicsapi.entities;

public class Capacity {
    private String size;
    private boolean available;
    private int price;
    private int quantity;

    public void setSize(String size) {
        this.size = size;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getSize() {
        return size;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Capacity(String size, boolean available, int price, int quantity) {
        this.size = size;
        this.available = available;
        this.price = price;
        this.quantity = quantity;
    }
}
