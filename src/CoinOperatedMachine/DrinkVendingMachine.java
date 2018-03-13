package CoinOperatedMachine;

public class DrinkVendingMachine extends Machine{

    public DrinkVendingMachine(Location location) {
        super(location);
        for (int row = 0; row < 6;row++){
            for (int shelf=0 ; shelf< 3; shelf++){
                getAvailableCompartments().add(new DrinkCompartment(row,shelf,12,"can"));
            }
        }
        for (int row = 0; row < 5;row++){
            for (int shelf=0 ; shelf< 2; shelf++){
                getAvailableCompartments().add(new DrinkCompartment(row,shelf,8,"bottle"));
            }
        }
    }
}
