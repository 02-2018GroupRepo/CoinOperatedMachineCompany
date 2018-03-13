package com.CoinOperatedMachine;

import java.util.ArrayList;

public class Location{

    private String name;
    private ArrayList<SnackMachine> snackList = new ArrayList<SnackMachine>();
    private ArrayList<DrinkMachine> drinkList = new ArrayList<DrinkMachine>();

    public Location(String name){
        this.name = name;
        setSnackMachine();
        setDrinkMachine();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSnackMachine(){

    }

    public void setDrinkMachine(){}
}
