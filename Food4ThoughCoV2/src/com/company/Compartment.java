package com.company;

import java.util.HashMap;
import java.util.Map;

public class Compartment {

    private String name;
    private Map<Product, Integer> drinks = new HashMap<>();
    private Map<Product, Integer> snacks = new HashMap<>();

    public Compartment(String name){
        this.name = name;
        setDrinks();
        setSnacks();
    }

    public void setDrinks(){
        Product A1 = new Product("A1", "Blue Poweraide", "Blue Sports Drink", 0.50, 1.25);
        drinks.put(A1, 12);
        Product A2 = new Product("A2", "Red Poweraide","Red Sports Drink", 0.50, 1.25);
        drinks.put(A2,12);
        Product A3 = new Product("A3", "Orange Poweraide","Orange Sports Drink", 0.50, 1.25);
        drinks.put(A3,12);
        Product A4 = new Product("A4", "Pink Poweraide","Pink Sports Drink", 0.50, 1.25);
        drinks.put(A4,12);
        Product A5 = new Product("A5", "Yellow Poweraide","yellow Sports Drink", 0.50, 1.25);
        drinks.put(A5,12);
        Product A6 = new Product("C1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(A6,12);
        Product B1 = new Product("B1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(B1,12);
        Product B2 = new Product("B2", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(B2,12);
        Product B3 = new Product("B3", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(B3,12);
        Product B4 = new Product("B4", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(B4,12);
        Product B5 = new Product("B5", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(B5,12);
        Product B6 = new Product("B6", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(B6,12);
        Product C1 = new Product("C1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(C1,12);
        Product C2 = new Product("C2", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(C2,12);
        Product C3 = new Product("C3", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(C3,12);
        Product C4 = new Product("C4", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(C4,12);
        Product C5 = new Product("C5", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(C5,12);
        Product C6 = new Product("C6", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(C6,12);
        Product D1 = new Product("D1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(D1,8);
        Product D2 = new Product("D2", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(D2,8);
        Product D3 = new Product("D3", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(D3,8);
        Product D4 = new Product("D4", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(D4,8);
        Product D5 = new Product("D5", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(D5,8);
        Product E1 = new Product("E1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(E1,8);
        Product E2 = new Product("E2", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(E2,8);
        Product E3 = new Product("E3", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(E3,8);
        Product E4 = new Product("E4", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(E4,8);
        Product E5 = new Product("E5", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.put(E5,8);


    }

    public void setSnacks(){
        Product A1 = new Product("A1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(A1, 10);
        Product A2 = new Product("A2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(A2, 10);
        Product A3 = new Product("A3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(A3, 10);
        Product A4 = new Product("A4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(A4, 10);
        Product A5 = new Product("A5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(A5, 10);
        Product B1 = new Product("B1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(B1, 10);
        Product B2 = new Product("B2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(B2, 10);
        Product B3 = new Product("B3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(B3, 10);
        Product B4 = new Product("B4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(B4, 10);
        Product B5 = new Product("B5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(B5, 10);
        Product C1 = new Product("C1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(C1, 10);
        Product C2 = new Product("C2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(C2, 10);
        Product C3 = new Product("C3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(C3, 10);
        Product C4 = new Product("C4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(C4, 10);
        Product C5 = new Product("C5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(C5, 10);
        Product D1 = new Product("D1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(D1, 10);
        Product D2 = new Product("D2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(D2, 10);
        Product D3 = new Product("D3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(D3, 10);
        Product D4 = new Product("D4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(D4, 10);
        Product D5 = new Product("D5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(D5, 10);
        Product E1 = new Product("E1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(E1, 10);
        Product E2 = new Product("E2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(E2, 10);
        Product E3 = new Product("E3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(E3, 10);
        Product E4 = new Product("E4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(E4, 10);
        Product E5 = new Product("E5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.put(E5, 10);



    }
}
