package com.CoinOperatedMachine;

import java.util.ArrayList;

public class DrinkMachine {

    private String machineId;
    private ArrayList<Shelf> drinkShelf = new ArrayList<Shelf>();

    public DrinkMachine(String machineId){
        this.machineId = machineId;

    }

    public String getMachineId() {
        return machineId;
    }

}
