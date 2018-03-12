package com.company;


import domain.DrinkMachine;
import domain.Coin;

public class Main {

    public static void main(String[] args) {

        Product rootBeer = new Product(1, "RootBeer",
                "A soda made with some flavor", .10, 1.25);
        Product cocaCola = new Product(2, "CocaCola",
                "A soda made with some cacao", .15, 1.25);
        Product beer = new Product(3, "Budwiser",
                "some malty water",.40, 2.00);
        Product sprite = new Product(4, "Sprite",
                "A sode made with some fake lemon and lime",.15, 1.25);
        Product powerade = new Product(5, "Powerade",
                "A sugary sports drink",.25, 1.50);
        Product chips = new Product(6, "Chips", "Thin fried potatoes", .20, 1.75);
        Product candyBar = new Product(7, "CandyBar", "candy and maybe chocolate", .20, 2.50);
        Product gum = new Product(8, "Gum", "you chew it", .05, 1.00);
        Product honeyBun = new Product(9, "HoneyBun", "a sweet roll", .75, 2.75);
        Product cheetos = new Product(10, "Cheetos", "fried corn", .25, 1.25);
        Product mints = new Product(10, "Mints", "they're minty", .05, 1.25);


        System.out.println(rootBeer.getUniqueID());

/*
        DrinkMachine somemachine = new DrinkMachine();
        Coin somecoins = new Coin();
        somecoins.setDimes(10);
        somemachine.setCoins(somecoins);*/

        DrinkMachine Drink_M_ATL = new DrinkMachine();
        Coin Drink_M_ATL_coin = new Coin();
        Drink_M_ATL_coin.setDimes(20);
        Drink_M_ATL_coin.setNickels(30);
        Drink_M_ATL_coin.setQuarters(25);



//        long somemachinetotalcoincount = somemachine.getCoins().getDimes() + somemachine.getCoins().getNickels() + somemachine.getCoins().getQuarters()

        long testervar = Drink_M_ATL.getTotalCoinCount(Drink_M_ATL_coin);
        System.out.println("look here asshole "+ testervar);
    }
//






    //    Lets Instantiate some Product Classes for Drinks

    //
    //    Lets Instantiate some Product Classes for Snacks





}


