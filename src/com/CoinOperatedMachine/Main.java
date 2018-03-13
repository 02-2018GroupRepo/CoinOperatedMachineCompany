package com.CoinOperatedMachine;
import java.util.*;



public class Main {

    public static void main(String [ ] args) {
        Scanner keyboard = new Scanner(System.in);
        double final nickel=.05;
        double final dime=.10;
        double final quarter=.25;

        double customerChangeDue;
        double customerChangeInput;
        String productSelection;

        System.out.println("Thanks for choosing Sugar Daddy District vending services. Enter a product identifier by entering a letter followed by a number--->:  ");
        productSelection=keyboard.nextLine();

        double customerChangeInput=keyboard.nextDouble();
        if(customerChangeInput%5 !=0){
            System.out.println("Please enter nickels, dimes, or quarters")
        }

    }
}
