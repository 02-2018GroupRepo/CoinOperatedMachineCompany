package com.company;

import java.util.ArrayList;

public class SnackMachine extends VendingMachine {
    private ArrayList<Shelf> shelves = new ArrayList<Shelf>();

    public SnackMachine(ArrayList<Shelf> shelves) {
        this.shelves = shelves;
    }
}
