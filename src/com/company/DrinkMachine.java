package com.company;

import java.util.HashMap;
import java.util.Map;

public class DrinkMachine extends Machine{

    public DrinkMachine(){}

    public DrinkMachine (String location, int nickels, int dimes, int quarters){
        super(location, nickels, dimes, quarters);
    }

    private Map<String, HashMap<Product, Integer>> drinkHashMap = new HashMap<>();
    private Map<Product, Integer> drinkQuantityMap = new HashMap<>();

    //Cans
    Product sprite = new Product (1,"Sprite", "sugar filled", 1.00, 2.00);
    Product coke = new Product (2,"Coke", "sugar filled", 1.00, 2.00);
    Product dietCoke = new Product (3, "Diet Coke", "sugar filled", 1.00, 2.00);
    Product pepsi = new Product (4, "Pepsi", "sugar filled", 1.00, 2.00);
    Product cherryCoke = new Product (5, "Cherry Coke", "sugar filled", 1.00, 2.00);
    Product la_Croix = new Product (6, "La Croix", "sugar filled", 1.00, 2.00);

    //Bottles
    Product water = new Product (7, "Water", "healthy", 0.50, 1.50);
    Product blueGatorade = new Product ( 8, "Blue Gatorade", "moderately healthy", 0.75, 1.75);
    Product orangeGatorade = new Product ( 9, "Orange Gatorade", "moderately healthy", 0.75, 1.75);
    Product vitaminWater = new Product (10, "Vitamin Water", "healthy", 0.50, 1.50);



}
