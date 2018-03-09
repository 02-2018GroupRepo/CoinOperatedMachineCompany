package com.fileCreating;

import java.util.ArrayList;

public class SnackMachine extends VendingMachine{

    private final int SHELVES = 5;
    private final int COMPARTMENTS = 5;
    ArrayList[][] inventory = new ArrayList[SHELVES][COMPARTMENTS];
    private final int MAX_SPACES = 10;

    public void intializeInventory(){
        for(int i = 0; i < SHELVES; i++){
            for(int j = 0; j < COMPARTMENTS; j++){
                inventory[i][j] = new ArrayList();
            }
        }
    }

    public void addToInventory(int row, int col, String item){
        inventory[row][col].add(item);
    }


    @Override
    public void selection() {

    }
}
