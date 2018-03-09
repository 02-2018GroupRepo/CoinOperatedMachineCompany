package com.fileCreating;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Operator christian = new Operator();
        SnackMachine vm = new SnackMachine();
        vm.intializeInventory();
        vm.addToInventory(0, 0 ,5, "Candy");
        vm.addToInventory(0, 1 ,7, "Cake");
        vm.addToInventory(0, 2 ,9, "Chips");

        vm.setItem(0,0,2.00);
        vm.setItem(0,1,2.25);
        vm.setItem(0,2,"Jerky",1.50);

        vm.printInventory();

        christian.setTotalNumCoins(25, 25, 25, vm);
        christian.checkThisMachineTotalMoney(vm);
    }
}
