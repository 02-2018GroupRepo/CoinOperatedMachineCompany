import java.util.ArrayList;

public class DrinkMachine extends VendingMachine {
    BottleDistributor bD;
    CanDistributor cD;
    ArrayList<Compartment> comp = new ArrayList<Compartment>();

    public DrinkMachine() {
        this.cD = new CanDistributor();
        this.bD = new BottleDistributor();
    }

}
