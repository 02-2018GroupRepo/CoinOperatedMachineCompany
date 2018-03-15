package com.company;

<<<<<<< HEAD
import java.util.Queue;
=======
import java.util.*;
>>>>>>> 97d6e8b087def233170c649057840ee52b70e069

public class Product {

    private Product name;
    private String description;
    private String uuid;
    private double wholeSalePrice;
    private double retailPrice;
<<<<<<< HEAD
    private Queue<String> productsQueue;

    public Product(String uuid, String name, String description, double wholeSalePrice, double retailPrice, int qtyOfQueue) {
=======
    private Queue<Product> productQty = new ArrayDeque<Product>();

    public Product(String uuid, Product name, String description, double wholeSalePrice, double retailPrice, int qty) {
        this.name = name;
        this.description = description;
        this.uuid = uuid;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = retailPrice;
        setProductQty(qty, name);
    }

    public void setProductQty(int qty, Product name){
        for(int i = 0; i < qty; i++){
        productQty.add(name);
        }
    }

    public Product getName() {
        return name;
    }

    public void setName(Product name) {
>>>>>>> 97d6e8b087def233170c649057840ee52b70e069
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public void setWholeSalePrice(double wholeSalePrice) {
        this.wholeSalePrice = wholeSalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
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
