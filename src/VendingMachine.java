import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private String location;
    private int numberOfMachines;
    private List<Product> items = new ArrayList<Product>();




    public void viewItemsInVendingMachine(){
        for(Product p : items) {
            System.out.println("Item ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Description: " + p.getDescription());
            System.out.println("Price: " + p.getRetailPrice() + "\n");
        }

    }
    public void addItemToMachine(Product p){
        items.add(p);
    }






    public void addLocation() {

    }












}
