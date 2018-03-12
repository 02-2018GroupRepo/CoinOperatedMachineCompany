package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<VendingMachine> vendingMachines;

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, List<VendingMachine> vendingMachines) {
        this.name = name;
        this.vendingMachines = vendingMachines;
    }

    public String getName() {
        return name;
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


