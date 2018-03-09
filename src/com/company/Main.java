package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arg) {

        try(BufferedReader console = new BufferedReader (new InputStreamReader(System.in))){
            System.out.println("Welcome to Noelle's COM Company. \n" + "Select 1 for Snack Machine. \n" +
                                "Select 2 for Drink Machine.");
            String machineSelection = console.readLine();
            if (machineSelection.equals("1")){
                System.out.println("You have selected Snack Machine.");

            }else if (machineSelection.equals("2")){
                System.out.println("You have selected Drink Machine.");

            }else {
                System.out.println("Invalid Entry");
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }


}



