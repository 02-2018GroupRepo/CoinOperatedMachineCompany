package com.fileCreating;

import sun.security.provider.VerificationProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Operator {

    private String password;
    private Map<String, ArrayList<VendingMachine>> myVMachinesList;

    Operator(){
        this.password = "password";
        this.myVMachinesList = new HashMap<String, ArrayList<VendingMachine>>();
    }

    public boolean checkPassWord(String password){
        return this.password.equals(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changeLocation(VendingMachine vm, String newLocation){
        vm.setLocation(newLocation);
    }

    public void addVendingMachineToMap(VendingMachine vm){
        ArrayList<VendingMachine> machinesInThisLocation = new ArrayList<>();

        if(myVMachinesList.containsKey(vm.getLocation())) {
            machinesInThisLocation = myVMachinesList.get(vm.getLocation());
        }

        machinesInThisLocation.add(vm);
        myVMachinesList.put(vm.getLocation(), machinesInThisLocation);
    }

    public void checkThisMachineTotalMoney(VendingMachine machine){
        System.out.println(machine.getAmountMoney());
    }

    public void checkThisMachineCoins(VendingMachine machine){
        System.out.println("Number of Nickels: " + machine.getTotalNumNickels());
        System.out.println("Number of Dimes: " + machine.getTotalNumDimes());
        System.out.println("Number of Quarters: " + machine.getTotalNumQuarters());
    }

    public Double totalMoneyInAllMyMachines(){
        Double total = 0.0;

        for(Map.Entry<String, ArrayList<VendingMachine>> map : myVMachinesList.entrySet()){
            for(VendingMachine machine : map.getValue()){
                total += machine.getAmountMoney();
            }
        }

        return total;
    }

    public void totalCoinsInAllMyMachines(){
        int totalNickel = 0;
        int totalDime = 0;
        int totalQuarter = 0;

        for(Map.Entry<String, ArrayList<VendingMachine>> map : myVMachinesList.entrySet()){
            for(VendingMachine machine : map.getValue()){
                totalNickel += machine.getTotalNumNickels();
                totalDime += machine.getTotalNumDimes();
                totalQuarter += machine.getTotalNumQuarters();
            }
        }

        System.out.println("Coins in all of my machines");
        System.out.println("Number of Nickels: " + totalNickel);
        System.out.println("Number of Dimes: " + totalDime);
        System.out.println("Number of Quarters: " + totalQuarter);

    }

    public void setTotalNumCoins(int numNickels, int numDimes, int numQuarters, VendingMachine thisMachine){
        thisMachine.setTotalNumNickels(numNickels);
        thisMachine.setTotalNumDimes(numDimes);
        thisMachine.setTotalNumQuarters(numQuarters);
    }


    public void printMyVendingMachines(){
        System.out.println("My vending Machines");
        for(Map.Entry<String, ArrayList<VendingMachine>> map : myVMachinesList.entrySet()){
            System.out.println(map.getKey());
            for(VendingMachine machine : map.getValue()){
                System.out.println("\tVending Machine:" + machine.getAmountMoney());
                System.out.println();
            }
        }
    }
}
