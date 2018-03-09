package com.syntel;

public class VendingProduct {

    private static int uniqueItemCount = 1;
    private int itemID;
    private String itemName;
    private String itemDescription;
    private double wholesalePrice;
    private double retailPrice;

    public VendingProduct(){};
    public VendingProduct(String itemName, String itemDescription, double retailPrice, double wholesalePrice){
        itemID = uniqueItemCount;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;

        uniqueItemCount++;
    }

    public static int getUniqueItemCount() {
        return uniqueItemCount;
    }

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }


    //    public VendingProduct(String itemName, String itemDescription, double retailPrice, double wholesalePrice){
    VendingProduct spite = new VendingProduct("Sprite", "Quench the thirst.",
            0.69, 1.00);
    VendingProduct spiteZero = new VendingProduct("Sprite Zero", "Quench the thirst.",
            0.69, 2.00);
    VendingProduct spriteRemix = new VendingProduct("Sprite Remix", "Quench the thirst.",
            0.69, 1.00);
    VendingProduct incaKola = new VendingProduct("Inca Kola", "Quench the thirst.",
            0.69, 1.00);
    VendingProduct gingerAle = new VendingProduct("Ginger Ale", "Quench the thirst.",
            0.69, 1.00);
    VendingProduct coke = new VendingProduct("Coke", "Quench the thirst.",
            0.69, 1.00);
    VendingProduct dietCoke = new VendingProduct("Diet Coke", "Quench the thirst.",
            0.69, 2.00);
    VendingProduct cokeZero = new VendingProduct("Coke Zero", "Quench the thirst.",
            0.69, 3.00);
    VendingProduct gatorade = new VendingProduct("Gatorade", "Quench the thirst.",
            0.69, 1.00);
    VendingProduct powerade = new VendingProduct("Powerade", "Quench the thirst.",
            0.69, 1.00);
    VendingProduct coffee = new VendingProduct("Coffee", "Quench the thirst.",
            0.69, 3.50);
    VendingProduct strongCoffee = new VendingProduct("Strong Coffee", "Quench the thirst.",
            0.69, 4.50);
    VendingProduct veryStrongCoffee = new VendingProduct("Very Strong Coffee", "Quench the thirst.",
            0.69, 5.50);
    VendingProduct vegetarianJuice = new VendingProduct("Vegetarian Juice", "Quench the thirst.",
            0.69, 100.00);
    VendingProduct veganJuice = new VendingProduct("Vegan Juice", "Quench the thirst.",
            0.69, 150.00);
    VendingProduct carnivoreJuice = new VendingProduct("Carnivore Juice (blood)", "Quench the thirst.",
            0.69, 1.00);
    VendingProduct programmerTears = new VendingProduct("Programmers' Tears", "Quench the thirst.",
            0.69, 0.05);
    VendingProduct water = new VendingProduct("Water", "Quench the thirst.",
            0.69, 1.00);

}

/*
Sprite
Sprite Zero
Sprite Remix
Inca Kola
Ginger Ale
Coke
Diet Coke
Coke Zero
Gatorade
Powerade
Coffee
Strong Coffee
Very Strong Coffee
Vegetarian Juice
Vegan Juice
Carnivore Juice (Blood)
Programmer's Tears
*/
