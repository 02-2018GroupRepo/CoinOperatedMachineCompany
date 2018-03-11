package com.Product;

public class Product {

    private static int id = 0;
    private int product_id;
    private String product_name;
    private String product_desc;
    private double whole_price;
    private double retail_price;

    public Product() {
        this.setProduct_id(id);
        this.setProduct_name("");
        this.setProduct_desc("");
        this.setWhole_price(0);
        this.setRetail_price(0);
        id++;
    }

    public Product(String product_name, String product_desc, double whole_price, double retail_price) {
        this.setProduct_id(id);
        this.setProduct_name(product_name);
        this.setProduct_desc(product_desc);
        this.setWhole_price(whole_price);
        this.setRetail_price(retail_price);
        id++;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public void setWhole_price(double whole_price) {
        this.whole_price = whole_price;
    }

    public void setRetail_price(double retail_price) {
        this.retail_price = retail_price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public double getWhole_price() {
        return whole_price;
    }

    public double getRetail_price() {
        return retail_price;
    }

    public String toString() {
        return ("ID: " + getProduct_id() +
                "\t\tNAME: " + getProduct_name() +
                "\t\tPRICE: " + getRetail_price());
    }
}
