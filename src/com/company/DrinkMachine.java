package com.company;

public class DrinkMachine extends VendingMachine{
    public void DrinkMachine(){
        for(int i=0; i < 3; i++){
            Shelf drinkShelf = new Shelf(6, 12);
            getShelves().add(drinkShelf);
        }
        for(int i=0; i < 2; i++){
            Shelf drinkShelf = new Shelf(5, 8);
            getShelves().add(drinkShelf);
        }
    }
}
