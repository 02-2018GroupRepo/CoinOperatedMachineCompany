package CoinOperatedMachine;

public class Drink extends Product {
    private String containerType;

    public Drink(double retailPrice, double wholesalePrice, String productID, String name, String desc, String containerType) {
        super(retailPrice, wholesalePrice, productID, name, desc);
        if(containerType.equalsIgnoreCase("can") || containerType.equalsIgnoreCase("bottle")) {
            this.containerType = containerType;
        } else {
            System.out.println("invalid container type. (enter can or bottle)");
        }
    }
}
