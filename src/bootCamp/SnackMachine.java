package bootCamp;

import java.lang.reflect.Array;
import java.util.*;

public class SnackMachine extends Machine {

    int snackRows, compartmentSize;
    ArrayList<Shelf> rowsList;

    public SnackMachine() {
        super.setType("Snack");
        super.setName("Default Snack Machine");
        snackRows = 5;
        compartmentSize = 10;
        rowsList = new ArrayList<Shelf>();
    }

    public SnackMachine(String name) {
        super.setType("Snack");
        super.setName(name);
        snackRows = 5;
        compartmentSize = 10;
        rowsList = new ArrayList<Shelf>();
    }

    public void stockAllRandom() {
        Shelf shelf = new Shelf();
        for (int i = 0; i < snackRows; i++) {
            shelf.stockAllWithRandom(snackRows);
            rowsList.add(i, shelf);
        }
    }
}