import java.util.ArrayList;
import java.util.List;

public class DrinkMachine extends VendingMachine{

    private List<Product> items = new ArrayList<Product>();
    private double coin;
    private double totalAmount;
    private Product product;
    private double selectionPrice;

    public DrinkMachine() {
        items.add(new Product("A1", "Coke", "Can", .25, .75));
        items.add(new Product("A2", "Diet Coke", "Can", .25, .75));
        items.add(new Product("A3", "Dr.Pepper", "Can", .25, .75));
        items.add(new Product("A4", "Diet Dr. Pepper", "Can", .25, .75));
        items.add(new Product("A5", "Sprite", "Can", .25, .75));
        items.add(new Product("A6", "Diet Sprite", "Can", .25, .75));
        items.add(new Product("B1", "Red Bull", "Can", .25, .75));
        items.add(new Product("B2", "Monster", "Can", .25, .75));
        items.add(new Product("B3", "Mountain Dew", "Can", .25, .75));
        items.add(new Product("B4", "Pepsi", "Can", .25, .75));
        items.add(new Product("B5", "Diet Pepsi", "Can", 25, .75));
        items.add(new Product("B6", "Coke Zero", "Can", 25, .75));
        items.add(new Product("C1", "RC Cola", "Can", 25, .75));
        items.add(new Product("C2", "Big Red", "Can", 25, .75));
        items.add(new Product("C3", "Sunkist Orange", "Can", 25, .75));
        items.add(new Product("C4", "Sierra Mist", "Can", 25, .75));
        items.add(new Product("C5", "Tab", "Can", 25, .75));
        items.add(new Product("C6", "Cherry Coke", "Can", 25, .75));
        items.add(new Product("D1", "Water", "Bottle", .50, 1.00));
        items.add(new Product("D2", "Minute Maid Apple Juice", "Bottle", .50, 1.00));
        items.add(new Product("D3", "Minute Maid Orange Juice", "Bottle", .50, 1.00));
        items.add(new Product("D4", "Coke", "Bottle", .50, 1.00));
        items.add(new Product("D5", "Diet Coke", "Bottle", .50, 1.00));
        items.add(new Product("E1", "Dr. Pepper", "Bottle", .50, 1.00));
        items.add(new Product("E2", "Diet Dr. Pepper", "Bottle", .50, 1.00));
        items.add(new Product("E3", "Sprite", "Bottle", .50, 1.00));
        items.add(new Product("E4", "Diet Sprite", "Bottle", .50, 1.00));
        items.add(new Product("E5", "Mountain Dew", "Bottle", .50, 1.00));
    }

    public void displayItems() {
        for (Product p : items) {
            System.out.println("[ ID: " + p.getId() + " ] " +
                               "[ Name: " +p.getName() + ", " +
                               ", " + p.getDescription() + " ] " +
                               "[ Price: " + p.getRetailPrice());
        }
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
