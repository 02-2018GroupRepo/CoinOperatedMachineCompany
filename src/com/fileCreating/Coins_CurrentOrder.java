package com.fileCreating;

import static com.fileCreating.Coins.DIME;
import static com.fileCreating.Coins.NICKEL;
import static com.fileCreating.Coins.QUARTER;

public class Coins_CurrentOrder {

    private int curNumNickels;
    private int curNumDimes;
    private int curNumQuarters;

    public Coins_CurrentOrder(){
        this.curNumDimes = 0;
        this.curNumNickels = 0;
        this.curNumQuarters = 0;
    }

    public Coins_CurrentOrder(int curNumNickels, int curNumDimes, int curNumQuarters) {
        this.curNumNickels = curNumNickels;
        this.curNumDimes = curNumDimes;
        this.curNumQuarters = curNumQuarters;
    }

    public double getCurTotal(){
        return (curNumNickels * NICKEL) + (curNumDimes * DIME) + (curNumQuarters * QUARTER);
    }

    public void curReset(){
        this.curNumDimes = 0;
        this.curNumNickels = 0;
        this.curNumQuarters = 0;
    }

    public void printCustomerCoinReturn(){
        if(curNumNickels > 0) System.out.println("\tNumber of NICKELS returned: " + curNumNickels);
        if(curNumDimes > 0) System.out.println("\tNumber of DIMES returned: " + curNumDimes);
        if(curNumQuarters > 0) System.out.println("\tNumber of QUARTERS returned: " + curNumQuarters);
        System.out.println("");
    }

    public void setCurNumNickels() {
        this.curNumNickels++;
    }

    public void setCurNumDimes() {
        this.curNumDimes++;
    }

    public void setCurNumQuarters() {
        this.curNumQuarters++;
    }


    public int getCurNumNickels() {
        return curNumNickels;
    }

    public int getCurNumDimes() {
        return curNumDimes;
    }

    public int getCurNumQuarters() {
        return curNumQuarters;
    }
}
