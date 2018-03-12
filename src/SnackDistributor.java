import java.util.ArrayList;

public class SnackDistributor {
    ArrayList<Products> snacks = new ArrayList<Products>();
    ArrayList <Compartment> inventory = new ArrayList <Compartment>();


    public SnackDistributor(){
        setSnacks();
    }


    public void setSnacks(){
        //Snack Products adding to the arraylist snacks

        snacks.add(0, new Products("Kit Kat", "Candy", "A1", .50, 1.00));
        snacks.add(1, new Products("Reese's", "Candy", "A2", .50, 1.00));
        snacks.add(2, new Products("Baby Ruth", "Candy", "A3", .50, 1.00));
        snacks.add(3, new Products("Butterfingers", "Candy", "A4", .50, 1.00));
        snacks.add(4, new Products("Skittles", "Candy", "A5", .50, 1.00));
        snacks.add(5, new Products("Twix", "Candy", "B1", .50, 1.00));
        snacks.add(6, new Products("Paydays", "Candy", "B2", .50, 1.00));
        snacks.add(7, new Products("Starburst", "Candy", "B3", .50, 1.00));
        snacks.add(8, new Products("Milky Way", "Candy", "B4", .50, 1.00));
        snacks.add(9, new Products("M & M's", "Candy", "B5", .50, 1.00));
        snacks.add(10, new Products("Nacho Cheese Doritos", "Chips", "C1", .50, 1.00));
        snacks.add(11, new Products("Spicy Nacho Doritos", "Chips", "C2", .50, 1.00));
        snacks.add(12, new Products("Cool Ranch Doritos", "Chips", "C3", .50, 1.00));
        snacks.add(13, new Products("Sour Cream & Onion Chips", "Chips", "C4", .50, 1.00));
        snacks.add(14, new Products("BBQ Chips", "Chips", "C5", .50, 1.00));
        snacks.add(15, new Products("Salt and Vinegar Chips", "Chips", "D1", .50, 1.00));
        snacks.add(16, new Products("Fritos", "Chips", "D2", .50, 1.00));
        snacks.add(17, new Products("Peanut Butter Crackers", "Crackers", "D3", .50, 1.00));
        snacks.add(18, new Products("Cheddar Cheese Crackers", "Crackers", "D4", .50, 1.00));
        snacks.add(19, new Products("Butterscotch Krimpets", "Tasty Cakes", "D5", .50, 1.00));
        snacks.add(20, new Products("Jelly Krimpets", "Tasty Cakes", "E1", .50, 1.00));
        snacks.add(21, new Products("Chocolate Cupcakes", "Tasty Cakes", "E2", .50, 1.00));
        snacks.add(22, new Products("Coffee Cakes", "Tasty Cakes", "E3", .50, 1.00));
        snacks.add(23, new Products("Kandy Cakes", "Tasty Cakes", "E4", .50, 1.00));
        snacks.add(24, new Products("Honey Roasted Peanuts", "Peanuts", "E5", .50, 1.00));
    }

    public void addCompartments() {
        int count = 0;
        //rows
        for (int j = 0; j <5; j++) {
            for (int i = 0; i <= 5; i++) {
                Products snack = (this.snacks).get(count);
                inventory.add(new Compartment(10, snack));
            }

        }

    }

    //public ArrayList<Products> getSnacks(){
    //    return this.snacks;


    //}



}
