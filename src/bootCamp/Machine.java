package bootCamp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Machine {

    private String machineName, companyName;
    private ArrayList<Coin> customerCoins;
    private ArrayList<Coin> machineMoney;
    private Random random = new Random();
    private String type;

                    /* GETTING INITIALIZED */
    public Machine(){
        companyName = "Venmo but not that Venmo";
        machineName = "default";
        type = "undifferentiated";
        customerCoins = new ArrayList<Coin>();
        machineMoney = new ArrayList<Coin>();
    }

    public Machine(String name) {
        companyName = "Venmo but not that Venmo";
        this.machineName = name;
        customerCoins = new ArrayList<Coin>();
        machineMoney = new ArrayList<Coin>();
    }

    public void setName(String name) {
        this.machineName = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMachineName() { return this.machineName; }

    public String getType() { return this.type; }

    public String getCompanyName() { return this.companyName; }


                                /* DEALING WITH MONEY */
    public void insertCoin(Coin coin) {
        customerCoins.add(coin);
    }

    public void printCustomerCoins() {
        for (Coin c : customerCoins)
            System.out.println(c.getType() + ", " + c.getValue());
    }

    public double getCashOnHand() {
        int nickelCount = 0;
        int dimeCount = 0;
        int quarterCount = 0;
        double cashOnHand = 0d;

        for (Coin c : machineMoney) {
            cashOnHand = c.getValue();
            if ( c.getValue() == 0.05)
                nickelCount++;
            else if (c.getValue() == 0.1)
                dimeCount++;
            else if (c.getValue() == 0.25)
                quarterCount++;
        }
        System.out.println("Coins on hand in machine " + this.machineName + ": " + nickelCount + " nickels, " + dimeCount + " dimes, " + quarterCount +
        " quarters.");

        return cashOnHand;
    }

    public void emptyCoins() {
        machineMoney.clear();
    }

    public double getCustomerCash() {
        double coins = 0d;
        for (Coin coin : customerCoins) {
            coins += coin.getValue();
        }
        return coins;
    }

    public void pay(double owed) {

        if (getCustomerCash() < owed)
            System.out.println("Insufficent funds.");

        else {
            while (owed > 0) {
                if (owed > 0.25 && customerCoins.contains(0.25)) {
                }
            }
        }
    }

    public void returnCoins(Operator operator) {
        for (Coin c : customerCoins) {
            operator.takeRefund(c);
        }
        customerCoins.clear();
    }

                            //Stock the machine

    public Queue<Product> stockCompartment(int x, Queue<Product> queue) {
        Product[] products = new Product[x];
        for (int i = 0; i < x; i++) {
            products[i] = new Product(random.nextInt(9999),"banana","a banana of dubious freshness",0.5,1.0);
        }
        for (int j = 0; j < x; j++) {
            queue.add(products[j]);
        }
        return queue;
    }

    public char int2Ascii(int i) {
        return (char)(i+65);
    }

    public int ascii2Int(char c) {
        return ((int)c)-65;
    }
}