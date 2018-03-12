package com.macmachines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main extends Machine {

    public static void main(String[] args) {
        Operator sam = new Operator();

        HashMap<String, ArrayList<Product>> drinkProducts = createDrinkProducts();
        HashMap<String, ArrayList<Product>> snackProducts = createSnackProducts();
        Drink drinkMachine1 = new Drink("MacMachines", "Bleep", drinkProducts);
        Drink drinkMachine2 = new Drink("MacMachines", "Bloop", drinkProducts);
        Drink snackMachine1 = new Drink("MacMachines", "Whirr", snackProducts);
        Drink snackMachine2 = new Drink("MacMachines", "Zoom", snackProducts);
        Location atlanta = new Location("Atlanta");
        Location smyrna = new Location("Smyrna");
        atlanta.addMachine(sam, drinkMachine1);
        atlanta.addMachine(sam, snackMachine1);
        smyrna.addMachine(sam, drinkMachine2);
        smyrna.addMachine(sam, snackMachine2);

        drinkMachine1.insertMoney(4, 2, 2);
        drinkMachine1.purchaseProduct("A1");
//        drinkMachine1.getProduct("B1");
        drinkMachine1.getMachineMoney();
//        drinkMachine1.insertMoney(3, 2, 1);
//        drinkMachine1.purchaseProduct("A1");
//        drinkMachine1.getMachineMoney();
//
//        drinkMachine2.insertMoney(4, 2, 2);
//        drinkMachine2.purchaseProduct("B1");
//
//        drinkMachine1.getAllMachineMoney();
//        atlanta.getAllMachineMoney(sam);

//        System.out.println("Are you an operator or a customer?");
//        Scanner console = new Scanner(System.in);
//        String user = console.next();
//        if (user.equalsIgnoreCase("customer")) {
//
//            boolean customerDone = true;
//            do {
//                System.out.println("Which action would you like to perform? \n" +
//                        "1 Product information \n" +
//                        "2 Purchase item");
//                int action = console.nextInt();
//                switch (action) {
//                    case 1:
//                        System.out.println("Please input compartment for item information. ex.A1");
//                        String compartment = console.next();
//
//                    case 2:
//                }
//            } while (customerDone);
//
//        } else if (user.equalsIgnoreCase("operator")) {
//
//        } else {
//            System.out.println("Not valid user type.  Please try again.");
//        }
    }

    public static HashMap<String, ArrayList<Product>> createDrinkProducts() {
        ArrayList<Product> a1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(1, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a1List.add(product);
        }
        ArrayList<Product> b1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(2, "Pepsi Can", "Can of slight enjoyment", 1.00, 0.65);
            b1List.add(product);
        }
        ArrayList<Product> c1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(3, "Orange Crush Can", "Orangey delight", 1.00, 0.70);
            c1List.add(product);
        }
        ArrayList<Product> d1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(4, "Grape Crush Can", "Graphish delight", 1.00, 0.75);
            d1List.add(product);
        }
        ArrayList<Product> e1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(5, "Big Red Can", "Cherry soda", 1.00, 0.75);
            e1List.add(product);
        }
        ArrayList<Product> f1List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(6, "Sprite Can", "Refreshing lemon-lime", 1.00, 0.75);
            f1List.add(product);
        }
        ArrayList<Product> a2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(7, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a2List.add(product);
        }
        ArrayList<Product> b2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(8, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            b2List.add(product);
        }
        ArrayList<Product> c2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(9, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            c2List.add(product);
        }
        ArrayList<Product> d2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(10, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            d2List.add(product);
        }
        ArrayList<Product> e2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(11, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            e2List.add(product);
        }
        ArrayList<Product> f2List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(12, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            f2List.add(product);
        }
        ArrayList<Product> a3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(13, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            a3List.add(product);
        }
        ArrayList<Product> b3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(14, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            b3List.add(product);
        }
        ArrayList<Product> c3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(15, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            c3List.add(product);
        }
        ArrayList<Product> d3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(16, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            d3List.add(product);
        }
        ArrayList<Product> e3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(17, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            e3List.add(product);
        }
        ArrayList<Product> f3List = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            Product product = new Product(18, "Coke Can", "Can of enjoyment", 1.00, 0.75);
            f3List.add(product);
        }

        // Bottle soda
        ArrayList<Product> a4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(19, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            a4List.add(product);
        }
        ArrayList<Product> b4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(20, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            b4List.add(product);
        }
        ArrayList<Product> c4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(21, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            c4List.add(product);
        }
        ArrayList<Product> d4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(22, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            d4List.add(product);
        }
        ArrayList<Product> e4List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(23, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            e4List.add(product);
        }
        ArrayList<Product> a5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(24, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            a5List.add(product);
        }
        ArrayList<Product> b5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(25, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            b5List.add(product);
        }
        ArrayList<Product> c5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(26, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            c5List.add(product);
        }
        ArrayList<Product> d5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(27, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            d5List.add(product);
        }
        ArrayList<Product> e5List = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            Product product = new Product(28, "Coke Bottle", "Can of enjoyment", 1.00, 0.75);
            e5List.add(product);
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

    public static HashMap<String, ArrayList<Product>> createSnackProducts() {
        ArrayList<Product> a1List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(29, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            a1List.add(product);
        }
        ArrayList<Product> b1List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(30, "Goldfish", "Fish shape crackers", 1.00, 0.65);
            b1List.add(product);
        }
        ArrayList<Product> c1List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(31, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            c1List.add(product);
        }
        ArrayList<Product> d1List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(32, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            d1List.add(product);
        }
        ArrayList<Product> e1List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(33, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            e1List.add(product);
        }
        ArrayList<Product> a2List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(34, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            a2List.add(product);
        }
        ArrayList<Product> b2List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(35, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            b2List.add(product);
        }
        ArrayList<Product> c2List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(36, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            c2List.add(product);
        }
        ArrayList<Product> d2List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(37, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            d2List.add(product);
        }
        ArrayList<Product> e2List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(38, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            e2List.add(product);
        }

        ArrayList<Product> a3List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(39, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            a3List.add(product);
        }
        ArrayList<Product> b3List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(40, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            b3List.add(product);
        }
        ArrayList<Product> c3List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(41, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            c3List.add(product);
        }
        ArrayList<Product> d3List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(42, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            d3List.add(product);
        }
        ArrayList<Product> e3List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(43, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            e3List.add(product);
        }
        ArrayList<Product> a4List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(44, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            a4List.add(product);
        }
        ArrayList<Product> b4List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(45, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            b4List.add(product);
        }
        ArrayList<Product> c4List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(46, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            c4List.add(product);
        }
        ArrayList<Product> d4List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(47, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            d4List.add(product);
        }
        ArrayList<Product> e4List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(48, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            e4List.add(product);
        }
        ArrayList<Product> a5List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(49, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            a5List.add(product);
        }
        ArrayList<Product> b5List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(50, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            b5List.add(product);
        }
        ArrayList<Product> c5List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(51, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            c5List.add(product);
        }
        ArrayList<Product> d5List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(52, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            d5List.add(product);
        }
        ArrayList<Product> e5List = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            Product product = new Product(53, "Cheese Its", "Square cheese cracker", 1.00, 0.75);
            e5List.add(product);
        }

        HashMap<String, ArrayList<Product>> products = new HashMap<>();
        products.put("A1", a1List);
        products.put("B1", b1List);
        products.put("C1", c1List);
        products.put("D1", d1List);
        products.put("E1", e1List);
        products.put("A2", a2List);
        products.put("B2", b2List);
        products.put("C2", c2List);
        products.put("D2", d2List);
        products.put("E2", e2List);
        products.put("A3", a3List);
        products.put("B3", b3List);
        products.put("C3", c3List);
        products.put("D3", d3List);
        products.put("E3", e3List);
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
