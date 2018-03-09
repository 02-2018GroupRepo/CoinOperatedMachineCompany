package com.company;

import java.util.Scanner;

public class Operator {

    public void addMachine(Vending_Machine machine, String location){
        machine.setLocation(location);
    }
    public void removeMachine(Vending_Machine machine){
        machine.setLocation("Warehouse");
    }
    public double getAllTotal(Vending_Machine machine1, Vending_Machine machine2){

        double total1 = (machine1.numQ * .25) + (machine1.numN * .05) + (machine1.numD * .10);
        double total2 = (machine2.numQ * .25) + (machine2.numN * .05) + (machine2.numD * .10);

        return total1 + total2;
    }
    public void getTotal(Vending_Machine machine){
        double total = (machine.numQ * .25) + (machine.numN * .05) + (machine.numD * .10);
        System.out.println("Total in this machine is $" + total);
        System.out.println("See details?");

        Scanner scanner = new Scanner(System.in);
        if(scanner.next().toLowerCase().equals("yes"))
            getDetails(machine);

    }

    public void getDetails(Vending_Machine machine){
        System.out.println("Quarters: " + machine.numQ);
        System.out.println("Dimes: " + machine.numD);
        System.out.println("Nickels: " + machine.numN);
    }
}
