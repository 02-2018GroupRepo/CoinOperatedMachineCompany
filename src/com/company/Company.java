package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<VendingMachine> vendingMachines;
    private String password;

    public Company(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Company(String name, String password, List<VendingMachine> vendingMachines) {
        this.name = name;
        this.vendingMachines = vendingMachines;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VendingMachine> getVendingMachines() {
        return vendingMachines;
    }

    public void setVendingMachines(List<VendingMachine> vendingMachines) {
        this.vendingMachines = vendingMachines;
    }
}


