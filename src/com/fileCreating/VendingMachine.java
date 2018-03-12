package com.fileCreating;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.fileCreating.Coins.DIME;
import static com.fileCreating.Coins.NICKEL;
import static com.fileCreating.Coins.QUARTER;

abstract class VendingMachine {

    private String location;

    private int numOfShelves;
    private int numOfCompartments;
    private int numOfMaxSpace;

    private Coins_TotalCoinsInMachine coin = new Coins_TotalCoinsInMachine();
    //Product[][] inventory = new Product[numOfShelves][numOfCompartments];
    ArrayList<Product>[][] inventory;

    public VendingMachine(int numOfShelves, int numOfCompartments, int maxNumOfSpace) {
        this.numOfShelves = numOfShelves;
        this.numOfCompartments = numOfCompartments;
        this.numOfMaxSpace = maxNumOfSpace;

        inventory = new ArrayList[numOfShelves][numOfCompartments];

    }

    public void selection(int row, int col, Coins_CurrentOrder myMoney) {


        // Print Changes
        if (inventory[row][col].size() > 0) {

            double changes = coin.purchased(inventory[row][col].get(0).getPrice(), myMoney);
            System.out.println("Price: " + inventory[row][col].get(0).getPrice());
            System.out.println("My money " + myMoney.getCurTotal());

            if(changes >= 0) {

                giveCustomerProduct(inventory[row][col]);
                System.out.println("Total Change is: ");
                for (Map.Entry<String, Integer> changeReturn : coin.returnChanges(changes).entrySet()) {
                    System.out.println(changeReturn.getValue() + " " + changeReturn.getKey() + "s");
                }
            } else {
                System.out.println("Not enough money to make purchase");
            }

        } else {
            System.out.println("Sorry Product Not Avaliable");
            myMoney.printCustomerCoinReturn();
            coin.returnMoney();
            myMoney.curReset();
        }
    }

    public void giveCustomerProduct(ArrayList<Product> itemRow) {
        itemRow.get(0).printThisProduct();
        itemRow.remove(0);
    }

    public void setLocation(String location) {
        this.location = location.toLowerCase();
    }

    public String getLocation() {
        return location;
    }

    public void setCoin(Coins_TotalCoinsInMachine coin) {
        this.coin = coin;
    }

    public Coins_TotalCoinsInMachine getCoin() {
        return coin;
    }

    public int getNumOfShelves() {
        return numOfShelves;
    }

    public int getNumOfCompartments() {
        return numOfCompartments;
    }

    public int getNumOfMaxSpace() {
        return numOfMaxSpace;
    }
}

