package com.fileCreating;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class SnackMachine extends VendingMachine{

    private final int SHELVES = 5;
    private final int COMPARTMENTS = 5;
    private final int MAX_SPACES = 10;

    // n x m array that holds Product Classes
    Product[][] inventory = new Product[SHELVES][COMPARTMENTS];


    public void setItem(int row, int col, String itemName){
        inventory[row][col].setItemName(itemName);
    }
    public void setItem(int row, int col, Double price){
        inventory[row][col].setPrice(price);
    }
    public void setItem(int row, int col, String itemName, Double price){
        inventory[row][col].setPrice(price);
        inventory[row][col].setItemName(itemName);
    }

    public void intializeInventory(){
        for(int i = 0; i < SHELVES; i++){
            for(int j = 0; j < COMPARTMENTS; j++){
                inventory[i][j] = new Product();
            }
        }
    }

    public void addToInventory(int row, int col, int amount){
        int newInventoryLength = inventory[row][col].getStock() + amount;
        int finalAmount = newInventoryLength > MAX_SPACES ? MAX_SPACES : newInventoryLength;
        inventory[row][col].setStock(finalAmount);
    }

    public void addToInventory(int row, int col, int amount, String item){
        int newInventoryLength = inventory[row][col].getStock() + amount;
        int finalAmount = newInventoryLength > MAX_SPACES ? MAX_SPACES : newInventoryLength;
        inventory[row][col].setStock(finalAmount);
        inventory[row][col].setItemName(item);
    }


    @Override
    public void selection(int row, int col) {

    }

    public void printInventory(){
        for(int i = 0; i < SHELVES; i++){
            for(int j = 0; j < COMPARTMENTS; j++){
                if(inventory[i][j].getStock() != 0) {
                    System.out.print("ITEM: " + inventory[i][j].getItemName() + " Price: " + inventory[i][j].getPrice());
                    System.out.println(" Amount in Stock: " + inventory[i][j].getStock());
                }
            }
        }
    }
}
