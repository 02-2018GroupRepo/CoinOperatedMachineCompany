package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) {
        //Customer is at location SharedSpace.
        String location = "SharedSpace";
        SnackMachine sharedSpaceSnackMachine = new SnackMachine ("SharedSpace", 0, 0, 0);
        DrinkMachine sharedSpaceDrinkMachine = new DrinkMachine("SharedSpace", 0, 0, 0);

         try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Welcome to Noelle's COM Company. \n" + "Select 1 for Snack Machine. \n" +
                    "Select 2 for Drink Machine.");
            String machineSelect = console.readLine();
            int machineSelection = Integer.parseInt(machineSelect);
            if (machineSelection == 1) {
                System.out.println("You have selected Snack Machine.");

            } else if (machineSelection == 2) {
                System.out.println("You have selected Drink Machine.");
            } else {
                System.out.println("Invalid Entry");
            }

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
            System.out.printf("You have entered $" + "%.2f" , sharedSpaceSnackMachine.getTotal());

            //Display Vending Menu
            sharedSpaceSnackMachine.displayVendingMenu();




        } catch (Exception e) {
            System.out.println(e);
        }

    }


}



