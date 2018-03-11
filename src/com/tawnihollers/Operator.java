package com.tawnihollers;

import java.util.HashMap;

public class Operator {

    HashMap<String, Double> myMap = new HashMap<>();

    public void showTotalCashInMachine(){
        double moneyInMachine = 0.00;
        for(double f : myMap.values()){
            moneyInMachine += f;
        }
        System.out.printf("Total money in machine $%.2f\n", moneyInMachine);
    }

    public void saveHashMap(HashMap map){
        myMap = map;
    }

    public void addMachine(){

    }

    public void removeMachine(){

    }
}
