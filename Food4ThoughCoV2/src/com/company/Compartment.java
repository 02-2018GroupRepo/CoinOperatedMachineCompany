package com.company;

import java.util.ArrayList;

public class Compartment {

    private String name;
    private ArrayList<Product> drinks = new ArrayList<Product>();
    private ArrayList<Product> snacks = new ArrayList<Product>();

    public Compartment(String name){
        this.name = name;
        setDrinks();
        setSnacks();
    }

    public void setDrinks(){
        Product A1 = new Product("A1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(A1);
    }

    public void setSnacks(){
        Product A1 = new Product("A1", "Blue Poweraide", "Blue Sports drink", 0.50, 1.25);
        snacks.add(A1);
    }
}
