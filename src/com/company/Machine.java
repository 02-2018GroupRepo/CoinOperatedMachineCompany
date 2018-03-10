package com.company;

public class Machine extends CoinCalculator implements Transactions {


    private static String companyName = "Noelle's COM Company";
    final static String securityCode = "pineapple";
    private String location;

    public Machine() {
    }

    public Machine(String location, int nickels, int dimes, int quarters) {
        super(nickels, dimes, quarters);
        this.location = location;
    }



    //    public void printSprite(){
//        System.out.println(sprite.getName());
//    }
}
