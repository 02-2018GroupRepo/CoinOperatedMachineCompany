package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Console {

    public static void locationScreen(ArrayList<VendingMachine> vendingMachines) {
        String locationSelection = "";
        try {
            BufferedReader customer = new BufferedReader(new InputStreamReader(System.in));
            locationSelection = customer.readLine();
            for (VendingMachine vendingMachine : vendingMachines) {
                if (vendingMachine.getLocation().equals(locationSelection)) {
                    menuScreen(vendingMachine);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void menuScreen(VendingMachine vendingMachine) {
        System.out.println("1) View items.");
        System.out.println("2) Insert coin.");
        System.out.println("3) Purchase item.");

        try {
            BufferedReader customer = new BufferedReader(new InputStreamReader(System.in));
            String input = customer.readLine();
            switch (input) {
                case "1":
                    //viewItems
                    break;
                case "2":
                    insertCoinScreen(vendingMachine);
                    break;
                case "3":
                    itemSelectionScreen(vendingMachine);
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void insertCoinScreen(VendingMachine vendingMachine) {
        System.out.println("Please insert a nickel, dime, or quarter: ");
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            vendingMachine.insertCoin(input.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public static void itemSelectionScreen(VendingMachine vendingMachine) {
        System.out.println("Please select an item by entering the item code: \n");
        for (int j = 0; j < vendingMachine.getRows(); j++) {
            int i = 0;
            //forEach column
            for (Product[] column : vendingMachine.getStorageArray()[j]) {
                try {
                    System.out.printf("%d%d : %s, $%.2f\n", j, i, column[0].getName(), column[0].getRetailPrice());
                    i++;
                } catch (NullPointerException e) {

                }
            }
        }

        try (BufferedReader customer = new BufferedReader(new InputStreamReader(System.in))) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
