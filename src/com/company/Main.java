package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        Product coke = new Product(1, "Coke", "Soda", 2.00, 4.00);
        Shelf A = new Shelf(10, 5);
        A.stockCompartment(0, coke);
        A.stockCompartment(4, coke);
        A.viewShelf();
    }
}
