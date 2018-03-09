public class Products {

    //Each product should have a unique id, a name, a description, a wholesale price, and a retail sale price

   private String name;
   private int id;
   private String description;
   private double wholesalePrice;
   private double retailPrice;

    public Products(String name, String description, int id, double wholesalePrice, double retailPrice) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    //use the getters and setters because your are using private products


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
