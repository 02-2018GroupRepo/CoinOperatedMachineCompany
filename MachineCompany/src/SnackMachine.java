import java.util.ArrayList;

public class SnackMachine extends VendingMachine{
    ///need to create an ArrayList of shelves
    ///need to create method to disp[lay shelves
   private ArrayList<Shelf> shelves;
    public final static String machineType = "SnackMachine";
    public  final int spaceSize = 10;



    public SnackMachine(){
        shelves = new ArrayList<Shelf>();

    }

/*
    public double purchaseItemAndReturnChange(int shelfNumber,int compartMentNumber,Product product){
        Shelf  s1 =  shelves.get(shelfNumber);
        LinkedHashMap<Integer,ArrayList<Product>> shelf =  s1.getShelf();

        if(getTotal() >= product.getRetail_price()){
            shelf.get(compartMentNumber).remove(product);
            double change = getTotal() - product.getRetail_price();
            System.out.println("Your total is :"+getTotal());
            System.out.println("Your change is :"+change);
            //total = getTotalAmtAvailableInMachine();
           //total-=change;
            balanceOfToTotalAmtAvailableInMachine(change);
           return  change;

        }else{
            double amtLeft = product.getRetail_price() - getTotal();
            System.out.println("Insufficient amount please add more coins ");
            System.out.println("You have "+amtLeft+" to pay");
            return  getTotal();
        }
    }
*/



  /*
    public ArrayList<Shelf> getShelves() {
        return shelves;
    }
    */

    public ArrayList<Shelf> createShelves(){
        for(int i = 0; i < 5;i++){
            Shelf newShelf = new Shelf(spaceSize);
            shelves.add(newShelf);
        }
        return shelves;
    }



}
