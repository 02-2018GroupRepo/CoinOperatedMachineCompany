package com.syntel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String snackOrDrink = "";
        System.out.println("Welcome. Please enter 1 to buy a drink or 2 to buy a snack.");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        try {
            snackOrDrink = in.readLine();
        } catch (Exception e){}

        if(snackOrDrink.equals("1")){
            DrinkMachine shareSpaceDrinkMachine = new DrinkMachine();
        } else if (snackOrDrink.equals("2")){
            SnackMachine shareSpaceSnackMachine = new SnackMachine();
        }

//        SnackMachine shareSpaceSnackMachine = new SnackMachine();
//
//
//
//        shareSpaceDrinkMachine.addItem(sprite, 10);
//        shareSpaceDrinkMachine.addItem(spriteZero, 10);

        //for(int i = 0; i < shareSpaceDrinkMachine.getProductInventoryMap().size(); i++){
//            System.out.println(shareSpaceDrinkMachine.getProductInventoryMap().toString());
        //}

    }
}
