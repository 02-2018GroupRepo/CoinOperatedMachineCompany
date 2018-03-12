package com.fileCreating;

import java.util.ArrayList;

public class LocalOperator extends VendingMachine {

    public LocalOperator(int numOfShelves, int numOfCompartments, int maxNumOfSpace) {
        super(numOfShelves, numOfCompartments, maxNumOfSpace);

        System.out.println("Int: " + inventory.length);
        intializeInventory();
        addStock();
    }

    public void intializeInventory() {
        for (int i = 0; i < getNumOfShelves(); i++) {
            for (int j = 0; j < getNumOfCompartments(); j++) {
                inventory[i][j] = new ArrayList();
            }
        }
    }

    public void addToInventory(int row, int col, Double wholesalePrice, Double retailPrice, String itemName, Integer stock, Integer id) {

        Product product = new Product(wholesalePrice, retailPrice, itemName, stock, id);
        if (inventory[row][col].size() < getNumOfMaxSpace())
            inventory[row][col].add(product);
    }

    public void addToInventory(int row, int col, int amount, Double wholesalePrice, Double retailPrice, String itemName, Integer stock, Integer id) {


        int inventoryLength = inventory[row][col].size();
        for (int i = inventoryLength; (i < amount) && (inventory[row][col].size() <= getNumOfMaxSpace()); i++) {
            Product product = new Product(wholesalePrice, retailPrice, itemName, stock, id);
            inventory[row][col].add(product);
        }
    }

    public void addStock() {

        Double wholeSale = 1.0;
        Double retail = 2.0;
        String string = "item";
        int stock = 0;
        int id;


        for (int i = 0; i < getNumOfShelves(); i++) {
            for (int j = 0; j < getNumOfCompartments(); j++) {
                string = "item";
                string += i + "" + j;
                id = Integer.parseInt("" + i + j);
                addToInventory(i, j, 7, wholeSale, retail, string, stock, id);
            }
        }
    }


    public void printInventory() {
        for (int i = 0; i < getNumOfShelves(); i++) {
            for (int j = 0; j < getNumOfCompartments(); j++) {
                System.out.print("[" + inventory[i][j].get(0).getItemName() + "]");
            }
            System.out.println();
        }
    }
}

