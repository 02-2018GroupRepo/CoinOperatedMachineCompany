package com.coin;

import com.helper.Helper;

public class Coin {

    private static final double NICKEL = 0.05;
    private static final double DIME = 0.10;
    private static final double QUARTER = 0.25;

    public static double getNickel() {
        return NICKEL;
    }

    public static double getDIME() {
        return DIME;
    }

    public static double getQUARTER() {
        return QUARTER;
    }

    public static int calculateChange(double change, int num_coins, double type_coins) {
        int num = 0;
        while(num_coins > 0 && change >= type_coins) {
            change = Helper.roundTwoDecimal(change - type_coins);
            num++;
            num_coins--;
        }

        if(type_coins == 0.25) {
           System.out.print("Number of Quarters: ");
        } else if(type_coins == 0.10) {
            System.out.print("Number of Dimes: ");
        } else if(type_coins == 0.05) {
            System.out.print("Number of Nickels: ");
        }
        System.out.println(num);
        return num;
    }
}
