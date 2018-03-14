package com.company;

public class Location {
    private String name;

    private SnackMachine snackMachine;
    private DrinkMachine drinkMachine;

    public Location(String name, String smName, String dmName) {
        this.name = name;
        DrinkMachine drinkMachine = new DrinkMachine(dmName);
        SnackMachine snackMachine = new SnackMachine(smName);

    }

    public DrinkMachine getDringMachine() {
        return drinkMachine;
    }

    public SnackMachine getSnackMachine() {
        return snackMachine;
    }
}
