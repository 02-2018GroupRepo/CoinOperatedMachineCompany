package com.company;

public class Product {

    private String name;
    private String description;
    private String uuid;
    private double wholeSalePrice;
    private double retailPrice;

    public Product(String uuid, String name, String description, double wholeSalePrice, double retailPrice) {
        this.name = name;
        this.description = description;
        this.uuid = uuid;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = retailPrice;
    }
}
