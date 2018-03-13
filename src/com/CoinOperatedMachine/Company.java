package com.CoinOperatedMachine;
import java.util.ArrayList;

public class Company {

    private String name;

    private ArrayList<Location> = new ArrayList<Location>();

    public Company(String name){
        this.name=name;
        setLocations();
    }
}

    public setLocations(){

    Location Location1 = new Location ("CNN Center Food Court");
    Location Location2 = new Location ("Georgia State University Central Campus");
    Location Location3 = new Location ("Atlantic Station AMC Theaters");

    locationList.add(Location1);
    locationList.add(Location2);
    locationList.add(Location3);
        }

        public String getName(){
    return this.name;
        }

        public void setName(String name){
    this.name=name;
        }

        public ArrayList<Location> allLocations(){
    return this.locationList;
        }