package CoinOperatedMachine;

public class DrinkCompartment extends Compartment {
    private String containerType;

    public DrinkCompartment(int row, int shelf, int numberOfSpaces, String containerType) {
        super(row, shelf, numberOfSpaces);
        this.containerType = containerType;
    }
}
