import java.util.ArrayList;
import java.util.HashMap;

public class Machine {

    private HashMap<Integer, String> productAvail = new HashMap<>();
    private String mart = "DunnMart";
    private String location;
    private double earnedMoney;


    public HashMap<Integer, String> getProductList() {
        return productAvail;
    }

    public void stockShelf(ArrayList<String> shelf, String product) {
        shelf.add(product);
    }

    public void setProductAvail(Integer num, String product) {
        this.productAvail.put(num, product);
    }

    public int getItemInventory(Integer key) {
        return this.productAvail.get(key);
    }

//    public void decreaseInventory(Product product) {
//        int prevItemCount = productAvail.get(product.getName());
//        this.setProductAvail(product.getName(), prevItemCount - 1);
//    }
//
//    public void increaseInventory(Product product) {
//        int prevItemCount = productAvail.get(product.getName());
//        this.setProductAvail(product.getName(), prevItemCount + 1);
    }

    public void completePurchase(String coin) {

    }

    public void returnChange(int nickels, int dimes, int quarters) {
        //if money not enough, return coins, wallet + change
    }

    public double getTotal() {
        return ((nickels * Coins.NICKEL) +
                (dimes * Coins.DIME) +
                (quarters * Coins.QUARTER));

    }

    public String getLocation() {
        return this.location;
    }

    public String getMart() {
        return this.mart;
    }
}