package com.company;

public class DrinkMachine extends Vending_Machine {
    public DrinkMachine(){
        MAX_ITEM_COUNT = 296;
        //todo: add items to inStock map
        Products pepsi      = new Products(1, "pepsi", "pepsi    ", 0.10, 0.50);
        Products coke       = new Products(2, "coke", "coke     ", 0.10, 0.50);
        Products sprite     = new Products(3, "sprite", "sprite   ", 0.10, 0.50);
        Products fanta      = new Products(4, "fanta", "fanta    ", 0.10, 0.50);
        Products dr         = new Products(5, "dr", "dr       ", 0.10, 0.50);
        Products pepper     = new Products(6, "pepper", "pepper   ", 0.10, 0.50);
        Products mountian   = new Products(7, "mountian", "mountian ", 0.10, 0.50);
        Products dew        = new Products(8, "dew", "dew      ", 0.10, 0.50);
        Products brisk      = new Products(9, "brisk", "brisk    ", 0.10, 0.50);
        Products iceT       = new Products(10, "iceT", "iceT     ", 0.10, 1.50);
        Products coffee     = new Products(11, "coffee", "coffee   ", 0.20, 0.0);
        Products budlight   = new Products(12, "budlight", "budlight ", 2.00, 5.00);
        Products miller     = new Products(13, "miller", "miller   ", 2.00, 5.00);
        Products amstel     = new Products(14, "amstel", "amstel   ", 2.00, 5.00);
        Products icehouse   = new Products(15, "icehouse", "icehouse ", 2.00, 5.00);
        Products budweiser  = new Products(16, "budweiser", "budweiser", 2.00, 5.00);
        Products guiness    = new Products(17, "guiness", "guiness  ", 2.00, 5.00);
        Products corona     = new Products(18, "corona", "corona   ", 2.00, 5.00);

        Products water0   = new Products(19,"water0", "water0", 0.50, 1.00);
        Products water1   = new Products(20,"water1", "water1", 0.50, 1.00);
        Products water2   = new Products(21,"water2", "water2", 0.50, 1.00);
        Products water3   = new Products(22,"water3", "water3", 0.50, 1.00);
        Products water4   = new Products(23,"water4", "water4", 0.50, 1.00);
        Products water5   = new Products(24,"water5", "water5", 0.50, 1.00);
        Products water6   = new Products(25,"water6", "water6", 0.50, 1.00);
        Products water7   = new Products(26,"water7", "water7", 0.50, 1.00);
        Products water8   = new Products(27,"water8", "water8", 0.50, 1.00);
        Products water9   = new Products(28,"water9", "water9", 0.50, 1.00);

        inStock.put(pepsi    ,12);
        inStock.put(coke     ,12);
        inStock.put(sprite   ,12);
        inStock.put(fanta    ,12);
        inStock.put(dr       ,12);
        inStock.put(pepper   ,12);
        inStock.put(mountian ,12);
        inStock.put(dew      ,12);
        inStock.put(brisk    ,12);
        inStock.put(iceT     ,12);
        inStock.put(coffee   ,12);
        inStock.put(budlight ,12);
        inStock.put(miller   ,12);
        inStock.put(amstel   ,12);
        inStock.put(icehouse ,12);
        inStock.put(budweiser,12);
        inStock.put(guiness  ,12);
        inStock.put(corona   ,12);

        inStock.put(water0,8);
        inStock.put(water1,8);
        inStock.put(water2,8);
        inStock.put(water3,8);
        inStock.put(water4,8);
        inStock.put(water5,8);
        inStock.put(water6,8);
        inStock.put(water7,8);
        inStock.put(water8,8);
        inStock.put(water9,8);


    }
}
