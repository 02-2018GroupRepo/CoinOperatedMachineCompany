package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class DrinkMachine extends Machine implements MachineTransactions {
    Change change = new Change();

    //Cans
    Product sprite = new Product(1, "Sprite", "sugar filled", 1.00, 2.00);
    Product coke = new Product(2, "Coke", "sugar filled", 1.00, 2.00);
    Product dietCoke = new Product(3, "Diet Coke", "sugar filled", 1.00, 2.00);
    Product pepsi = new Product(4, "Pepsi", "sugar filled", 1.00, 2.00);
    Product cherryCoke = new Product(5, "Cherry Coke", "sugar filled", 1.00, 2.00);
    Product la_Croix = new Product(6, "La Croix", "sugar filled", 1.00, 2.00);

    //Bottles
    Product water = new Product(7, "Water", "healthy", 0.50, 1.50);
    Product blueGatorade = new Product(8, "Blue Gatorade", "moderately healthy", 0.75, 1.75);
    Product orangeGatorade = new Product(9, "Orange Gatorade", "moderately healthy", 0.75, 1.75);
    Product vitaminWater = new Product(10, "Vitamin Water", "healthy", 0.50, 1.50);
    Product vitaminWaterFlavored = new Product(16, "Flavored Vitamin Water", "healthy", 0.50, 1.50);

    Product[] productsOfCans = {sprite, coke, dietCoke, pepsi, cherryCoke, la_Croix};
    Product[] productsOfBottles = {water, blueGatorade, orangeGatorade, vitaminWater, vitaminWaterFlavored};
    ArrayList<ArrayList<ArrayDeque<Product>>> vendingMachineContentsOfCans = new ArrayList<>(3);
    ArrayList<ArrayList<ArrayDeque<Product>>> vendingMachineContentsOfBottles = new ArrayList<>(2);

    public DrinkMachine() {
    }

    public DrinkMachine(String location, int nickels, int dimes, int quarters) {
        super(location, nickels, dimes, quarters);
    }

    public void loadMachine() {
        for (int i = 0; i < 3; i++) {
            vendingMachineContentsOfCans.add(new ArrayList<ArrayDeque<Product>>());
            for (int j = 0; j < 6; j++) {
                vendingMachineContentsOfCans.get(i).add(new ArrayDeque<Product>());
                for (int k = 0; k < 12; k++) {
                    vendingMachineContentsOfCans.get(i).get(j).push(productsOfCans[j]);
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            vendingMachineContentsOfBottles.add(new ArrayList<ArrayDeque<Product>>());
            for (int j = 0; j < 5; j++) {
                vendingMachineContentsOfBottles.get(i).add(new ArrayDeque<Product>());
                for (int k = 0; k < 8; k++) {
                    vendingMachineContentsOfBottles.get(i).get(j).push(productsOfBottles[j]);
                }
            }
        }
    }

    public void displayVendingMenu() {
        System.out.println("Please make your selection:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("A." + i + "." + j + " = " + productsOfCans[j].getName() + " = $" + productsOfCans[j].getRetailPrice() + " | ");
//                for (int k = 0; k < 10; k++) {
//                }
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("B." + i + "." + j + " = " + productsOfBottles[j].getName() + " = $" + productsOfBottles[j].getRetailPrice() + " | ");
//                for (int k = 0; k < 10; k++) {
//                }
            }
            System.out.println();
        }
    }

    //
    public String getProductNameFromCode(String letterIndicator, int i, int j) {
        if (letterIndicator.equals("A")) {
            return letterIndicator + i + j + " " + vendingMachineContentsOfCans.get(i).get(j).peekFirst().getName();
        } else {
            return letterIndicator + i + j + " " + vendingMachineContentsOfBottles.get(i).get(j).peekFirst().getName();
        }
    }

    public void coinAndItemExchange(String letterIndicator, int i, int j, double moneyCustomerEntered) {
        if (letterIndicator.equals("A")) {
            double retailPrice = vendingMachineContentsOfCans.get(i).get(j).peekFirst().getRetailPrice();
            if (retailPrice <= moneyCustomerEntered) {
                //Deliver item to customer
                System.out.println("You have received " + vendingMachineContentsOfCans.get(i).get(j).peekFirst().getName() + "." + "\n");
                //Return change to customer
                double customerChange = moneyCustomerEntered - retailPrice;
                System.out.printf("Your change is " + "%.2f" + "." + "\n", customerChange );
                System.out.printf("%.0f" + " " + change.changeInNameOfCoin(customerChange) + " have been returned."
                        , change.changeInNumberOfCoin(customerChange));
                vendingMachineContentsOfCans.get(i).get(j).pop();
            } else {
                System.out.println("Not enough payment.");
                System.out.printf(getQuarters() + " Quarters, " + getDimes() + " Dimes, " + getNickels() + " Nickels returned.");
            }

        } else {
            double retailPrice = vendingMachineContentsOfBottles.get(i).get(j).peekFirst().getRetailPrice();
            if (retailPrice <= moneyCustomerEntered) {
                //Deliver item to customer
                System.out.println("You have received " + vendingMachineContentsOfBottles.get(i).get(j).peekFirst().getName() + "." + "\n");
                //Return change to customer
                double customerChange = moneyCustomerEntered - retailPrice;
                System.out.printf("Your change is " + "%.2f"+ "." + "\n" , customerChange);
                System.out.printf("%.0f" + " " + change.changeInNameOfCoin(customerChange) + " have been returned."
                        , change.changeInNumberOfCoin(customerChange));
                vendingMachineContentsOfBottles.get(i).get(j).pop();
            } else {
                System.out.println("Not enough payment.");
                System.out.printf(getQuarters() + " Quarters, " + getDimes() + " Dimes, " + getNickels() + " Nickels returned.");
            }
        }


    }

}
