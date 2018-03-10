package com.tawnihollers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SnackMachine extends VendingMachines {

    Product gum = new Product("A1", "Gum", "Minty Gum", 0.50, 1.00, 10);
    Product recess = new Product("A2", "Recess", "Minty Gum", 1.00, 2.00, 10);
    Product butterFinger = new Product("A3", "Butter Finger", "Minty Gum", 1.00, 1.50, 10);
    Product hershy = new Product("A4", "Hershy", "Minty Gum", 2.00, 2.80, 10);
    Product random = new Product("A5", "Random", "Minty Gum", 1.00, 1.75, 0);

    ArrayList<Product> fun = new ArrayList<>();
    static HashMap<String, Integer> myMap = new HashMap<>();

    static{
        myMap.put("Gum", 10);
        myMap.put("Recess", 10);
        myMap.put("Butter Finger", 10);
        myMap.put("Hershy", 10);
        myMap.put("Random", 0);
    }

    public void snacksInMachine() {
        ArrayList<Product> items = new ArrayList<Product>();
        //ArrayList<Product> fun = new ArrayList<Product>();

//        Product gum = new Product("A1", "Gum", "Minty Gum", 0.50, 1.00, 10);
//        Product recess = new Product("A2", "Recess", "Minty Gum", 1.00, 2.00, 10);
//        Product butterFinger = new Product("A3", "Butter Finger", "Minty Gum", 1.00, 1.50, 10);
//        Product hershy = new Product("A4", "Hershy", "Minty Gum", 2.00, 2.80, 10);
//        Product random = new Product("A5", "Random", "Minty Gum", 1.00, 1.75, 0);

        fun.add(gum);
        fun.add(recess);
        fun.add(butterFinger);
        fun.add(hershy);
        fun.add(random);

        Iterator itr = fun.iterator();
        while(itr.hasNext()) {
            Object x = itr.next();
            System.out.println(x);
        }

    }

    public void takeMoneyAndChangeQty(double moneyGiven, String name){

        //fun.
            //name.decreaseStock();
            //System.out.println(name.getQty());
            //System.out.println("Enjoy your snack");
    }


    //Enter the hashmap to change the quantity
    //Find a way to change the qty of the Product by the hashmap qty
    //or find a way to make it search the hashmap before showing the menu

}
