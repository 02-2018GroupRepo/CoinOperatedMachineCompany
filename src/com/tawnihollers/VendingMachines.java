package com.tawnihollers;


public class VendingMachines extends Operator{
    public final static String company = "Verdy Venders & Co.\n";
    public final static double NICKEL = 0.05;
    public final static double DIME = 0.10;
    public final static double QUARTER = 0.25;

    private int nickels;
    private int dimes;
    private int quarters;
    int nickelsGiven;
    int dimesGiven;
    int quartersGiven;

    public void getNameOfCompany(){
        System.out.println("The Company name is " + company);
    }

    public void customerAddsMoneyToMachine(int nickels, int dimes, int quarters){
        addNickels(nickels);
        addDimes(dimes);
        addQuarters(quarters);
    }

    public void resetTotalToZero(){
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }



    public void addNickels(int nickels){
        this.nickels += nickels;
    }


    public void addDimes(int dimes){
        this.dimes += dimes;
    }

    public void addQuarters(int quarters){
        this.quarters += quarters;
    }


    public double getTotal(){
        return ((nickels * NICKEL) +
                (dimes * DIME) +
                (quarters * QUARTER));
    }

// delete this because it doesnt work??
    public void countOfCoinsInTheMachine(){
        nickelsGiven += nickels;
        dimesGiven += dimes;
        quartersGiven += quarters;
    }


}
