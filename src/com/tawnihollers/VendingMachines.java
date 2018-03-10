package com.tawnihollers;



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


    public void getNameOfCompany(){
        System.out.println("The Company name is " + company);
    }


    public void customerAddsMoneyToTheMachine(int coin){
        switch (coin){
            default : {
                System.out.println("That is not a coin the machine can take");
                break;
            }
            case 1: {
                addNickels(1);
                break;
            }
            case 2: {
                addDimes(1);
                break;
            }
            case 3: {
                addQuarters(1);
                break;
            }

        }
    }

    public void addNickels(int nickels){
        this.nickels += nickels;
    }

    public double getNickelValue(){
        return (this.nickels * NICKEL);
    }

    public void addDimes(int dimes){
        this.dimes += dimes;
    }

    public void addQuarters(int quarters){
        this.quarters += quarters;
    }

    public int getNickels() {
        return nickels;
    }

    public int getDimes() {
        return dimes;
    }

    public int getQuarters() {
        return quarters;
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
        String indiviualCoins = "Nickels in machine " + nickelsGiven
                + ". Dimes in machine " + dimesGiven + " Quarters in machine " + quartersGiven;
        System.out.println("Total money in the machine: " + money);
        System.out.println(indiviualCoins);
    }



}
