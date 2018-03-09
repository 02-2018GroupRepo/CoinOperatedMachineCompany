package com.macmachines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Drink extends Machine {
    Map<String, ArrayList<Product>> products = new HashMap<String, ArrayList<Product>>();
    private double insertedMoney;
    private double machineMoney;
    private String machineName;

    private Drink() {}

    public Drink(String companyName, String machineName, Map<String, ArrayList<Product>> products) {
        super(companyName);
        this.machineName = machineName;
        this.products = products;
    }

    public String getMachineName() {
        System.out.println(machineName);
        return machineName;
    }

    public void insertMoney(int quarters, int dimes, int nickels) {
        this.insertedMoney = Coin.QUARTER * quarters + Coin.DIME * dimes + Coin.NICKEL * nickels;
        System.out.println("You have inserted " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        System.out.printf("Total amount inserted is: " + "$%.2f\n", this.insertedMoney);
    }

    public void getProduct(String area) {
        System.out.println(products.get(area).get(0).getName());
        System.out.println(products.get(area).get(0).getDescription());
        System.out.println("$" + products.get(area).get(0).getRetailPrice());
    }

    public void purchaseProduct(String area) {
        if (products.get(area).isEmpty()) {
            System.out.println("Product is out of stock");
        } else if (this.insertedMoney >= products.get(area).get(0).getRetailPrice()) {

            Product purchasedProduct = products.get(area).get(0);
            System.out.println("You have purchased " + purchasedProduct.getName() + ".");

            this.machineMoney += (insertedMoney - purchasedProduct.getRetailPrice());
            addToAllMachineMoney(insertedMoney - purchasedProduct.getRetailPrice());

            double change = insertedMoney - purchasedProduct.getRetailPrice();
            products.get(area).remove(0);
            this.insertedMoney = 0;
            System.out.printf("Your change is: " + "$%.2f\n", change);
        } else {
            System.out.println("You do not have enough money.");
            System.out.printf("$%.2f" + " was returned.\n", this.insertedMoney);
            this.insertedMoney = 0;
        }
    }

    public void getMachineMoney() {
        System.out.println(machineMoney);
    }
}
