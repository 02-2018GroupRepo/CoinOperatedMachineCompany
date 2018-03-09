package com.Project1;

import java.util.ArrayList;
import java.util.HashMap;

public class Location {
    private String city;
    private String store;
    private String chainNumber;
    ArrayList<AbstractMachine> machines;

    public Location(String city, String store, String chainNumber) {
        this.city = city;
        this.store = store;
        this.chainNumber = chainNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStore() {
        return store;
    }

    public String getChain() {
        return chainNumber;
    }

}
