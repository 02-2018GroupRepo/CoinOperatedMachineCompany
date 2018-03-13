package CoinOperatedMachine;

import java.util.ArrayList;

public class Company {
    private static ArrayList<Machine> machines = new ArrayList<>();
    private static ArrayList<Location> locations = new ArrayList<>();

    public Company(){}

    public static ArrayList<Machine> getMachines() {
        return machines;
    }

    public static ArrayList<Location> getLocations() {
        return locations;
    }
}
