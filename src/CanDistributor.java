import java.util.ArrayList;

public class CanDistributor {

    ArrayList<Products> canDrinks = new ArrayList<Products>();

    public CanDistributor(){
        setCannedDrink();
    }


    public void setCannedDrink(){
        //Canned drink products
        this.canDrinks.add(new Products("Lemonade", "Juice", "A1", .50, 1.00));
        this.canDrinks.add(new Products("Coke", "Soda", "A2", .50, 1.00));
        this.canDrinks.add(new Products("Root Beer", "Soda", "A3", .50, 1.00));
        this.canDrinks.add(new Products("Pepsi", "Soda", "A4", .50, 1.00));
        this.canDrinks.add(new Products("Orange Fanta", "Soda", "A5", .50, 1.00));
        this.canDrinks.add(new Products("Strawberry Fanta", "Soda", "A6", .50, 1.00));
        this.canDrinks.add(new Products("Raspberry Fanta", "Soda", "B1", .50, 1.00));
        this.canDrinks.add(new Products("Mango Fanta", "Soda", "B2", .50, 1.00));
        this.canDrinks.add(new Products("Brisk Ice Tea", "Juice", "B3", .50, 1.00));
        this.canDrinks.add(new Products("Brisk Raspberry Tea", "Juice", "B4", .50, 1.00));
        this.canDrinks.add(new Products("Chocolate Yoo-hoo", "Milk", "B5", .50, 1.00));
        this.canDrinks.add(new Products("Dr. Pepper", "Soda", "B6", .50, 1.00));
        this.canDrinks.add(new Products("Sprite", "Juice", "C1", .50, 1.00));
        this.canDrinks.add(new Products("Dr. Sprite", "Soda", "C2", .50, 1.00));
        this.canDrinks.add(new Products("Hawaiian Fruit Punch", "Juice", "C3", .50, 1.00));
        this.canDrinks.add(new Products("Mountain Dew", "Soda", "C4", .50, 1.00));
        this.canDrinks.add(new Products("Cream Soda", "Soda", "C5", .50, 1.00));
        this.canDrinks.add(new Products("Birch Beer", "Soda", "C6", .50, 1.00));
    }


    public ArrayList<Products> getCanDrinks(){
        return this.canDrinks;
    }
}
