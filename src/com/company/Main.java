package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) {
        //Customer is at location SharedSpace.
        String location = "SharedSpace";
        SnackMachine sharedSpaceSnackMachine = new SnackMachine("SharedSpace", 0, 0, 0);
        DrinkMachine sharedSpaceDrinkMachine = new DrinkMachine("SharedSpace", 0, 0, 0);

        sharedSpaceSnackMachine.loadMachine();
        sharedSpaceDrinkMachine.loadMachine();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Welcome to Noelle's COM Company. \n" + "Select 1 for Snack Machine. \n" +
                    "Select 2 for Drink Machine.");
            String machineSelect = console.readLine();
            int machineSelection = Integer.parseInt(machineSelect);
            if (machineSelection == 1) {
                System.out.println("You have selected Snack Machine.");

                //Insert Coins
                System.out.println("Please insert coins.\nEnter # of quarters:");
                String quarterInput = console.readLine();
                int quarters = Integer.parseInt(quarterInput);
                sharedSpaceSnackMachine.addQuarters(quarters);

                System.out.println("Enter # of dimes:");
                String dimeInput = console.readLine();
                int dimes = Integer.parseInt(dimeInput);
                sharedSpaceSnackMachine.addDimes(dimes);

                System.out.println("Enter # of nickels:");
                String nickelInput = console.readLine();
                int nickels = Integer.parseInt(nickelInput);
                sharedSpaceSnackMachine.addNickels(nickels);

                //Display Total
                System.out.printf("You have entered $" + "%.2f\n", sharedSpaceSnackMachine.getTotal());
                double moneyCustomerEntered = sharedSpaceSnackMachine.getTotal();

                //Display Vending Menu
                sharedSpaceSnackMachine.displayVendingMenu();

                //Select item
                String itemSelect = console.readLine();
                String[] arrayToSplitItemSelectString = itemSelect.split("");
                // if can : [A , . , i , . , j]=[0, . , 2 , . ,4] i=ArrayList of first column; j=ArrayList across rows
                //if bottle : [B , . , i , . , j] = [0, . , 2 , . , 4]
                String letterIndicator = arrayToSplitItemSelectString[0];

                int i = Integer.parseInt(arrayToSplitItemSelectString[2]);
//
                int j = Integer.parseInt(arrayToSplitItemSelectString[4]);

                System.out.println("You have selected " + sharedSpaceSnackMachine.getProductNameFromCode(letterIndicator, i, j) + ".\n");
                sharedSpaceSnackMachine.coinAndItemExchange(letterIndicator, i, j, moneyCustomerEntered);

            } else if (machineSelection == 2) {
                System.out.println("You have selected Drink Machine.");

                //Insert Coins
                System.out.println("Please insert coins.\nEnter # of quarters:");
                String quarterInput = console.readLine();
                int quarters = Integer.parseInt(quarterInput);
                sharedSpaceDrinkMachine.addQuarters(quarters);

                System.out.println("Enter # of dimes:");
                String dimeInput = console.readLine();
                int dimes = Integer.parseInt(dimeInput);
                sharedSpaceDrinkMachine.addDimes(dimes);

                System.out.println("Enter # of nickels:");
                String nickelInput = console.readLine();
                int nickels = Integer.parseInt(nickelInput);
                sharedSpaceDrinkMachine.addNickels(nickels);

                //Display Total
                System.out.printf("You have entered $" + "%.2f\n", sharedSpaceDrinkMachine.getTotal());
                double moneyCustomerEntered = sharedSpaceDrinkMachine.getTotal();

                //Display Vending Menu
                sharedSpaceDrinkMachine.displayVendingMenu();

                //Select item
                String itemSelect = console.readLine();
                String[] arrayToSplitItemSelectString = itemSelect.split("");
                // if can : [A , . , i , . , j]=[0, . , 2 , . ,4] i=ArrayList of first column; j=ArrayList across rows
                //if bottle : [B , . , i , . , j] = [0, . , 2 , . , 4]
                String canOrBottleSelection = arrayToSplitItemSelectString[0];

                int i = Integer.parseInt(arrayToSplitItemSelectString[2]);
//
                int j = Integer.parseInt(arrayToSplitItemSelectString[4]);

                System.out.println("You have selected " + sharedSpaceDrinkMachine.getProductNameFromCode(canOrBottleSelection, i, j) + ".\n");
                sharedSpaceDrinkMachine.coinAndItemExchange(canOrBottleSelection, i, j, moneyCustomerEntered);
            } else {
                System.out.println("Invalid Entry");
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }


}



