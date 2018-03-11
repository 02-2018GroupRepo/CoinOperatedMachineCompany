package com.tawnihollers;

import java.util.ArrayList;
import java.util.Iterator;

public class DrinkMachine extends VendingMachines{

    Product sprite = new Product("A1", "Sprite", "Green Can", 0.50, 0.10, 1);
    Product coke = new Product("A2", "Coke", "Red can", 1.00, 2.00, 10);
    Product rootBeer = new Product("A3", "Root Beer", "Gross can", 1.00, 1.50, 10);
    Product drPepper = new Product("A4", "Dr Pepper", "Alright can", 2.00, 2.80, 10);
    Product melloYellow = new Product("A5", "Mello Yellow", "Off brand sprite can", 1.00, 1.75, 0);
    Product dietCoke = new Product("A6", "Diet Coke", "Diet can of coke", 1.00, 1.75, 0);
    //6 more canned drinks and then 10 bottled drinks
    ArrayList<Product> fun = new ArrayList<>();

    public void drinksInMachine() {

        fun.add(sprite);
        fun.add(coke);
        fun.add(rootBeer);
        fun.add(drPepper);
        fun.add(melloYellow);
        fun.add(dietCoke);

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
                    if (sprite.getRetailSalePrice() <= moneyGiven) {
                        if(sprite.getQty() == 0){
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        }
                        else {
                            double moneyReturned = moneyGiven - sprite.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            sprite.decreaseStock();
                        }
                    }
                }
                case 2: {
                    if (coke.getRetailSalePrice() <= moneyGiven){
                        coke.decreaseStock();
                    }
                }
                case 3: {
                    if(rootBeer.getRetailSalePrice() <= moneyGiven){
                        rootBeer.decreaseStock();
                    }
                }
                case 4: {
                    if(drPepper.getRetailSalePrice() <= moneyGiven){
                        drPepper.decreaseStock();
                    }
                }
                case 5: {
                    if(melloYellow.getRetailSalePrice() <= moneyGiven){
                        melloYellow.decreaseStock();
                    }
                }
                case 6: {
                    if(dietCoke.getRetailSalePrice() <= moneyGiven){
                        dietCoke.decreaseStock();
                    }
                }

            }
        }
    }
}
