package com.company;

import java.util.ArrayList;

public class Shelf {

    private String name;
    private ArrayList<Compartment> Compartments = new ArrayList<Compartment>();

    public Shelf(String name){
        this.name = name;
        setCompartments();
    }

    public void setCompartments(){
        Compartment compartment1 = new Compartment("1");
    }
}
