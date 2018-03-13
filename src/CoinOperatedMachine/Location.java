package CoinOperatedMachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Location {

    private String houseNumber;
    private String city;
    private String state;
    private String zipCode;

    public Location() {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Number: ");
            String input = console.readLine();
            this.houseNumber = input;
            System.out.println("City: ");
            input = console.readLine();
            this.city = input;
            System.out.println("State: ");
            input = console.readLine();
            this.state = input;
            System.out.println("Zip code: ");
            input = console.readLine();
            this.zipCode = input;
            Company.getLocations().add(this);
        } catch (Exception e)

        {
            System.out.println(e);
        } finally

        {
            try {
                console.close();
            } catch (Exception e) {

            }
            console = null;
        }
    }

    public static Location specifyLocation() {
        Location location = new Location();
        System.out.println("choose the location");
        System.out.println("1. Add a new location");
        System.out.println("2. choose from existing locations");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try {
            int input = Integer.valueOf(console.readLine());
            switch (input) {
                case 1: {
                    location = new Location();
                    break;
                }
                case 2: {
                    ArrayList<Location> locations = Company.getLocations();
                    int index = 1;
                    for (Location l : locations) {
                        System.out.println(Integer.valueOf(index) + ". " + l);
                        index++;
                    }
                    System.out.println("choose the location");
                    String locationIndex = console.readLine();
                    location = Company.getLocations().get(Integer.valueOf(locationIndex)-1);
                }
            }
        } catch (Exception e)

        {
            System.out.println(e);
        } finally

        {
            try {
                console.close();
            } catch (Exception e) {

            }
            console = null;
        }
        return location;
    }

    @Override
    public String toString() {
        return (this.houseNumber + " " + this.city + ", " + this.state +" " + this.zipCode);
    }
}
