package com.company;



public class SnackMachine extends VendingMachine{

    public SnackMachine(){



        Products snickers = new Products("snickers", 1, "snack",.20, .50 );
        Products twix = new Products("twix", 2, "snack",.20, .50 );
        Products doritos = new Products("doritos", 3, "snack",.20, .50 );
        Products lays = new Products("lays", 4, "snack",.20, .50 );
        Products pretzels = new Products("pretzels", 5, "snack",.20, .50 );
        Products protein_bar = new Products("protein_bar", 6, "snack",.25, .60 );
        Products energy_bar = new Products("energy_bar", 7, "snack",.25, .60 );
        Products mixed_nuts = new Products("mixed_nuts", 8, "snack",.25, .60 );
        Products almonds = new Products("almonds", 9, "snack",.25, .60 );
        Products apple = new Products("apple", 10, "snack",.25, .60 );
        Products banana = new Products("banana", 11, "snack",.25, .60 );
        Products grapes = new Products("grapes", 12, "snack",.25, .60 );
        Products salami = new Products("salami", 13, "snack",.40, .75 );
        Products ham = new Products("ham", 14, "snack",.40, .75 );
        Products pepperoni = new Products("pepperoni", 15, "snack",.40, .75 );
        Products cheese_stick = new Products("cheese_stick", 16, "snack",.40, .75 );
        Products fries = new Products("fries", 17, "snack",.40, .75 );
        Products yogurt = new Products("yogurt", 18, "snack",.40, .75 );
        Products popcorn = new Products("popcorn", 19, "snack",.40, .75 );
        Products carrots = new Products("carrots", 20, "snack",.40, .75 );
        Products jerky = new Products("jerky", 21, "snack",.40, .75 );
        Products sunflower_seeds = new Products("sunflower_seeds", 22, "snack",.40, .75 );
        Products hot_dog = new Products("hot_dog", 23, "snack",.60, .80 );
        Products hamburger = new Products("hamburger", 24, "snack",.60, .80 );
        Products pizza = new Products("pizza", 25, "snack",.60, .80 );


        vendingStock.put(snickers, 10);
        vendingStock.put(twix, 10);
        vendingStock.put(doritos, 10);
        vendingStock.put(lays, 10);
        vendingStock.put(pretzels, 10);
        vendingStock.put(protein_bar, 10);
        vendingStock.put(energy_bar, 10);
        vendingStock.put(mixed_nuts, 10);
        vendingStock.put(almonds, 10);
        vendingStock.put(apple, 10);
        vendingStock.put(banana, 10);
        vendingStock.put(grapes, 10);
        vendingStock.put(salami, 10);
        vendingStock.put(ham, 10);
        vendingStock.put(pepperoni, 10);
        vendingStock.put(cheese_stick, 10);
        vendingStock.put(fries, 10);
        vendingStock.put(yogurt, 10);
        vendingStock.put(popcorn, 10);
        vendingStock.put(carrots, 10);
        vendingStock.put(jerky, 10);
        vendingStock.put(sunflower_seeds, 10);
        vendingStock.put(hot_dog, 10);
        vendingStock.put(hamburger, 10);
        vendingStock.put(pizza, 10);


    }
}
