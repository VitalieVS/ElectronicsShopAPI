package com.example.electronicsapi.entities;

public class Capacity {
    private String size;
    private boolean available;
    private int price;

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
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Capacity(String size, boolean available, int price) {
        this.size = size;
        this.available = available;
        this.price = price;
    }
}
