package bootCamp;

import java.util.ArrayList;

public class SnackMachine extends LittleThingsCompany {
     private int rows;
     private int columns;
     private  int numOfSpacePerCom;
    ArrayList<Shelf> listOfRow;

    public SnackMachine() {
        String machineType ="Snack Machine";
        this.rows = 5;
        this.columns = 5;
        this.numOfSpacePerCom = 10;
        listOfRow = new ArrayList<Shelf>();
    }

    public void stockItem(){
        Shelf myShelf= new Shelf();
        for(int i=0; i<rows; i++){
            myShelf.stockItems(rows);
            listOfRow.add(i, myShelf);
        }
    }
    public void resetSnackMachine(){
     listOfRow.clear();
    }
}
