package com.company;

// compartment to hold inventory

public class Compart {private String name;

    public Compart(String name){
        this.name = name;
    }

    public String getName(){
        System.out.println("testing changes");
        return this.name;
    }
}
