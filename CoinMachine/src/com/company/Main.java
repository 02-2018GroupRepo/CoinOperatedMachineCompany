package com.company;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int q = 0, d = 0, n = 0;
        int counter = 0, counter2 = 0;
        boolean done = false;
        boolean shutdown = false;
        int selection;
        String choice;

        Scanner scanner = new Scanner(System.in);
        SnackMachine candy = new SnackMachine();
        DrinkMachine drinks = new DrinkMachine();

        //testing vending machines
        candy.attemptPurchase(4, 0,0, "cracker"); //choice: cracker, exact change
        candy.attemptPurchase(4, 0, 0, "apple"); //choice: apple, has enough money will return 2 quarters
        candy.attemptPurchase(1,1,1, "orange"); // choice: orange, does not have enough money
        drinks.attemptPurchase(4,0,0, "water0"); //choice water0, exact amount
        drinks.attemptPurchase(2, 2, 2, "pepsi"); //choice pepsi, returns 30cents, 1 quarter 1 nickel
        drinks.attemptPurchase(1, 0, 0,"water0"); //choice water0, not enough

        //testing operator
        Operator testOperator = new Operator();
        testOperator.getTotal(candy); //yes, get total from candy machine, see details
        testOperator.getTotal(drinks);//no, get total from machine, dont see detials
        testOperator.getAllTotal(candy, drinks); //get total from all machines
        testOperator.removeMachine(candy); //removing candy machine
        testOperator.addMachine(candy, "Baltimore"); //moving it to baltimore


/* youll need to uncomment public void attemptPurchase(int Q, int D, int N) in Vending_Machine.java
        while(!shutdown) {
            System.out.println("What kind of machine would you like? Snack or Drink or Done?");
            choice = scanner.next();

            if (choice.toLowerCase().equals("snack")) {

                for (Map.Entry<Products, Integer> entry : candy.inStock.entrySet()) {
                    System.out.print(entry.getKey().getName() + " $" + entry.getKey().getRetailPrice());
                    if (counter < 5) {
                        System.out.print("\t");
                        counter++;
                    } else {
                        System.out.println("");
                        counter = 0;
                    }

                }

                System.out.println("Insert money before making Selection");

                while (!done) {
                    System.out.println("1) Insert Quarter\n2) Insert Dime\n3) Insert Nickel\n4) Done inserting coins\n(Input options 1, 2, or 3)");
                    selection = scanner.nextInt();

                    switch (selection) {
                        case 1:
                            ++q;
                            break;
                        case 2:
                            ++d;
                            break;
                        case 3:
                            ++n;
                            break;
                        case 4:
                            done = true;
                            break;
                    }
                }

                candy.attemptPurchase(q, d, n);
                counter = 0;
                done = false;
            } else if (choice.equals("1234")) {
                Operator operator = new Operator();
                while (!done) {
                    System.out.println("1)Add machine \n2) Remove Machine\n3) Get Total from Machine\n" +
                                        "4) Get total from ALl machines\n 5) Done(Input options 1, 2, or 3)");
                    selection = scanner.nextInt();

                    switch (selection) {
                        case 1:
                            System.out.println("candy or drinks?");
                            if(scanner.next().toLowerCase().equals("candy")){
                                System.out.println("Enter city you are moving it too");
                                operator.addMachine(candy, scanner.next());
                            }
                            else{
                                operator.getTotal(drinks);
                                System.out.println("Enter city you are moving it too");
                                operator.addMachine(candy, scanner.next());
                            }
                            break;
                        case 2:
                            System.out.println("candy or drinks?");
                            if(scanner.next().toLowerCase().equals("candy")){
                                operator.removeMachine(candy);
                            }
                            else{
                                operator.removeMachine(drinks);
                            }
                            break;
                        case 3:
                            System.out.println("candy or drinks?");
                            if(scanner.next().toLowerCase().equals("candy")){
                                operator.getTotal(candy);
                            }
                            else{
                                operator.getTotal(drinks);
                            }
                            break;
                        case 4:
                            System.out.println("$" + operator.getAllTotal(candy, drinks));
                            break;
                        case 5:
                            done = true;
                            break;
                    }
                }

            } else if (choice.toLowerCase().equals("done")) {
                shutdown = true;
            } else {


                for (Map.Entry<Products, Integer> entry : drinks.inStock.entrySet()) {
                    System.out.print(entry.getKey().getName() + " $" + entry.getKey().getRetailPrice());
                }

                System.out.println("Insert money before making Selection");

                while (!done) {
                    System.out.println("1) Insert Quarter\n2) Insert Dime\n3) Insert Nickel\n4) Done inserting coins\n(Input options 1, 2, or 3)");
                    selection = scanner.nextInt();

                    switch (selection) {
                        case 1:
                            q++;
                            break;
                        case 2:
                            d++;
                            break;
                        case 3:
                            n++;
                            break;
                        case 4:
                            done = true;
                            break;
                    }
                }

                drinks.attemptPurchase(q, d, n);
                counter = 0;
                done = false;
            }

        }
        */
    }


}
