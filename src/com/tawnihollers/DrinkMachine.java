package com.tawnihollers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class DrinkMachine extends VendingMachines {

    Product sprite = new Product("A1", "Sprite", "Green Can", 0.50, 0.10, 1);
    Product coke = new Product("A2", "Coke", "Red can", 1.00, 2.00, 10);
    Product rootBeer = new Product("A3", "Root Beer", "Gross can", 1.00, 1.50, 12);
    Product drPepper = new Product("A4", "Dr Pepper", "Alright can", 2.00, 2.80, 11);
    Product melloYellow = new Product("A5", "Mello Yellow", "Off brand sprite can", 1.00, 1.75, 3);
    Product dietCoke = new Product("A6", "Diet Coke", "Diet can of coke", 1.00, 1.75, 11);

    Product mountainDew = new Product("B1", "Mountain Dew", "Green Can", 0.50, 0.10, 1);
    Product pepsi = new Product("B2", "Pepsi", "Red can", 1.00, 2.00, 10);
    Product dietPepsi = new Product("B3", "Diet Pepsi", "Gross can", 1.00, 1.50, 12);
    Product dietMountainDew = new Product("B4", "Diet Mountain Dew", "Alright can", 2.00, 2.80, 10);
    Product orangeSoda = new Product("B5", "Orange Soda", "Off brand sprite can", 1.00, 1.75, 1);
    Product grapeSoda = new Product("B6", "Grape Soda", "Diet can of coke", 1.00, 1.75, 12);

    Product redBull = new Product("C1", "Red Bull", "Green Can", 0.50, 0.10, 1);
    Product monster = new Product("C2", "Monster", "Red can", 1.00, 2.00, 10);
    Product rockstar = new Product("C3", "Rockstar", "Gross can", 1.00, 1.50, 12);
    Product nos = new Product("C4", "NOS", "Alright can", 2.00, 2.80, 10);
    Product amp = new Product("C5", "Amp", "Off brand sprite can", 1.00, 1.75, 1);
    Product fullThrottle = new Product("C6", "Full Throttle", "Diet can of coke", 1.00, 1.75, 12);

    Product appleJuice = new Product("D1", "Apple Juice", "Green Can", 0.50, 0.10, 1);
    Product bottledWater = new Product("D2", "Bottled Water", "Red can", 1.00, 2.00, 10);
    Product orangeJuice = new Product("D3", "Orange Juice", "Gross can", 1.00, 1.50, 12);
    Product lemonade = new Product("D4", "Lemonade", "Lemonade", 2.00, 2.80, 10);
    Product fruitPunch = new Product("D5", "Fruit Punch", "Fruit Punch", 1.00, 1.75, 1);

    Product lemonLimeGatorade = new Product("E1", "Lemon-Lime Gatorade", "Green Can", 0.50, 0.10, 1);
    Product strawberryLemonadeGatorade = new Product("E2", "Strawberry Lemonade Gatorade", "Red can", 1.00, 2.00, 10);
    Product grapeGatorade = new Product("E3", "Grape Gatorade", "Gross can", 1.00, 1.50, 12);
    Product coolBlueGatorade = new Product("E4", "Cool Blue Gatorade", "Lemonade", 2.00, 2.80, 10);
    Product whiteCherryGatorade = new Product("E5", "White Cherry Gatorade", "Fruit Punch", 1.00, 1.75, 1);

    ArrayList<Product> fun = new ArrayList<>();
    HashMap<String, Double> coins = new HashMap<>();

    public void drinksInMachine() {

        fun.add(sprite);
        fun.add(coke);
        fun.add(rootBeer);
        fun.add(drPepper);
        fun.add(melloYellow);
        fun.add(dietCoke);
        fun.add(mountainDew);
        fun.add(pepsi);
        fun.add(dietPepsi);
        fun.add(dietMountainDew);
        fun.add(orangeSoda);
        fun.add(grapeSoda);
        fun.add(redBull);
        fun.add(monster);
        fun.add(rockstar);
        fun.add(nos);
        fun.add(amp);
        fun.add(fullThrottle);
        fun.add(appleJuice);
        fun.add(bottledWater);
        fun.add(orangeJuice);
        fun.add(lemonade);
        fun.add(fruitPunch);
        fun.add(lemonLimeGatorade);
        fun.add(strawberryLemonadeGatorade);
        fun.add(grapeGatorade);
        fun.add(coolBlueGatorade);
        fun.add(whiteCherryGatorade);

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
                    if (sprite.getRetailSalePrice() <= moneyGiven) {
                        if (sprite.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - sprite.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            sprite.decreaseStock();
                            String key = sprite.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (coke.getRetailSalePrice() <= moneyGiven) {
                        if (coke.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - coke.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            coke.decreaseStock();
                            String key = coke.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (rootBeer.getRetailSalePrice() <= moneyGiven) {
                        if (rootBeer.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - rootBeer.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            rootBeer.decreaseStock();
                            String key = rootBeer.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (drPepper.getRetailSalePrice() <= moneyGiven) {
                        if (drPepper.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - drPepper.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            drPepper.decreaseStock();
                            String key = drPepper.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (melloYellow.getRetailSalePrice() <= moneyGiven) {
                        if (melloYellow.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - melloYellow.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            melloYellow.decreaseStock();
                            String key = melloYellow.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 6: {
                    if (dietCoke.getRetailSalePrice() <= moneyGiven) {
                        if (dietCoke.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - dietCoke.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            dietCoke.decreaseStock();
                            String key = dietCoke.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
            }
        } else if (letter.equals("B")) {
            switch (number) {
                case 1: {
                    if (mountainDew.getRetailSalePrice() <= moneyGiven) {
                        if (mountainDew.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - mountainDew.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            mountainDew.decreaseStock();
                            String key = mountainDew.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (pepsi.getRetailSalePrice() <= moneyGiven) {
                        if (pepsi.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - pepsi.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            pepsi.decreaseStock();
                            String key = pepsi.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (dietPepsi.getRetailSalePrice() <= moneyGiven) {
                        if (dietPepsi.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - dietPepsi.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            dietPepsi.decreaseStock();
                            String key = dietPepsi.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (dietMountainDew.getRetailSalePrice() <= moneyGiven) {
                        if (dietMountainDew.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - dietMountainDew.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            dietMountainDew.decreaseStock();
                            String key = dietMountainDew.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (orangeSoda.getRetailSalePrice() <= moneyGiven) {
                        if (orangeSoda.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - orangeSoda.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            orangeSoda.decreaseStock();
                            String key = orangeSoda.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 6: {
                    if (grapeSoda.getRetailSalePrice() <= moneyGiven) {
                        if (grapeSoda.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - grapeSoda.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            grapeSoda.decreaseStock();
                            String key = grapeSoda.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
            }
        } else if (letter.equals("C")) {
            switch (number) {
                case 1: {
                    if (redBull.getRetailSalePrice() <= moneyGiven) {
                        if (redBull.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - redBull.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            redBull.decreaseStock();
                            String key = redBull.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (monster.getRetailSalePrice() <= moneyGiven) {
                        if (monster.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - monster.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            monster.decreaseStock();
                            String key = monster.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (rockstar.getRetailSalePrice() <= moneyGiven) {
                        if (rockstar.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - rockstar.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            rockstar.decreaseStock();
                            String key = rockstar.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (nos.getRetailSalePrice() <= moneyGiven) {
                        if (nos.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - nos.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            nos.decreaseStock();
                            String key = nos.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (amp.getRetailSalePrice() <= moneyGiven) {
                        if (amp.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - amp.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            amp.decreaseStock();
                            String key = amp.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 6: {
                    if (fullThrottle.getRetailSalePrice() <= moneyGiven) {
                        if (fullThrottle.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - fullThrottle.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            fullThrottle.decreaseStock();
                            String key = fullThrottle.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
            }
        } else if (letter.equals("D")) {
            switch (number) {
                case 1: {
                    if (appleJuice.getRetailSalePrice() <= moneyGiven) {
                        if (appleJuice.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - appleJuice.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            appleJuice.decreaseStock();
                            String key = appleJuice.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (bottledWater.getRetailSalePrice() <= moneyGiven) {
                        if (bottledWater.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - bottledWater.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            bottledWater.decreaseStock();
                            String key = bottledWater.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (orangeJuice.getRetailSalePrice() <= moneyGiven) {
                        if (orangeJuice.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - orangeJuice.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            orangeJuice.decreaseStock();
                            String key = orangeJuice.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (lemonade.getRetailSalePrice() <= moneyGiven) {
                        if (lemonade.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - lemonade.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            lemonade.decreaseStock();
                            String key = lemonade.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (fruitPunch.getRetailSalePrice() <= moneyGiven) {
                        if (fruitPunch.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - fruitPunch.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            fruitPunch.decreaseStock();
                            String key = fruitPunch.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
            }
        } else if (letter.equals("E")) {
            switch (number) {
                case 1: {
                    if (lemonLimeGatorade.getRetailSalePrice() <= moneyGiven) {
                        if (lemonLimeGatorade.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - lemonLimeGatorade.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            lemonLimeGatorade.decreaseStock();
                            String key = lemonLimeGatorade.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 2: {
                    if (strawberryLemonadeGatorade.getRetailSalePrice() <= moneyGiven) {
                        if (strawberryLemonadeGatorade.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - strawberryLemonadeGatorade.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            strawberryLemonadeGatorade.decreaseStock();
                            String key = strawberryLemonadeGatorade.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 3: {
                    if (grapeGatorade.getRetailSalePrice() <= moneyGiven) {
                        if (grapeGatorade.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - grapeGatorade.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            grapeGatorade.decreaseStock();
                            String key = grapeGatorade.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 4: {
                    if (coolBlueGatorade.getRetailSalePrice() <= moneyGiven) {
                        if (coolBlueGatorade.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - coolBlueGatorade.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            coolBlueGatorade.decreaseStock();
                            String key = coolBlueGatorade.getName();
                            coins.put(key, moneyGiven);
                        }
                    }
                }
                case 5: {
                    if (whiteCherryGatorade.getRetailSalePrice() <= moneyGiven) {
                        if (whiteCherryGatorade.getQty() == 0) {
                            System.out.printf("Your money returned is $%.2f\n", moneyGiven);
                            System.out.println(" The machine is out of that product");
                        } else {
                            double moneyReturned = moneyGiven - whiteCherryGatorade.getRetailSalePrice();
                            System.out.printf("Your money returned $%.2f\n", moneyReturned);
                            System.out.println("Please enjoy your snack!");
                            whiteCherryGatorade.decreaseStock();
                            String key = whiteCherryGatorade.getName();
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
