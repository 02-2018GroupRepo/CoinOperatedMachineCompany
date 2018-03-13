package com.CoinOperatedMachine;

import java.util.ArrayList;

public class DrinkMachine {

    private String machineId;
    private ArrayList<Shelf> drinkShelf = new ArrayList<Shelf>();
    private RandomCharGenerator randomly = new RandomCharGenerator();


    public DrinkMachine(String machineId){
        this.machineId = machineId;
        setNumberOfShelves(6);

    }

    public String getMachineId() {
        return this.machineId;
    }

    public void setNumberOfShelves(int shelves){
        for(int i = 0; i < shelves; i++){
            String machineCharId = randomly.getCurrentCharacter();
            randomly.setNextOrderedChar();
            (this.drinkShelf).add(new Shelf(machineCharId));
        }
    }

    public ArrayList<Shelf> ListOfShelves(){
        return this.drinkShelf;
    }

    public String ShelvesToString(){
        String newString = "";
        for(Shelf shelf : this.drinkShelf){
            newString += shelf.getName();
        }
        newString  += "\n";
        return newString;
    }


}
