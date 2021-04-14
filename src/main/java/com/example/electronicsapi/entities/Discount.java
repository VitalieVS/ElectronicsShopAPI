package com.example.electronicsapi.entities;

public class Discount {
    private String id;
    private int value;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Discount(String id, int value, String code) {
        this.id = id;
        this.value = value;
        this.code = code;
    }

}
