package com.example.electronicsapi.entities;

public class Color {
    private String color;
    private boolean available;
    private int quantity;

    public void setColor(String color) {
        this.color = color;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getColor() {
        return color;
    }

    public boolean isAvailable() {
        return available;
    }

    public Color(String color, boolean available, int quantity) {
        this.color = color;
        this.available = available;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
