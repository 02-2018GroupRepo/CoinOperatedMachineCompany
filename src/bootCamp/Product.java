package bootCamp;

import java.util.ArrayList;

public class Product {
    private String id;
    private String name;
    private double wholeSalePrice;
    private double retailPrice;

    public Product(String id, String name, double wholeSalePrice, double retailPrice) {
        this.id = id;
        this.name = name;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = retailPrice;
    }
    Product(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    }
    public  void viewProduct(ArrayList<Product>myProduct){
        System.out.println("*****Welcome to LTC Snack Machine*****");
        for(Product product: myProduct)
            System.out.println(" ID: "+product.id+ " Name: "+product.name+ "  WholeSalePrice: " +product.wholeSalePrice+"  RetailPrice: "+product.retailPrice);
    }
}