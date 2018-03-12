package com.company;
import domain.Coin;

public class Machine {

    public String name;
    public int coinCount;
    public double moneyCount;
    public String location;
    private String passcode;
    public Coin coins;

    public String getName() {
        return name;
    }

    public int getCoinCount() {
        return coinCount;
    }

    public double getMoneyCount() {
        return moneyCount;
    }

    public String getLocation() {
        return location;
    }

//    is this getCoins method needed?

//    public Coin getCoins() {
//        return coins;
//    }

    public Machine(String name, int coinCount, double moneyCount, String location, String passcode, Coin coins) {
        this.name = name;
        this.coinCount = coinCount;
        this.moneyCount = moneyCount;
        this.location = location;
        this.passcode = passcode;
        this.coins = coins;
    }


    //        Are these array lists necessary? Could the coin tracking just use doubles? All the coin objects are the same, except for value.
//    public Machine(ArrayList<Nickel> nickelsInMachine, ArrayList<Quarter> quartersInMachine,
//                   ArrayList<Dime> dimesInMachine, String name, int coinCount, double moneyCount)
//    {
//        this.nickelsInMachine = nickelsInMachine;
//        this.quartersInMachine = quartersInMachine;
//        this.dimesInMachine = dimesInMachine;
//        this.name = name;
//        this.coinCount = coinCount;
//        this.moneyCount = moneyCount;
//    }
    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public long getCoinCount(Coin coin){
//        get usd value
        return  coin.getDimes() + coin.getNickels() + coin.getQuarters();

    }
    public double getMoneyCount(Coin coin){
        return coin.getDimes() * .10 + coin.getNickels() * .05 + coin.getQuarters() * .25;
    }


    public void setCoinCount(int coinCount) {
        this.coinCount = coinCount;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
