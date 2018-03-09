package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Console {

    public static void locationScreen(ArrayList<VendingMachine> vendingMachines) {
        String locationSelection = "";
        try (BufferedReader customer = new BufferedReader(new InputStreamReader(System.in))) {
           locationSelection = customer.readLine();
        } catch (Exception e) {
            System.out.println(e);
        }


        for (VendingMachine vendingMachine : vendingMachines) {
            if (vendingMachine.getLocation().equals(locationSelection)) {
                itemSelectionScreen(vendingMachine);
            }
        }
    }

    public static void itemSelectionScreen(VendingMachine vendingMachine) {
        System.out.println("Please select an item by entering the item code: ");
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
