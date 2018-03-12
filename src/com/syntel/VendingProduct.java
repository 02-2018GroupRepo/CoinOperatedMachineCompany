package com.syntel;

public class VendingProduct {

    private static int uniqueItemCount = 1; //uniqueItemCount allows products to have unique item IDs
    private int itemID;
    private String itemName;
    private String itemDescription;
    private double wholesalePrice;
    private double retailPrice;
    private boolean isCanned;

    public boolean getIsCanned() {
        return isCanned;
    }

    public boolean getIsBottled() {
        return isBottled;
    }

    private boolean isBottled;

    public VendingProduct(){};
    public VendingProduct(String itemName, String itemDescription, double retailPrice, double wholesalePrice,
                          boolean isBottled, boolean isCanned){
        itemID = uniqueItemCount;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.isBottled = isBottled;
        this.isCanned = isCanned;

        uniqueItemCount++;
    }

    public VendingProduct getProduct(VendingProduct product) {
        return this;
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
