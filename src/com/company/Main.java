package com.company;

public class Main {

    public static void main(String[] args) {
        
        SnackMachine snacks = new SnackMachine();
        DrinkMachine drinks = new DrinkMachine();
        Operator machine = new Operator();

        System.out.println(machine.individualVendingMachineTotal(snacks));
        System.out.println(machine.allVendingMachineTotal(snacks, drinks));
        machine.getCoinCount(snacks);









    }
}
