package com.syntel;

import java.util.LinkedHashMap;
import java.util.Map;

public class VendingMachine {

    private static int machineItemCount;

    private Map <Integer, Integer> productInventoryMap = new LinkedHashMap<Integer, Integer>(); //itemID, productStock

//    public double sellItem(int itemID, Map mapInventory){
//
//        decrement item count in inventory
//        add to coin box
//        return change
//        double change = moneyTaken - wholesalePrice;
//        return change;
//    }

    public void addItem(VendingProduct item, int stock) {
        productInventoryMap.put(item.getItemID(), stock);
        machineItemCount++;
    }

    public void restockItem(VendingProduct item, VendingMachine machine, int amountToAdd) {
        //productInventoryMap.replace(item.getItemID(), VendingMachine.thisvendingmachine'splacefortheitem, amount+amounttoadd);
        // need to access items in vending machine
    }

}
