package com.company;

import java.util.Arrays;

public class SnackMachine extends VendingMachine {

    public SnackMachine(String location) {
        this.location = location;
        this.rows = 5;
        this.columns = 5;
        this.spacePerCompartment = 10;
        this.storageArray = new Product[this.rows][this.columns][this.spacePerCompartment];
    }

    @Override
    public void stockProduct(Product product, int quantity, int row, int column) {
        if (product.getProductType() == "snack") {
            super.stockProduct(product, quantity, row, column);
        } else {
            System.out.println("Invalid product type.");
        }
    }


}
