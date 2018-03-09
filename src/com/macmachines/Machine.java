package com.macmachines;

public abstract class Machine {
    private String companyName;
    private double allMachineMoney;

    public Machine() {}

    public Machine(String companyName, String machineName) {
        this.companyName = companyName;
    }

    protected void addToAllMachineMoney(double money) {
        this.allMachineMoney += money;
    }
    public void getAllMachineMoney() {
        System.out.println(this.allMachineMoney);
    }

}
