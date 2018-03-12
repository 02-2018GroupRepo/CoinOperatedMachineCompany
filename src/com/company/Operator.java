package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Operator {
    private ArrayList<Location> locationsArr = new ArrayList<Location>();
    private static final String password = "on a diet";

    public ArrayList<Location> getLocationsArr(String password) {
        System.out.println("Password:");
        Scanner pass = new Scanner(System.in);
        if (pass.equals(password)) {
            return locationsArr;
        }
        else{
            System.out.println("Wrong Password");
            return null;
        }
    }

    public void addToLocation(VendingMachine machine){
        System.out.println("Which location would you like to add the machine?");
        Scanner loc = new Scanner(System.in);
        for(int i=0; i < locationsArr.size(); i++){
            if (locationsArr.get(i).getName().equals(loc)){
                locationsArr.get(i).addMachine(machine);
                System.out.println("Machine added.");
            } else {
                System.out.println("Sorry that location does not exist.");
            }
        }
    }
}
