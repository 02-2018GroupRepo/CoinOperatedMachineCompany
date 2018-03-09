package com.macmachines;

public class Product {
    private int id;
    private String name;
    private String description;
    private double wholeSalePrice;
    private double retailPrice;
    private int qty;

    private Product() {}

    public Product(int id, String name, String description, double wholeSalePrice, double retailPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
