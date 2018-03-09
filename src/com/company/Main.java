package com.company;

public class Main {

    public static void main(String[] args) {










//        VendingMachine vending = new DrinkMachine();
//        vending.vmPrices();
//        vending.vmQuantity();
       VendingMachine vend = new SnackMachine();
        vend.vmQuantity();
        vend.vmPrices();


        Coin nickel = new Coin("Nickel", .05);
        Coin dime = new Coin("Dime", .10);
        Coin quarter = new Coin("Quarter", .25);


        Products Snickers = new Products("Snickers","01", "Snack", .25, .50);
        Products Coke = new Products("Coke", "02", "Drink", .45, .80);
    }
}
