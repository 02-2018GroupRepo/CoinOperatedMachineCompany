package com.company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<VendingMachine> vendingMachines = Config.createData();
        boolean done = false;


        System.out.println("Please enter your location: ");
        Console.locationScreen(vendingMachines);
        do {



            } while (!done);


    }


}
