package com.fileCreating;

public class Main {

    public static void main(String[] args) {
	// write your code here
        test2();

    }

    public static void test1(){
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

    public static void test2(){
        Operator christian = new Operator();
        SnackMachine clemsonVM1 = new SnackMachine();
        SnackMachine clemsonVM2 = new SnackMachine();
        SnackMachine atlantaVM1 = new SnackMachine();

        clemsonVM1.setLocation("Clemson");
        clemsonVM2.setLocation("Clemson");
        atlantaVM1.setLocation("Atlanta");

        christian.setTotalNumCoins(25, 25, 25, clemsonVM1);
        christian.setTotalNumCoins(25, 25, 25, clemsonVM2);
        christian.setTotalNumCoins(25, 25, 25, atlantaVM1);

        christian.addVendingMachineToMap(clemsonVM1);
        christian.addVendingMachineToMap(clemsonVM2);
        christian.addVendingMachineToMap(atlantaVM1);

        christian.printMyVendingMachines();

        System.out.println();
        System.out.println("Total Amount of Money");
        System.out.println(christian.totalMoneyInAllMyMachines());

    }
}
