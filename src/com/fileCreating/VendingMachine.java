package com.fileCreating;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.HashMap;
import java.util.Map;

import static com.fileCreating.Coins.DIME;
import static com.fileCreating.Coins.NICKEL;
import static com.fileCreating.Coins.QUARTER;

abstract class VendingMachine implements CoinOperator {

    private String location;
    private int totalNumNickels;
    private int totalNumDimes;
    private int totalNumQuarters;
    private double amountMoney;

    private int numOfShelves;
    private int numOfCompartments;
    private int numOfMaxSpace;

    public VendingMachine(int numOfShelves, int numOfCompartments, int maxNumOfSpace) {
        this.numOfShelves = numOfShelves;
        this.numOfCompartments = numOfCompartments;
        this.numOfMaxSpace = maxNumOfSpace;

        this.totalNumNickels = 0;
        this.totalNumDimes = 0;
        this.totalNumQuarters = 0;
        this.amountMoney = 0;
    }

    private Coins coin = new Coins();
    Product[][] inventory = new Product[numOfShelves][numOfCompartments];


    @Override
    public void insertion(Double coin) {
        if (coin == NICKEL) {
            this.coin.setCurNumNickels();
            this.totalNumNickels++;
        } else if (coin == DIME) {
            this.coin.setCurNumDimes();
            this.totalNumDimes++;
        } else if (coin == QUARTER) {
            this.coin.setCurNumQuarters();
            this.totalNumQuarters++;
        }
    }


    @Override
    public void returnMoney() {
        this.totalNumNickels -= coin.getCurNumNickels();
        this.totalNumDimes -= coin.getCurNumDimes();
        this.totalNumQuarters -= coin.getCurNumQuarters();
    }

    @Override
    public Product selection(int row, int col) {

        double changes = purchased(inventory[row][col].getPrice());

        // Print Changes
        if(changes >= 0) {
            System.out.println("Total Change is: ");
            for (Map.Entry<Double, Integer> changeReturn : returnChanges(changes).entrySet()) {
                System.out.println(changeReturn.getValue() + " " + changeReturn.getKey() + "s");
            }
        } else {
            // Not enough money
            System.out.println("Not enough money to make purchase");
            return null;
        }

        return inventory[row][col];
    }

    @Override
    public double purchased(Double price){
        return coin.getCurTotal() - price;
    }

    @Override
    public Map<Double, Integer> returnChanges(Double price) {
        Map<Double, Integer> changesMap = new HashMap<Double, Integer>();

        if (price % QUARTER == 0) {
            if (price / QUARTER >= totalNumQuarters) {
                totalNumQuarters -= (price / QUARTER);
                price = (price / QUARTER) * QUARTER;
                changesMap.put(QUARTER, (int)(price / QUARTER));
            } else {
                price -= totalNumQuarters * QUARTER;
                changesMap.put(QUARTER, totalNumQuarters);
            }
        }

        if (price % DIME == 0) {
            if (price / DIME >= totalNumDimes) {
                totalNumDimes -= (price / DIME);
                price -= (price / DIME) * DIME;
                changesMap.put(DIME, (int)(price / DIME));

            } else {
                price -= totalNumDimes * DIME;
                changesMap.put(DIME, totalNumDimes);
            }

        }
        if (price % NICKEL == 0){
            if (price / NICKEL >= totalNumNickels) {
                totalNumNickels -= (price / NICKEL);
                price -= (price / NICKEL) * NICKEL;
                changesMap.put(NICKEL, (int)(price / NICKEL));
            } else {
                price -= totalNumNickels * NICKEL;
                changesMap.put(NICKEL, totalNumNickels);
            }

        }

        return changesMap;
    }



    public void setItem(int row, int col, String itemName){
        inventory[row][col].setItemName(itemName);
    }
    public void setItem(int row, int col, Double price){
        inventory[row][col].setPrice(price);
    }
    public void setItem(int row, int col, String itemName, Double price){
        inventory[row][col].setPrice(price);
        inventory[row][col].setItemName(itemName);
    }

    public void intializeInventory(){
        for(int i = 0; i < numOfShelves; i++){
            for(int j = 0; j < numOfCompartments; j++){
                inventory[i][j] = new Product();
            }
        }
    }

    public void addToInventory(int row, int col, int amount){
        int newInventoryLength = inventory[row][col].getStock() + amount;
        int finalAmount = newInventoryLength > numOfMaxSpace ? numOfMaxSpace : newInventoryLength;
        inventory[row][col].setStock(finalAmount);
    }
    public void addToInventory(int row, int col, int amount, String item){
        int newInventoryLength = inventory[row][col].getStock() + amount;
        int finalAmount = newInventoryLength > numOfMaxSpace ? numOfMaxSpace : newInventoryLength;
        inventory[row][col].setStock(finalAmount);
        inventory[row][col].setItemName(item);
    }


    public void printInventory(){
        for(int i = 0; i < numOfShelves; i++){
            for(int j = 0; j < numOfCompartments; j++){
                if(inventory[i][j].getStock() != 0) {
                    System.out.print("ITEM: " + inventory[i][j].getItemName() + " Price: " + inventory[i][j].getPrice());
                    System.out.println(" Amount in Stock: " + inventory[i][j].getStock());
                }
            }
        }
    }


    public void setTotalNumNickels(int totalNumNickels) {
        this.totalNumNickels += totalNumNickels;
        this.amountMoney += totalNumNickels * NICKEL;
    }

    public void setTotalNumDimes(int totalNumDimes) {
        this.totalNumDimes += totalNumDimes;
        this.amountMoney += totalNumDimes * DIME;
    }

    public void setTotalNumQuarters(int totalNumQuarters) {
        this.totalNumQuarters += totalNumQuarters;
        this.amountMoney += totalNumQuarters * QUARTER;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public double getAmountMoney() {
        return amountMoney;
    }

    public int getTotalNumNickels() {
        return totalNumNickels;
    }

    public int getTotalNumDimes() {
        return totalNumDimes;
    }

    public int getTotalNumQuarters() {
        return totalNumQuarters;
    }
}

