package CoinOperatedMachine;

import java.util.ArrayList;

public class Machine {
    private Location location;
    //private static double[] coinsAccepted = {Coins.NICKEL, Coins.DIME, Coins.QUARTER};
    private ArrayList<Compartment> availableCompartments;


    public Machine(Location location) {
        this.location = location;
    }

    public ArrayList<Compartment> getAvailableCompartments() {
        return availableCompartments;
    }

}
