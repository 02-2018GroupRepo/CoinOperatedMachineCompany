package com.fileCreating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Oraganization {

    private String password;
    private Map<String, ArrayList<Machine>> myVMachinesMap;

    Oraganization() {
        this.password = "password";
        this.myVMachinesMap = new HashMap<String, ArrayList<Machine>>();
    }

    public boolean checkPassWord(String password) {
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void addVendingMachineToMap(Machine vm) {
        ArrayList<Machine> machinesInThisLocation = new ArrayList<>();

        if (myVMachinesMap.containsKey(vm.getLocation())) {
            machinesInThisLocation = myVMachinesMap.get(vm.getLocation());
        }

        machinesInThisLocation.add(vm);
        myVMachinesMap.put(vm.getLocation(), machinesInThisLocation);
    }

    public void removeVendingMachineFromMap(Machine vm, String machine_id) {

        int count = 0;

        if (myVMachinesMap.containsKey(vm.getLocation())) {
            ArrayList<Machine> locationList = myVMachinesMap.get(vm.getLocation());


            if (locationList.size() > 0) {
                System.out.println("l: " + locationList.size());
                for(Iterator<Machine> locationIterator = myVMachinesMap.get(vm.getLocation()).iterator(); locationIterator.hasNext();){
                    Machine machine = locationIterator.next();
                    if(machine.getMachine_id().equalsIgnoreCase(machine_id)){
                        locationIterator.remove();
                    }
                }

                // Apparently you can't remove inside a foreach
//
//                for (Machine machine : locationList) {
//                    if (machine.getMachine_id().equalsIgnoreCase(machine_id)) {
//                        System.out.println("count " + count);
//                        break;
//                        locationList.remove(count);
//                    }
//                    count++;
//                }
            } else {
                myVMachinesMap.remove(locationList);
            }
        }
    }

    public void checkThisMachineTotalMoney(Machine machine) {
        System.out.printf("Total cash in" + machine.getMachine_id() + ": %.02f\n\n", machine.getCoin().getTotalAmountMoney());
    }

    public void checkThisMachineCoins(Machine machine) {
        System.out.println("This Machine amount of Coins");
        System.out.println("\tNumber of Nickels: " + machine.getCoin().getTotalNumNickels());
        System.out.println("\tNumber of Dimes: " + machine.getCoin().getTotalNumDimes());
        System.out.println("\tNumber of Quarters: " + machine.getCoin().getTotalNumQuarters());
    }

    public void totalMoneyInAllMyMachines() {
        Double total = 0.0;

        for (Map.Entry<String, ArrayList<Machine>> map : myVMachinesMap.entrySet()) {
            for (Machine machine : map.getValue()) {
                total += machine.getCoin().getTotalAmountMoney();
            }
        }

        System.out.println(total);
    }

    public void totalCoinsInAllMyMachines() {
        int totalNickel = 0;
        int totalDime = 0;
        int totalQuarter = 0;

        for (Map.Entry<String, ArrayList<Machine>> map : myVMachinesMap.entrySet()) {
            for (Machine machine : map.getValue()) {
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
        if (myVMachinesMap.containsKey(location)) {
            ArrayList<Machine> machinesInThisLocation = myVMachinesMap.get(location);
            for (Machine vm : machinesInThisLocation) {
                total += vm.getCoin().getTotalAmountMoney();
            }
            System.out.println("--> " + total + "\n");
        } else {
            System.out.println("Invalid Location\n");
        }


    }

    public void totalCoinsInThisLocation(String location) {
        int totalNickel = 0;
        int totalDime = 0;
        int totalQuarter = 0;

        System.out.println("Total Coins at location " + location);
        if (myVMachinesMap.containsKey(location)) {
            ArrayList<Machine> machinesInThisLocation = myVMachinesMap.get(location);
            for (Machine vm : machinesInThisLocation) {
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

    public void setTotalNumCoins(int numNickels, int numDimes, int numQuarters, Machine thisMachine) {
        thisMachine.getCoin().setTotalNumNickels(numNickels);
        thisMachine.getCoin().setTotalNumDimes(numDimes);
        thisMachine.getCoin().setTotalNumQuarters(numQuarters);
    }

    public void printMyVendingMachines() {
        System.out.println("My vending Machines");
        for (Map.Entry<String, ArrayList<Machine>> map : myVMachinesMap.entrySet()) {
            System.out.println(map.getKey());
            for (Machine machine : map.getValue()) {
                System.out.println("\tVending Machine: [" + machine.getMachine_id() + "] " + machine.getCoin().getTotalAmountMoney());
            }
        }
        System.out.println();

    }

    public void printLocations() {
        System.out.println("Locations where I have machines");
        for (Map.Entry<String, ArrayList<Machine>> map : myVMachinesMap.entrySet()) {
            System.out.println("\t" + map.getKey());
        }
    }

    public void operatorUI_SwitchCase(int selection, Machine vm) {
        String str;

        switch (selection) {
            case 1:
                System.out.println("Would like to 'add' or 'remove'? ");
                str = Buffer.stringBufferIO().toLowerCase();
                switch (str) {
                    case "add":
                        addVendingMachineToMap(vm);
                        break;
                    case "remove":
                        System.out.println();
                        printMyVendingMachines();
                        System.out.println("Enter machine id to remove");
                        removeVendingMachineFromMap(vm, Buffer.stringBufferIO().toLowerCase());
                        printMyVendingMachines();
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
                System.out.print("Enter previous password: ");
                if (checkPassWord(Buffer.stringBufferIO())) {
                    System.out.print("Enter new password: ");
                    setPassword(Buffer.stringBufferIO());
                } else {
                    System.out.println("Sorry Wrong Password.");
                }
                System.out.println();
                break;
            case 6:
                System.out.println("Exiting Out");
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}

