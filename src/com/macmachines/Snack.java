package com.macmachines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Snack extends Machine {
    Map<String, ArrayList<Product>> products = new HashMap<String, ArrayList<Product>>();
    private Snack(String macMachines, String atlanta, HashMap<String, ArrayList<Product>> products) {}

    public Snack(String companyName, Map<String, ArrayList<Product>> products) {
        super(companyName);
        this.products = products;
    }

    public void getProduct(String area) {
        products.get(area).get(0).getName();
    }
}
