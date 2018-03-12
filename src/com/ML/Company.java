package com.ML;

public class Company {

    String companyName;


    public static void main(String[] args) {
        Location kennesaw = new Location("Kennesaw", "GA");
        Location acworth = new Location("Acworth", "GA");
        Location marietta = new Location("Marietta", "GA");
        Location collegePark = new Location("College Park", "GA");
        Location morrow = new Location("Morrow", "GA");

        Location[] locationList = new Location[5];
        locationList[0]=kennesaw;
        locationList[1]=acworth;
        locationList[2]=marietta;
        locationList[3]=collegePark;
        locationList[4]=morrow;



        for (int i=0;i<locationList.length;i++){

            System.out.println(locationList[i]);

        }

    }



    public Company (String companyName){


    }


}
