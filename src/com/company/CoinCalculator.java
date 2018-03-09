package com.company;

public class CoinCalculator {
    private int nickels;
    private int dimes;
    private int quarters;

    public CoinCalculator (){}

    public CoinCalculator(int nickels, int dimes, int quarters) {
        addNickels(nickels);
        addDimes(dimes);
        addQuarters(quarters);
    }

    public void addNickels (int nickels){
        this.nickels +=nickels;
    }
    public void addDimes (int dimes){
        this.dimes += dimes;
    }
    public void addQuarters (int quarters){
        this.quarters += quarters;
    }

    public int getNickels (){
        return nickels;
    }
    public int getDimes (){
        return dimes;
    }
    public int getQuarters(){
        return quarters;
    }

    public double getTotal (){
        return ((nickels * Coins.NICKEL)+
                (dimes * Coins.DIME) +
                (quarters * Coins.QUARTER));
    }

}
