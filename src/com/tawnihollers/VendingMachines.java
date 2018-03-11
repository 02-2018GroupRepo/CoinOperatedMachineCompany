package com.tawnihollers;


import java.util.HashMap;

public class VendingMachines extends Operator{
    public final static String company = "Verdy Venders & Co.\n";
    public final static double NICKEL = 0.05;
    public final static double DIME = 0.10;
    public final static double QUARTER = 0.25;

    private int nickels;
    private int dimes;
    private int quarters;
    private int nickelsGiven;
    private int dimesGiven;
    private int quartersGiven;
    private int coinsInMachine;

    HashMap<String, Integer> coins = new HashMap<>();


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


    public void countOfCoinsInTheMachine(){
        nickelsGiven += nickels;
        dimesGiven += dimes;
        quartersGiven += quarters;
    }

    public void getTotalCashInMachine(){
        double money = (nickelsGiven * NICKEL) + (dimesGiven * DIME) + (quartersGiven * QUARTER);
        String individualCoins = "Nickels in machine " + nickelsGiven
                + "\nDimes in machine " + dimesGiven + "\nQuarters in machine " + quartersGiven;
        System.out.printf("Total money in the machine: $%.2f\n", money);
        System.out.println(individualCoins);
    }



}
