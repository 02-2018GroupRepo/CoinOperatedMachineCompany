package com.ML;

public class Coin {

    String cName;
    double value;


    public Coin (double value){

       // this.cName=cName;
        this.value=value;

    }


    public static void main(String[] args) {
        Coin quarter = new Coin(.25);
        Coin dime = new Coin(.10);
        Coin nickel = new Coin(.05);
        System.out.println(quarter.value+dime.value);

    }

//
//   double  quarter = new double (0.25);
//
//    };
//    static double Coin dime = .10;

//Coin total = quarter.value.add(dime.value);

}
