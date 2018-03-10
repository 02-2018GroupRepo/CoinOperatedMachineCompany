package com.company;

public class SnackMachine extends VendingMachine {

    public SnackMachine(String location) {
        this.location = location;
        this.rows = 5;
        this.columns = 5;
        this.spacePerCompartment = 10;
        this.storageArray = new Product[this.rows][this.columns][this.spacePerCompartment];
    }

}
