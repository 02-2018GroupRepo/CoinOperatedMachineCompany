package com.fileCreating;

import java.util.HashMap;
import java.util.Map;

import static com.fileCreating.Coins.DIME;
import static com.fileCreating.Coins.NICKEL;
import static com.fileCreating.Coins.QUARTER;

public class Coins_TotalCoinsInMachine {

    private int totalNumNickels;
    private int totalNumDimes;
    private int totalNumQuarters;
    private double amountMoney;

    private Coins_CurrentOrder currCoins = new Coins_CurrentOrder();

    public Coins_TotalCoinsInMachine() {
        this.totalNumNickels = 0;
        this.totalNumDimes = 0;
        this.totalNumQuarters = 0;
        this.amountMoney = 0;
    }

    public double purchased(Double price){
        return currCoins.getCurTotal() - price;
    }

    public void insertion(Double coin) {
        if (coin == NICKEL) {
            this.currCoins.setCurNumNickels();
            this.totalNumNickels++;
        } else if (coin == DIME) {
            this.currCoins.setCurNumDimes();
            this.totalNumDimes++;
        } else if (coin == QUARTER) {
            this.currCoins.setCurNumQuarters();
            this.totalNumQuarters++;
        }
    }

    public void returnMoney() {
        this.totalNumNickels -= currCoins.getCurNumNickels();
        this.totalNumDimes -= currCoins.getCurNumDimes();
        this.totalNumQuarters -= currCoins.getCurNumQuarters();
    }

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


    public double getAmountMoney() { return amountMoney; }
    public int getTotalNumNickels() { return totalNumNickels; }
    public int getTotalNumDimes() { return totalNumDimes; }
    public int getTotalNumQuarters() { return totalNumQuarters; }
}
