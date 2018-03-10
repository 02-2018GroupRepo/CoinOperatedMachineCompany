package com.company;
import domain.Coin;


import java.util.ArrayList;

public class Machine {
    private ArrayList<Nickel> nickelsInMachine = new ArrayList<Nickel>();
    private ArrayList<Quarter> quartersInMachine = new ArrayList<Quarter>();
    private ArrayList<Dime> dimesInMachine = new ArrayList<Dime>();
    public String name;

    int coinCount;
    double moneyCount;

//        Are these array lists necessary? Could the coin tracking just use doubles? All the coin objects are the same, except for value.
    public Machine(ArrayList<Nickel> nickelsInMachine, ArrayList<Quarter> quartersInMachine,
                   ArrayList<Dime> dimesInMachine, String name, int coinCount, double moneyCount)
    {
        this.nickelsInMachine = nickelsInMachine;
        this.quartersInMachine = quartersInMachine;
        this.dimesInMachine = dimesInMachine;
        this.name = name;
        this.coinCount = coinCount;
        this.moneyCount = moneyCount;
    }

    public double getTotalCoinCount(Coin coin){

        long totalcoincount = coin.getDimes() + coin.getNickels() + coin.getQuarters();
//      return Coin.getnickel() + coin.getquarter() coin.getdime()
//        total amount of coins

//        get usd value
//

       return coinCount;
    }




}
