package com.company;

import java.util.ArrayList;

public class Food4ThoughCo {

    private String name;
    private ArrayList<Location> locationArrayList = new ArrayList<Location>();

    public Food4ThoughCo(String name){
        this.name = name;

    }

    public void setLocations(){
        Location location1 = new Location("Stone Mountain",
                "Stone Mountain SnackMachine",
                "Stone Mountain DrinkMachine");
    }

    public String getName() {
        return name;
    }


}
