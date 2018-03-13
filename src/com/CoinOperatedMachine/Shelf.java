package com.CoinOperatedMachine;

import java.util.ArrayList;

public class Shelf {
    private String name;
    private int size;
    private ArrayList<Compartment> productCompartment = new ArrayList<Compartment>();
    private RandomCharGenerartor Randomly = new RandomCharGenerator();

    public Shelf(String name){
        this.name = name;
        setNumberOfCompartments(5);
    }

    public String getName(){
        return this.name;
    }

    public void setNumberOfCompartments(int compartment) {
        for (int i = 0; i < compartment; i++) {
            String compartmentNumber = Randomly.getCompartmentOrderNo();
            Randomly.setCompartmentOrderNo();
            (this.productCompartment).add(new Compartment(compartmentNumber));
        }
    }

    public ArrayList<Compartment>ListOfCompartments(){
        return this.productCompartment;

    }

    public String compartmentToString(){
        String newString = "";
        for(Compartment compartment : this.productCompartment){
            newString += compartment.getName();
        }
        newString += "\n";
        return newString;
    }



}
