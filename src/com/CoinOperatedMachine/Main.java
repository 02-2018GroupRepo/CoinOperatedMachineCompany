package com.CoinOperatedMachine;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner coinScanner=new Scanner(System.in);

        double coinsEntered =coinScanner.nextDouble();



        if(coinsEntered %5!==0) {
            System.out.println("Please enter the correct amount!");

        }
    }
}
