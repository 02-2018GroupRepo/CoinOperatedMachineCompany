package com.fileCreating;

import java.util.ArrayList;

public class DrinkMachine extends VendingMachine {
    private final int SHELVES = 3;
    private final int COMPARTMENTS = 6;
    ArrayList[][] inventory = new ArrayList[SHELVES][COMPARTMENTS];
    private final int MAX_SPACES = 12;


    public void intializeInventory(){
        for(int i = 0; i < SHELVES; i++){
            for(int j = 0; j < COMPARTMENTS; j++){
                inventory[i][j] = new ArrayList();
            }
        }
    }

    public void addToInventory(int row, int col, int amount, String item){
        int inventoryLength = inventory[row][col].size();
        for(int i = inventoryLength; (i < amount) && (inventory[row][col].size() <= MAX_SPACES); i++){
            inventory[row][col].add(item);
        }
    }


    @Override
    public void selection(int shelf, int compartment) {

    }

    public void printInventory(){
        System.out.println(inventory[0][0].size());
        for(int i = 0; i < SHELVES; i++){
            for(int j = 0; j < COMPARTMENTS; j++){
                for(Object str : inventory[i][j]){
                    System.out.print(str + " - ");
                }
            }
        }
    }
}
