package com.bootcamp;


import java.util.ArrayList;

public class Company {
    private String name;

    private ArrayList<Operator> locList = new ArrayList<Operator>();
    public Company (String name){
        this.name = name;
        setLocations();

    }
    public void setLocations(){
        Operator loc1 = new Operator("Atlanta");
        Operator loc2 = new Operator("Savannah");
        Operator loc3 = new Operator("Augusta");
        Operator loc4 = new Operator("Columbus");
        Operator loc5 = new Operator("Macon");
        locList.add(loc1);
        locList.add(loc2);
        locList.add(loc3);
        locList.add(loc4);
        locList.add(loc5);
    }

    public ArrayList<Operator> getLocations(){
        return this.locList;
    }

}
