package com.CoinOperatedMachine;
import java.util.*;



public class Main {

    public static void main(String[] args) {


        Scanner coinScanner=new Scanner(System.in);
        System.out.print("Please select an item by entering the letter followed by a number: ");
        double coinsEntered =coinScanner.nextDouble();


        System.out.println("Select a product by entering a letter followed by a number-->  ");
        String productSelected=coinScanner.nextLine();

        if(coinsEntered %5!==0) {
            System.out.println("Please enter the correct amount!");

        }
    }
}
