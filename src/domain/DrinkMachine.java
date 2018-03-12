package domain;

import com.company.Machine;
import com.company.Product;

import java.util.ArrayList;

public class DrinkMachine extends Machine{
    Product[] canshelf1 = new Product[12];
    Product[] canshelf2 = new Product[12];
    Product[] canshelf3 = new Product[12];


    ArrayList<Product> bottleshelf1 = new ArrayList<>();
    ArrayList<Product> bottleshelf2 = new ArrayList<>();
    ArrayList<Product> bottleshelf3 = new ArrayList<>();

    public DrinkMachine(String name, int coinCount, double moneyCount, String location, String passcode, Coin coins) {
        super(name, coinCount, moneyCount, location, passcode, coins);
    }
//        each shelf is an array list
//    write a method to add integers in each array
////    the integer represents how many items there are in that row in the shelf
//    maybe these should be normal arrays
//








}



