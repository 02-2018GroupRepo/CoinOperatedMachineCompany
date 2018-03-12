import java.util.ArrayList;
import java.util.List;


public class SnackMachine extends VendingMachine {
    private List<Product> items = new ArrayList<Product>();
    private double coin;
    private double totalAmount;
    private Product product;
    private double selectionPrice;


    public SnackMachine() {
        items.add(new Product("A1", "Cheetos", "Cheddar Jalapeno", .75, 1.25));
        items.add(new Product("A2", "Fritos", "Honey BBQ", .75, 1.25));
        items.add(new Product("A4", "Doritos", "Nacho Cheese", .75, 1.25));
        items.add(new Product("A5", "Chester Fries", "Flamin Hot", .75, 1.25));
        items.add(new Product("B1", "Pop Tarts", "Strawberry", 1.00, 1.50));
        items.add(new Product("B2", "Danish", "Cream Cheese", 1.00, 1.50));
        items.add(new Product("B3", "Pop Corn", "Act II", 1.00, 1.50));
        items.add(new Product("B4", "Fruit Snacks", "Kellogs", 1.00, 1.50));
        items.add(new Product("B5", "Rice Krispie Treats", "Original", 1.00, 1.50));
        items.add(new Product("C1", "Cheez It", "Cheddar Cheese", .40, .90));
        items.add(new Product("C2", "Ruffles", "BBQ", .40, .90));
        items.add(new Product("C3", "Herr's Chips", "Baby Back Rib Flavor", .40, .90));
        items.add(new Product("C4", "Bugles", "Original Flavor", .40, .90));
        items.add(new Product("C5", "Zapp's Chips", "Ranch Flavor", .40, .90));
        items.add(new Product("D1", "Nutri Grain", "Protein Bar", .25, .75));
        items.add(new Product("D2", "Crackers", "Cheese", .25, .75));
        items.add(new Product("D3", "Captain Wafers", "Grilled Cheese Flavor", .25, .75));
        items.add(new Product("D4", "Peanuts", "Planters", .25, .75));
        items.add(new Product("D5", "Oreo Cookies", "6 pack", .25, .75));
        items.add(new Product("E1", "Snickers", "Caramel & Peanuts", .75, 1.25));
        items.add(new Product("E2", "Skittles", "Rainbow", .75, 1.25));
        items.add(new Product("E3", "Plain M&M's", "Chocolate", .75, 1.25));
        items.add(new Product("E4", "Baby Ruth", "Chocolate with Nuts", .75, 1.25));
        items.add(new Product("E5", "Butterfinger", "Crunchy Peanut Butter", .75, 1.25));
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