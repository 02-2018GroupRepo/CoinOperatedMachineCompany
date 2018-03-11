package com.machine;

import com.Product.Product;
import com.coin.Coin;
import com.helper.Helper;

import java.util.LinkedList;

public class SnackMachine extends Machine {

    private final String TYPE = "SNACK";
    private LinkedList<Product>[][] shelf;
    private static int id = 0;
    private int m_id;
    private int num_nickel;
    private int num_dime;
    private int num_quarter;

    public SnackMachine() {
        shelf = new LinkedList[5][5];
        this.instantiate();
        num_nickel = 2;
        num_dime = 2;
        num_quarter = 4;
        m_id = id;
        id++;
    }

    @Override
    public void instantiate() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                this.shelf[i][j] = new LinkedList<>();
            }
        }
    }

    @Override
    public void addItem(Product product, int shelf, int comp) {
        this.shelf[shelf][comp].add(product);
    }

    @Override
    public void removeItem(Product product, int shelf, int comp) {
        this.shelf[shelf][comp].remove(product);
    }

    @Override
    public Product sell(int shelf, int comp, int num_nickel, int num_dime, int num_quarter) {
        Product soldItem = this.shelf[shelf][comp].getFirst();
        double price = soldItem.getRetail_price();
        double cus_money = (Coin.getNickel() * num_nickel) +
                (Coin.getDIME() * num_dime) +
                (Coin.getQUARTER() * num_quarter);
        double change = cus_money - price;
        this.shelf[shelf][comp].remove();

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
        System.out.println(super.getCOMPANY() + " " + this.TYPE + " machine #" + this.getM_id());
    }

    @Override
    public void printAvailableItems() {
        System.out.println(super.getCOMPANY() + "'s Snack Machine " + this.getM_id() + ":");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(i + "" + j + ": " + this.getShelf(i)[i][j].getFirst().getProduct_name() + " "
                                    + this.getShelf(i)[i][j].getFirst().getRetail_price() + "||");
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
        return this.shelf;
    }
}
