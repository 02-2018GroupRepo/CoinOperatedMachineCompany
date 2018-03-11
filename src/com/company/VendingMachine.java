package com.company;

import java.util.ArrayList;

public abstract class VendingMachine {
    private final String company = "BigVendorBrand";
    private ArrayList<Shelf> shelves = new ArrayList<Shelf>();
    private Wallet wallet = new Wallet();

    public VendingMachine(){};

    public VendingMachine(ArrayList<Shelf> shelves, Wallet wallet) {
        this.shelves = shelves;
        this.wallet = wallet;
    }

    public String getCompany() {
        return company;
    }

}
