package com.test;

import com.Product.Product;
import com.machine.DrinkMachine;
import com.machine.SnackMachine;

import java.util.Random;

public class ProductGenerator {

    private static final String[] SNACK_NAME = {"Cheetos", "Doritos", "M&M", "Snickers", "Hershey"};
    private static final String[] SNACK_DESC = {"Snack", "Snack", "Snack", "Candy", "Candy"};
    private static final Double[] SNACK_WHOLE_PRICE = {2.50, 2.50, 1.50, 1.50, 1.50};
    private static final Double[] SNACK_RETAIL_PRICE = {3.50, 3.50, 2.50, 2.50, 2.50};

    private static final String[] BOTTLE_NAME = {"Coke", "Sprite", "Water"};
    private static final String[] BOTTLE_DESC = {"Bottle", "Bottle", "Bottle"};
    private static final Double[] BOTTLE_WHOLE_PRICE = {0.50, 0.50, 0.25};
    private static final Double[] BOTTLE_RETAIL_PRICE = {2.00, 2.00, 1.00};

    private static final String[] CAN_NAME = {"Coke", "Sprite", "Water"};
    private static final String[] CAN_DESC = {"Can", "Can", "Can"};
    private static final Double[] CAN_WHOLE_PRICE = {0.40, 0.40, 0.10};
    private static final Double[] CAN_RETAIL_PRICE = {1.50, 1.50, 0.50};

    private static final int SPACE_FOR_SNACK = 10;
    private static final int SPACE_FOR_BOTTLE = 8;
    private static final int SPACE_FOR_CAN = 12;

    public static Product[] generateSnack() {
        Product[] snack_list = new Product[250];
        Random randomGen = new Random();
        int random_index = randomGen.nextInt(5);
        for(int i = 0; i < snack_list.length; i++) {
            snack_list[i] = new Product(SNACK_NAME[random_index],
                    SNACK_DESC[random_index],
                    SNACK_WHOLE_PRICE[random_index],
                    SNACK_RETAIL_PRICE[random_index]);
        }
        return snack_list;
    }

    public static void insertSnacks(SnackMachine machine) {
        int counter = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                for(int k = 0; k < 10; k++) {
                    machine.addItem(generateSnack()[counter], i, j);
                    counter++;
                }
            }
        }

    }

    public static Product[] generateBottle() {
        Product[] bottle_list = new Product[80];
        Random randomGen = new Random();
        int random_index = randomGen.nextInt(3);
        for(int i = 0; i < bottle_list.length; i++) {
            bottle_list[i] = new Product(BOTTLE_NAME[random_index],
                    BOTTLE_DESC[random_index],
                    BOTTLE_WHOLE_PRICE[random_index],
                    BOTTLE_RETAIL_PRICE[random_index]);
        }
        return bottle_list;
    }

    public static Product[] generateCan() {
        Product[] can_list = new Product[216];
        Random randomGen = new Random();
        int random_index = randomGen.nextInt(3);
        for(int i = 0; i < can_list.length; i++) {
            can_list[i] = new Product(CAN_NAME[random_index],
                    CAN_DESC[random_index],
                    CAN_WHOLE_PRICE[random_index],
                    CAN_RETAIL_PRICE[random_index]);
        }
        return can_list;
    }

    public static void insertDrinks(DrinkMachine machine) {
        int counter = 0;
        for(int i = 0; i < 5; i++) {
            if(counter >= 216) counter = 0;
            if(i < 3) {
                for (int j = 0; j < 6; j++) {
                    for (int k = 0; k < 12; k++) {
                        machine.addItem(generateCan()[counter], i, j);
                        counter++;
                    }
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 8; k++) {
                        machine.addItem(generateBottle()[counter], i, j);
                        counter++;
                    }
                }
            }
        }

    }

}
