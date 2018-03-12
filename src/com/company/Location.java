package com.company;

public class Location {

    private SnackMachine snack1;
    private DrinkMachine drink1;
    private int qtyOfSnackMachine;
    private int qtyOfDrinkMachine;

    public Location(int qtyOfSnackMachine, int qtyOfDrinkMachine) {
        this.snack1 = new SnackMachine();
        this.drink1 = new DrinkMachine();
        this.qtyOfSnackMachine = qtyOfSnackMachine;
        this.qtyOfDrinkMachine = qtyOfDrinkMachine;

    }
}
