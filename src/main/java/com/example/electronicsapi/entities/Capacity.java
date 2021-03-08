package com.example.electronicsapi.entities;

public class Capacity {
    private String size;
    private boolean available;

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

    public Capacity(String size, boolean available) {
        this.size = size;
        this.available = available;
    }
}
