package com.tawnihollers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SnackMachine extends VendingMachines {

    Product gum = new Product("A1", "Gum", "Minty Gum", 0.50, 0.10, 1);
    Product recess = new Product("A2", "Recess", "Minty Gum", 0.25, 1.00, 10);
    Product butterFinger = new Product("A3", "Butter Finger", "Minty Gum", 1.00, 1.50, 10);
    Product hershy = new Product("A4", "Hershy", "Minty Gum", 2.00, 2.80, 10);
    Product twix = new Product("A5", "twix", "Minty Gum", 1.00, 1.75, 0);
    //another 4 shelves of 5
    //find a way for operator to be able to get the hashmap from both SnackMachine and DrinkMachine (maybe return the key values to the main function)
    //find a way to save the coins as seperate coins not just the total
    ArrayList<Product> fun = new ArrayList<>();
    HashMap<String, Double> coins = new HashMap<>();

    static{

    }

    public void snacksInMachine() {

        fun.add(gum);
        fun.add(recess);
        fun.add(butterFinger);
        fun.add(hershy);
        fun.add(twix);

        Iterator itr = fun.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            System.out.println(x);
        }

    }

    public void printOutHashmap(){
        String builder = "";
        for (String foodName : (this.coins).keySet()) {
            builder += foodName + " Price: $" + (this.coins).get(foodName) + "\n";

        }
        System.out.println(builder);
    }

    public void takeMoneyAndChangeQty(double moneyGiven, String letter, int number) {
        if (letter.equals("A")) {
            switch (number) {
                case 1: {
                    if (gum.getRetailSalePrice() <= moneyGiven) {
                        if(gum.getQty() == 0){
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        }
                        else {
                            double moneyReturned = moneyGiven - gum.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            gum.decreaseStock();
                            String key = gum.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (recess.getRetailSalePrice() <= moneyGiven){
                        if(recess.getQty() == 0){
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        }
                        else{
                            double moneyReturned = moneyGiven - recess.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            recess.decreaseStock();
                            String key = recess.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if(butterFinger.getRetailSalePrice() <= moneyGiven){
                        if(butterFinger.getQty() == 0){
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        }
                        else {
                            double moneyReturned = moneyGiven - butterFinger.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            butterFinger.decreaseStock();
                            String key = butterFinger.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if(hershy.getRetailSalePrice() <= moneyGiven){
                        if(hershy.getQty() == 0){
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        }
                        else {
                            double moneyReturned = moneyGiven - hershy.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            hershy.decreaseStock();
                            String key = hershy.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if(twix.getRetailSalePrice() <= moneyGiven){
                        if(twix.getQty() == 0){
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        }
                        else {
                            double moneyReturned = moneyGiven - twix.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            twix.decreaseStock();
                            String key = twix.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }

            }
        }
    }

}
