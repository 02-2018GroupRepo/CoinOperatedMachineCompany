package com.company;

import java.util.*;

public class SnackMachine extends Machine implements MachineTransactions {

    Change change = new Change();

    //Snacks
    Product potatoChips = new Product(11, "Potato Chips", "salty", 0.75, 1.75);
    Product pretzels = new Product(12, "Pretzels", "salty", 0.75, 1.75);
    Product doritos = new Product(13, "Doritos", "nacho cheese", 0.75, 1.75);
    Product coolRanchDoritos = new Product(14, "Cool Ranch Doritos", "ranch flavored", 0.75, 1.75);
    Product reeses = new Product(15, "Reese's", "sweet", 1.25, 2.25);

    Product[] products = {potatoChips, pretzels, doritos, coolRanchDoritos, reeses};
    ArrayList<ArrayList<ArrayDeque<Product>>> vendingMachineContents = new ArrayList<>(5);

    public SnackMachine() {
    }

    public SnackMachine(String location, int nickels, int dimes, int quarters) {
        super(location, nickels, dimes, quarters);
    }

    public void loadMachine() {
        for (int i = 0; i < 5; i++) {
            vendingMachineContents.add(new ArrayList<ArrayDeque<Product>>());
            for (int j = 0; j < 5; j++) {
                vendingMachineContents.get(i).add(new ArrayDeque<Product>());
                for (int k = 0; k < 10; k++) {
                    vendingMachineContents.get(i).get(j).push(products[j]);
                }
            }
        }
    }


    public void displayVendingMenu() {
        System.out.println("Please make your selection:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print( "A." + i + "." + j + " = " + products[j].getName() + " = $" + products[j].getRetailPrice() + " | ");
//                for (int k = 0; k < 10; k++) {
//                }
            }
            System.out.println();
        }
    }

    public String getProductNameFromCode (String letterIndicator, int i, int j){
        return letterIndicator + i + j + " " + vendingMachineContents.get(i).get(j).peekFirst().getName();
    }

    public void coinAndItemExchange (String letterIndicator, int i, int j, double moneyCustomerEntered){
        double retailPrice = vendingMachineContents.get(i).get(j).peekFirst().getRetailPrice();
        if(retailPrice <= moneyCustomerEntered ){
            //Deliver item to customer
            System.out.println("You have received " + vendingMachineContents.get(i).get(j).peekFirst().getName() + "." + "\n");
            //Return change to customer
            double customerChange = moneyCustomerEntered - retailPrice;
            System.out.printf("Your change is " + "%.2f" + "."+ "\n" , customerChange);
            System.out.printf("%.0f" + " " + change.changeInNameOfCoin(customerChange) + " have been returned."
                    ,change.changeInNumberOfCoin(customerChange) );
            vendingMachineContents.get(i).get(j).pop();
        }else{
            System.out.println("Not enough payment.");
            System.out.printf(getQuarters() + " Quarters, " + getDimes() + " Dimes, " + getNickels() + " Nickels returned.");        }


    }
}