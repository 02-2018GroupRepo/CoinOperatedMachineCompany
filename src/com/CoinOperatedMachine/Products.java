package com.CoinOperatedMachine;

public class Products {
    private String productName;
    private String productDesc;
    private double productPrice;

    public Products(String productName, String productDesc, double productPrice){
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
