package com.syntel;

import java.util.ArrayList;
import java.util.List;

public class SnackMachine extends VendingMachine {

    public SnackMachine(){

        CoinBox coinBox = new CoinBox();

        //Generate snack products
        VendingProduct snickers = new VendingProduct("Snickers", "Yum.",
                0.69, 1.00, false, false);
        VendingProduct peanutMNMs = new VendingProduct("Peanut M&M's", "Yum.",
                0.69, 1.00, false, false);
        VendingProduct reesesCups = new VendingProduct("Reeses Peanut Butter Cups", "Yum.",
                0.69, 1.00, false, false);
        VendingProduct doritos = new VendingProduct("Doritos", "Yum.",
                0.69, 1.00, false, false);
        VendingProduct oreos = new VendingProduct("Oreos", "Yum.",
                0.69, 1.00, false, false);
        VendingProduct riceCrispyTreats = new VendingProduct("Rice Crispy Treats", "Yum.",
                0.69, 1.00, false, false);
        VendingProduct cheezits = new VendingProduct("Cheez-it's", "Yum.",
                0.69, 1.00, false, false);
        VendingProduct clifBar = new VendingProduct("White Chocolate Macadamia Nut CLIF BAR", "Yum.",
                0.69, 1.00, false, false);

        //Add snack products to a product list
        List<VendingProduct> snacksList = new ArrayList<>();
        snacksList.add(snickers);
        snacksList.add(peanutMNMs);
        snacksList.add(reesesCups);
        snacksList.add(doritos);
        snacksList.add(oreos);
        snacksList.add(riceCrispyTreats);
        snacksList.add(cheezits);
        snacksList.add(clifBar);

        //Makes a 2 dimensional array of snack
        VendingProduct[][] snacks = new VendingProduct[5][5];
        int index = 0;
        for (int i = 0; i < snacks.length; i++){
            for(int j = 0; j < snacks[i].length; j++){
                while(index < snacksList.size()){
                    if(!snacksList.get(index).getIsCanned() && !snacksList.get(index).getIsBottled()){

                        snacks[i][j] = snacksList.get(index);
                        System.out.println(snacks[i][j].getItemName());
                    }
                    index++;
                }
            }
        }



    }



}


/*
Snickers
Peanut M&M's
Twix
Reeses Peanut Butter Cups
Doritos
Oreos
Rice Crispy Treats
Cheez-it's
White Chocolate Macadamia Nut CLIF BAR

one 2 dimensional array
    1   2   3   4   5
A   A1  A2  A3  A4  A5
B   B1  B2  B3  B4  B5
C   C1  C2  C3  C3  C5
D   D1  D2  D3  D4  D5
E   E1  E2  E3  E4  E5


 */
