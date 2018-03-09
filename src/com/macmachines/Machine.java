package com.macmachines;

public abstract class Machine {
    private String location;
    
    private Machine() {}

    public Machine(String location) {
        this.location = location;
    }
}
