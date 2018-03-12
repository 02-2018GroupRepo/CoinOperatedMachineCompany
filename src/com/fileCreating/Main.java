package com.fileCreating;

public class Main {

    public static void main(String[] args) {
        // write your code here
        test4();

    }

    public static void test1() {
        Operator christian = new Operator();
        SnackMachine vm = new SnackMachine();
//        vm.intializeInventory();
//        christian.addToInventory(0, 0, 5, "Candy");
//        vm.addToInventory(0, 1, 7, "Cake");
//        vm.addToInventory(0, 2, 9, "Chips");
//
//        vm.setItem(0, 0, 2.00);
//        vm.setItem(0, 1, 2.25);
//        vm.setItem(0, 2, "Jerky", 1.50);
//
//        vm.printInventory();

        christian.setTotalNumCoins(25, 25, 25, vm);
        christian.checkThisMachineTotalMoney(vm);
    }

    public static void test2() {
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
        System.out.println("Total Amount of Money across All machines");
        christian.totalMoneyInAllMyMachines();

        christian.totalCoinsInAllMyMachines();
        System.out.println();

        System.out.println("At Location: Clemson");
        christian.totalMoneyInThisLocation("Clemson");
        christian.totalCoinsInThisLocation("Clemson");
        System.out.println();

        System.out.println("At Location: Atlanta");
        christian.totalMoneyInThisLocation("Atlanta");
        christian.totalCoinsInThisLocation("Atlanta");
        System.out.println();
    }

    public static void test3() {
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


        System.out.print("Enter Password: ");
        int input;

        if (christian.checkPassWord(Buffer.stringBufferIO())) {

            System.out.println("----- Operator Menu -----");
            System.out.println("1. Add/Remove a machine from a location");
            System.out.println("2. Check money in individual machines");
            System.out.println("3. Check money of all machines at a specific location");
            System.out.println("4. Check money of all machines everywhere");
            System.out.println("5. Change my password");
            System.out.println("6. Exit out of Operator Mode");
            System.out.println();

            do {
                System.out.println("Enter an input (1-6)");
                input = Buffer.intBufferIO();
                christian.operatorUI_SwitchCase(input, clemsonVM1);
            } while (input != 6);
        } else {
            System.out.println("Try Again");
        }


    }

    public static void test4(){
        Operator christian = new Operator();
        SnackMachine vm = new SnackMachine();
        christian.setTotalNumCoins(25, 25, 25, vm);

        vm.printInventory();

        for(int i = 0; i < 8; i++) {
            System.out.println("<------------->");
            Coins_CurrentOrder myMoneyForSnacks = new Coins_CurrentOrder(2, 0, 8);
            vm.getCoin().insertion(myMoneyForSnacks);
            vm.selection(0, 0, myMoneyForSnacks);
        }
    }
}
