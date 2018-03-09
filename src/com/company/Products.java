package com.company;

public class Products {
    String name;
    String id;
    String description;
    double whole_price;
    double retail_price;
    int quantity;

    Products(String productName, String productId, String productDescription, double wPrice, double rPrice){
        this.name  = productName;
        this.id = productId;
        this.description = productDescription;
        this.whole_price = wPrice;
        this.retail_price = rPrice;
    }

}


