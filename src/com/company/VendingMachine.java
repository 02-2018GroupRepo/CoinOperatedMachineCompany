package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class VendingMachine {
    private final String company = "BigVendorBrand";
    private ArrayList<Shelf> shelves = new ArrayList<Shelf>();
    private Wallet wallet = new Wallet();
    private String machineType;

    public VendingMachine(){};

    public VendingMachine(ArrayList<Shelf> shelves, Wallet wallet, String machineType) {
        this.shelves = shelves;
        this.wallet = wallet;
        this.machineType = machineType;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public ArrayList<Shelf> getShelves() {
        return shelves;
    }

    public String getMachineType(){
        return machineType;
    }

    public String getCompany() {
        return company;
    }

    public void purchaseProduct(){
        System.out.println("How many Nickles do you want to enter?");
        Scanner nin = new Scanner(System.in);
        int nickels = nin.nextInt();
        System.out.println("How many Dimes do you want to enter?");
        Scanner din = new Scanner(System.in);
        int dimes = din.nextInt();
        System.out.println("How many Quarters do you want to enter?");
        Scanner tin = new Scanner(System.in);
        int quarters = tin.nextInt();
        orderItem(nickels, dimes, quarters);
    }

    public void orderItem(int nickels, int dimes, int quarters){
        for(int i=0; i < shelves.size(); i++){
            System.out.println("Shelf " + i);
            shelves.get(i).viewShelf();
        }
        System.out.println("Which shelf?");
        Scanner chosenShelf = new Scanner(System.in);
        int shelf = chosenShelf.nextInt();
        System.out.println("Which compartment?");
        Scanner chosenCompartment = new Scanner(System.in);
        int compartment = chosenCompartment.nextInt();
        checkMoney(shelf, compartment, nickels, dimes,quarters);
    }

    public void checkMoney(int numShelf, int compartment, int nickels, int dimes, int quarters){
        double total = getCurrentTotal(nickels, dimes, quarters);
        Product productToPurchase = shelves.get(numShelf).getSpecificProduct(compartment);
        if(total >= productToPurchase.getRetailSalePrice()){
            System.out.println("Thank you, enjoy your " + productToPurchase.getName());
            calculateChange(productToPurchase, nickels, dimes, quarters);
        } else {
            System.out.println("Sorry, not enough money. Here is your $" + total + "back.");
        }
    }

    public void calculateChange(Product product, int nickels, int dimes, int quarters){
        double temp = product.getRetailSalePrice();
        int changeN = 0;
        int changeD = 0;
        int changeQ = 0;
        while(temp > 0.00){
            if (temp > Coins.QUARTER && quarters >= 1){
                temp -= Coins.QUARTER;
                quarters -= 1;
                changeQ += 1;
                wallet.addQuarters(1);
            } else if(temp > Coins.DIME && dimes >= 1){
                temp -= Coins.DIME;
                dimes -= 1;
                changeD += 1;
                wallet.addDimes(1);
            } else if(temp > Coins.NICKEL && nickels >= 1){
                temp -= Coins.NICKEL;
                nickels -= 1;
                changeN += 1;
                wallet.addNickels(1);
            }
        }
        System.out.println("Here is your change");
        System.out.println("Quarters: " + changeQ);
        System.out.println("Dimes: " + changeD);
        System.out.println("Nickels: " + changeN);
    }

    public double getCurrentTotal(int nickels, int dimes, int quarters){
        return ((nickels * Coins.NICKEL) +
                (dimes * Coins.DIME) +
                (quarters * Coins.QUARTER));
    }
}
