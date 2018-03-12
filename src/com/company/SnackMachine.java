package com.company;

public class SnackMachine extends VendingMachine {

    public SnackMachine(String location, String company) {
        this.machineType = "Snack Machine";
        this.location = location;
        this.rows = 5;
        this.columns = 5;
        this.spacePerCompartment = 10;
        this.storageArray = new Product[this.rows][this.columns][this.spacePerCompartment];
        this.companyName = company;
    }

}
