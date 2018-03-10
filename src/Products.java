public class Products {

    //Each product should have a unique id, a name, a description, a wholesale price, and a retail sale price

    private String name;
    private int id;
    private String description;
    private double wholesalePrice;
    private double retailPrice;

    //if you make your constructor private, you can't create objects in main only in the current class

    public Products(String name, String description, int id, double wholesalePrice, double retailPrice) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    //use the getters  because your are using private products
    //I took the setters out because it's not useful because someone can change the value

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }


    public String getDescription() {
        return description;
    }


    public double getWholesalePrice() {
        return wholesalePrice;
    }


    public double getRetailPrice() {
        return retailPrice;
    }

    //this is a toString method, just called a different name
    public String getNamePrice(){
        return this.name + " = $" + this.retailPrice;
    }

    public double payForItem (double amount) {

        return retailPrice;
    }



}
