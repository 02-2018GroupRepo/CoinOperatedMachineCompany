package bootCamp;

import java.util.ArrayList;

public class LittleThingsCompany extends ArrayList<LittleThingsCompany> {
    String location;
     int numberOfVending;
    String typeOfVending;

    private ArrayList<LittleThingsCompany> littleThingsList = new ArrayList<LittleThingsCompany>();

    public LittleThingsCompany(String location, int numberOfVending, String typeOfVending) {
        this.location = location;
        this.numberOfVending = numberOfVending;
        this.typeOfVending = typeOfVending;
        ArrayList<LittleThingsCompany> littleThingsList = new ArrayList<LittleThingsCompany>();
    }

    public LittleThingsCompany() {

    }

    public  String getLocation(String location) {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public  int getNumberOfVending(int numberOfMachine) {
        return numberOfMachine;
    }

    public void setNumberOfVending(int numberOfVending) {
        this.numberOfVending = numberOfVending;
    }

    public String getTypeOfVending(String typeOfVending) {
        return typeOfVending;
    }

    public void setTypeOfVending(String typeOfVending) {
        this.typeOfVending = typeOfVending;
    }

    public  void viewLocation(ArrayList<LittleThingsCompany> myLocation) {
        for (LittleThingsCompany location : myLocation) {
            System.out.println("We have machine in: " + location.location + "  Number of vending machine: " + location.numberOfVending + "  Type of Vending: " + location.typeOfVending);
        }
    }
    public void addNewMachine(ArrayList<LittleThingsCompany> myLocation){
        for (LittleThingsCompany location: myLocation )
            littleThingsList.add(location);

    }



}
