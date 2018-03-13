package domain;

import com.company.Machine;


public class SnackMachine extends Machine {

// snacks
//    10 | 10 | 10 | 10 | 10
//    10 | 10 | 10 | 10 | 10
//    10 | 10 | 10 | 10 | 10
//    10 | 10 | 10 | 10 | 10
//    10 | 10 | 10 | 10 | 10

    int[] foodshelf1 = new int[10];
    int[] foodshelf2 = new int[10];
    int[] foodshelf3 = new int[10];
    int[] foodshelf4 = new int[10];
    int[] foodshelf5 = new int[10];

    public SnackMachine(String name, int coinCount, double moneyCount, String location, String passcode, Coin coins) {
        super(name, coinCount, moneyCount, location, passcode, coins);
    }
//    write a method to add integers in each array
//    the integer represents how many items there are in that row in the shelf

//     how can I create this constructor so that I do not have to pass a coin object when creating a new Machine?
}
