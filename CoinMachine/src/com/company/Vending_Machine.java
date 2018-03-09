package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vending_Machine {

    String location;
    String company;

    int MAX_ITEM_COUNT;

    //Starting each vending machine with $20
    int numQ = 50; //Number of Quarters, $12.50
    int numN = 50; //Number of Nickels, $2.50
    int numD = 50; //Number of Dimesm $5.00

    Map<Products, Integer> inStock = new HashMap<Products, Integer>();
    Coins coin = new Coins();

    public Vending_Machine(){};

    public Vending_Machine(String location, String company){
                this.location = location;
                this.company = company;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getChange(double change){

        boolean done = false;
        int q = 0, d = 0, n = 0;
        while(!done){
            if((change - .25) >= 0.0){
                numQ--;
                q++;
                change -= .25;
                System.out.println(change);
            }
            else if((change - .10) >= 0.0){
                numD--;
                d++;
                change -= .10;
                System.out.println(change);
            }
            else if((change - .05) >= 0.0){
                numN--;
                n++;
                change -= 0.05;
                System.out.println(change);
            }
            else
                done = true;
        }

        return "Your Change: " + q + " Quarters " + d + " Dimes " + n + " Nickels";
    }

    public void addMoney(int q, int d, int n){
        numQ += q;
        numD += d;
        numN += n;
    }

    public void buyProduct(Products key){

        System.out.println("*Vending item*\n" + key.getName() + "\n*clunk*");
        inStock.put(key, inStock.get(key) - 1);
        if(inStock.get(key) == 0)
            inStock.remove(key);

    }

    public void attemptPurchase(int Q, int D, int N){
        double total = (Q* coin.QUARTER ) + (N * coin.NICKEL) + (D * coin.DIME);

        System.out.println("Make selection");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

            for(Products i : inStock.keySet()){
                if(choice.toLowerCase().equals(i.getName())) {
                    if (total > i.getRetailPrice()) {
                        addMoney(Q, D, N);
                        buyProduct(i);
                        System.out.println(getChange(total - i.getRetailPrice()));
                    } else if (total == i.getRetailPrice()) {
                        buyProduct(i);
                    } else{
                        System.out.println("Not Enough Currency\nReturning Money");
                    }
                    break;
                }
            }


    }

}
