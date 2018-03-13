package com.CoinOperatedMachine;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Company gouge = new Company("Covfefe Vending");
        System.out.println("**************Covfefe VENDING****************");
        System.out.println("List of all locations");
        for (Location locationObject : gouge.allLocations()) {
            System.out.println(locationObject.getName());
        }

    }
}