package com.macmachines;

public abstract class Machine {
    private String companyName;
    private String machineName;
    private double machineMoney;

    public Machine() {}

    public Machine(String companyName, String machineName) {
        this.companyName = companyName;
        this.machineName = machineName;
    }

    public void addToMachineMoney(double money) {
        this.machineMoney += money;
    }

    public double getMachineMoney() {
        System.out.printf("Total machine cash: $%.2f\n", this.machineMoney);
        int[] coinArray = convertCashToCoins(this.machineMoney);
        System.out.println("Machine cash by coin type: " + coinArray[0] + " quarters, " + coinArray[1] + " dimes, and " + coinArray[2] + " nickels.");
        return this.machineMoney;
    }

    public double getAllMachineMoney() {
        System.out.println("Total money for all machines: $" + MachineTotals.allMachineMoney);
        int[] coinArray = convertCashToCoins(MachineTotals.allMachineMoney);
        System.out.println("All machine cash by coin type: " + coinArray[0] + " quarters, " + coinArray[1] + " dimes, and " + coinArray[2] + " nickels.");
        return  MachineTotals.allMachineMoney;
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
