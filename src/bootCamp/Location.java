package bootCamp;

import java.util.ArrayList;
import java.util.HashMap;

public class Location {
    private String locationName;
    private HashMap<String, LittleThingsCompany> location;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public HashMap<String, LittleThingsCompany> getLocation() {
        return location;
    }

    public void setLocation(HashMap<String, LittleThingsCompany> location) {
        this.location = location;
    }

    public Location() {
        this.locationName = locationName;
        this.location = new HashMap<String, LittleThingsCompany>();
    }

    public Location(String str) {
        this.locationName = str;
    }
    public LittleThingsCompany checkMachine(String locationName){
        return location.get(locationName);
    }

    public DrinkMachine checkDrinkMachine(String locationName){
        return (DrinkMachine) location.get(locationName);
    }
    public SnackMachine checkSnackMachine(String locationName){
        return (SnackMachine) location.get(locationName);
    }

    public void viewLocation(ArrayList<LittleThingsCompany> myLocation) {
        for (LittleThingsCompany location : myLocation) {
            System.out.println("We have machine in: " + location.location + "  Number of vending machine: " + location.numberOfVending + "  Type of Vending: " + location.typeOfVending);
        }
    }

    public void addNewDrinkMachine(String locationName) {
        location.put(locationName, new DrinkMachine());
        location.get(locationName).setLocation(locationName);

    }

    public void addNewSnackMachine(String locationName) {
        location.put(locationName, new DrinkMachine());
        location.get(locationName).setLocation(locationName);
    }
    public void viewUpdate(LittleThingsCompany vending, String name) {
        location.put(name, vending);
        System.out.println(vending.typeOfVending + " has been added to " + locationName);
    }

}