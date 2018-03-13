package com.CoinOperatedMachine;

import java.util.ArrayList;

public class Shelf {
    private String name;
    private int size;
    private ArrayList<Compartment> productCompartment = new ArrayList<Compartment>();

    public Shelf(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
