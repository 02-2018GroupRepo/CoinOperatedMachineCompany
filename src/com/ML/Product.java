package com.ML;

public class Product {

    String name;
    String description;
    double retailPrice;
    double wholesalePrice;
    int inStock;

    public Product (String name, String description, double retailPrice, double wholesalePrice, int inStock){

        this.name=name;
        this.description=description;
        this.retailPrice=retailPrice;
        this.wholesalePrice=wholesalePrice;
        this.inStock=inStock;

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

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public int getInStock() {
        return inStock;
    }

}
