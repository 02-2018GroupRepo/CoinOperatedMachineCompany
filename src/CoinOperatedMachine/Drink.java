package CoinOperatedMachine;

public class Drink extends Product {
    private String containerType;

    public Drink(double retailPrice, double wholesalePrice, String productID, String name, String desc, String containerType) {
        super(retailPrice, wholesalePrice, productID, name, desc);
            this.containerType = containerType;

    }
}
