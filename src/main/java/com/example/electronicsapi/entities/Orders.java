package com.example.electronicsapi.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Orders {
    private UUID id;
    private List<ProductOrder> products;
    private Contact contact;
    private String shippingPrice;
    private Discount discount;
    private double totalPrice;

    public Orders(List<ProductOrder> products, Contact contact, String shippingPrice, Discount discount, double totalPrice) {
        this.id = UUID.randomUUID();
        this.products = products;
        this.contact = contact;
        this.shippingPrice = shippingPrice;
        this.discount = discount;
        this.totalPrice = totalPrice;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setProducts(List<ProductOrder> products) {
        this.products = products;
    }

    public void setContact(Contact contact) {
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

    public List<ProductOrder> getProducts() {
        return products;
    }

    public Contact getContact() {
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
