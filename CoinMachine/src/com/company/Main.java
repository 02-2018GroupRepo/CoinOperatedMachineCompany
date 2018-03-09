package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int q = 0;
        int d = 0;
        int n = 0;
        boolean done = false;
        int selection;

        Scanner scanner = new Scanner(System.in);

        SnackMachine candy = new SnackMachine();
        DrinkMachine drinks = new DrinkMachine();

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




    }
}
