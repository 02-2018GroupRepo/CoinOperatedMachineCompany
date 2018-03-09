package com.CoinOperatedMachine;

public class Vendor {

    private double nickel  = 0.05;
    private double dime = 0.10;
    private double quarter =0.25;

    private String productName;
    private String productDescription;
    private String productId;

    public Vendor(){

    }

    public Vendor(double nickel, double dime, double quarter, String productName, String productDescription, String productId){
        this.nickel = nickel;
        this.dime = dime;
        this.quarter = quarter;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productId = productId;
    }

    public double getNickel() {
        return nickel;
    }

    public double getDime() {
        return dime;
    }

    public double getQuarter() {
        return quarter;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductId() {
        return productId;
    }
}
