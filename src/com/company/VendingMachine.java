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
    public double totalNickels;
    public double totalDimes;
    public double totalQuarters;
    public double currentCoinInputTotal;
    public double currentNickleInput;
    public double currentDimeInput;
    public double currentQuarterInput;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double acceptCoins(double coin) {
        return 0;
    }

    public int getRows() {
        return rows;
    }

    public Product[][][] getStorageArray() {
        return storageArray;
    }

    public double getCurrentCoinInputTotal() {
        return currentCoinInputTotal;
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

    public void purchaseItem(int row, int column) {
        try {
            Product product = this.getStorageArray()[row][column][0];
            if (product.getRetailPrice() <= this.currentCoinInputTotal) {
                double changeDue = this.currentCoinInputTotal > product.getRetailPrice() ? this.currentCoinInputTotal - product.getRetailPrice()
                                                                                         : 0;
                this.totalDimes += this.currentDimeInput;
                this.totalNickels += this.currentNickleInput;
                this.totalQuarters += this.currentQuarterInput;
                this.resetCompartment(this.getStorageArray()[row][column], row, column);

            } else {
                double totalRemaining = product.getRetailPrice() - this.currentCoinInputTotal;
                System.out.printf("Please insert $%.2f.", totalRemaining);
            }
        } catch (Exception e) {
            System.out.println("Invalid selection.");
        }
    }

    public void resetCompartment(Product[] compartment, int row, int column) {
        compartment[0] = null;
        int i = 0;
        Product[] updatedCompartment = new Product[compartment.length];
        for (Product product : compartment) {
            if (product != null) {
                updatedCompartment[i] = product;
            }
        }
        this.getStorageArray()[row][column] = updatedCompartment;
    }


    public void refund() {
        System.out.printf("You have received a refund of %.2f", this.currentCoinInputTotal);
        this.currentCoinInputTotal = 0;
        this.currentNickleInput = 0;
        this.currentDimeInput = 0;
        this.currentQuarterInput = 0;
    }

    public void insertCoin(String coin) {
        switch (coin.toLowerCase()) {
            case "nickel":
                this.currentCoinInputTotal += VendingMachine.NICKEL;
                this.currentNickleInput += VendingMachine.NICKEL;
                break;
            case "dime":
                this.currentCoinInputTotal += VendingMachine.DIME;
                this.currentDimeInput += VendingMachine.DIME;
                break;
            case "quarter":
                this.currentCoinInputTotal += VendingMachine.QUARTER;
                this.currentQuarterInput += VendingMachine.QUARTER;
                break;
            default:
                System.out.println("Invalid coin type.");
        }
        System.out.printf("Current amount: %.2f", this.currentCoinInputTotal);
    }

    public double getTotal() {
        double totalNickelVal = this.totalNickels * VendingMachine.NICKEL;
        double totalDimeVal = this.totalDimes * VendingMachine.NICKEL;
        double totalQuarterVal = this.totalQuarters * VendingMachine.NICKEL;
        return totalDimeVal + totalNickelVal + totalQuarterVal;
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
