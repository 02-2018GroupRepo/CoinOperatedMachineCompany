package com.bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Company drew = new Company("Andrew's Vending");


    public static void main(String[] args) {
        Scanner customerInput = new Scanner(System.in);
        VendingMachine vendingMachine;
        int customerNumber;

        welcomeMessage();
        customerNumber = customerInput.nextInt();
        customerInput.nextLine();

        switch(customerNumber){
            case 1:
                System.out.println("Welcome to Drew's Snack Machine \n What do you want?");
                vendingMachine = new SnackMachine();
                //Snack snack = new Snack();
                vendingMachine.showItems();
                customerInput.nextLine();
                double price = vendingMachine.getPrice();
                System.out.println("This item costs " + price );
                //double price = vendingMachine.showItems();
                break;
            case 2:
                System.out.println("Welcome to Drew's Drink Machine \n What do you want?");
                vendingMachine = new DrinkMachine();
                //Drink drink = new Drink;
                vendingMachine.showItems();
                customerInput.nextLine();
                price = vendingMachine.getPrice();
                System.out.println("This item costs " + price );
                break;
            default:
                System.out.println("Error: Invalid Input");


        }

    }

    public static void welcomeMessage() {
        System.out.println("Welcome to Andrew's Vending:\n" +
                "1) Snack Machine\n" +
                "2) Drink Machine\n" +
                "Please enter 1 or 2: ");
    }

    private static ArrayList<String> chosenItem = new ArrayList();

    public static void chosenItem(String item){
        chosenItem.add(item);
    }




}
