package domain;

import com.company.Machine;
import com.company.Product;

import java.util.ArrayList;

public class SnackMachine extends Machine {
    ArrayList<Product> foodshelf1 = new ArrayList<>();
    ArrayList<Product> foodshelf2 = new ArrayList<>();
    ArrayList<Product> foodshelf3 = new ArrayList<>();
    ArrayList<Product> foodshelf4 = new ArrayList<>();
    ArrayList<Product> foodshelf5 = new ArrayList<>();

    public SnackMachine(String name, int coinCount, double moneyCount, String location, String passcode, Coin coins) {
        super(name, coinCount, moneyCount, location, passcode, coins);
    }
//    write a method to add integers in each array
//    the integer represents how many items there are in that row in the shelf
}
