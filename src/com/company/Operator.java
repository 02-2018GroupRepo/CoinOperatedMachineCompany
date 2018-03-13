package com.company;

public class Operator {

    /*public void addVendingMachine(Company vm, String location ){
        vm.setLocation(location);
        System.out.println("Machine placed at " + location);
    }

    public void removeVendingMachine(Company vm){
        vm.setLocation("Storage");
        System.out.println("This vending machine has been moved to storage.");
    }*/

    public double individualVendingMachineTotal(VendingMachine machine){

        double total = (machine.sNickels * .05) + (machine.sDimes * .10) + (machine.sQuarters * .25);
        return total;

    }

    public double allVendingMachineTotal(VendingMachine sMachine, VendingMachine dMachine){
        double total1 = (sMachine.sNickels * .05) + (sMachine.sDimes * .10) + (sMachine.sQuarters * .25);
        double total2 = (dMachine.sNickels * .05) + (dMachine.sDimes * .10) + (dMachine.sQuarters * .25);
        return total1 + total2;

    }

    public void getCoinCount(VendingMachine machine){
        System.out.println("Nickels: " + machine.sNickels);
        System.out.println("Dimes: " + machine.sDimes);
        System.out.println("Quarters: " + machine.sQuarters);
    }

}
