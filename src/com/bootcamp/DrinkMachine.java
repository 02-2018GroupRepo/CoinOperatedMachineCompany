package com.bootcamp;

//The drink machine provides bottle and canned drinks for sale.
// There are 3 shelves with 6 compartments on each shelf with 12 individual spaces for canned drinks.
// There are 2 shelves with 5 compartments on each shelf with 8 individual spaces for bottled drinks.

public class DrinkMachine extends VendingMachine {

    public DrinkMachine(){
        super.listOfProducts("A1","water","water",1.50, 2.00);
        super.listOfProducts("B1","sprite","sprite",1.70, 2.50);
        super.listOfProducts("C1","pepsi","pepsi",1.80, 2.10);
        super.listOfProducts("D1","coke","coke",1.90, 2.20);
        super.listOfProducts("E1","apple juice","apple juice",1.95, 2.25);
    }


}
