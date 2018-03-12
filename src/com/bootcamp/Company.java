package com.bootcamp;

import javax.xml.stream.Location;
import java.util.ArrayList;

public class MuddyWaterCoins {
    //State
    private String name;
    //ArrayList of Location
    private ArrayList<Location> locList = new ArrayList<Location>();

    //Constructor
    private MuddyWaterCoins(String name) {
        this.name = name;
        setLocations();
    }

    public void setLocations() {
        Location loc1 = new Location("Jackson");
        Location loc2 = new Location ("Meridian");
        Location loc3 = new Location ("Tupelo");
        Location loc4 = new Location ("Hattiesburg");
        Location loc5 = new Location ("Greenwood");

        locList.add(loc1);
        locList.add(loc2);
        locList.add(loc3);
        locList.add(loc4);
        locList.add(loc5);
    }
    public ArrayList<Location>getLocations(){
        return this.locList;
    }



}
