package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<VendingMachine> vendingMachines = Config.createData();
        System.out.println("Please enter your location: ");
        Console.locationScreen(vendingMachines);
    }

}
