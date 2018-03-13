package CoinOperatedMachine;

import java.util.ArrayList;

public class Machine {
    private Location location;
    private int machineID;
    static int lastIDGenerated=1;
    //private static double[] coinsAccepted = {Coins.NICKEL, Coins.DIME, Coins.QUARTER};
    private ArrayList<Compartment> availableCompartments = new ArrayList<>();


    public Machine(Location location) {
        this.machineID = lastIDGenerated++;
        this.location = location;
    }

    public ArrayList<Compartment> getAvailableCompartments() {
        return availableCompartments;
    }

    public int getMachineID() {
        return machineID;
    }
}
