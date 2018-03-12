import java.util.ArrayList;
import java.util.List;

public class DrinkMachine extends VendingMachine{

    private List<Product> items = new ArrayList<Product>();
    private double coin;
    private double totalAmount;
    private Product product;
    private double selectionPrice;

    public DrinkMachine() {
        super("drink");
    }

    public void displayItems() {
        super.displayItems();
    }
    public double getSelectionPrice() {
        return selectionPrice;
    }

    public void selectItem(String item) {
        double amount = 0;
        for (Product p : items) {
            if (item.equalsIgnoreCase(p.getId())) {
                System.out.println("You Selected: " + p.getName() + ", " + p.getDescription() + ". \n" +
                        "Please insert $" + p.getRetailPrice());
                amount = p.getRetailPrice();
            }


        }
        this.selectionPrice = amount;

    }

    public void insertCoin(double coin) {
        if (coin == getSelectionPrice()){
            System.out.println("Item dispensed");
        } else {
            System.out.println("Not Enough Money");
        }

    }
    public double getTotalAmount(){
        return totalAmount;
    }

    public void dispenseItem() {
        if(getTotalAmount()== getSelectionPrice()){
            System.out.println(product.getName() + " Dispensed!");
        }else{
            System.out.println("Your money has been returned.");
        }
    }




}
