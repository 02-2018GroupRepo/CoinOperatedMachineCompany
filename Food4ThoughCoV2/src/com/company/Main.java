package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int customerIntSelection;
        String customerStrSelection;

        boolean keepGoing = true;




        System.out.println("\t\tFood 4 Though inc");
        do {
            System.out.println("Do you want a Drink or a Snack?");
            customerStrSelection = scan.nextLine();
            if(customerStrSelection.equals("Operator")){
                System.out.println("Please enter your access code... ");
                //TODO: make method under operator
            }else if (customerStrSelection.equals("Drink")){
                System.out.println("From the options provided, " +
                        "what Drink would you like to be dispensed?");
            }else if (customerStrSelection.equals("Snack")){
                System.out.println("From the options provided, " +
                        "what Drink would you like to be dispensed");
            }
        }while(keepGoing);
    }
}
