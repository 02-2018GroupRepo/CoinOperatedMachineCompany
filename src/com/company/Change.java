package com.company;

public class Change {

    private int nickels;
    private int dimes;
    private int quarters;

    public double changeInNumberOfCoin (double customerChange){
        if ( customerChange == 0){
            return 0;
        }
        else if(customerChange % 0.25 == 0){
            return customerChange/Coins.QUARTER;
        }else if ( customerChange % 0.10 == 0){
            return customerChange/Coins.DIME;
        }else {
            return customerChange/Coins.NICKEL;
        }


        }
        public String changeInNameOfCoin (double customerChange){
            if(customerChange == 0){
                return "coins";
            }
        else if(customerChange % 0.25 == 0){
                return "Quarters";
            }else if ( customerChange % 0.10 == 0){
                return "Dimes";
            }else {
                return "Nickels";
            }
    }

}
