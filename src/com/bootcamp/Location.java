import java.util.ArrayList;

public class Location {

    String name;

    public Location(String name) {
        this.name = name;
    }

    public ArrayList<VendingMachines> vendArray;

    public Location(ArrayList<VendingMachines> vendArray){
        this.vendArray = vendArray;

    }

    public ArrayList<VendingMachines> getVendArray() {
        return vendArray;
    }


    public AddMachine(){

    }

    public RemoveMachine() {}

}
