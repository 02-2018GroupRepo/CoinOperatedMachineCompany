package com.company;

public class SnackMachine extends VendingMachine {
    private static final String machineType = "Snack Machine";
    public void SnackMachine(){
        for(int i=0; i < 5; i++){
            Shelf drinkShelf = new Shelf(5, 10);
            getShelves().add(drinkShelf);
        }
    }
}
