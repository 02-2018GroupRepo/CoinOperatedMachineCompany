package com.company;



public class SnackMachine extends VendingMachine{

    public SnackMachine(){
        super.addToPrice("Snickers", .75);
        super.addToQuantity("Snickers", 10 );

    }
}
