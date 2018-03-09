//package project1;
//
////        The snack machine provides candy and snacks for sale.
////        It has 5 shelves with 5 compartments on each shelf.
////        Each compartment has 10 spaces for an individual item for sale.
//
//
////import java.util.HashMap;
////import java.util.Scanner;
////import java.text.NumberFormat;
////
////public class Menu {
////
////    private static HashMap<String,Double> snackMap = new HashMap<String, Double>();
////    NumberFormat formatter = NumberFormat.getCurrencyInstance();
////
////    //constructor
////    public Menu () {
////        snackMap.put("French Fries", 3d);
////        snackMap.put("Soda Pop", 2d);
////    }
////    public void showMenu (){
////        System.out.println("Here's the snack menu!");
////        for (String snack : snackMap.keySet())
////            System.out.println(snack + "   " + formatter.format(snackMap.get(snack)));
////    }
////    public double getSnackPrice (String order){
////      /*
////      double price = snackMap.get(selection);
////      return price;
////      */
////        return snackMap.get(selection);
////    }
//
//
//public class SnackMachine implements VendingMachine {
//
//    private static String snackMachineLocation;
//
//    //variable
//    private static double spendingTotal;
//
//    //constructor
//    public SnackMachine (){
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
//    public String getSnackProduct(){
//        return product;
//    }
//
//
//}
