package bootCamp;

import java.util.ArrayList;

public class LittleThingsCompany  {
    String location;
     int numberOfVending;
     String typeOfVending;

    private Inventory<Coin> coinInventory= new Inventory<Coin>();
    private Inventory<SnackItems> itemInventory= new Inventory<SnackItems>();
    private double totalSale;
    private SnackItems currentItem;
    private double  currentItemBal;

    private ArrayList<LittleThingsCompany> littleThingsList = new ArrayList<LittleThingsCompany>();

    public LittleThingsCompany(String location, int numberOfVending, String typeOfVending) {
        this.location = location;
        this.numberOfVending = numberOfVending;
        this.typeOfVending = typeOfVending;
        ArrayList<LittleThingsCompany> littleThingsList = new ArrayList<LittleThingsCompany>();
    }

    public LittleThingsCompany() {

    }

    public  String getLocation(String location) {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public  int getNumberOfVending(int numberOfMachine) {
        return numberOfMachine;
    }

    public void setNumberOfVending(int numberOfVending) {
        this.numberOfVending = numberOfVending;
    }

    public String getTypeOfVending(String typeOfVending) {
        return typeOfVending;
    }

    public void setTypeOfVending(String typeOfVending) {
        this.typeOfVending = typeOfVending;
    }
    public double getCurrentItemBal() {
        return currentItemBal;
    }


    public void insertCoin(Coin coin) {
        currentItemBal= currentItemBal+ coin.getValue();
        coinInventory.add(coin);
    }


}
