import java.util.HashMap;
import java.util.Map;

public class Products {

    private int id;
    private String name;
    private String description;
    private double wholeSalePrice;
    private double retailPrice;


    public Products(int id, String name, String description, double wholeSalePrice, double retailPrice) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = retailPrice;
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

    public double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
