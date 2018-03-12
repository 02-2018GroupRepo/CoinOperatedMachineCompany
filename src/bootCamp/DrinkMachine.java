package bootCamp;

import java.util.LinkedList;
import java.util.Queue;

public class DrinkMachine extends Machine {

    Queue[][] unitCans;
    Queue[][] unitBottles;
    Queue<Product> compartment;

    public DrinkMachine() {

        unitCans = new Queue[3][6];
        unitBottles = new Queue[2][5];
        compartment = new LinkedList<Product>();

        //3 shelves, 6 compartments per shelf, 12 spaces for cans
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                unitCans[i][j] = compartment;
            }
        }

        //2 shelves, 5 compartments on each shelf, 8 spaces per shelf for bottles
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                unitBottles[i][j] = compartment;
            }
        }
    }

    public DrinkMachine(String name) {
        super.setName(name);
        unitCans = new Queue[3][6];
        unitBottles = new Queue[2][5];
        compartment = new LinkedList<Product>();

        //3 shelves, 6 compartments per shelf, 12 spaces for cans
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                unitCans[i][j] = compartment;
            }
        }

        //2 shelves, 5 compartments on each shelf, 8 spaces per shelf for bottles
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                unitBottles[i][j] = compartment;
            }
        }
    }

    public void showStock() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println((char)(i+65) + j + ": " + unitCans[i][j].peek().toString());
            }
        }

        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.println((char)(k+68) + l + ": " + unitBottles[k][l].peek().toString());
            }
        }
    }

    public void vend(String selection) {
        Product product = new Product();
        if ((int)selection.charAt(0) < 68) {
            product = (Product)unitCans[super.int2Ascii(selection.charAt(0))][(int)selection.charAt(1)].peek();
            if (product.getRetailPrice() <= getCustomerCash()) {
                unitCans[(int)selection.charAt(0)-65][(int)selection.charAt(1)].remove();
            }
            else
                System.out.println("Insufficent funds.");
        }
        if ((int)selection.charAt(0) >= 68) {
            product = (Product) unitBottles[int2Ascii(selection.charAt(0))][(int)selection.charAt(1)].peek();
            if (product.getRetailPrice() <= getCustomerCash()) {
                unitBottles[ascii2Int(selection.charAt(0))-3][(int) selection.charAt(1)].remove();
            }
            else
                System.out.println("Insufficent funds.");
        }
    }
}