package com.bootcamp;

//The snack machine provides candy and snacks for sale.
// It has 5 shelves with 5 compartments on each shelf.
// Each compartment has 10 spaces for an individual item for sale.

public class SnackMachine extends VendingMachine{

    public SnackMachine() {

        super.listOfProducts("A1", "chips", "chips",1.50, 2.00);
        super.listOfProducts("B1", "popcorn", "popcorn", 1.70, 2.50);
        super.listOfProducts("C1", "pretzels", "pretzels",1.80, 2.10);
        super.listOfProducts("D1", "cookie", "cookie",1.90, 2.20);
        super.listOfProducts("E1", "muffin", "muffin", 1.95, 2.25);
    }
}
