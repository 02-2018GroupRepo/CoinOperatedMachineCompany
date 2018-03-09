package com.bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner customerInput = new Scanner(System.in);
        VendingMachine machine;
        int customerNumber;

        welcomeMessage();
        customerNumber = customerInput.nextInt();
        customerInput.nextLine();

        switch(customerNumber){
            case 1:
                System.out.println("Welcome to Drew's Snack Machine");
                machine = new SnackMachine();
                break;
            case 2:
                System.out.println("Welcome to Drew's Drink Machine");
                machine = new DrinkMachine();
                break;
            default:
                System.out.println("Error: Invalid Input");


        }

    }

    public static void welcomeMessage() {
        System.out.println("Welcome to Andrew's Vending:\n" +
                "1) Drink Machine\n" +
                "2) Snack Machine\n" +
                "Enter the number: ");
    }




}
