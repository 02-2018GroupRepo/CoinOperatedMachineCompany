package com.tawnihollers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SnackMachine extends VendingMachines {

    Product gum = new Product("A1", "Gum", "Minty Gum", 0.50, 0.10, 1);
    Product recess = new Product("A2", "Recess", "Minty Gum", 1.00, 2.00, 10);
    Product butterFinger = new Product("A3", "Butter Finger", "Minty Gum", 1.00, 1.50, 10);
    Product hershy = new Product("A4", "Hershy", "Minty Gum", 2.00, 2.80, 10);
    Product random = new Product("A5", "Random", "Minty Gum", 1.00, 1.75, 0);

    ArrayList<Product> fun = new ArrayList<>();
    static HashMap<String, Integer> myMap = new HashMap<>();

    static {
        myMap.put("Gum", 10);
        myMap.put("Recess", 10);
        myMap.put("Butter Finger", 10);
        myMap.put("Hershy", 10);
        myMap.put("Random", 0);
    }

    public void snacksInMachine() {

        fun.add(gum);
        fun.add(recess);
        fun.add(butterFinger);
        fun.add(hershy);
        fun.add(random);

        Iterator itr = fun.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            System.out.println(x);
        }

    }

    public void takeMoneyAndChangeQty(double moneyGiven, String letter, int number) {
        if (letter.equals("A")) {
            switch (number) {
                case 1: {
                    if (gum.getRetailSalePrice() <= moneyGiven) {
                        double moneyReturned = moneyGiven - gum.getRetailSalePrice();
                        System.out.printf("Your money returned $%.2f\n", moneyReturned);
                    }
                }
                case 2: {
                    if (recess.getRetailSalePrice() <= moneyGiven){
                        recess.decreaseStock();
                    }
                }
                case 3: {
                    if(butterFinger.getRetailSalePrice() <= moneyGiven){
                        butterFinger.decreaseStock();
                    }
                }
                case 4: {
                    if(hershy.getRetailSalePrice() <= moneyGiven){
                        hershy.decreaseStock();
                    }
                }
                case 5: {
                    if(random.getRetailSalePrice() <= moneyGiven){
                        random.decreaseStock();
                    }
                }

            }
        }
    }

}
