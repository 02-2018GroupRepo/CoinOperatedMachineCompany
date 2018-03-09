package com.company;

import java.util.*;

public class SnackMachine extends Machine {
    //Snacks
    Product potatoChips = new Product(11, "Potato Chips", "salty", 0.75, 1.75);
    Product pretzels = new Product(12, "Pretzels", "salty", 0.75, 1.75);
    Product Doritos = new Product(13, "Doritos", "nacho cheese", 0.75, 1.75);
    Product coolRanchDoritos = new Product(14, "Cool Ranch Doritos", "ranch flavored", 0.75, 1.75);
    Product reeses = new Product(15, "Reese's", "sweet", 1.25, 2.25);

    public SnackMachine() {
    }

    public SnackMachine(String location, int nickels, int dimes, int quarters) {
        super(location, nickels, dimes, quarters);
    }

    private List<Product> a11 = new ArrayList<Product>(Arrays.asList(potatoChips, potatoChips, potatoChips));
    private List<Product> b11 = new ArrayList<Product>(Arrays.asList(potatoChips,potatoChips,potatoChips));

    private Map<String, ArrayList<Product>> snackHashMap = new HashMap<String, ArrayList<Product>> ();



    public void displayVendingMenu() {
        System.out.println("Please make your selection:");
        for (Map.Entry<String, ArrayList<Product>> entry : snackHashMap.entrySet()) {
            ArrayList<Product> listofproducts = entry.getValue();
            Product name = listofproducts.get(0);
            System.out.println(entry.getKey() + ":" + entry.getValue() + " = " + name.getRetailPrice());
        }



    }
}