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

    public int getQty(){
        return qty;
    }

    public String getName() {
        return name;
    }

//    public double getRetailSalePrice() {
//        return retailSalePrice;
//    }

    public String formatTheRetailStalePrice(){
        return String.format("%.2f", retailSalePrice);
    }

    public String toString(){
        return getName() + " Price: " + formatTheRetailStalePrice();
    }

}
