package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shelf {
    Map<Integer, ArrayList<Product>> shelf;
    public int spaces;
    public int compartments;

    public Shelf(int spaces, int compartments) {
        this.shelf = new HashMap<Integer, ArrayList<Product>>();
        this.spaces = spaces;
        this.compartments = compartments;
        generateShelf(compartments);
    }

    public void generateShelf(int compartments){
        for(int i=0; i < compartments; i++) {
            ArrayList<Product> productList = new ArrayList<Product>();
            shelf.put(i, productList);
        }
    }

    public void stockCompartment(int compartment, Product product){
        int emptySpaces = spaces - shelf.get(compartment).size();
        if (emptySpaces > 0){
            for(int i=0; i < emptySpaces; i++){
                shelf.get(compartment).add(product);
            }
            System.out.println("The compartment" + compartment + " is now re-stocked.");
        }
        else {
            System.out.println("This compartment"+ compartment + "is already full.");
        }
    }

    public void viewShelf(){
        for(Map.Entry<Integer, ArrayList<Product>> entry : shelf.entrySet()){
            System.out.printf("Compartment" + entry.getKey() + ": ");
            for (int i =0; i < entry.getValue().size(); i++){
                Product product = entry.getValue().get(i);
                System.out.printf( product.getName() + " ");
            }
            System.out.println("");
        }
    }
}
