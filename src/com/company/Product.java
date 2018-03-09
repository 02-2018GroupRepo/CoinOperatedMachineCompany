package com.company;

public class Product {
    private int unique_id;
    private String name;
    private String description;
    private double wholesalePrive;
    private double retailPrice;

    public Product(int unique_id, String name, String description, double wholesalePrive, double retailPrice) {
        this.unique_id = unique_id;
        this.name = name;
        this.description = description;
        this.wholesalePrive = wholesalePrive;
        this.retailPrice = retailPrice;
    }

    public int getUnique_id() {
        return unique_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWholesalePrive() {
        return wholesalePrive;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
