package bootCamp;

import java.util.LinkedList;
import java.util.Queue;

public class DrinkMachine extends LittleThingsCompany {
    Queue<Product> compartments;
    Queue[][] canCompartment;
    Queue[][] bottleCompartment;

    public DrinkMachine(String location, int numberOfVending, String typeOfVending) {
        super(location, numberOfVending, typeOfVending);
    }

    public DrinkMachine() {
        compartments = new LinkedList<Product>();
        canCompartment = new Queue[3][6];
        bottleCompartment = new Queue[2][5];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                compartments = canCompartment[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                compartments = bottleCompartment[i][j];
            }
        }
    }
}
