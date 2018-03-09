package com.company;

public class DrinkMachine extends VendingMachine {
    public DrinkMachine(){
        super.addToPrice("Coke", .80);
        super.addToQuantity("Coke", 12);
        super.addToPrice("Sprite", .85);
        super.addToQuantity("Sprite",12 );

    }
}
