package com.CoinOperatedMachine;

import java.util.ArrayList;

public class SnackMachine {

    private String machineId;
    private ArrayList<Shelf> snackShelf = new ArrayList<Shelf>();


    public SnackMachine(String machineId){
        this.machineId = machineId;

    }

    public String getMachineId() {
        return machineId;
    }
}
