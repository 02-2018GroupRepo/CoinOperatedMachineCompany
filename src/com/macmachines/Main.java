package com.macmachines;

import java.util.ArrayList;
import java.util.HashMap;

public class Main extends Machine {

    public static void main(String[] args) {
        ArrayList<Product> a1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(1, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        HashMap<String, ArrayList<Product>> products = new HashMap<>();
        products.put("A1", a1List);



        Drink drinkMachine1 = new Drink("MacMachines", "Atlanta", products);
        Drink drinkMachine2 = new Drink("MacMachines", "Smyrna", products);

        drinkMachine1.insertMoney(4, 2, 2);
        drinkMachine1.purchaseProduct("A1");

        drinkMachine2.insertMoney(4, 2, 2);
        drinkMachine2.purchaseProduct("A1");

    }
}
