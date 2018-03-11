package com.bootcamp;



//    An operator can add and remove a machine from a location.
//    An operator can check the amount of money in each machine. By total amount and individual coins.
//    An operator can check the status of money in all machines at a specific location. By total amount and individuals coins.
//    An operator must enter a security code to gain access to all previous actions.

import java.util.ArrayList;

public class Operator {

    private String name;
    private ArrayList<SnackMachine> sList = new ArrayList<SnackMachine>();
    private ArrayList<DrinkMachine> dList = new ArrayList<DrinkMachine>();

    public Operator(String name){
        this.name = name;
        setSnackMachines();
        setDrinkMachines();
    }

    public String getName(){
        return this.name;
    }

    public void setSnackMachines(){
        for (int i = 0; i < 5; i++){

        }
    }
    public void setDrinkMachines(){
        for(int i=0; i < 5; i++){

        }
    }

}
