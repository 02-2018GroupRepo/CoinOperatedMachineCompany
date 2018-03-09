package CoinOperatedMachine;

public class Product {
    private double retailPrice;
    private double wholesalePrice;
    private String productID;
    private String name;
    private String desc;

    public Product(double retailPrice, double wholesalePrice, String productID, String name, String desc) {
        this.retailPrice = retailPrice;
        this.wholesalePrice = wholesalePrice;
        this.productID = productID;
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
}
