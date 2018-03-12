package com.company;

import java.util.ArrayList;

public abstract class Machine {

    private String name;
    private ArrayList<Shelf> shelves = new ArrayList<>();

    public Machine(String name){
        this.name = name;
        setShelves();
    }

    public void setShelves(){
        Shelf A = new Shelf("Shelf A");
        Shelf B = new Shelf("Shelf B");
        Shelf C = new Shelf("Shelf C");
        Shelf D = new Shelf("Shelf D");
        Shelf E = new Shelf("Shelf E");
        shelves.add(A);
        shelves.add(B);
        shelves.add(C);
        shelves.add(D);
        shelves.add(E);
    }

}
