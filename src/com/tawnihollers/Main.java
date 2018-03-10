package com.tawnihollers;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader((System.in)));

        try {
            System.out.println("Did you want the Snack or Drink Vending Machine? Choose 1 for Snack, 2 for Drink");
            int where = Integer.parseInt(console.readLine());

            if (where == 1) {
                SnackMachine snack = new SnackMachine();
                snack.getNameOfCompany();
                boolean con = true;

                snack.snacksInMachine();
                System.out.println(" ");

                while (con) {
                    System.out.println("Please enter a number to say what kind of coin you will add: 1 for Nickel, 2 for Dime, 3 for Quarter");
                    int coin = Integer.parseInt(console.readLine());
                    snack.customerAddsMoneyToTheMachine(coin);
                    double total = snack.getTotal();
                    System.out.printf("new total is $%.2f\n", total);
                    System.out.println("Would you like to continue putting in coins? Enter 1 for yes, 2 for no");
                    int answer = Integer.parseInt(console.readLine());
                    if (answer == 1) {
                        con = Boolean.valueOf(true);
                    } else {
                        con = Boolean.valueOf(false);
                    }
                }
                double total = snack.getTotal();
                System.out.println("Using the product ID please enter the letter (A-E)");
                String productName = console.readLine();
                System.out.println("Using the product ID please enter the number (1-5)");
                int productNum = Integer.parseInt(console.readLine());
                snack.takeMoneyAndChangeQty(total, productName, productNum);



            }


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                console.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
