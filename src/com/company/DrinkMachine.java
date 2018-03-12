package com.company;

public class DrinkMachine extends VendingMachine{
    private static final String machineType = "Drink Machine";
    public void DrinkMachine(){
        for(int i=0; i < 3; i++){
            Shelf drinkShelf = new Shelf(6, 12);
            getShelves().add(drinkShelf);
        }
        for(int i=0; i < 2; i++){
            Shelf drinkShelf = new Shelf(5, 10);
            getShelves().add(drinkShelf);
        }
    }
}
