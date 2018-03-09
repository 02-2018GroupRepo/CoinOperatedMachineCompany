package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Config {

    public static ArrayList<VendingMachine> createData() {

        Snack snickers = new Snack("1231232", "snickers", "test", 2.00, 2.00);
        Snack reeses = new Snack("1231232", "reeses", "test", 2.00, 2.00);
        Snack donut = new Snack("1231232", "donut", "test", 2.00, 2.00);
        Snack snickers2 = new Snack("1231232", "snickers2", "test", 2.00, 2.00);
        Snack snickers3 = new Snack("1231232", "snickers3", "test", 2.00, 2.00);
        Snack snickers4 = new Snack("1231232", "snickers4", "test", 2.00, 2.00);
        Snack snickers5 = new Snack("1231232", "snickers5", "test", 2.00, 2.00);


        SnackMachine snackMachine = new SnackMachine("test");
        snackMachine.stockProduct(snickers, 10, 0, 0);
        snackMachine.stockProduct(snickers2, 5, 0, 1);
        snackMachine.stockProduct(snickers3, 3, 2, 2);
        snackMachine.stockProduct(snickers4, 8, 3, 3);
        snackMachine.stockProduct(snickers5, 9, 0, 4);
        snackMachine.stockProduct(reeses, 2, 2, 4);


        DrinkMachine drinkMachine = new DrinkMachine("test");
        Drink cocaCola = new Drink("1231232", "snickers", "test", 2.00, 2.00, true);
        Drink sprite = new Drink("1231232", "reeses", "test", 2.00, 2.00, false);
        Drink dietcoke = new Drink("1231232", "donut", "test", 2.00, 2.00, true);
        Drink dietPepsi = new Drink("1231232", "snickers2", "test", 2.00, 2.00, false);
        Drink drPepper = new Drink("1231232", "snickers3", "test", 2.00, 2.00, true);
        Drink dietDrPepper = new Drink("1231232", "snickers4", "test", 2.00, 2.00, true);
        Drink drink5 = new Drink("1231232", "snickers5", "test", 2.00, 2.00, false);
        Drink pepsi = new Drink("1231232", "snickers5", "test", 2.00, 2.00, true);

        drinkMachine.stockProduct(cocaCola, 10, 0, 0);
        drinkMachine.stockProduct(sprite, 5, 0, 1);
        drinkMachine.stockProduct(dietcoke, 3, 2, 2);
        drinkMachine.stockProduct(dietPepsi, 8, 3, 3);
        drinkMachine.stockProduct(drPepper, 9, 0, 4);
        drinkMachine.stockProduct(dietDrPepper, 2, 2, 4);
        drinkMachine.stockProduct(dietDrPepper, 2, 2, 4);
        drinkMachine.stockProduct(dietDrPepper, 2, 2, 4);

        ArrayList<VendingMachine> vendingMachines = new ArrayList<>();
        vendingMachines.add(drinkMachine);
        vendingMachines.add(snackMachine);

        return vendingMachines;
    }
}
