package com.company;

import java.util.ArrayList;

public class Location {
    private String name;
    private ArrayList<VendingMachine> machineList = new ArrayList<VendingMachine>();

    public Location(String name){
        this.name = name;
        ArrayList<VendingMachine> machineList = new ArrayList<VendingMachine>();
    }

    public void addMachine(VendingMachine machine){
        machineList.add(machine);
    }

    public void viewMachines(){
        if (machineList.size() < 0){
            System.out.println("Sorry there are no machines at this location.");
        } else {
            for(int i=0; i < machineList.size(); i++){
                System.out.println(machineList.get(i));
            }
        }
    }
}
