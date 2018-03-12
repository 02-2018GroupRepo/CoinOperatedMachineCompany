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
        Product A1 = new Product("A1", "Blue Poweraide", "Blue Sports Drink", 0.50, 1.25);
        drinks.add(A1);
        Product A2 = new Product("A2", "Red Poweraide","Red Sports Drink", 0.50, 1.25);
        drinks.add(A2);
        Product A3 = new Product("A3", "Orange Poweraide","Orange Sports Drink", 0.50, 1.25);
        drinks.add(A3);
        Product A4 = new Product("A4", "Pink Poweraide","Pink Sports Drink", 0.50, 1.25);
        drinks.add(A4);
        Product A5 = new Product("A5", "Yellow Poweraide","yellow Sports Drink", 0.50, 1.25);
        drinks.add(A5);
        Product A6 = new Product("C1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(A6);
        Product B1 = new Product("B1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(B1);
        Product B2 = new Product("B2", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(B2);
        Product B3 = new Product("B3", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(B3);
        Product B4 = new Product("B4", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(B4);
        Product B5 = new Product("B5", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(B5);
        Product B6 = new Product("B6", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(B6);
        Product C1 = new Product("C1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(C1);
        Product C2 = new Product("C2", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(C2);
        Product C3 = new Product("C3", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(C3);
        Product C4 = new Product("C4", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(C4);
        Product C5 = new Product("C5", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(C5);
        Product C6 = new Product("C6", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(C6);
        Product D1 = new Product("D1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(D1);
        Product D2 = new Product("D2", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(D2);
        Product D3 = new Product("D3", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(D3);
        Product D4 = new Product("D4", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(D4);
        Product D5 = new Product("D5", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(D5);
        Product E1 = new Product("E1", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(E1);
        Product E2 = new Product("E2", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(E2);
        Product E3 = new Product("E3", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(E3);
        Product E4 = new Product("E4", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(E4);
        Product E5 = new Product("E5", "Snickers","chocolate bar", 0.35, 0.75);
        drinks.add(E5);


    }

    public void setSnacks(){
        Product A1 = new Product("A1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(A1);
        Product A2 = new Product("A2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(A2);
        Product A3 = new Product("A3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(A3);
        Product A4 = new Product("A4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(A4);
        Product A5 = new Product("A5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(A5);
        Product B1 = new Product("B1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(B1);
        Product B2 = new Product("B2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(B2);
        Product B3 = new Product("B3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(B3);
        Product B4 = new Product("B4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(B4);
        Product B5 = new Product("B5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(B5);
        Product C1 = new Product("C1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(C1);
        Product C2 = new Product("C2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(C2);
        Product C3 = new Product("C3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(C3);
        Product C4 = new Product("C4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(C4);
        Product C5 = new Product("C5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(C5);
        Product D1 = new Product("D1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(D1);
        Product D2 = new Product("D2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(D2);
        Product D3 = new Product("D3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(D3);
        Product D4 = new Product("D4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(D4);
        Product D5 = new Product("D5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(D5);
        Product E1 = new Product("E1", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(E1);
        Product E2 = new Product("E2", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(E2);
        Product E3 = new Product("E3", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(E3);
        Product E4 = new Product("E4", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(E4);
        Product E5 = new Product("E5", "Snickers","chocolate bar", 0.35, 0.75);
        snacks.add(E5);



    }
}
