package com.syntel;

import java.util.LinkedHashMap;
import java.util.Map;

public class VendingMachine {

    public Map<VendingProduct, Integer> getProductInventoryMap() {
        return productInventoryMap;
    }

    private Map <VendingProduct, Integer> productInventoryMap = new LinkedHashMap<VendingProduct, Integer>(); //item, productStock

//    public double sellItem(int itemID, Map mapInventory){
//
//        decrement item count in inventory
//        add to coin box
//        return change
//        double change = moneyTaken - wholesalePrice;
//        return change;
//    }

    public void addItem(VendingProduct item, int stock) {
        productInventoryMap.put(item, stock);
    }

    public void restockItem(VendingProduct item, VendingMachine machine, int amountToAdd) {
        //TODO: productInventoryMap.replace(item.getItemID(), VendingMachine.thisvendingmachine'splacefortheitem, amount+amounttoadd);
        // need to access items in vending machine
    }

}
