package com.company;
import Coins.*;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Machine {
    private ArrayList<Nickel> nickelsInMachine = new ArrayList<Nickel>();
    private ArrayList<Quarter> quartersInMachine = new ArrayList<Quarter>();
    private ArrayList<Dime> dimesInMachine = new ArrayList<Dime>();
    public String name;
    int coinCount;
    double moneyCount;

//        Are these array lists necessary? Could the coin tracking just use integers? All the coin objects are the same, except for value.
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

    public double getTotalCoinCount(){

       for(int i = 0; i < nickelsInMachine.size(); i++ ){
           coinCount += 1;
       }
       for(int i = 0; i < quartersInMachine.size(); i++ ){
           coinCount += 1;
       }
       for(int i = 0; i < dimesInMachine.size(); i++ ){
           coinCount += 1;
       }
       return coinCount;
    }



}
