package com.CoinOperatedMachine;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Company gouge = new Company("Gouge Vending");

        for (Location locationObject : gouge.allLocations()) {
            System.out.println(locationObject.getName());
        }

    }
}