package com.fileCreating;

import sun.security.provider.VerificationProvider;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Oraganization {

    private String password;
    private Map<String, ArrayList<VendingMachine>> myVMachinesList;

    Oraganization() {
        this.password = "password";
        this.myVMachinesList = new HashMap<String, ArrayList<VendingMachine>>();
    }

    public boolean checkPassWord(String password) {
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changeLocation(VendingMachine vm, String newLocation) {
        vm.setLocation(newLocation);
    }

    public void addVendingMachineToMap(VendingMachine vm) {
        ArrayList<VendingMachine> machinesInThisLocation = new ArrayList<>();

        if (myVMachinesList.containsKey(vm.getLocation())) {
            machinesInThisLocation = myVMachinesList.get(vm.getLocation());
        }

        machinesInThisLocation.add(vm);
        myVMachinesList.put(vm.getLocation(), machinesInThisLocation);
    }

    public void checkThisMachineTotalMoney(VendingMachine machine) {
        System.out.println(machine.getCoin().getAmountMoney());
    }

    public void checkThisMachineCoins(VendingMachine machine) {
        System.out.println("This Machine amount of Coins");
        System.out.println("\tNumber of Nickels: " + machine.getCoin().getTotalNumNickels());
        System.out.println("\tNumber of Dimes: " + machine.getCoin().getTotalNumDimes());
        System.out.println("\tNumber of Quarters: " + machine.getCoin().getTotalNumQuarters());
    }

    public void totalMoneyInAllMyMachines() {
        Double total = 0.0;

        for (Map.Entry<String, ArrayList<VendingMachine>> map : myVMachinesList.entrySet()) {
            for (VendingMachine machine : map.getValue()) {
                total += machine.getCoin().getAmountMoney();
            }
        }

        System.out.println(total);
    }

    public void totalCoinsInAllMyMachines() {
        int totalNickel = 0;
        int totalDime = 0;
        int totalQuarter = 0;

        for (Map.Entry<String, ArrayList<VendingMachine>> map : myVMachinesList.entrySet()) {
            for (VendingMachine machine : map.getValue()) {
                totalNickel += machine.getCoin().getTotalNumNickels();
                totalDime += machine.getCoin().getTotalNumDimes();
                totalQuarter += machine.getCoin().getTotalNumQuarters();
            }
        }

        System.out.println("Coins in all of my machines");
        System.out.println("Number of Nickels: " + totalNickel);
        System.out.println("Number of Dimes: " + totalDime);
        System.out.println("Number of Quarters: " + totalQuarter);

    }

    public void totalMoneyInThisLocation(String location) {
        Double total = 0.0;

        System.out.println("Total Money at location " + location);
        if (myVMachinesList.containsKey(location)) {
            ArrayList<VendingMachine> machinesInThisLocation = myVMachinesList.get(location);
            for (VendingMachine vm : machinesInThisLocation) {
                total += vm.getCoin().getAmountMoney();
            }
            System.out.println("--> " + total +"\n");
        } else {
            System.out.println("Invalid Location\n");
        }


    }

    public void totalCoinsInThisLocation(String location) {
        int totalNickel = 0;
        int totalDime = 0;
        int totalQuarter = 0;

        System.out.println("Total Coins at location " + location);
        if (myVMachinesList.containsKey(location)) {
            ArrayList<VendingMachine> machinesInThisLocation = myVMachinesList.get(location);
            for (VendingMachine vm : machinesInThisLocation) {
                totalNickel += vm.getCoin().getTotalNumNickels();
                totalDime += vm.getCoin().getTotalNumDimes();
                totalQuarter += vm.getCoin().getTotalNumQuarters();
            }

            System.out.println("\tNum of Nickels -> " + totalNickel);
            System.out.println("\tNum of Dimes -> " + totalDime);
            System.out.println("\tNum of Quarter -> " + totalQuarter);
            System.out.println();
        } else {
            System.out.println("Invalid Location\n");
        }
    }

    public void setTotalNumCoins(int numNickels, int numDimes, int numQuarters, VendingMachine thisMachine) {
        thisMachine.getCoin().setTotalNumNickels(numNickels);
        thisMachine.getCoin().setTotalNumDimes(numDimes);
        thisMachine.getCoin().setTotalNumQuarters(numQuarters);
    }

//    public void setItem(int row, int col, String itemName, VendingMachine vm){ vm.inventory[row][col].setItemName(itemName); }
//    public void setItem(int row, int col, Double price, VendingMachine vm){
//        vm.inventory[row][col].setPrice(price);
//    }
//    public void setItem(int row, int col, String itemName, Double price, VendingMachine vm){
//        vm.inventory[row][col].setPrice(price);
//        vm.inventory[row][col].setItemName(itemName);
//    }

    public void printMyVendingMachines() {
        System.out.println("My vending Machines");
        for (Map.Entry<String, ArrayList<VendingMachine>> map : myVMachinesList.entrySet()) {
            System.out.println(map.getKey());
            for (VendingMachine machine : map.getValue()) {
                System.out.println("\tVending Machine:" + machine.getCoin().getAmountMoney());
                System.out.println();
            }
        }
    }

    public void printLocations() {
        System.out.println("Locations where I have machines");
        for (Map.Entry<String, ArrayList<VendingMachine>> map : myVMachinesList.entrySet()) {
            System.out.println("\t" + map.getKey());
        }
    }

    public void operatorUI_SwitchCase(int selection, VendingMachine vm) {
        String str;

        switch (selection) {
            case 1:
                System.out.println("Would like to 'add' or 'remove'? ");
                str = Buffer.stringBufferIO().toLowerCase();
                switch (str) {
                    case "add":
                        break;
                    case "remove":
                        break;
                    default:
                }
                break;
            case 2:
                System.out.println("Check 'money' or 'coins' in this machine?");
                str = Buffer.stringBufferIO().toLowerCase();
                switch (str) {
                    case "money":
                        checkThisMachineTotalMoney(vm);
                        break;
                    case "coins":
                        checkThisMachineCoins(vm);
                        break;
                }
                break;
            case 3:
                printLocations();
                System.out.println("Choose Location:");
                String location = Buffer.stringBufferIO().toLowerCase();
                System.out.println("Check 'money' or 'coins' at this location");
                switch (Buffer.stringBufferIO().toLowerCase()) {
                    case "money":
                        totalMoneyInThisLocation(location);
                        break;
                    case "coins":
                        totalCoinsInThisLocation(location);
                        break;
                }
                break;
            case 4:

                System.out.println("Check 'money' or 'coins' everywhere");
                switch (Buffer.stringBufferIO().toLowerCase()) {
                    case "money":
                        totalMoneyInAllMyMachines();
                        break;
                    case "coins":
                        totalCoinsInAllMyMachines();
                        break;
                }
                break;
            case 5:
                System.out.println("Enter previous password: ");
                if (checkPassWord(Buffer.stringBufferIO())) {
                    System.out.println("Enter new password: ");
                    setPassword(Buffer.stringBufferIO());
                }
                break;
            case 6:
                System.out.println("Exiting Out");
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}

