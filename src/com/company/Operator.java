package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operator {

    public static void main(String [] arg){

        SnackMachine sharedSpaceSnackMachine = new SnackMachine ("SharedSpace", 0, 0, 0);
        DrinkMachine sharedSpaceDrinkMachine = new DrinkMachine("SharedSpace", 0, 0, 0);
        SnackMachine nextDoorSnackMachine = new SnackMachine("Next Door", 0,0,0);
        DrinkMachine nextDoorDrinkMachine = new DrinkMachine ("Next Door",0,0,0);



        try(BufferedReader console = new BufferedReader (new InputStreamReader(System.in))){
            System.out.println("Welcome to Noelle's COM Company. \n" +
                                "Please enter security code to continue as operator. \n");
            String operatorSecurityCode = console.readLine();
            if (operatorSecurityCode.equals(Machine.securityCode)){
                System.out.println("Access granted.");

            }else {
                System.out.println("Access denied.");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

}
