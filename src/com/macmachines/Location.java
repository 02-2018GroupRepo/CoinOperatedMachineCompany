package com.macmachines;

import java.util.ArrayList;
import java.util.List;

public class Location {
    List<Machine> machines = new ArrayList<Machine>();
    String locationName;

    private Location() {};

    public Location(String locationName) {
        this.locationName = locationName;
    }

    public Location(String locationName, List<Machine> machines) {
        this.locationName = locationName;
        this.machines = machines;
    }

//    public void listMachines(Operator operator) {
//        if(Operator.class.isInstance(operator)) {
//            for (Machine machine: machines) {
//                machine.();
//            }
//        }
//    }

    public void addMachine(Operator operator, Machine machine) {
        if(Operator.class.isInstance(operator)) {
            machines.add(machine);
        }
    }

    public void removeMachine(Operator operator, int index) {
        if(Operator.class.isInstance(operator)) {
            machines.remove(index);
        }
    }

}
