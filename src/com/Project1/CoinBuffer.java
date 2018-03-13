package com.Project1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CoinBuffer {
    private  Map<AbstractMachine.COINS, Integer> holdings = new HashMap<>();
    private double total = 0;
    private AbstractMachine parentMachine;

    public CoinBuffer(AbstractMachine ab) {
        holdings.put(AbstractMachine.COINS.NICKEL, 0);
        holdings.put(AbstractMachine.COINS.DIME, 0);
        holdings.put(AbstractMachine.COINS.QUARTER, 0);

        parentMachine = ab;
        int d = 9;
    }

    private void flush() {
        parentMachine.addQuarters(holdings.get(AbstractMachine.COINS.QUARTER));
        parentMachine.addDimes(holdings.get(AbstractMachine.COINS.DIME));
        parentMachine.addNickels(holdings.get(AbstractMachine.COINS.NICKEL));

        holdings.replace(AbstractMachine.COINS.QUARTER, 0);
        holdings.replace(AbstractMachine.COINS.DIME, 0);
        holdings.replace(AbstractMachine.COINS.NICKEL, 0);

        total = 0;
    }

    public void initiateInterface() {

        if (parentMachine instanceof SnackMachine)
            ((SnackMachine) parentMachine).displayInventory();
        else
            ((DrinkMachine) parentMachine).displayInventory();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String[] fullInput;
        String input = "";

        System.out.println("Type 'done' when you are done, or 'select A1' to select.");

        while (!input.toUpperCase().equals("DONE")) {
            try {
                fullInput = console.readLine().split(" ");
                input = fullInput[0];
                switch (input.toUpperCase()) {
                    case "QUARTER":
                        addQuarterToBuffer();
                        break;
                    case "DIME":
                        addDimeToBuffer();
                        break;
                    case "NICKEL":
                        addNickelToBuffer();
                        break;
                    case "SELECT":
                        try {
                            double difference = parentMachine.removeItem(fullInput[1], total);
                            if(difference>0)
                                System.out.println("Your Change is $" + difference);
                            //todo: greedy-algorithm(difference) for coins to return to user
                            flush();
                        } catch (BADENTRY b) {
                            System.out.println("That entry does not exist or is out of stock");
                        } catch (INSUFFICIENTFUNDS in) {
                            System.out.println("Not enough money");
                        }
                        parentMachine.displayInventory();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void addQuarterToBuffer() {
        int more = holdings.get(AbstractMachine.COINS.QUARTER);
        holdings.replace(AbstractMachine.COINS.QUARTER, more + 1);
        total += .25;
        System.out.println(total);
    }

    private void addDimeToBuffer() {
        int more = holdings.get(AbstractMachine.COINS.DIME);
        holdings.replace(AbstractMachine.COINS.DIME, more + 1);
        total += .1;
        System.out.println(total);
    }

    private void addNickelToBuffer() {
        int more = holdings.get(AbstractMachine.COINS.NICKEL);
        holdings.replace(AbstractMachine.COINS.NICKEL, more + 1);
        total += .05;
        System.out.println(total);
    }
}
