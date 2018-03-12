package com.company;

public class Product {

    private String uniqueId;
    private String name;
    private String description;
    private double wholesalePrice;
    private double retailPrice;
    private double qtyAvailable;

    public Product(String uniqueId, String name, String description, double wholesalePrice, double retailPrice, int qtyAvailable) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.qtyAvailable = qtyAvailable;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    public double getQtyAvailable() {
        return qtyAvailable;
    }

    public String getDescription() {
        return description;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

}
