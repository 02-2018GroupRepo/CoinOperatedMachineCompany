package com.macmachines;

public abstract class Machine {
    private String companyName;
    private String machineName;

    public Machine() {}

    public Machine(String companyName, String machineName) {
        this.companyName = companyName;
        this.machineName = machineName;
    }

    public String getMachineName() {
        System.out.println(machineName);
        return machineName;
    }
}
