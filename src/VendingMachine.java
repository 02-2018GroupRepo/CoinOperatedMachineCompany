import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private String location;
    private int numberOfMachines;
    private List<Product> items = new ArrayList<Product>();


    public VendingMachine(String s){
        if (s.equalsIgnoreCase("snack")) {
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
        }else if(s.equalsIgnoreCase("drink")){
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
    }



    public void displayItems() {
        for (Product p : items) {
            System.out.println("[ ID: " + p.getId() + " ] " +
                    "[ Name: " +p.getName() + ", " +
                    ", " + p.getDescription() + " ] " +
                    "[ Price: " + p.getRetailPrice());
        }
    }
    public void viewItemsInVendingMachine(){
        for(Product p : items) {
            System.out.println("Item ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Description: " + p.getDescription());
            System.out.println("Price: " + p.getRetailPrice() + "\n");
        }

    }
    public void addItemToMachine(Product p){
        items.add(p);
    }






    public void addLocation() {

    }












}
