import java.util.ArrayList;
import java.util.LinkedHashMap;

public class SnackMachine extends VendingMachine{
    ///need to create an ArrayList of shelves
   private ArrayList<Shelf> shelves;

    private double total;

    public final static String machineType = "SnackMachine";
    public  final int spaceSize = 10;
    public  final int compartMentSize = 5;


    public SnackMachine(){
        shelves = new ArrayList<Shelf>();

        total = 0;

    }


    public double purchaseItemAndReturnChange(int shelfNumber,int compartMentNumber,Product product){
        Shelf  s1 =  shelves.get(shelfNumber);
        LinkedHashMap<Integer,ArrayList<Product>> shelf =  s1.getShelf();

        if(getTotal() >= product.getRetail_price()){
            shelf.get(compartMentNumber).remove(product);
            double change = getTotal() - product.getRetail_price();
            System.out.println("Your change is :"+change);
            total = getTotalAmtAvailableInMachine();
           total-=change;
           return  change;

        }else{
            double amtLeft = product.getRetail_price() - getTotal();
            System.out.println("Insufficient amount please add more coins ");
            System.out.println("You have "+amtLeft);
            return  getTotal();
        }
    }

    public double getTotalAmtInMachine(){
        System.out.println("amount available in machine is :"+total);
        return total;
    }

    public ArrayList<Shelf> getShelves() {
        return shelves;
    }




}
