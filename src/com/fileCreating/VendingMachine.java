package com.fileCreating;

import java.util.HashMap;
import java.util.Map;

import static com.fileCreating.Coins.DIME;
import static com.fileCreating.Coins.NICKEL;
import static com.fileCreating.Coins.QUARTER;

abstract class VendingMachine implements CoinOperator {

    private String location;
    private int totalNumNickels = 0;
    private int totalNumDimes = 0;
    private int totalNumQuarters = 0;
    private int curNumNickels = 0;
    private int curNumDimes = 0;
    private int curNumQuarters = 0;
    private double amountMoney = 0;

    @Override
    public void insertion(Double coin) {
        if (coin == NICKEL) {
            this.curNumNickels++;
            this.totalNumNickels++;
            this.amountMoney += NICKEL;
        } else if (coin == DIME) {
            this.curNumDimes++;
            this.totalNumDimes++;
            this.amountMoney += DIME;
        } else if (coin == QUARTER) {
            this.curNumQuarters++;
            this.totalNumQuarters++;
            this.amountMoney += QUARTER;
        } else {
        }
    }


    @Override
    public void returnMoeney() {
        this.totalNumNickels -= curNumNickels;
        this.totalNumDimes -= curNumDimes;
        this.totalNumQuarters -= curNumQuarters;
        this.amountMoney -= curNumNickels + curNumDimes + curNumQuarters;

        resetCurCoins();
    }

    @Override
    public Map<Double, Integer> purchased(Double price) {
        Map<Double, Integer> changesMap = new HashMap<Double, Integer>();

        if (price % QUARTER == 0) {
            if (price / QUARTER >= totalNumQuarters) {
                totalNumQuarters -= curNumQuarters;
                price -= curNumQuarters * QUARTER;
                changesMap.put(QUARTER, curNumQuarters);
            } else {
                price -= totalNumQuarters * QUARTER;
                changesMap.put(QUARTER, totalNumQuarters);
            }
        } else if (price % DIME == 0) {
            if (price / DIME >= totalNumDimes) {
                totalNumDimes -= curNumDimes;
                price -= curNumDimes * DIME;
                changesMap.put(DIME, curNumDimes);

            } else {
                price -= totalNumDimes * DIME;
                changesMap.put(DIME, totalNumDimes);
            }

        } else {
            if (price / NICKEL >= totalNumNickels) {
                totalNumNickels -= curNumNickels;
                price -= curNumNickels * NICKEL;
                changesMap.put(NICKEL, curNumNickels);
            } else {
                price -= totalNumNickels * NICKEL;
                changesMap.put(NICKEL, totalNumNickels);
            }

        }

        resetCurCoins();
        return changesMap;
    }


    public void resetCurCoins() {
        this.curNumQuarters = 0;
        this.curNumNickels = 0;
        this.curNumDimes = 0;
    }


}

