package com.company;

import java.util.UUID;

public class Product {
    private final int uniqueID;
    private String name;
    private String description;
    private double wholesale_price;
    private double retail_price;


    public Product(int uniqueID, String name, String description, double wholesale_price, double retail_price) {
        this.uniqueID = uniqueID;
        this.name = name;
        this.description = description;
        this.wholesale_price = wholesale_price;
        this.retail_price = retail_price;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWholesale_price() {
        return wholesale_price;
    }

    public double getRetail_price() {
        return retail_price;
    }

}
