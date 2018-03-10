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

    public String getName() {
        return name;
    }

    public double getRetailSalePrice(){
        return getRetailSalePrice();
    }

    public String formatTheRetailStalePrice() {
        return String.format("%.2f", retailSalePrice);
    }

    public String toString() {
        if (getQty() != 0) {
            return getName() + " Price: " + formatTheRetailStalePrice();
        }
        return "Empty Slot";
    }


    public void decreaseStock(){
        if(this.qty > 0) {
            this.qty--;
            System.out.println("Stock is " + this.qty);
        }
    }


}
