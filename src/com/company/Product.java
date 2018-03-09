package com.company;

public class Product {

    public static int counter = 0;
    private int uid;
    private String name;
    private String description;
    private double wholesalePrice;
    private double retailSalePrice;

    public Product(int uid, String name, String description, double wholesalePrice, double retailSalePrice) {
        this.uid = uid;
        this.name = name;
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.retailSalePrice = retailSalePrice;
    }

    public int getUid() {
        return uid;
    }
}
