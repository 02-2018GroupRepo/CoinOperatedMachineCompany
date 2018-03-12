package bootCamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Operator {

    private final int code = 8675309;
    private HashMap<String,Location> locations;
    private ArrayList<Coin> wallet;
    private Random rand = new Random();

    // USE A SECURITY CODE FOR EVERY METHOD

    public Operator(int code) {
        if (this.code == code) {
            locations = new HashMap<String, Location>();
            wallet = new ArrayList<Coin>();
            makeWallet(wallet);
        }

        else
            System.exit(0);
    }

                        // Location management

    //add a location
    public void makeLocation(int code, String name) {
        if (code ==  this.code) {
            locations.put(name, new Location());
            locations.get(name).setName(name);
        }
        else
            System.exit(0);
    }

    public Location getLocation(int code, String name) {
        if (code != this.code)
            System.exit(0);

        return locations.get(name);
    }

                // CHECKING MONEY METHODS

    //check money in each machine, as total and as coin
    public double checkMachineMoney(int code, String location, String machineName) {
        if (code == this.code) {
           return locations.get(location).getMachine(machineName).getCashOnHand();
        }

        else
            System.exit(0);

        return 0;
    }

    //check money for machines by location
    public double checkLocationMoney(int code, String location) {
        double cashOnHand = 0d;
        if (code == this.code) {
            for (Machine m : locations.get(location).getMachinesMap().values()) {
                cashOnHand += m.getCashOnHand();
            }
        }

        else
            System.exit(0);

        return cashOnHand;
    }
    //check money in all machines, as total and as coin
    public double checkAllMoney(int code) {
        double cashOnHand = 0d;
        if (code == this.code) {
            for (Location l : locations.values()) {
                for (Machine m : locations.get(l).getMachinesMap().values()) {
                    cashOnHand += m.getCashOnHand();
                }
            }
        }
        else
            System.exit(0);
        return cashOnHand;
    }


                // MAKE A WALLET, PRIVATE AND HARDCODED
    private void makeWallet(ArrayList<Coin> wallet) {
        int temp = 0;
        for (int i = 0; i < 20; i++) {
            temp = rand.nextInt(3);
            if (temp == 0)
                wallet.add(new Nickel());
            else if (temp == 1)
                wallet.add(new Dime());
            else if (temp == 2)
                wallet.add(new Quarter());
        }
    }

    public Coin getRandomCoin() {
        int hold = rand.nextInt(wallet.size());
        Coin temp = wallet.get(hold);
        wallet.remove(hold);
        return temp;
    }

    public void takeRefund(Coin coin) {
        wallet.add(coin);
    }
}