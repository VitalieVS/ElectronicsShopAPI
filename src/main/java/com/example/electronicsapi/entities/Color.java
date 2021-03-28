package com.example.electronicsapi.entities;

public class Color {
    private String color;
    private boolean available;

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

    public Color(String color, boolean available) {
        this.color = color;
        this.available = available;
    }




}
