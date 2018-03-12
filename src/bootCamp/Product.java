package bootCamp;

public class Product {

    private int id;
    private String name;
    private String description;
    private double wholesalePrice;
    private double retailPrice;

    public Product() {}

    public Product(int id, String name, String description, double wholesalePrice, double retailPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    //Random Product generator
    public Product(int id) {
        this.id = id;
        this.name = "Random Product number" + id;
        this.description = "I am worth your money.";
        this.wholesalePrice = 0.50;
        this.retailPrice = 1d;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    @Override
    public String toString() {
        return "Item name: " + name + ", Price: " + retailPrice;
    }
}
