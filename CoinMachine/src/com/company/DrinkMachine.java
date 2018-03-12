package com.company;

public class DrinkMachine extends Vending_Machine {
    public DrinkMachine(String location){
        MAX_ITEM_COUNT = 296;

        this.location = location;
        company = "MyCompany";

        //todo: add items to inStock map
        Products pepsi      = new Products("A1", "pepsi", "pepsi    ", 0.10, 0.50);
        Products coke       = new Products("A2", "coke", "coke     ", 0.10, 0.50);
        Products sprite     = new Products("A3", "sprite", "sprite   ", 0.10, 0.50);
        Products fanta      = new Products("A4", "fanta", "fanta    ", 0.10, 0.50);
        Products dr         = new Products("A5", "dr", "dr       ", 0.10, 0.50);
        Products pepper     = new Products("A6", "pepper", "pepper   ", 0.10, 0.50);
        Products mountian   = new Products("B1", "mountian", "mountian ", 0.10, 0.50);
        Products dew        = new Products("B2", "dew", "dew      ", 0.10, 0.50);
        Products brisk      = new Products("B3", "brisk", "brisk    ", 0.10, 0.50);
        Products iceT       = new Products("B4", "iceT", "iceT     ", 0.10, 1.50);
        Products coffee     = new Products("B5", "coffee", "coffee   ", 0.20, 0.0);
        Products budlight   = new Products("B6", "budlight", "budlight ", 2.00, 5.00);
        Products miller     = new Products("C1", "miller", "miller   ", 2.00, 5.00);
        Products amstel     = new Products("C2", "amstel", "amstel   ", 2.00, 5.00);
        Products icehouse   = new Products("C3", "icehouse", "icehouse ", 2.00, 5.00);
        Products budweiser  = new Products("C4", "budweiser", "budweiser", 2.00, 5.00);
        Products guiness    = new Products("C5", "guiness", "guiness  ", 2.00, 5.00);
        Products corona     = new Products("C6", "corona", "corona   ", 2.00, 5.00);
        Products water0     = new Products("D1","water0", "water0", 0.50, 1.00);
        Products water1     = new Products("D2","water1", "water1", 0.50, 1.00);
        Products water2     = new Products("D3","water2", "water2", 0.50, 1.00);
        Products water3     = new Products("D4","water3", "water3", 0.50, 1.00);
        Products water4     = new Products("D5","water4", "water4", 0.50, 1.00);
        Products water5     = new Products("E1","water5", "water5", 0.50, 1.00);
        Products water6     = new Products("E2","water6", "water6", 0.50, 1.00);
        Products water7     = new Products("E3","water7", "water7", 0.50, 1.00);
        Products water8     = new Products("E4","water8", "water8", 0.50, 1.00);
        Products water9     = new Products("E5","water9", "water9", 0.50, 1.00);

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
