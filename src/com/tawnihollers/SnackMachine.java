package com.tawnihollers;

import java.util.ArrayList;

public class SnackMachine extends VendingMachines {

    private String id;
    private String name;
    private String description;
    private double wholeSalePrice;
    private double retailSalePrice;


    public void Product(String id, String name, String description, double wholeSalePrice, double retailSalePrice){
        this.id = id;
        this.name = name;
        this.description = description;
        this.wholeSalePrice = wholeSalePrice;
        this.retailSalePrice = retailSalePrice;
    }
}
