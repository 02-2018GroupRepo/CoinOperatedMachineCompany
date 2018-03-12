package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Console {

    public static void locationScreen(ArrayList<VendingMachine> vendingMachines) {
        String locationSelection;
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
        System.out.println("1) View items");
        System.out.println("2) Insert coin");
        System.out.println("3) Purchase item");
        System.out.println("4) Refund");
        System.out.println("5) Exit");

        try {
            BufferedReader customer = new BufferedReader(new InputStreamReader(System.in));
            String input = customer.readLine();
            switch (input) {
                case "1":
                    viewItemsScreen(vendingMachine);
                    menuScreen(vendingMachine);
                    break;
                case "2":
                    insertCoinScreen(vendingMachine);
                    break;
                case "3":
                    itemSelectionScreen(vendingMachine);
                    break;
                case "4":
                    vendingMachine.refund();
                    menuScreen(vendingMachine);
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Invalid input.");
                    menuScreen(vendingMachine);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void viewItemsScreen(VendingMachine vendingMachine) {
        for (int j = 0; j < vendingMachine.getRows(); j++) {
            int i = 0;
            //forEach column
            for (Product[] column : vendingMachine.getStorageArray()[j]) {
                try {
                    System.out.printf("Item: %s\nDescription: %s\nPrice: $%.2f\n", column[0].getName(), column[0].getDescription(), column[0].getRetailPrice());
                    System.out.println("----------------------------------------------------------------");
                } catch (NullPointerException e) {

                }
                i++;
            }
        }
    }

    public static void insertCoinScreen(VendingMachine vendingMachine) {
        System.out.println("Please insert a nickel, dime, or quarter: ");
        boolean done = false;

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            vendingMachine.insertCoin(input.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("1) Insert additional coins.");
            System.out.println("2) Return to main screen.");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            switch (input.readLine()) {
                case "1":
                    insertCoinScreen(vendingMachine);
                    break;
                case "2":
                    menuScreen(vendingMachine);
                    break;
                default:
                    System.out.println("Invalid input.");
            }

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
                } catch (NullPointerException e) {

                }
                i++;
            }
        }

        try {
            BufferedReader customer = new BufferedReader(new InputStreamReader(System.in));
            String input = customer.readLine();
            int row = Integer.parseInt(input.split("")[0]);
            int col = Integer.parseInt(input.split("")[1]);
            vendingMachine.purchaseItem(row, col);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
