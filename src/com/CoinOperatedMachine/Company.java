package com.CoinOperatedMachine;
import java.util.ArrayList;

public class Company {

    private String name;

    private ArrayList<Location> locationsList = new ArrayList<Location>();

    public Company(String name) {
        this.name = name;
        setLocations();
    }
        public void setLocations(){
            Location Location1 = new Location("Atlanta");
            Location Location2 = new Location("Nairobi");
            Location Location3 = new Location("Canberra");
            Location Location4 = new Location("Dubai");
            locationsList.add(Location1);
            locationsList.add(Location2);
            locationsList.add(Location3);
            locationsList.add(Location4);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public ArrayList<Location> allLocations(){
            return this.locationsList;
        }


    }

