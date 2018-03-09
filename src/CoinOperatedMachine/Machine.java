package CoinOperatedMachine;

import java.util.Map;

public class Machine {
    private Location location;
    private static double[] coinsAccepted = {Coins.NICKEL, Coins.DIME, Coins.QUARTER};
    private Map<Product, Integer> productsQuantity;
    private Map<Compartment, Map<Product, Integer>> availableItems;
    private Compartment[] compartments;

}
