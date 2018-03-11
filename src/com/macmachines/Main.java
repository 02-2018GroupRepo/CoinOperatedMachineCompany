package com.macmachines;

import java.util.ArrayList;
import java.util.HashMap;

public class Main extends Machine {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Product>> drinkProducts = createDrinkProducts();
        Drink drinkMachine1 = new Drink("MacMachines", "Atlanta", drinkProducts);
        Drink drinkMachine2 = new Drink("MacMachines", "Smyrna", drinkProducts);

        drinkMachine1.insertMoney(4, 2, 2);
        drinkMachine1.purchaseProduct("A1");

        drinkMachine2.insertMoney(4, 2, 2);
        drinkMachine2.purchaseProduct("A1");

    }

    public static HashMap<String, ArrayList<Product>> createDrinkProducts() {
        ArrayList<Product> a1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(1, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> b1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(2, "Pepsi Can", "Can of slight enjoyment", 1.00, 0.65);
            a1List.add(coke);
        }
        ArrayList<Product> c1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(3, "Orange Crush Can", "Orangey delight", 1.00, 0.70);
            a1List.add(coke);
        }
        ArrayList<Product> d1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(4, "Grape Crush Can", "Graphish delight", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> e1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(5, "Big Red Can", "Cherry soda", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> f1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(6, "Sprite Can", "Refreshing lemon-lime", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> a2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(7, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> b2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(8, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> c2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(9, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> d2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(10, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> e2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(11, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> f2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(12, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> a3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(13, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> b3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(14, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> c3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(15, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> d3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(16, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> e3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(17, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> f3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product coke = new Product(18, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }

        // Bottle soda
        ArrayList<Product> a4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(19, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> b4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(20, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> c4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(21, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> d4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(22, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> e4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(23, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> a5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(24, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> b5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(25, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> c5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(26, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> d5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(27, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }
        ArrayList<Product> e5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product coke = new Product(28, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(coke);
        }

        HashMap<String, ArrayList<Product>> products = new HashMap<>();
        products.put("A1", a1List);
        products.put("B1", b1List);
        products.put("C1", c1List);
        products.put("D1", d1List);
        products.put("E1", e1List);
        products.put("F1", f1List);
        products.put("A2", a2List);
        products.put("B2", b2List);
        products.put("C2", c2List);
        products.put("D2", d2List);
        products.put("E2", e2List);
        products.put("F2", f2List);
        products.put("A3", a3List);
        products.put("B3", b3List);
        products.put("C3", c3List);
        products.put("D3", d3List);
        products.put("E3", e3List);
        products.put("F3", f3List);
        products.put("A4", a4List);
        products.put("B4", b4List);
        products.put("C4", c4List);
        products.put("D4", d4List);
        products.put("E4", e4List);
        products.put("A5", a5List);
        products.put("B5", b5List);
        products.put("C5", c5List);
        products.put("D5", d5List);
        products.put("E5", e5List);

        return products;
    }
}
