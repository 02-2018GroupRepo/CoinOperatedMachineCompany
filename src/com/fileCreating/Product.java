package com.fileCreating;

public class Product {
    private Double wholesalePrice;
    private Double retailPrice;
    private String itemName;
    private Integer stock;
    private Integer id;

    public Product(){
        this.stock = 0;
    }

    public Product(Double wholesalePrice, Double retailPrice, String itemName, Integer stock, Integer id) {
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.itemName = itemName;
        this.stock = stock;
        this.id = id;
    }

    public void printThisPurchaseProduct(){
        System.out.println("You Purchased!");
        System.out.println("\t"+itemName + " of Price: " + retailPrice);
    }

    public Double getPrice() {
        return retailPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setPrice(Double price) {
        this.retailPrice = price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
