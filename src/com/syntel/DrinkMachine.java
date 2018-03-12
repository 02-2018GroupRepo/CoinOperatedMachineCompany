package com.syntel;

import java.util.ArrayList;
import java.util.List;

public class DrinkMachine extends VendingMachine {

    DrinkMachine(){

        CoinBox coinBox = new CoinBox();

        //Generate Drink Products
        VendingProduct sprite = new VendingProduct("Sprite", "Quench the thirst.",
                0.69, 1.00, true, false);
        VendingProduct spriteZero = new VendingProduct("Sprite Zero", "Quench the thirst.",
                0.69, 2.00, true, false);
        VendingProduct spriteRemix = new VendingProduct("Sprite Remix", "Quench the thirst.",
                0.69, 1.00, true, false);
        VendingProduct incaKola = new VendingProduct("Inca Kola", "Quench the thirst.",
                0.69, 1.00, true, false);
        VendingProduct gingerAle = new VendingProduct("Ginger Ale", "Quench the thirst.",
                0.69, 1.00, true, false);
        VendingProduct coke = new VendingProduct("Coke", "Quench the thirst.",
                0.69, 1.00, true, false);
        VendingProduct dietCoke = new VendingProduct("Diet Coke", "Quench the thirst.",
                0.69, 2.00, true, false);
        VendingProduct cokeZero = new VendingProduct("Coke Zero", "Quench the thirst.",
                0.69, 3.00, true, false);
        VendingProduct gatorade = new VendingProduct("Gatorade", "Quench the thirst.",
                0.69, 1.00, true, false);
        VendingProduct powerade = new VendingProduct("Powerade", "Quench the thirst.",
                0.69, 1.00, false, true);
        VendingProduct coffee = new VendingProduct("Coffee", "Quench the thirst.",
                0.69, 3.50, false, true);
        VendingProduct strongCoffee = new VendingProduct("Strong Coffee", "Quench the thirst.",
                0.69, 4.50, false, true);
        VendingProduct veryStrongCoffee = new VendingProduct("Very Strong Coffee", "Quench the thirst.",
                0.69, 5.50, false, true);
        VendingProduct vegetarianJuice = new VendingProduct("Vegetarian Juice", "Quench the thirst.",
                0.69, 100.00, false, true);
        VendingProduct veganJuice = new VendingProduct("Vegan Juice", "Quench the thirst.",
                0.69, 150.00, false, true);
        VendingProduct carnivoreJuice = new VendingProduct("Carnivore Juice (blood)", "Quench the thirst.",
                0.69, 1.00, false, true);
        VendingProduct programmerTears = new VendingProduct("Programmers' Tears", "Quench the thirst.",
                0.69, 0.05, false, true);
        VendingProduct water = new VendingProduct("Water", "Quench the thirst.",
                0.69, 1.00, false, true);

        //Add drinks to a drinksList
        List<VendingProduct> drinksList = new ArrayList<>();
        drinksList.add(sprite);
        drinksList.add(spriteZero);
        drinksList.add(spriteRemix);
        drinksList.add(incaKola);
        drinksList.add(gingerAle);
        drinksList.add(coke);
        drinksList.add(dietCoke);
        drinksList.add(cokeZero);
        drinksList.add(gatorade);
        drinksList.add(powerade);
        drinksList.add(coffee);
        drinksList.add(strongCoffee);
        drinksList.add(veryStrongCoffee);
        drinksList.add(vegetarianJuice);
        drinksList.add(veganJuice);
        drinksList.add(carnivoreJuice);
        drinksList.add(programmerTears);
        drinksList.add(water);


        //Makes a 2 dimensional array of canned drinks
        VendingProduct[][] cannedDrinks = new VendingProduct[6][3];
        int index = 0;
        for (int i = 0; i < cannedDrinks.length; i++){
            for(int j = 0; j < cannedDrinks[i].length; j++){
                while(index < drinksList.size()){
                    if(drinksList.get(index).getIsCanned()){

                        cannedDrinks[i][j] = drinksList.get(index);
                        System.out.println(cannedDrinks[i][j].getItemName());
                    }
                    index++;
                }
            }
        }

        //Makes a 2 dimensional array of bottled drinks
        System.out.println("\nBottled Drinks:");
        VendingProduct[][] bottledDrinks = new VendingProduct[5][2];
        index = 0;
        for (int i = 0; i < bottledDrinks.length; i++){
            for(int j = 0; j < bottledDrinks[i].length; j++){
                while(index < drinksList.size()){
                    if(drinksList.get(index).getIsBottled()){

                        bottledDrinks[i][j] = drinksList.get(index);
                        System.out.println(bottledDrinks[i][j].getItemName());
                    }
                    index++;
                }
            }
        }



    }

    public void printDrinkSelection(){
        for(VendingProduct drink : )
    }

    @Override
    public void addItem(VendingProduct item, int stock) {
        super.addItem(item, stock);
    }
//
//    two 2 dimensional arrays:
//
//        1   2   3   4   5   6
//    A   A1  A2  A3  A4  A5  A6
//    B   B1  B2  B3  B4  B5  B6
//    C   C1  C2  C3  C3  C5  C6
//---------------------------
//    D   D1  D2  D3  D4  D5
//    E   E1  E2  E3  E4  E5

}


/*
Sprite
Sprite Zero
Sprite Remix
Inca Kola
Ginger Ale
Coke
Diet Coke
Coke Zero
Gatorade
Powerade
Coffee
Strong Coffee
Very Strong Coffee
Vegetarian Juice
Vegan Juice
Carnivore Juice (Blood)
Programmer's Tears
Water

two 2 dimensional arrays:

    1   2   3   4   5   6
A   A1  A2  A3  A4  A5  A6
B   B1  B2  B3  B4  B5  B6
C   C1  C2  C3  C3  C5  C6
---------------------------
D   D1  D2  D3  D4  D5
E   E1  E2  E3  E4  E5





*/
