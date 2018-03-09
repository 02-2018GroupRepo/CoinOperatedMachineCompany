package CoinOperatedMachine;

public class SnackVendingMachine extends Machine{

    public SnackVendingMachine(Location location) {
        super(location);
        for (int row = 0; row < 5;row++){
            for (int shelf=0 ; shelf< 5; shelf++){
                getAvailableCompartments().add(new Compartment(row,shelf,10));
            }
        }
    }
}
