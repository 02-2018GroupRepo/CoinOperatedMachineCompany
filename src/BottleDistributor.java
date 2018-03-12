import java.util.ArrayList;

public class BottleDistributor {

    ArrayList<Products> bottleDrinks = new ArrayList<Products>();

    public BottleDistributor(){
        setBottledDrink();
    }

    public void setBottledDrink(){
        //Bottled drink products
        this.bottleDrinks.add(new Products("Cool Rush Gatorade", "Gatorade", "D1", .50, 1.00));
        this.bottleDrinks.add(new Products("Glacier Gatorade", "Gatorade", "D2", .50, 1.00));
        this.bottleDrinks.add(new Products("Orange Gatorade", "Gatorade", "D3", .50, 1.00));
        this.bottleDrinks.add(new Products("Melon Gatorade", "Gatorade", "D4", .50, 1.00));
        this.bottleDrinks.add(new Products("Mucho Mango Arizona", "Juice", "D5", .50, 1.00));
        this.bottleDrinks.add(new Products("Fruit Punch Arizona", "Juice", "E1", .50, 1.00));
        this.bottleDrinks.add(new Products("Half and Half Arizona", "Juice", "E2", .50, 1.00));
        this.bottleDrinks.add(new Products("Strawberry Kiwi Mystic", "Juice", "E3", .50, 1.00));
        this.bottleDrinks.add(new Products("Minute Maid Apple Juice", "Juice", "E4", .50, 1.00));
        this.bottleDrinks.add(new Products("Water", "Water", "E5", .50, 1.00));
    }

    public ArrayList<Products> getBottledDrinks(){
        return this.bottleDrinks;
    }

}
