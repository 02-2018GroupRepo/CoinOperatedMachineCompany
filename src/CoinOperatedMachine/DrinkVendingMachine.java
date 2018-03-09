package CoinOperatedMachine;

public class DrinkVendingMachine extends Machine{

    public DrinkVendingMachine(Location location) {
        super(location);
        for (int row = 0; row < 6;row++){
            for (int shelf=0 ; shelf< 3; shelf++){
                getAvailableCompartments().add(new Compartment(row,shelf,12));
            }
        }
    }
}
