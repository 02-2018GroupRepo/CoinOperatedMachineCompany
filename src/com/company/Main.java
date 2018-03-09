package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<VendingMachine> vendingMachines = Config.createData();
        boolean done = false;

        do {
            System.out.println("Please enter your location: ");
            try (BufferedReader customer = new BufferedReader(new InputStreamReader(System.in))){
                Console.locationScreen(customer.readLine(), vendingMachines);

            } catch (Exception e) {
                System.out.println(e);
            }


            } while (!done);


    }


}
