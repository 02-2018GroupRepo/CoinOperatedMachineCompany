package com.company;

public class SnackMachine extends Vending_Machine {

    public SnackMachine(){
        MAX_ITEM_COUNT = 250;
        //todo: add items to inStock map class
        Products chips       = new Products(1, "chips", "potato", 0.50, 1.00);
        Products cracker     = new Products(2, "cracker", "saltine", 0.25, 1.00);
        Products popcorn     = new Products(3, "popcorn", "salted", 0.50, 1.50);
        Products almonds     = new Products(4, "almonds", "potato", 2.50, 4.00);
        Products choclate    = new Products(5, "choclate", "potato", 0.50, 2.00);
        Products jerky       = new Products(6, "jerky", "potato", 1.50, 5.00);
        Products yogurt      = new Products(7, "yogurt", "potato", 0.50, 1.00);
        Products pretzel     = new Products(8, "pretzel", "potato", 0.50, 1.00);
        Products dried_fruit = new Products(9, "dried fruit", "potato", 0.10, 0.50);
        Products doughnut    = new Products(10, "doughnuts", "potato", 0.50, 1.00);
        Products granola     = new Products(11, "granola", "potato", 0.15, 1.25);
        Products sunflower   = new Products(12, "sunflower seeds", "potato", 0.50, 1.00);
        Products mixed_nuts  = new Products(13, "mixed nuts", "potato", 0.50, 1.00);
        Products energy_bar  = new Products(14, "energy bar", "potato", 0.50, 2.50);
        Products corn_nuts   = new Products(15, "corn nuts", "potato", 0.50, 1.00);
        Products protien_bar = new Products(16, "protien bar", "potato", 0.50, 1.00);
        Products poptart     = new Products(17, "pop tart", "potato", 0.50, 2.50);
        Products bagel       = new Products(18, "bagel", "potato", 0.50, 1.00);
        Products carrots     = new Products(19, "bag of mini carrots", "potato", 0.50, 1.00);
        Products salsa       = new Products(20, "for chips", "potato", 0.50, 3.00);
        Products apple       = new Products(21, "apple", "potato", 0.50, 0.50);
        Products orange      = new Products(22, "orange", "potato", 0.50, 0.50);
        Products grapes      = new Products(23, "bundle of grapes", "potato", 0.50, 1.00);
        Products cookies     = new Products(24, "a cookie", "potato", 0.50, 1.00);
        Products toffee      = new Products(25, "toffee nugget candy", "potato", 0.50, 1.00);

        inStock.put(chips      ,10);
        inStock.put(cracker    ,10);
        inStock.put(popcorn    ,10);
        inStock.put(almonds    ,10);
        inStock.put(choclate   ,10);
        inStock.put(jerky      ,10);
        inStock.put(yogurt     ,10);
        inStock.put(pretzel    ,10);
        inStock.put(dried_fruit,10);
        inStock.put(doughnut   ,10);
        inStock.put(granola    ,10);
        inStock.put(sunflower  ,10);
        inStock.put(mixed_nuts ,10);
        inStock.put(energy_bar ,10);
        inStock.put(corn_nuts  ,10);
        inStock.put(protien_bar,10);
        inStock.put(poptart    ,10);
        inStock.put(bagel      ,10);
        inStock.put(carrots    ,10);
        inStock.put(salsa      ,10);
        inStock.put(apple      ,10);
        inStock.put(orange     ,10);
        inStock.put(grapes     ,10);
        inStock.put(cookies    ,10);
        inStock.put(toffee     ,10);

    }

}
