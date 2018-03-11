package com.tawnihollers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SnackMachine extends VendingMachines {

    Product gum = new Product("A1", "Gum", "Minty Gum", 0.10, 0.50, 1);
    Product recess = new Product("A2", "Recess", "Peanut Butter & Chocolate", 0.15, 0.50, 3);
    Product butterFinger = new Product("A3", "Butter Finger", "Orange Chocolate", .20, 0.80, 10);
    Product hershy = new Product("A4", "Hershy", "Just Chocolate", 0.25, 1.00, 7);
    Product twix = new Product("A5", "twix", "Goodness", .30, 1.25, 2);

    Product mm = new Product("B1", "MnM", "Minty Gum", 0.50, 0.10, 1);
    Product peanutMm = new Product("B2", "Peanut MnM", "Minty Gum", 0.25, 1.00, 10);
    Product milkDuds = new Product("B3", "Milk Duds", "Minty Gum", 1.00, 1.50, 10);
    Product milkyWay = new Product("B4", "Milky Way", "Minty Gum", 2.00, 2.80, 10);
    Product babyRuth = new Product("B5", "Baby Ruth", "Minty Gum", 1.00, 1.75, 1);

    Product laysOriginalchips = new Product("C1", "Lays Original Chips", "Minty Gum", 0.50, 0.10, 1);
    Product laysSaltNVinegarChips = new Product("C2", "Lays Salt and Vinegar chips", "Minty Gum", 0.25, 1.00, 10);
    Product bakedOriginalChips = new Product("C3", "Baked Original Chips", "Minty Gum", 1.00, 1.50, 10);
    Product bakedBbqChips = new Product("C4", "Baked BBQ Chips", "Minty Gum", 2.00, 2.80, 10);
    Product sunChips = new Product("C5", "Sun Chips", "Minty Gum", 1.00, 1.75, 3);

    Product cheetos = new Product("D1", "Cheetos", "Minty Gum", 0.50, 0.10, 1);
    Product hotCheetos = new Product("D2", "Hot Cheetos", "Minty Gum", 0.25, 1.00, 10);
    Product chexMix = new Product("D3", "Chex Mix", "Minty Gum", 1.00, 1.50, 10);
    Product peanuts = new Product("D4", "Peanuts", "Minty Gum", 2.00, 2.80, 10);
    Product prezels = new Product("D5", "Prezels", "Minty Gum", 1.00, 1.75, 1);

    Product riceCrispyTreats = new Product("E1", "Rice Crispy Treats", "Minty Gum", 0.50, 0.10, 1);
    Product trailMix = new Product("E2", "Trail Mix", "Minty Gum", 0.25, 1.00, 10);
    Product honeyBuns = new Product("E3", "Honey Buns", "Minty Gum", 1.00, 1.50, 10);
    Product granolaBar = new Product("E4", "Granola Bar", "Minty Gum", 2.00, 2.80, 10);
    Product cheezIts = new Product("E5", "CheezIts", "Minty Gum", 1.00, 1.75, 2);

    ArrayList<Product> fun = new ArrayList<>();
    HashMap<String, Double> coins = new HashMap<>();

    public void snacksInMachine() {

        fun.add(gum);
        fun.add(recess);
        fun.add(butterFinger);
        fun.add(hershy);
        fun.add(twix);
        fun.add(mm);
        fun.add(peanutMm);
        fun.add(milkDuds);
        fun.add(milkyWay);
        fun.add(babyRuth);
        fun.add(laysOriginalchips);
        fun.add(laysSaltNVinegarChips);
        fun.add(bakedOriginalChips);
        fun.add(bakedBbqChips);
        fun.add(sunChips);
        fun.add(cheetos);
        fun.add(hotCheetos);
        fun.add(chexMix);
        fun.add(peanuts);
        fun.add(prezels);
        fun.add(riceCrispyTreats);
        fun.add(trailMix);
        fun.add(honeyBuns);
        fun.add(granolaBar);
        fun.add(cheezIts);

        Iterator itr = fun.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            System.out.println(x);
        }

    }

    public HashMap giveTheHashMapToOperator() {
        return coins;
    }

    public void takeMoneyAndChangeQty(double moneyGiven, String letter, int number) {
        if (letter.equals("A")) {
            switch (number) {
                case 1: {
                    if (gum.getRetailSalePrice() <= moneyGiven) {
                        if (gum.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - gum.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            gum.decreaseStock();
                            String key = gum.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (recess.getRetailSalePrice() <= moneyGiven) {
                        if (recess.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - recess.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            recess.decreaseStock();
                            String key = recess.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (butterFinger.getRetailSalePrice() <= moneyGiven) {
                        if (butterFinger.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - butterFinger.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            butterFinger.decreaseStock();
                            String key = butterFinger.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (hershy.getRetailSalePrice() <= moneyGiven) {
                        if (hershy.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - hershy.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            hershy.decreaseStock();
                            String key = hershy.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (twix.getRetailSalePrice() <= moneyGiven) {
                        if (twix.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - twix.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            twix.decreaseStock();
                            String key = twix.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }

            }
        } else if (letter.equals("B")) {
            switch (number) {
                case 1: {
                    if (mm.getRetailSalePrice() <= moneyGiven) {
                        if (mm.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - mm.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            mm.decreaseStock();
                            String key = mm.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (peanutMm.getRetailSalePrice() <= moneyGiven) {
                        if (peanutMm.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - peanutMm.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            peanutMm.decreaseStock();
                            String key = peanutMm.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (milkDuds.getRetailSalePrice() <= moneyGiven) {
                        if (milkDuds.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - milkDuds.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            milkDuds.decreaseStock();
                            String key = milkDuds.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (milkyWay.getRetailSalePrice() <= moneyGiven) {
                        if (milkyWay.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - milkyWay.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            milkyWay.decreaseStock();
                            String key = milkyWay.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (babyRuth.getRetailSalePrice() <= moneyGiven) {
                        if (babyRuth.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - babyRuth.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            babyRuth.decreaseStock();
                            String key = babyRuth.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }

            }
        } else if (letter.equals("C")) {
            switch (number) {
                case 1: {
                    if (laysOriginalchips.getRetailSalePrice() <= moneyGiven) {
                        if (laysOriginalchips.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - laysOriginalchips.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            laysOriginalchips.decreaseStock();
                            String key = laysOriginalchips.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (laysSaltNVinegarChips.getRetailSalePrice() <= moneyGiven) {
                        if (laysSaltNVinegarChips.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - laysSaltNVinegarChips.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            laysSaltNVinegarChips.decreaseStock();
                            String key = laysSaltNVinegarChips.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (bakedOriginalChips.getRetailSalePrice() <= moneyGiven) {
                        if (bakedOriginalChips.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - bakedOriginalChips.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            bakedOriginalChips.decreaseStock();
                            String key = bakedOriginalChips.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (bakedBbqChips.getRetailSalePrice() <= moneyGiven) {
                        if (bakedBbqChips.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - bakedBbqChips.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            bakedBbqChips.decreaseStock();
                            String key = bakedBbqChips.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (sunChips.getRetailSalePrice() <= moneyGiven) {
                        if (sunChips.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - sunChips.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            sunChips.decreaseStock();
                            String key = sunChips.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }

            }
        } else if (letter.equals("D")) {
            switch (number) {
                case 1: {
                    if (cheetos.getRetailSalePrice() <= moneyGiven) {
                        if (cheetos.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - cheetos.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            cheetos.decreaseStock();
                            String key = cheetos.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (hotCheetos.getRetailSalePrice() <= moneyGiven) {
                        if (hotCheetos.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - hotCheetos.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            hotCheetos.decreaseStock();
                            String key = hotCheetos.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (chexMix.getRetailSalePrice() <= moneyGiven) {
                        if (chexMix.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - chexMix.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            chexMix.decreaseStock();
                            String key = chexMix.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (peanuts.getRetailSalePrice() <= moneyGiven) {
                        if (peanuts.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - peanuts.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            peanuts.decreaseStock();
                            String key = peanuts.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (prezels.getRetailSalePrice() <= moneyGiven) {
                        if (prezels.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - prezels.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            prezels.decreaseStock();
                            String key = prezels.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }

            }
        } else if (letter.equals("E")) {
            switch (number) {
                case 1: {
                    if (riceCrispyTreats.getRetailSalePrice() <= moneyGiven) {
                        if (riceCrispyTreats.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - riceCrispyTreats.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            riceCrispyTreats.decreaseStock();
                            String key = riceCrispyTreats.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (trailMix.getRetailSalePrice() <= moneyGiven) {
                        if (trailMix.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - trailMix.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            trailMix.decreaseStock();
                            String key = trailMix.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (honeyBuns.getRetailSalePrice() <= moneyGiven) {
                        if (honeyBuns.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - honeyBuns.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            honeyBuns.decreaseStock();
                            String key = honeyBuns.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (granolaBar.getRetailSalePrice() <= moneyGiven) {
                        if (granolaBar.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - granolaBar.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            granolaBar.decreaseStock();
                            String key = granolaBar.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (cheezIts.getRetailSalePrice() <= moneyGiven) {
                        if (cheezIts.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println("The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - cheezIts.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            cheezIts.decreaseStock();
                            String key = cheezIts.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }

            }
        } else {
            System.out.println("Invalid");
        }
    }
}
