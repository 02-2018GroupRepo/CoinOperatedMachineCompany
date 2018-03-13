package com.company;

public class Products {
    String name;
    int id;
    String description;
    double whole_price;
    double retail_price;

    public Products(String name, int id, String description, double whole_price, double retail_price){
        this.name  = name;
        this.id = id;
        this.description = description;
        this.whole_price = whole_price;
        this.retail_price = retail_price;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getWhole_price() {
        return whole_price;
    }

    public double getRetail_price() {
        return retail_price;
    }
}


