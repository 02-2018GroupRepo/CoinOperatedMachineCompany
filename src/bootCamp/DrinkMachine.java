package bootCamp;

import java.util.Queue;

public class DrinkMachine extends LittleThingsCompany {
    Queue<Product> compart;

    public DrinkMachine(String location, int numberOfVending, String typeOfVending) {
        super(location, numberOfVending, typeOfVending);
    }

    public DrinkMachine() {
    }
}
