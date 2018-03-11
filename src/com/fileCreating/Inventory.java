package com.fileCreating;

public class Inventory extends VendingMachine{

    public Inventory(int numOfShelves, int numOfCompartments, int maxNumOfSpace) {
        super(numOfShelves, numOfCompartments, maxNumOfSpace);

    }

    public void intializeInventory(){
        for(int i = 0; i < getNumOfShelves(); i++){
            for(int j = 0; j < getNumOfCompartments(); j++){
                inventory[i][j] = new Product();
            }
        }
    }

    public void addToInventory(int row, int col, int amount){
        int newInventoryLength = inventory[row][col].getStock() + amount;
        int finalAmount = newInventoryLength > getNumOfMaxSpace() ? getNumOfMaxSpace() : newInventoryLength;
        inventory[row][col].setStock(finalAmount);
    }
    public void addToInventory(int row, int col, int amount, String item){
        int newInventoryLength = inventory[row][col].getStock() + amount;
        int finalAmount = newInventoryLength > getNumOfMaxSpace() ? getNumOfMaxSpace() : newInventoryLength;
        inventory[row][col].setStock(finalAmount);
        inventory[row][col].setItemName(item);
    }


    public void printInventory(){
        for(int i = 0; i < getNumOfShelves(); i++){
            for(int j = 0; j < getNumOfCompartments(); j++){
                if(inventory[i][j].getStock() != 0) {
                    System.out.print("ITEM: " + inventory[i][j].getItemName() + " Price: " + inventory[i][j].getPrice());
                    System.out.println(" Amount in Stock: " + inventory[i][j].getStock());
                }
            }
        }
    }
}
