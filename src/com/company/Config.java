package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Config {

    public static ArrayList<VendingMachine> createData() {

        Snack snickers = new Snack("1", "Snickers", "Snickers", 2.00, 2.00);
        Snack reeses = new Snack("2", "Reeses", "Reeses", 2.00, 2.00);
        Snack crunchbar = new Snack("3", "Crunchbar", "Crunchbar", 2.00, 2.00);
        Snack potatoChips = new Snack("4", "Potato Chips", "Potato Chips", 2.00, 2.00);
        Snack animalCrackers = new Snack("5", "Animal Crackers", "Animal Crackers", 2.00, 2.00);
        Snack peanuts = new Snack("6", "Peanuts", "Peanuts", 0.25, 0.25);
        Snack mm = new Snack("7", "M&Ms", "M&Ms", 0.25, 0.25);


        SnackMachine snackMachine = new SnackMachine("Atlanta", "The VendingMachine Company");
        snackMachine.stockProduct(snickers, 10, 0, 0);
        snackMachine.stockProduct(crunchbar, 10, 1, 0);
        snackMachine.stockProduct(potatoChips, 5, 0, 1);
        snackMachine.stockProduct(animalCrackers, 3, 2, 2);
        snackMachine.stockProduct(peanuts, 8, 3, 3);
        snackMachine.stockProduct(mm, 9, 0, 4);
        snackMachine.stockProduct(reeses, 2, 2, 4);


        DrinkMachine drinkMachine = new DrinkMachine("Atlanta", "The VendingMachine Company");
        Drink cocaCola = new Drink("8", "Coca-cola", "Coca-cola", 2.00, 2.00, true);
        Drink sprite = new Drink("9", "Sprite", "Sprite", 2.00, 2.00, false);
        Drink dietcoke = new Drink("10", "Diet Coke", "Diet Coke", 2.00, 2.00, true);
        Drink dietPepsi = new Drink("11", "Diet Pepsi", "Diet Pepsi", 2.00, 2.00, false);
        Drink drPepper = new Drink("12", "Dr. Pepper", "Dr. Pepper", 2.00, 2.00, true);
        Drink dietDrPepper = new Drink("13", "Diet Dr.Pepper", "Diet Dr.Pepper", 2.00, 2.00, true);
        Drink pepsi = new Drink("14", "Pepsi", "Pepsi", 2.00, 2.00, true);

        drinkMachine.stockProduct(cocaCola, 10, 0, 0);
        drinkMachine.stockProduct(sprite, 5, 0, 1);
        drinkMachine.stockProduct(dietcoke, 3, 2, 2);
        drinkMachine.stockProduct(dietPepsi, 8, 3, 3);
        drinkMachine.stockProduct(drPepper, 9, 0, 4);
        drinkMachine.stockProduct(cocaCola, 2, 2, 4);
        drinkMachine.stockProduct(sprite, 2, 2, 4);
        drinkMachine.stockProduct(pepsi, 2, 2, 2);
        drinkMachine.stockProduct(pepsi, 2, 2, 3);

        ArrayList<VendingMachine> vendingMachines = new ArrayList<>();
        vendingMachines.add(drinkMachine);
        vendingMachines.add(snackMachine);

        Company company = new Company("The VendingMachine Company", "123", vendingMachines);

        return vendingMachines;
    }
}
