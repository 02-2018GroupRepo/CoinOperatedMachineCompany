package com.ML;

public class Company {

    String companyName;

    Location kennesaw = new Location("Kennesaw", "GA");
    Location acworth = new Location("Acworth", "GA");
    Location marietta = new Location("Marietta", "GA");
    Location collegePark = new Location("College Park", "GA");
    Location morrow = new Location("Morrow", "GA");

    Location[] locationList = new Location[5];

    locationList[0]=kennesaw;

    public Company (String companyName){


    }


}
