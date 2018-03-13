package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Console {

    public static void locationScreen(ArrayList<VendingMachine> vendingMachines) {
        String locationSelection;
        Map<Integer, VendingMachine> vendingMachineSelectionMap = new HashMap<>();
        int i = 1;
        try {
            BufferedReader customer = new BufferedReader(new InputStreamReader(System.in));
            locationSelection = customer.readLine();
            for (VendingMachine vendingMachine : vendingMachines) {
                if (vendingMachine.getLocation().equals(locationSelection)) {
                    vendingMachineSelectionMap.put(i, vendingMachine);
                    i++;
                }
            }
            vendingMachineSelectionScreen(vendingMachineSelectionMap);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void vendingMachineSelectionScreen(Map<Integer, VendingMachine> vendingMachineMap) {
        System.out.println("Please select a vending machine at this location: ");
        for (int i=1; i <= vendingMachineMap.size(); i++) {
            System.out.printf("%d) %s\n", i, vendingMachineMap.get(i).getMachineType());
        }

        try {
            BufferedReader customer = new BufferedReader(new InputStreamReader(System.in));
            String machineSelection = customer.readLine();

            if (vendingMachineMap.containsKey(Integer.parseInt(machineSelection))) {
                menuScreen(vendingMachineMap.get(Integer.parseInt(machineSelection)));
            } else {
                System.out.println("Invalid input");
                vendingMachineSelectionScreen(vendingMachineMap);
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
        System.out.println("5) Company Info");
        System.out.println("6) Operator Console");
        System.out.println("7) Exit");

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
                    System.out.println(vendingMachine.getCompanyName());
                    break;
                case "6":
                    operatorScreen(vendingMachine);
                    break;
                case "7":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input.");
                    menuScreen(vendingMachine);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void operatorScreen(VendingMachine vendingMachine) {
        System.out.println("Enter password: ");
        try {
            BufferedReader customer = new BufferedReader(new InputStreamReader(System.in));
            String password = customer.readLine();
            if (password.equals(new String("123"))) {
                System.out.println("1) View coin information.");
                System.out.println("2) View inventory.");
                customer = new BufferedReader(new InputStreamReader(System.in));
                switch (customer.readLine()) {
                    case "1":
                        System.out.printf("%.2f\n", vendingMachine.getTotal());
                        break;
                    case "2":
                        vendingMachine.getInventory();
                        break;
                    default:
                        System.out.println("Invalid selection.");
                }

            } else {
                System.out.println("Invalid password");

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
