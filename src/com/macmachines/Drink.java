package com.macmachines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drink extends Machine {
    Map<String, ArrayList<Product>> products = new HashMap<String, ArrayList<Product>>();
    private Drink(String macMachines, String atlanta, HashMap<String, ArrayList<Product>> products) {}

    public Drink(String companyName, String location, Map<String, ArrayList<Product>> products) {
        super(companyName, location);
        this.products = products;
    }

    public void getProduct(String area) {
        System.out.println(products.get(area).get(0).getName());
    }
}
