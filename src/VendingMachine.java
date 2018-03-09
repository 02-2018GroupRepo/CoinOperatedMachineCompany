import java.util.ArrayList;
import java.util.List;

public class SnackMachine implements VendingMachine {

    private String location;
    private int numberOfMachines;
    private int[] shelves = new int[5];
    private int[] compartments = new int[5];
    private int[] spaces = new int[10];
    private List<Products> items = new ArrayList<Products>();



    public void initializeSnackMachine(Products product){


    }
    public void addItemIdToMachine(Products p){
        items.add(p);
    }


    @Override
    public void insertCoin() {

    }

    @Override
    public void addLocation() {

    }

    @Override
    public void selectItem() {

    }

    @Override
    public void dispenseItem() {

    }
    public void displayItems(){
        for(Products p : items){
            System.out.println(p.getId());
            System.out.println(p.getName());
            System.out.println(p.getDescription());
            System.out.println(p.getRetailPrice());

        }
    }
}
