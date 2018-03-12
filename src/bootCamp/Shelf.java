package bootCamp;

import java.util.*;

public class Shelf {

    ArrayList<Queue> shelfList;
    Queue compartment;
    int compartmentCapacity, temp;
    Random rand = new Random();
    Set<Integer> set = new HashSet<Integer>();

    public Shelf() {
        shelfList = new ArrayList<Queue>();
        compartment = new LinkedList();
        compartmentCapacity = 10;
    }

    public void stockAllWithRandom(int shelfCapacity) {
        for (int i = 0; i < compartmentCapacity; i++) {
            temp = rand.nextInt(10000);
            while (set.contains(temp)) {
                temp = rand.nextInt(10000);
            }
            set.add(temp);
            compartment.add(new Product(temp));
        }
        for (int i = 0; i < shelfCapacity; i++) {
            shelfList.add(compartment);
        }
    }

    public void stockCompartment(int index, Queue compartment) { shelfList.add(index,compartment); }

    public ArrayList getShelf() { return shelfList; }

    public void clearShelf() { shelfList.clear(); }
}
