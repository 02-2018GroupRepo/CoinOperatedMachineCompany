package com.tawnihollers;


import java.util.ArrayList;
import java.util.Iterator;

public class SnackMachine extends VendingMachines {


    public void snacksInMachine() {
        ArrayList<Product> items = new ArrayList<Product>();
        ArrayList<Product> fun = new ArrayList<Product>();

        Product gum = new Product("A1", "Gum", "Minty Gum", 0.50, 1.00, 10);
        Product recess = new Product("A2", "Recess", "Minty Gum", 1.00, 2.00, 10);
        Product butterFinger = new Product("A3", "Butter Finger", "Minty Gum", 1.00, 1.50, 10);
        Product hershy = new Product("A4", "Hershy", "Minty Gum", 2.00, 2.80, 10);
        Product random = new Product("A5", "Random", "Minty Gum", 1.00, 1.75, 10);

        //Product[] fun = {gum, recess, butterFinger, hershy, random};
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
}
