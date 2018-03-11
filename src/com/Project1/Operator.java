package com.Project1;

public class Operator {
    String Name;
    String ID;

    public Operator(String name, String ID) {
        Name = name;
        this.ID = ID;
    }


    void getLogFile(AbstractMachine machine) {
        machine.getLogFile(this.ID);
    }

    AbstractMachine addMachine(Location location, String machineType) {


        //location.addMachineToThisLocation(machineType, location);
        AbstractMachine newMachine;

        if (machineType.toUpperCase().equals("SNACKMACHINE")) {
            newMachine = new SnackMachine(location);
        } else if (machineType.toUpperCase().equals("DRINKMACHINE")) {
            newMachine = new DrinkMachine(location);
        } else {
            System.out.println("That doesnt exists");
            return null;
        }
        location.addMachineToThisLocation(newMachine);
        return newMachine;

    }
}


