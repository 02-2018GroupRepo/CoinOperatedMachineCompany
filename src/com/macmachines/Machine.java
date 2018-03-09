package com.macmachines;

public abstract class Machine {
    private String companyName;
    private String machineName;
    private int machineQuarters;
    private int machineDimes;
    private int machineNickels;

    public Machine() {}

    public Machine(String companyName, String machineName) {
        this.companyName = companyName;
        this.machineName = machineName;
    }

    public void addToMachineMoney(int quarters, int dimes, int nickels) {
        this.machineQuarters = quarters;
        this.machineDimes = dimes;
        this.machineNickels = nickels;
    }

    public double getMachineMoney() {
        return convertCoinsToCash(this.machineQuarters, this.machineDimes, this.machineNickels);
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getMachineName() {
        return machineName;
    }

    public double convertCoinsToCash(int quarters, int dimes, int nickels) {
        return Coin.QUARTER * this.machineQuarters + Coin.DIME * this.machineDimes + Coin.NICKEL * this.machineNickels;
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
