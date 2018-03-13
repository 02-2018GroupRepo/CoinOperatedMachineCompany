package domain;

import com.company.Machine;


public class DrinkMachine extends Machine{
    public DrinkMachine(String name, int coinCount, double moneyCount, String location, String passcode, Coin coins) {
        super(name, coinCount, moneyCount, location, passcode, coins);
    }

//    how can I create this constructor so that I do not have to pass a coin object when creating a new Machine?

    //        each shelf is an array list
    ////    the integer represents how many items there are in that row in the shelf

//drinks
//    cans
    //    12 | 12 | 12 | 12 |12 | 12
    //    12 | 12 | 12 | 12 |12 | 12
    //    12 | 12 | 12 | 12 |12 | 12
//    bottles
//        8 | 8 | 8 | 8 | 8
//        8 | 8 | 8 | 8 | 8
//    write a method to add integers in each array

    int[] canshelf1 = new int[12];
    int[] canshelf2 = new int[12];
    int[] canshelf3 = new int[12];
    int[] bottleshelf1 = new int[8];
    int[] bottleshelf2 = new int[8];











}



