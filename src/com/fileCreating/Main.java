package com.fileCreating;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SnackMachine vm = new SnackMachine();
        vm.intializeInventory();
        vm.addToInventory(0, 0 ,5, "Candy");
        vm.printInventory();

        DrinkMachine dm = new DrinkMachine();
        dm.intializeInventory();
        dm.addToInventory(0, 0, 3 ,"Pop");
        System.out.println();
        System.out.println();
        dm.printInventory();
    }
}
