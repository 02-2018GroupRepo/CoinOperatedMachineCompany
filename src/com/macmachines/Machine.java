package com.macmachines;

public abstract class Machine {
    private String companyName;
    private String machineName;
    private int machineQuarters = 100;
    private int machineDimes = 100;
    private int machineNickels = 100;

    public Machine() {}

    public Machine(String companyName, String machineName) {
        this.companyName = companyName;
        this.machineName = machineName;
        MachineTotals.allMachineQuarters += this.machineQuarters;
        MachineTotals.allMachineDimes += this.machineDimes;
        MachineTotals.allMachineNickels += this.machineNickels;
    }

    public void addToMachineMoney(int quarters, int dimes, int nickels) {
        this.machineQuarters += quarters;
        this.machineDimes += dimes;
        this.machineNickels += nickels;
        MachineTotals.allMachineQuarters += quarters;
        MachineTotals.allMachineDimes += dimes;
        MachineTotals.allMachineNickels += nickels;
    }

    public void removeMachineMoney(int quarters, int dimes, int nickels) {
        this.machineQuarters -= quarters;
        this.machineDimes -= dimes;
        this.machineNickels -= nickels;
        MachineTotals.allMachineQuarters -= quarters;
        MachineTotals.allMachineDimes -= dimes;
        MachineTotals.allMachineNickels -= nickels;
    }

    public double getMachineMoney() {
        double machineMoney = convertCoinsToCash(this.machineQuarters, this.machineDimes, this.machineNickels);
        System.out.printf("Total machine cash: $%.2f\n", machineMoney);
        int[] coinArray = convertCashToCoins(machineMoney);
        System.out.println("Machine cash by coin type: " + this.machineQuarters + " quarters, " + this.machineDimes + " dimes, and " + this.machineNickels + " nickels.");
        return machineMoney;
    }

    public double getAllMachineMoney() {
        double allMachineMoneyCash = convertCoinsToCash(MachineTotals.allMachineQuarters, MachineTotals.allMachineDimes, MachineTotals.allMachineNickels);
        System.out.println("Total money for all machines: $" + allMachineMoneyCash);
        System.out.println("All machine cash by coin type: " + MachineTotals.allMachineQuarters + " quarters, " + MachineTotals.allMachineDimes + " dimes, and " + MachineTotals.allMachineNickels + " nickels.");
        return  allMachineMoneyCash;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getMachineName() {
        return machineName;
    }

    public double convertCoinsToCash(int quarters, int dimes, int nickels) {
        return (Coin.QUARTER * quarters + Coin.DIME * dimes + Coin.NICKEL * nickels);
    }

    public int[] convertCashToCoins(double money) {
        int quarters = (int) Math.floor(money / Coin.QUARTER);
        money = money - quarters * Coin.QUARTER;
        int dimes = (int) Math.floor(money / Coin.DIME);
        money = money - dimes * Coin.DIME;
        int nickels = (int) (money / Coin.NICKEL);
        int[] coinArray = {quarters, dimes, nickels};
        return coinArray;
    }

}
