package com.company;

import java.util.Queue;

public class Product {

    private String name;
    private String description;
    private String uuid;
    private double wholeSalePrice;
    private double retailPrice;
    private Queue<String> productsQueue;

    public Product(String uuid, String name, String description, double wholeSalePrice, double retailPrice, int qtyOfQueue) {
        this.name = name;
        this.description = description;
        this.uuid = uuid;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = retailPrice;
        this.makeQueue(qtyOfQueue);
        
    }

    public void makeQueue(int qtyOfQueue){
        for(int i = 0; i < qtyOfQueue; i++){
            productsQueue.add(uuid);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUuid() {
        return uuid;
    }

    public double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public Queue<String> getProductsQueue() {
        return productsQueue;
    }
}
