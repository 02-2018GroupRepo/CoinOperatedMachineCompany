package coinOperatedMachine;

public class Product {

    final int uniqueID;
    String name;
    String description;
    double wholesalePrice;
    double retailPrice;

    public Product (int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Product(int uniqueID, String name, String description, double wholesalePrice, double retailPrice) {
        this.uniqueID = uniqueID;
        this.name = name;
        this.description = description;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public int getUniqueID() {
        return uniqueID;
    }

//    public int setUniqueID (int uniqueID) {
//        this.uniqueID = uniqueID;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
}
