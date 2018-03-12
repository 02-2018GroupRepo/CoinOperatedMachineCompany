package bootCamp;

import java.util.ArrayList;
import java.util.Map;

public class Shelf {


    int compartment;
    int numOfSpaces;
    Map<Integer, ArrayList<Product>> shelfMap;

    public Shelf(int compartment, int numOfSpaces, Map<Integer, ArrayList<Product>> shelfMap) {
        this.compartment = compartment;
        this.numOfSpaces = numOfSpaces;
        this.shelfMap = shelfMap;
    }

    public Map<Integer, ArrayList<Product>> getShelfMap() {
        return shelfMap;
    }

    public void setShelfMap(Map<Integer, ArrayList<Product>> shelfMap) {
        this.shelfMap = shelfMap;
    }

    public int getCompartment() {
        return compartment;
    }

    public void setCompartment(int compartment) {
        this.compartment = compartment;
    }

    public int getNumOfSpaces() {
        return numOfSpaces;
    }

    public void setNumOfSpaces(int numOfSpaces) {
        this.numOfSpaces = numOfSpaces;
    }

    public  void createShelf(int compartment){
        for(int i=0; i<compartment; i++){
            ArrayList<Product> productArrayList= new ArrayList<>();
            shelfMap.put(i,productArrayList);
        }
    }
//    public void checkInventory(int compartment, Product product){
//        if(compartment==0){
//            System.out.println(shelfMap.get(compartment).add(product));
//        }
//
//    }
    //public void viewInventory()
}
