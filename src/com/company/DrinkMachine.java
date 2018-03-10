package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class DrinkMachine extends Machine{
    Change change = new Change();

    //Cans
    Product sprite = new Product (1,"Sprite", "sugar filled", 1.00, 2.00);
    Product coke = new Product (2,"Coke", "sugar filled", 1.00, 2.00);
    Product dietCoke = new Product (3, "Diet Coke", "sugar filled", 1.00, 2.00);
    Product pepsi = new Product (4, "Pepsi", "sugar filled", 1.00, 2.00);
    Product cherryCoke = new Product (5, "Cherry Coke", "sugar filled", 1.00, 2.00);
    Product la_Croix = new Product (6, "La Croix", "sugar filled", 1.00, 2.00);

    //Bottles
    Product water = new Product (7, "Water", "healthy", 0.50, 1.50);
    Product blueGatorade = new Product ( 8, "Blue Gatorade", "moderately healthy", 0.75, 1.75);
    Product orangeGatorade = new Product ( 9, "Orange Gatorade", "moderately healthy", 0.75, 1.75);
    Product vitaminWater = new Product (10, "Vitamin Water", "healthy", 0.50, 1.50);
    //This is where I stopped with last commit. To be continued...
//    Product[] products = {potatoChips, pretzels, doritos, coolRanchDoritos, reeses};
    ArrayList<ArrayList<ArrayDeque<Product>>> vendingMachineContents = new ArrayList<>(5);

    public DrinkMachine(){}

    public DrinkMachine (String location, int nickels, int dimes, int quarters){
        super(location, nickels, dimes, quarters);
    }

//    public void loadMachine() {
//        for (int i = 0; i < 5; i++) {
//            vendingMachineContents.add(new ArrayList<ArrayDeque<Product>>());
//            for (int j = 0; j < 5; j++) {
//                vendingMachineContents.get(i).add(new ArrayDeque<Product>());
//                for (int k = 0; k < 10; k++) {
//                    vendingMachineContents.get(i).get(j).push(products[j]);
//                }
//            }
//        }
//    }
//
//    public void displayVendingMenu() {
//        System.out.println("Please make your selection:");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print( i + "." + j + " = " + products[j].getName() + " = $" + products[j].getRetailPrice() + " | ");
//                for (int k = 0; k < 10; k++) {
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    public String getProductNameFromCode (int i, int j){
//        return vendingMachineContents.get(i).get(j).peekFirst().getName();
//    }
//    public void coinAndItemExchange (int i, int j, double moneyCustomerEntered){
//        double retailPrice = vendingMachineContents.get(i).get(j).peekFirst().getRetailPrice();
//        if(retailPrice <= moneyCustomerEntered ){
//            //Deliver item to customer
//            System.out.println("You have received " + vendingMachineContents.get(i).get(j).peekFirst().getName() + "." + "\n");
//            //Return change to customer
//            double customerChange = moneyCustomerEntered - retailPrice;
//            System.out.printf("Your change is " + "%.2f" + "\n", customerChange + ".");
//            System.out.printf("%.0f" + " " + change.changeInNameOfCoin(customerChange) + " have been returned."
//                    ,change.changeInNumberOfCoin(customerChange) );
//            vendingMachineContents.get(i).get(j).pop();
//        }else{
//            System.out.println("Not enough payment.");
//            System.out.printf(getQuarters() + " Quarters, " + getDimes() + " Dimes, " + getNickels() + " Nickels returned.");        }
//
//
//    }

}
