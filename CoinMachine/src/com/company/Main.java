package com.company;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int q = 0, d = 0, n = 0;
        int counter = 0, counter2 = 0;
        boolean done = false;
        int selection;
        String choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of machine would you like? Snack or Drink?");
        choice = scanner.next();

        if(choice.toLowerCase().equals("snack")){

            SnackMachine candy = new SnackMachine();

            for(Map.Entry<Products, Integer> entry : candy.inStock.entrySet()){
                System.out.print( entry.getKey() + " $" + entry.getKey().getRetailPrice());
                if(counter < 5){
                    System.out.print("\t");
                    counter++;
                }
                else{
                    System.out.println("");
                    counter = 0;
                }

            }

            System.out.println("Insert money before making Selection");

            while(!done){
                System.out.println("1) Insert Quarter\n2) Insert Dime\n3) Insert Nickel\n4) Done inserting coins\n(Input options 1, 2, or 3)");
                selection = scanner.nextInt();

                switch(selection){
                    case 1:
                        q++; break;
                    case 2:
                        d++; break;
                    case 3:
                        n++; break;
                    case 4:
                        done = true; break;
                }
            }

            candy.attemptPurchase(q, d, n);

        }
        else if(choice.equals("1234")){
            Operator operator = new Operator();

        }
        else{
            DrinkMachine drinks = new DrinkMachine();

            for(Map.Entry<Products, Integer> entry : drinks.inStock.entrySet()){
                System.out.print( entry.getKey() + " $" + entry.getKey().getRetailPrice());
            }

            System.out.println("Insert money before making Selection");

            while(!done){
                System.out.println("1) Insert Quarter\n2) Insert Dime\n3) Insert Nickel\n4) Done inserting coins\n(Input options 1, 2, or 3)");
                selection = scanner.nextInt();

                switch(selection){
                    case 1:
                        q++; break;
                    case 2:
                        d++; break;
                    case 3:
                        n++; break;
                    case 4:
                        done = true; break;
                }
            }

            drinks.attemptPurchase(q, d, n);
        }

    }


}
