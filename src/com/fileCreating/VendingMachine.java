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

    private Coins coin = new Coins();

    VendingMachine(){
        this.totalNumNickels = 0;
        this.totalNumDimes = 0;
        this.totalNumQuarters = 0;
        this.amountMoney = 0;
    }

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
}

