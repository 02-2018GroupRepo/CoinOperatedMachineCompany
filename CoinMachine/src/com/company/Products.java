package com.company;

public class Products {

    private int id; //needs to be unique
    private String name;
    private String description;
    private double salePrice; //cost of item to venching machine company
    private double retailPrice; //price vending machine is using

    public Products(int id, String name, String description, double salePrice, double retailPrice){
        this.id = id;
        this.name = name;
        this.description = description;
        this.salePrice  = salePrice;
        this.retailPrice = retailPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

}
