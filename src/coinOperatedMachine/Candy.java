package coinOperatedMachine;


public class Candy extends Product {


    public Candy(int uniqueID) {
        super(uniqueID);
    }

    public Candy(int uniqueID, String name, String description, double wholesalePrice, double retailPrice) {
        super(uniqueID, name, description, wholesalePrice, retailPrice);
    }


}
