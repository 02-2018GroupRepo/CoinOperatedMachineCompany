package com.company;

public class DrinkMachine extends VendingMachine {
    public DrinkMachine(){



        Products coke = new Products("coke", 26, "drink", .30, .50);
        Products diet_coke = new Products("coke", 27, "drink", .30, .50);
        Products sprite = new Products("coke", 28, "drink", .30, .50);
        Products fanta = new Products("coke", 29, "drink", .30, .50);
        Products pepsi = new Products("coke", 30, "drink", .30, .50);
        Products mt_dew = new Products("coke", 31, "drink", .30, .50);
        Products iced_tea = new Products("coke", 32, "drink", .30, .50);
        Products sweet_tea = new Products("coke", 33, "drink", .30, .50);
        Products red_bull = new Products("coke", 34, "drink", .45, .80);
        Products monster = new Products("coke", 35, "drink", .45, .80);
        Products orange_juice = new Products("coke", 36, "drink", .45, .80);
        Products apple_juice = new Products("coke", 37, "drink", .45, .80);
        Products grape_juice = new Products("coke", 38, "drink", .45, .80);
        Products coffee = new Products("coke", 39, "drink", .60, .90);
        Products root_beer = new Products("coke", 40, "drink", .60, .90);
        Products sasparilla = new Products("coke", 41, "drink", .60, .90);
        Products ginger_ale = new Products("coke", 42, "drink", .60, .90);
        Products kool_aid = new Products("coke", 43, "drink", .60, .90);

        Products water = new Products("water", 44, "drink", .75, 1.00);
        Products bud = new Products("bud", 45, "drink", .75, 1.00);
        Products miller = new Products("miller", 46, "drink", .75, 1.00);
        Products michelob = new Products("michelob", 47, "drink", .75, 1.00);
        Products coors = new Products("coors", 48, "drink", .75, 1.00);
        Products heineken = new Products("heineken", 49, "drink", .75, 1.00);
        Products fosters = new Products("fosters", 50, "drink", .75, 1.00);
        Products peroni = new Products("peroni", 51, "drink", .75, 1.00);
        Products terrapin = new Products("terrapin", 52, "drink", .75, 1.00);
        Products bells = new Products("bells", 53, "drink", .75, 1.00);

        //canned drinks
        vendingStock.put(coke, 12);
        vendingStock.put(diet_coke, 12);
        vendingStock.put(sprite, 12);
        vendingStock.put(fanta, 12);
        vendingStock.put(pepsi, 12);
        vendingStock.put(mt_dew, 12);
        vendingStock.put(iced_tea, 12);
        vendingStock.put(sweet_tea, 12);
        vendingStock.put(red_bull, 12);
        vendingStock.put(monster, 12);
        vendingStock.put(orange_juice, 12);
        vendingStock.put(apple_juice, 12);
        vendingStock.put(grape_juice, 12);
        vendingStock.put(coffee, 12);
        vendingStock.put(root_beer, 12);
        vendingStock.put(sasparilla, 12);
        vendingStock.put(ginger_ale, 12);
        vendingStock.put(kool_aid, 12);
        //bottled drinks
        vendingStock.put(water, 8);
        vendingStock.put(bud, 8);
        vendingStock.put(miller, 8);
        vendingStock.put(michelob, 8);
        vendingStock.put(coors, 8);
        vendingStock.put(heineken, 8);
        vendingStock.put(fosters, 8);
        vendingStock.put(peroni, 8);
        vendingStock.put(terrapin, 8);
        vendingStock.put(bells, 8);
    }
}
