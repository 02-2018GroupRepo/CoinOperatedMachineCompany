package com.macmachines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Snack extends Machine {
    Map<String, ArrayList<Product>> products = new HashMap<String, ArrayList<Product>>();
    private int insertedQuarters;
    private int insertedDimes;
    private int insertedNickels;
    private double insertedMoney;

    private Snack() {}

    public Snack(String companyName, String machineName, Map<String, ArrayList<Product>> products) {
        super(companyName, machineName);
        this.products = products;
    }

    public void insertMoney(int quarters, int dimes, int nickels) {
        this.insertedQuarters = quarters;
        this.insertedDimes = dimes;
        this.insertedNickels = nickels;
        this.insertedMoney = convertCoinsToCash(quarters, dimes, nickels);
        System.out.println("You have inserted " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        System.out.printf("Total amount inserted is: " + "$%.2f\n", this.insertedMoney);
    }

    public void getProduct(String area) {
        System.out.println(products.get(area).get(0).getName());
        System.out.println(products.get(area).get(0).getDescription());
        System.out.println("$" + products.get(area).get(0).getRetailPrice());
    }

    public void purchaseProduct(String compartment) {
        // Check if item is available
        if (products.get(compartment).isEmpty()) {
            System.out.println("Product is out of stock.");
        } else if (this.insertedMoney >= products.get(compartment).get(0).getRetailPrice()) {
            // Retrieve product from compartment
            Product purchasedProduct = products.get(compartment).get(0);
            System.out.println("You have purchased " + purchasedProduct.getName() + ".");

            // Add to machine money and all machine money
            addToMachineMoney(this.insertedQuarters, this.insertedDimes, this.insertedNickels);

            // Calculate change, coins to remove, and remove item from slot in compartment
            double change = insertedMoney - purchasedProduct.getRetailPrice();
            int[] coinsToRemove = convertCashToCoins(change);
            removeMachineMoney(coinsToRemove[0], coinsToRemove[1], coinsToRemove[2]);
            products.get(compartment).remove(0);
            resetInsertedMoney();
            System.out.printf("Your change is: " + "$%.2f\n", change);
        } else {
            // Inform user is short of money and return inserted cash
            System.out.println("You do not have enough money.");
            System.out.printf("$%.2f" + " was returned.\n", this.insertedMoney);
            resetInsertedMoney();
        }
    }

    private void resetInsertedMoney() {
        this.insertedQuarters = 0;
        this.insertedDimes = 0;
        this.insertedNickels = 0;
        this.insertedMoney = 0;
    }
}
