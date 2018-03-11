package com.location;

import com.machine.Machine;
import java.util.ArrayList;

public class Location {

    private ArrayList<Machine> machine_list;
    private String name;

    public Location() {
        machine_list = new ArrayList<>();
        setName(null);
    }

    public Location(String name) {
        machine_list = new ArrayList<>();
        setName(name);
    }

    public void addMachine(Machine machine) {
        machine_list.add(machine);
    }

    public void removeMachine(int index) {
        machine_list.remove(index);
    }

    public void print() {
        System.out.println("LOCATION(" + this.getName() + ") SELECT MACHINE NUMBER");
        if(!this.machine_list.isEmpty()) {
            for (int i = 0; i < machine_list.size(); i++) {
                System.out.print((i + 1) + ": ");
                machine_list.get(i).print();
            }
        } else System.out.println("IS PREPARING......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Machine> getMachine_list() {
        return machine_list;
    }
}
