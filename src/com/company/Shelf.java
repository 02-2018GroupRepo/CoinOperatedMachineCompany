package com.company;

import java.util.ArrayList;
import java.util.Map;

public class Shelf {
    Map<Integer, ArrayList<Product>> shelf;
    public int spaces;
    public int compartments;

    public Shelf(Map<Integer, ArrayList<Product>> shelf, int spaces, int compartments) {
        this.shelf = shelf;
        this.spaces = spaces;
        this.compartments = compartments;
    }

    public void stockCompartment(int compartment, Product product){
        int emptySpaces = spaces - shelf.get(compartment).size();
        if (emptySpaces > 0){
            for(int i=0; i < emptySpaces; i++){
                shelf.get(compartment).add(product);
            }
            System.out.println("The compartment is now re-stocked.");
        }
        else {
            System.out.println("This compartment is already full.");
        }
    }
}
