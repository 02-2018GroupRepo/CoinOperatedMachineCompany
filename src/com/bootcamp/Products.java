package com.bootcamp;
//Each product should have a unique id, a name, a description, a wholesale price, and a retail sale price.
// The vending machines will use the retail price for all items provided for sale

public class Products {
    private int id;
    private String name;
    private String description;
    private double wholesalePrice;
    private double retailPrice;

    public Products(Integer id, String name, String description, double wholesalePrice, double retailPrice){
        this.id = id;
        this.name = name;
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getResalePrice() {
        return retailPrice;
    }




}
