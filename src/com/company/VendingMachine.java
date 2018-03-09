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

    public String stockProduct(Product product, int quantity, int row, int column) {

        if (this.getClass().getName().contains(product.getClass().getName())) {
            //Create products
            for (int i = 0; i < quantity; i++) {
                this.storageArray[row][column][i] = product;
            }
            return "Products successfully stocked";
        } else {
            return "Invalid product type.";
        }

    }

    public Product[][][] getStorageArray() {
        return storageArray;
    }

    public int getRows() {
        return rows;
    }

    public void getInventory() {
        String currentProductName = "";
        int currentProductQty = 0;
        //forEach shelf
        for (int j = 0; j < this.getRows(); j++) {
            int i = 0;
            System.out.printf("\nShelf %d has the following items: \n", j);
            System.out.println("---------------------------------");
            //forEach column
            for (Product[] column : this.getStorageArray()[j]) {
                for (Product compartment : column) {

                    if (compartment != null) {
                        currentProductQty += 1;
                    }
                    try {
                        currentProductName = compartment.getName();
                    } catch (Exception e) {
                       // System.out.println("null");
                    }
                }
                i +=1;
                System.out.printf("Item: %s, Quantity: %d \n", currentProductName, currentProductQty);
            }
            currentProductQty = 0;

        }

    }
}
