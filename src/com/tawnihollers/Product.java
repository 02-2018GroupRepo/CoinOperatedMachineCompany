package com.tawnihollers;

public class Product {
    private String id;
    private String name;
    private String description;
    private double wholeSalePrice;
    private double retailSalePrice;
    private int qty;

    public Product(String id, String name, String description, double wholeSalePrice, double retailSalePrice, int qty) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.wholeSalePrice = wholeSalePrice;
        this.retailSalePrice = retailSalePrice;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRetailSalePrice(){
        return retailSalePrice;
    }

    public String formatTheRetailStalePrice() {
        return String.format("%.2f", retailSalePrice);
    }

    public String toString() {
        if (getQty() != 0) {
            return "Id:" + getId() + " Name: " + getName() + " Price: " + formatTheRetailStalePrice();
        }
        return "Empty slot";
    }


    public void decreaseStock(){
        if(this.qty > 0) {
            this.qty--;
        }
    }


}
