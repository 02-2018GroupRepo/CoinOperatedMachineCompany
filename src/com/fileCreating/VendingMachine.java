package com.fileCreating;

import java.util.ArrayList;
import java.util.Map;

public class VendingMachine extends Machine{

    private int numOfShelves;
    private int numOfCompartments;
    private int numOfMaxSpace;

    ArrayList<Product>[][] inventory;

    public VendingMachine(int numOfShelves, int numOfCompartments, int maxNumOfSpace, String location, String location_id) {
        super(location, location_id);

        this.numOfShelves = numOfShelves;
        this.numOfCompartments = numOfCompartments;
        this.numOfMaxSpace = maxNumOfSpace;

        inventory = new ArrayList[numOfShelves][numOfCompartments];

        intializeInventory();
        addStock();
    }

    public void intializeInventory() {
        for (int i = 0; i < numOfShelves; i++) {
            for (int j = 0; j < numOfCompartments; j++) {
                inventory[i][j] = new ArrayList();
            }
        }
    }

    public void addToInventory(int row, int col, Double wholesalePrice, Double retailPrice, String itemName, Integer stock, Integer id) {

        Product product = new Product(wholesalePrice, retailPrice, itemName, stock, id);
        if (inventory[row][col].size() < numOfMaxSpace)
            inventory[row][col].add(product);
    }

    public void addToInventory(int row, int col, int amount, Double wholesalePrice, Double retailPrice, String itemName, Integer stock, Integer id) {


        int inventoryLength = inventory[row][col].size();
        for (int i = inventoryLength; (i < amount) && (inventory[row][col].size() <= numOfMaxSpace); i++) {
            Product product = new Product(wholesalePrice, retailPrice, itemName, stock, id);
            inventory[row][col].add(product);
        }
    }

    public void selection(int row, int col, Coins_CurrentOrder myMoney) {
        if (inventory[row][col].size() > 0) {

            double changes = getCoin().purchased(inventory[row][col].get(0).getPrice(), myMoney);
            System.out.println("Price: " + inventory[row][col].get(0).getPrice());
            System.out.println("My money " + myMoney.getCurTotal());

            if(changes >= 0) {

                giveCustomerProduct(inventory[row][col]);
                System.out.println("Total Change is: ");
                for (Map.Entry<String, Integer> changeReturn : getCoin().returnChanges(changes).entrySet()) {
                    System.out.println(changeReturn.getValue() + " " + changeReturn.getKey() + "s");
                }
            } else {
                System.out.println("Not enough money to make purchase");
            }

        } else {
            System.out.println("Sorry Product Not Avaliable");
            myMoney.printCustomerCoinReturn();
            getCoin().returnMoney();
            myMoney.curReset();
        }
    }

    public void giveCustomerProduct(ArrayList<Product> itemRow) {
        itemRow.get(0).printThisPurchaseProduct();
        itemRow.remove(0);
    }

    public void addStock() {

        Double wholeSale = 1.0;
        Double retail = 2.0;
        String string = "item";
        int stock = 0;
        int id;


        for (int i = 0; i < numOfShelves; i++) {
            for (int j = 0; j < numOfCompartments; j++) {
                string = "item";
                string += i + "" + j;
                id = Integer.parseInt("" + i + j);
                addToInventory(i, j, 7, wholeSale, retail, string, stock, id);
            }
        }
    }


    public void printInventory() {
        for (int i = 0; i < numOfShelves; i++) {
            for (int j = 0; j < numOfCompartments; j++) {
                System.out.print("[" + inventory[i][j].get(0).getItemName() + "]");
            }
            System.out.println();
        }
    }
}
