package com.CoinOperatedMachine;

import java.util.ArrayList;
import java.util.Random;

public class Location{

    private String name;
    private ArrayList<SnackMachine> snackList = new ArrayList<SnackMachine>();
    private ArrayList<DrinkMachine> drinkList = new ArrayList<DrinkMachine>();
    private RandomCharGenerator randomly = new RandomCharGenerator();

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
        for(int i = 0; i < 3; i++){
            String randomString = randomly.getRandomCharacters();
            (this.snackList).add(newSnackMachine(randomString));
        }

    }

    public void setDrinkMachine(){
        for(int i = 0; i < 3; i++){
            String randomString = randomly.getRandomCharacters();
            (this.snackList).add(newSnackMachine(randomString));
        }
    }

    public String snackMachineToString(){
        String newString = "";
        newString += "Snack Machines"
                for(SnackMachine snack : snackList){
                    newString += snack.getMachineId() + " ";
                }
                newString += "\n";
                return  newString;
    }

    public String drinkMachineToString(){
        String newString = "";
        newString += "Drink Machines";
        for(DrinkMachine drink : drinkList){
            newString += drink.getMachineId() + " ";
        }
        newString += "\n";
        return  newString;
    }

    public ArrayList<SnackMachine> ListOfSnackMachines() {
        return this.snackList;
    }
    public ArrayList<DrinkMachine> ListOfDrinkMachines() {
        return this.drinkList;
    }
}
