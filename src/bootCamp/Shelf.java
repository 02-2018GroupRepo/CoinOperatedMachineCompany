package bootCamp;

import java.util.*;

public class Shelf {
    Queue compartment;
    ArrayList<Queue> shelf;  //queue of compartment
    int compartmentSize;
    Set<Integer> setShelf =new HashSet<>();

    public Shelf() {
        this.shelf = new ArrayList<>();
        this.compartment = new LinkedList();
        this.compartmentSize = 10;
        this.setShelf = setShelf;
    }
    public ArrayList<Queue> getShelf() {
        return shelf;
    }
    public void clearShelf(){
        shelf.clear();
    }

    public void stockItems(int shelfsize ){
        for(int i=0; i<shelfsize; i++){
            for(int j = 0 ; j < compartmentSize; j++){
                this.compartment.add(shelfsize);
            }
        }
    }
    public void getCompartment(int index, Queue compartment){
        shelf.add(index,compartment);

    }

}
