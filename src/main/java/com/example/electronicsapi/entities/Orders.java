package com.example.electronicsapi.entities;

import java.util.List;
import java.util.UUID;

public class Orders {
    private UUID id;
    private List<Product> products;
    private Contacts contact;
    private String shippingPrice;
    private Discount discount;
    private double totalPrice;

    public Orders(UUID id, List<Product> products, Contacts contact, String shippingPrice, Discount discount, double totalPrice) {
        this.id = id;
        this.products = products;
        this.contact = contact;
        this.shippingPrice = shippingPrice;
        this.discount = discount;
        this.totalPrice = totalPrice;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setContact(Contacts contact) {
        this.contact = contact;
    }

    public void setShippingPrice(String shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public UUID getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Contacts getContact() {
        return contact;
    }

    public String getShippingPrice() {
        return shippingPrice;
    }

    public Discount getDiscount() {
        return discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
