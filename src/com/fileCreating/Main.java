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

        christian.addVendingMachiceToMap(clemsonVM1);
        christian.addVendingMachiceToMap(clemsonVM2);
        christian.addVendingMachiceToMap(atlantaVM1);

        christian.printMyVendingMachines();
    }
}
