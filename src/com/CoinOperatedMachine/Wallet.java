package com.CoinOperatedMachine;

public class Wallet {


    private int nickel;
    private int dime;
    private int quarter;


    public Wallet(int nickel, int dime, int quarter){
        this.nickel = nickel;
        this.dime = dime;
        this.quarter = quarter;
    }

    public void addNickel(int nickel){
        this.nickel += nickel;
    }

    public void addDime(int dime){
        this.dime += dime;
    }

    public void addQuarter(int quarter){
        this.quarter += quarter;
    }

    public int getNickel() {
        return nickel;
    }

    public int getDime() {
        return dime;
    }

    public int getQuarter() {
        return quarter;
    }

    public double getValueOfNickels(){
        return (this.nickel * Coin.nickel);
    }

    public double getValueOfDimes(){
        return (this.dime * Coin.dime);
    }

    public double getValueOfQuarters(){
        return(this.quarter * Coin.quarter);
    }

    public double getTotalValue(){
        return ((nickel * Coin.nickel) +
                (dime * Coin.dime) +
                (quarter * Coin.quarter));
    }
}
