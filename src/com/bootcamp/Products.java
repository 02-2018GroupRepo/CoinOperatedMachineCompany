package com.bootcamp;
//Each product should have a unique id, a name, a description, a wholesale price, and a retail sale price.
// The vending machines will use the retail price for all items provided for sale

public class Products {
    private int id;
    private String name;
    private String description;
    private double wholesalePrice;
    private double retailPrice;

    public Products(Integer id, String name, String description, double wholesalePrice, double resalePrice){
        this.id = id;
        this.name = name;
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = resalePrice;
    }
    public int getId(){
        return id;
    }

    public void setName(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getResalePrice() {
        return retailPrice;
    }

    public void setResalePrice(double resalePrice) {
        this.retailPrice = resalePrice;
    }


}
