package com.company;

public abstract class VendingMachine {

    public static final double NICKEL = 0.05;
    public static final double DIME = 0.10;
    public static final double QUARTER = 0.25;

    public int rows;
    public int columns;
    public int spacePerCompartment;
    public Product[][][] storageArray;
    public String location;
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double acceptCoins(double coin) {
        return 0;
    }

    public void stockProduct(Product product, int quantity, int row, int column) {
        //Create products
        for (int i=0; i < quantity; i++) {
            this.storageArray[row][column][i] = product;
        }
    }
}
