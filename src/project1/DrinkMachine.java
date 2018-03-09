//package project1;
////        The drink machine provides bottle and canned drinks for sale.
////        There are 3 shelves with 6 compartments on each shelf with 12 individual spaces for canned drinks.
////        There are 2 shelves with 5 compartments on each shelf with 8 individual spaces for bottled drinks.
//
//
////import java.util.HashMap;
////import java.util.Scanner;
////import java.text.NumberFormat;
////
////public class Menu {
////
////    private static HashMap<String,Double> drinkMap = new HashMap<String, Double>();
////
////    NumberFormat formatter = NumberFormat.getCurrencyInstance();
////
////    //constructor
////    public Menu () {
////
////        drinkMap.put("French Fries", 3d);
////        drinkMap.put("Soda Pop", 2d);
////
////    }
////    public void showMenu (){
////        System.out.println("Here's the Drink Menu!");
////        for (String drink : drinkMap.keySet())
////            System.out.println(drink + "   " + formatter.format(drinkMap.get(drink)));
////    }
////
////
////    public double getDrinkPrice (String selection){
////      /*
////      double price = drinkMap.get(selection);
////      return price;
////      */
////        return drinkMap.get(selection);
////    }
//
//
//public class DrinkMachine implements VendingMachine {
//
//    private static String drinkMachineLocation;
//
//    //variable
//    private static double spendingTotal;
//
//    //constructor
//    public DrinkMachine (){
//        spendingTotal = 0d;
//    }
//
//    //method
//    public double payCoinsToMachine() {
//        return spendingTotal;
//    }
//
//    //method
//    public double getCoinsPaid(double amount){
//        return (amount - this.getCoinsPaid(amount));
//    }
//
//    public String getDrinkProduct(){
//        return product;
//    }
//
//}
