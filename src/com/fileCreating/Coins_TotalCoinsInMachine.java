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
    private double totalAmountMoney;

    private Coins_CurrentOrder currCoins = new Coins_CurrentOrder();

    public Coins_TotalCoinsInMachine() {
        this.totalNumNickels = 0;
        this.totalNumDimes = 0;
        this.totalNumQuarters = 0;
        this.totalAmountMoney = 0;
    }

    public double purchased(Double price, Coins_CurrentOrder myCoins) {
        DecimalFormat f = new DecimalFormat("##.00");
        return Double.parseDouble(f.format(myCoins.getCurTotal() - price));
    }

    public void insertion(Coins_CurrentOrder myCurrCoins) {

        this.totalNumNickels += myCurrCoins.getCurNumNickels();
        this.totalNumDimes += myCurrCoins.getCurNumDimes();
        this.totalNumQuarters += myCurrCoins.getCurNumQuarters();

    }

    public void returnMoney() {
        this.totalNumNickels -= currCoins.getCurNumNickels();
        this.totalNumDimes -= currCoins.getCurNumDimes();
        this.totalNumQuarters -= currCoins.getCurNumQuarters();
    }

    public Map<String, Integer> returnChanges(Double priceDifference) {
        Map<String, Integer> changesMap = new HashMap<String, Integer>();
        int numTakenOut;

        if (priceDifference > 0) {
            if (priceDifference >= QUARTER) {
                if (priceDifference / QUARTER <= totalNumQuarters) {
                    totalNumQuarters -= (priceDifference / QUARTER);
                    numTakenOut = (int) (priceDifference / QUARTER);
                    double round = (int) (priceDifference / QUARTER) * QUARTER;
                    //double next = Math.round(round * 100)/100.0;
                    priceDifference = Math.round((priceDifference - round) * 100) / 100.0;
                    changesMap.put("QUARTER", numTakenOut);
                } else {
                    priceDifference -= totalNumQuarters * QUARTER;
                    changesMap.put("QUARTER", totalNumQuarters);
                }
            }

            if (priceDifference / DIME <= totalNumQuarters) {
                totalNumQuarters -= (priceDifference / DIME);
                numTakenOut = (int) (priceDifference / DIME);
                double round = numTakenOut * DIME;
                //double next = Math.round(round * 100)/100.0;
                priceDifference = Math.round((priceDifference - round) * 100) / 100.0;
                changesMap.put("DIME", numTakenOut);
            } else {
                priceDifference -= totalNumQuarters * QUARTER;
                changesMap.put("DIME", totalNumQuarters);
            }

            if (priceDifference / NICKEL <= totalNumQuarters) {
                totalNumQuarters -= (priceDifference / NICKEL);
                numTakenOut = (int) (priceDifference / NICKEL);
                double round = numTakenOut * NICKEL;
                //double next = Math.round(round * 100)/100.0;
                priceDifference = Math.round((priceDifference - round) * 100) / 100.0;
                changesMap.put("NICKEL", numTakenOut);
            } else {
                priceDifference -= totalNumQuarters * NICKEL;
                changesMap.put("NICKEL", totalNumQuarters);
            }
        }

        return changesMap;
    }


    public void setTotalNumNickels(int totalNumNickels) {
        this.totalNumNickels += totalNumNickels;
        this.totalAmountMoney += totalNumNickels * NICKEL;
    }

    public void setTotalNumDimes(int totalNumDimes) {
        this.totalNumDimes += totalNumDimes;
        this.totalAmountMoney += totalNumDimes * DIME;
    }

    public void setTotalNumQuarters(int totalNumQuarters) {
        this.totalNumQuarters += totalNumQuarters;
        this.totalAmountMoney += totalNumQuarters * QUARTER;
    }


    public double getTotalAmountMoney() {
        return totalAmountMoney;
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
