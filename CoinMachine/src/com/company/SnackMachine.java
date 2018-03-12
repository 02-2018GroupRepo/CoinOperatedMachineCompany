package com.company;

public class SnackMachine extends Vending_Machine {

    public SnackMachine(String location){
        MAX_ITEM_COUNT = 250;

        this.location = location;
        company = "MyCompany";

        //todo: add items to inStock map class
        Products chips       = new Products("A1", "chips",           "potato", 0.50, 1.00);
        Products cracker     = new Products("A2", "cracker",         "saltine", 0.25, 1.00);
        Products popcorn     = new Products("A3", "popcorn",         "salted", 0.50, 1.50);
        Products almonds     = new Products("A4", "almonds",         "almonds", 2.50, 4.00);
        Products choclate    = new Products("A5", "choclate",        "choclate", 0.50, 2.00);
        Products jerky       = new Products("B1", "jerky",           "jerky", 1.50, 5.00);
        Products yogurt      = new Products("B2", "yogurt",          "yogurt", 0.50, 1.00);
        Products pretzel     = new Products("B3", "pretzel",         "pretzel", 0.50, 1.00);
        Products dried_fruit = new Products("B4", "dried_fruit",     "dried fruit", 0.10, 0.50);
        Products doughnut    = new Products("B5", "doughnuts",      "doughnut", 0.50, 1.00);
        Products granola     = new Products("C1", "granola",        "granola", 0.15, 1.25);
        Products sunflower   = new Products("C2", "sunflower_seeds","sunflower seeds", 0.50, 1.00);
        Products mixed_nuts  = new Products("C3", "mixed_nuts",     "mixed nuts", 0.50, 1.00);
        Products energy_bar  = new Products("C4", "energy_bar",     "energy bar", 0.50, 2.50);
        Products corn_nuts   = new Products("C5", "corn_nuts",      "corn nuts", 0.50, 1.00);
        Products protien_bar = new Products("D1", "protien_bar",    "protien bar", 0.50, 1.00);
        Products poptart     = new Products("D2", "poptart",        "pop tart", 0.50, 2.50);
        Products bagel       = new Products("D3", "bagel",          "bagel", 0.50, 1.00);
        Products carrots     = new Products("D4", "carrots",        "carrots", 0.50, 1.00);
        Products salsa       = new Products("D5", "salsa",          "salsa", 0.50, 3.00);
        Products apple       = new Products("E1", "apple",          "apple", 0.50, 0.50);
        Products orange      = new Products("E2", "orange",         "orange", 0.50, 0.50);
        Products grapes      = new Products("E3", "grapes",         "grapes", 0.50, 1.00);
        Products cookies     = new Products("E4", "cookie",         "cookie", 0.50, 1.00);
        Products toffee      = new Products("E5", "toffee",         "toffee", 0.50, 1.00);

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
