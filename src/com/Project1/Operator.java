package com.Project1;

public class Operator {
    String Name;
    String ID;

    public Operator(String name, String ID) {
        Name = name;
        this.ID = ID;
    }


    void getLogFile(AbstractMachine machine) {
        machine.getLogFile(this.ID);
    }
}


