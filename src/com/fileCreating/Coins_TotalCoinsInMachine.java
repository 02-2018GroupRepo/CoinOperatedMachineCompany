package com.fileCreating;

import java.text.DecimalFormat;
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

    public double purchased(Double price, Coins_CurrentOrder myCoins){
        DecimalFormat f = new DecimalFormat("##.00");
        return Double.parseDouble(f.format(myCoins.getCurTotal() - price));
    }

    public void insertion(Coins_CurrentOrder myCurrCoins) {

        this.totalNumNickels += myCurrCoins.getCurNumNickels();
        this.totalNumDimes += myCurrCoins.getCurNumDimes();
        this.totalNumQuarters += myCurrCoins.getCurNumQuarters();

//        if (coin == NICKEL) {
//            this.currCoins.setCurNumNickels();
//            this.totalNumNickels++;
//        } else if (coin == DIME) {
//            this.currCoins.setCurNumDimes();
//            this.totalNumDimes++;
//        } else if (coin == QUARTER) {
//            this.currCoins.setCurNumQuarters();
//            this.totalNumQuarters++;
//        }
    }

    public void returnMoney() {
        this.totalNumNickels -= currCoins.getCurNumNickels();
        this.totalNumDimes -= currCoins.getCurNumDimes();
        this.totalNumQuarters -= currCoins.getCurNumQuarters();
    }

    public Map<Double, Integer> returnChanges(Double priceDifference) {
        Map<Double, Integer> changesMap = new HashMap<Double, Integer>();
        DecimalFormat f = new DecimalFormat("##.00");
        int numTakenOut;

        if(priceDifference > 0) {
            if (priceDifference >= QUARTER) {
                if (priceDifference / QUARTER <= totalNumQuarters) {
                    totalNumQuarters -= (priceDifference / QUARTER);
                    numTakenOut = (int)(priceDifference / DIME);
                    priceDifference = (int)(priceDifference / QUARTER) * QUARTER;
                    changesMap.put(QUARTER, numTakenOut);
                } else {
                    priceDifference -= totalNumQuarters * QUARTER;
                    changesMap.put(QUARTER, totalNumQuarters);
                }
            }

            if (priceDifference >= DIME) {
                if (priceDifference / DIME <= totalNumDimes) {
                    totalNumDimes -= (priceDifference / DIME);
                    numTakenOut = (int)(priceDifference / DIME);
                    priceDifference -= (int)(priceDifference / DIME) * DIME;
                    changesMap.put(DIME, numTakenOut);

                } else {
                    priceDifference -= totalNumDimes * DIME;
                    changesMap.put(DIME, totalNumDimes);
                }

            }
            if (priceDifference >= NICKEL) {
                if (priceDifference / NICKEL <= totalNumNickels) {
                    totalNumNickels -= (priceDifference / NICKEL);
                    numTakenOut = (int)(priceDifference / DIME);
                    priceDifference -= (int)(priceDifference / NICKEL) * NICKEL;
                    changesMap.put(NICKEL, numTakenOut);
                } else {
                    priceDifference -= totalNumNickels * NICKEL;
                    changesMap.put(NICKEL, totalNumNickels);
                }

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
