package com.CoinOperatedMachine;

public class ProductsForSale {
    private int idNum;
    private String productName="";
    private String productDescription="";
    private double productWholesalePrice;
    private double productRetailPrice;


    public ProductsForSale( int idNum, String productName, String productDescription, String productWholesalePrice, String productRetailPrice){

        this.idNum=idNum;
        this.productName=productName;
        this.productDescription=productDescription;
        this.productWholesalePrice=productWholesalePrice;
        this.productRetailPrice=productRetailPrice;
    }
}

