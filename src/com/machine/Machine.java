package com.machine;


import com.Product.Product;

import java.util.LinkedList;

public abstract class Machine {

    private final String COMPANY = "JUHO INC";

    public abstract void addItem(Product product, int shelf, int comp);
    public abstract void removeItem(Product product, int shelf, int comp);
    public abstract Product sell(int shelf, int comp, int num_nickel, int num_dime, int num_quarter);
    public abstract double checkCoins();
    public abstract void print();
    public abstract void printAvailableItems();
    public abstract void instantiate();
    public abstract LinkedList<Product>[][] getShelf(int shelf);

    public String getCOMPANY() {
        return COMPANY;
    }
}
