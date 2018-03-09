package com.fileCreating;

public class Product {
    private Double price;
    private String itemName;
    private Integer stock;

    public Product(){
        this.stock = 0;
    }

    public Product(Double price, String itemName, Integer stock) {
        this.price = price;
        this.itemName = itemName;
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
