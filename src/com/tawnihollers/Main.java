package com.tawnihollers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader((System.in)));
        Boolean keepGoing = true;

        try {
            SnackMachine snack = new SnackMachine();
            DrinkMachine drink = new DrinkMachine();
            Operator guy = new Operator();
            HashMap<String, Double> snackMap;
            HashMap<String, Double> drinkMap;
            HashMap<String, Double> operatorMap = new HashMap<>();

            while (keepGoing) {
                System.out.println("Did you want the Snack or Drink Vending Machine? Choose 1 for Snack, 2 for Drink");
                int where = Integer.parseInt(console.readLine());

                if (where == 1) {
                    snack.getNameOfCompany();
                    boolean con = true;

                    snack.snacksInMachine();
                    System.out.println(" ");
                    while (con) {
                        System.out.println("Please enter in the number of nickels you will enter");
                        int nickels = Integer.parseInt(console.readLine());
                        System.out.println("Please enter in the number of dimes you will enter");
                        int dimes = Integer.parseInt(console.readLine());
                        System.out.println("Please enter in the number of quarters you will enter");
                        int quarters = Integer.parseInt(console.readLine());
                        snack.customerAddsMoneyToMachine(nickels, dimes, quarters);
                        double total = snack.getTotal();
                        System.out.printf("Amount you entered into the machine $%.2f\n", total);

                        System.out.println("Using the product ID please enter the letter (A-E)");
                        String productName = console.readLine();
                        System.out.println("Using the product ID please enter the number (1-5)");
                        int productNum = Integer.parseInt(console.readLine());
                        snack.takeMoneyAndChangeQty(total, productName, productNum);

                        System.out.println("Would you like to continue purchasing? Press 1 for yes, 2 for no");
                        int answer = Integer.parseInt(console.readLine());
                        snack.resetTotalToZero();

                        if (answer == 1) {
                            con = Boolean.valueOf(true);
                        } else {
                            con = Boolean.valueOf(false);
                        }
                    }
                    System.out.println("Would you like to purchase from a different machine? Press 1 for yes, 2 for no");
                    int maybe = Integer.parseInt(console.readLine());
                    if (maybe == 1) {
                        keepGoing = Boolean.valueOf(true);
                    } else {
                        keepGoing = Boolean.valueOf(false);
                    }
                } else if (where == 2) {
                    drink.getNameOfCompany();
                    boolean con = true;

                    drink.drinksInMachine();
                    System.out.println(" ");
                    while (con) {
                        System.out.println("Please enter in the number of nickels you will enter");
                        int nickels = Integer.parseInt(console.readLine());
                        System.out.println("Please enter in the number of dimes you will enter");
                        int dimes = Integer.parseInt(console.readLine());
                        System.out.println("Please enter in the number of quarters you will enter");
                        int quarters = Integer.parseInt(console.readLine());
                        drink.customerAddsMoneyToMachine(nickels, dimes, quarters);
                        double total = drink.getTotal();
                        System.out.printf("Amount you entered into the machine $%.2f\n", total);

                        System.out.println("Using the product ID please enter the letter (A-E)");
                        String productName = console.readLine();
                        System.out.println("Using the product ID please enter the number (1-5)");
                        int productNum = Integer.parseInt(console.readLine());
                        drink.takeMoneyAndChangeQty(total, productName, productNum);

                        System.out.println("Would you like to continue purchasing? Press 1 for yes, 2 for no");
                        int answer = Integer.parseInt(console.readLine());
                        drink.resetTotalToZero();
                        if (answer == 1) {
                            con = Boolean.valueOf(true);
                        } else {
                            con = Boolean.valueOf(false);
                        }
                    }
                    System.out.println("Would you like to purchase from a different machine? Press 1 for yes, 2 for no");
                    int maybe = Integer.parseInt(console.readLine());
                    if (maybe == 1) {
                        keepGoing = Boolean.valueOf(true);
                    } else {
                        keepGoing = Boolean.valueOf(false);
                    }

                } else if (where == 8772) {
                    //put operator stuff here
                    System.out.println("Please say which machine you would like to look at. Press 1 for Snack Machine, 2 for Drink Machine, and 3 for both" );
                    int num = Integer.parseInt(console.readLine());
                    if(num == 1){
                        snackMap = snack.giveTheHashMapToOperator();
                        guy.saveHashMap(snackMap);
                        guy.showTotalCashInMachine();
                    }
                    else if(num == 2){
                        drinkMap = drink.giveTheHashMapToOperator();
                        guy.saveHashMap(drinkMap);
                        guy.showTotalCashInMachine();
                    }
                    else if(num == 3){
                        snackMap = snack.giveTheHashMapToOperator();
                        drinkMap = drink.giveTheHashMapToOperator();
                        operatorMap.putAll(snackMap);
                        operatorMap.putAll(drinkMap);
                        guy.saveHashMap(operatorMap);
                        guy.showTotalCashInMachine();
                    }

                } else {
                    System.out.println("GoodBye");
                    keepGoing = Boolean.valueOf(false);
                }
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
