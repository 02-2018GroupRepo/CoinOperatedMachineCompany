package com.company;
import java.util.Map;
import java.util.HashMap;


public class VendingMachine {

    private Map<String, Integer> quantityVending = new HashMap<>();
    private Map<String, Double> priceVending = new HashMap<>();


    public void addToQuantity(String prodName, int quantity){
        this.quantityVending.put(prodName, quantity);
    }

    public void addToPrice(String prodName, double retailPrice){
        this.priceVending.put(prodName, retailPrice);
    }

    public void vmPrices(){
        System.out.println(this.priceVending.toString());
    }

    public void vmQuantity(){
        System.out.println(this.quantityVending.toString());
    }

}
