package com.example.electronicsapi.entities;

public class Contact {
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String city;
    private String country;

    public Contact(String name, String surname, String address, String phone, String city, String country) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.city = city;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
