package com.machine;

import com.Product.Product;
import com.coin.Coin;
import com.helper.Helper;

import java.util.LinkedList;

public class DrinkMachine extends Machine {

    private final String TYPE = "DRINK";
    private LinkedList<Product>[][] can_shelf;
    private LinkedList<Product>[][] bottle_shelf;
    private static int id = 0;
    private int m_id;
    private int num_nickel;
    private int num_dime;
    private int num_quarter;

    public DrinkMachine() {
        can_shelf = new LinkedList[3][6];
        bottle_shelf = new LinkedList[2][5];
        this.instantiate();
        num_nickel = 5;
        num_dime = 5;
        num_quarter = 5;
        m_id = id;
        id++;
    }

    @Override
    public void instantiate() {
        for(int i = 0; i < 5; i++) {
            if(i < 3) {
                for (int j = 0; j < 6; j++) {
                    this.can_shelf[i][j] = new LinkedList<>();
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    this.bottle_shelf[i - 3][j] = new LinkedList<>();
                }
            }
        }
    }

    @Override
    public void addItem(Product product, int shelf, int comp) {
        if(shelf < 3) this.can_shelf[shelf][comp].add(product);
        else this.bottle_shelf[shelf - 3][comp].add(product);
    }

    @Override
    public void removeItem(Product product, int shelf, int comp) {
        if(shelf < 3) this.can_shelf[shelf][comp].remove(product);
        else this.bottle_shelf[shelf - 3][comp].remove(product);
    }

    @Override
    public Product sell(int shelf, int comp, int num_nickel, int num_dime, int num_quarter) {
        Product soldItem;
        if(shelf < 3) {
            soldItem = this.can_shelf[shelf][comp].getFirst();
            this.can_shelf[shelf][comp].remove();
        }
        else {
            soldItem = this.bottle_shelf[shelf - 3][comp].getFirst();
            this.bottle_shelf[shelf - 3][comp].remove();
        }

        double price = soldItem.getRetail_price();
        double cus_money = (Coin.getNickel() * num_nickel) +
                (Coin.getDIME() * num_dime) +
                (Coin.getQUARTER() * num_quarter);
        double change = cus_money - price;

        if(change < 0) {
            System.err.printf("[ERROR]: NOT ENOUGH MONEY. HERE IS YOUR $%.2f BACK\n", cus_money);
            System.exit(1);
        } else if(change == 0) {
            setNum_nickel(this.num_nickel + num_nickel);
            setNum_dime(this.num_dime + num_dime);
            setNum_quarter(this.num_quarter + num_quarter);
            System.out.printf("Here is your %s.\n", soldItem.getProduct_name());
        }
        else {
            double temp_change = Helper.roundTwoDecimal(change);
            int change_num_quarter = 0;
            int change_num_dime = 0;
            int change_num_nickel = 0;
            change_num_quarter = Coin.calculateChange(temp_change, (this.num_quarter + num_quarter), 0.25);
            temp_change = Helper.roundTwoDecimal(temp_change - (change_num_quarter * 0.25));
            change_num_dime = Coin.calculateChange(temp_change, (this.num_dime + num_dime), 0.10);
            temp_change = Helper.roundTwoDecimal(temp_change - (change_num_dime * 0.10));
            change_num_nickel = Coin.calculateChange(temp_change, (this.num_nickel + num_nickel), 0.05);
            temp_change = Helper.roundTwoDecimal(temp_change - (change_num_nickel * 0.05));
            if(temp_change > 0) {
                System.err.printf("[ERROR]: OUT OF COINS. CANNOT RETURN CHANGE. HERE IS YOUR $%.2f BACK.", cus_money);
                System.exit(1);
            } else {
                setNum_nickel(this.num_nickel + num_nickel - change_num_nickel);
                setNum_dime(this.num_dime + num_dime - change_num_dime);
                setNum_quarter(this.num_quarter + num_quarter - change_num_quarter);
                System.out.printf("Here is your %s and change: $%.2f\n", soldItem.getProduct_name(), change);
            }
        }
        return soldItem;
    }

    @Override
    public double checkCoins() {
        System.out.println(this.TYPE + " machine #" + this.getM_id() + "-----------------------\n" +
                "NICKEL: " + this.getNum_nickel() + "\n" +
                "DIME: " + this.getNum_dime() + "\n" +
                "QUARTER: " + this.getNum_quarter());
        return (Coin.getNickel() * this.getNum_nickel()) + (Coin.getDIME() * this.getNum_dime()) + (Coin.getQUARTER() * this.getNum_quarter());
    }

    @Override
    public void print() {
        System.out.println(super.getCOMPANY() +  " " + this.TYPE + " machine #" + this.getM_id());
    }

    @Override
    public void printAvailableItems() {
        System.out.println(super.getCOMPANY() +  "'s Drink Machine " + this.getM_id() + ":");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 6; j++) {
                System.out.print(i + "" + j + ": " + this.getShelf(i)[i][j].getFirst().getProduct_name() + " "
                        + this.getShelf(i)[i][j].getFirst().getRetail_price() + "||");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print((i + 3) + "" + j + ": " + this.getShelf(i + 3)[i][j].getFirst().getProduct_name() + " "
                        + this.getShelf(i + 3)[i][j].getFirst().getRetail_price() + "||");
            }
            System.out.println();
        }
    }

    public int getNum_nickel() {
        return num_nickel;
    }

    public void setNum_nickel(int num_nickel) {
        this.num_nickel = num_nickel;
    }

    public int getNum_dime() {
        return num_dime;
    }

    public void setNum_dime(int num_dime) {
        this.num_dime = num_dime;
    }

    public int getNum_quarter() {
        return num_quarter;
    }

    public void setNum_quarter(int num_quarter) {
        this.num_quarter = num_quarter;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public LinkedList<Product>[][] getShelf(int shelf) {
        if(shelf < 3) return can_shelf;
        else return bottle_shelf;
    }
}
