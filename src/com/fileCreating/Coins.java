package com.fileCreating;

public class Coins {
    public final static double NICKEL = 0.05;
    public final static double DIME = 0.10;
    public final static double QUARTER = 0.25;

    private int curNumNickels;
    private int curNumDimes;
    private int curNumQuarters;

    public Coins(){
        this.curNumDimes = 0;
        this.curNumNickels = 0;
        this.curNumQuarters = 0;
    }

    public Coins(int curNumNickels, int curNumDimes, int curNumQuarters) {
        this.curNumNickels = curNumNickels;
        this.curNumDimes = curNumDimes;
        this.curNumQuarters = curNumQuarters;
    }


    public double getCurTotal(){
        return (curNumNickels * NICKEL) + (curNumDimes * DIME) + (curNumQuarters + QUARTER);
    }

    public void curReset(){
        this.curNumDimes = 0;
        this.curNumNickels = 0;
        this.curNumQuarters = 0;
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
