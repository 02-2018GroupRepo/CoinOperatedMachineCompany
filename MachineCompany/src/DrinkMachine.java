import java.util.ArrayList;

public class DrinkMachine extends VendingMachine {
    private ArrayList<Shelf> shelves;
    public final static String machineType = "DrinkMachine";
    public  final int spaceSizeForCannedDrinks = 12;
    public final int spaceSizeForBottledDrinks = 8;



    public DrinkMachine(){
        shelves = new ArrayList<Shelf>();

    }



    public ArrayList<Shelf> createShelves(){
        for(int i = 0; i < 5;i++){
            if(i >= 2){
                Shelf bottleShelf = new Shelf(spaceSizeForBottledDrinks);
                shelves.add(bottleShelf);
            }
            else {
                Shelf canShelf = new Shelf(spaceSizeForCannedDrinks);
                shelves.add(canShelf);
            }

        }
        return shelves;
    }
}
