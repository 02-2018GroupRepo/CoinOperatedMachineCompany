package com.company;
import java.util.*;


public class VendingMachine {

    Map<Products, Integer> vendingStock = new HashMap<>();

    //starting amount of coins for vending machines
    int sNickels = 20;
    int sDimes = 20;
    int sQuarters = 20;

    public void showProducts(){
        ArrayList<String> showMe = new ArrayList<>();

        for(Map.Entry<Products, Integer> entry : vendingStock.entrySet()){
            showMe.add(entry.getKey().getId() + " " + entry.getKey().getName() + " $" + entry.getKey().getRetail_price());
        }

        Collections.sort((showMe));

        for(String i : showMe){
            System.out.println(i);
        }
    }


}
