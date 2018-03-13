package com.Project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;

public abstract class AbstractMachine {


    static final String COMPANY = "Backpfeifengesicht";
    Map<COINS, Integer> holdings = new HashMap<>();
    Location myLocation;
    protected static int lastMachineID = 12345;
    static ArrayList<String> validIDS = new ArrayList<>();
    int myMachineID;
    LinkedList[][] machine;
    public enum COINS {
        NICKEL(.05), DIME(.10), QUARTER(.25);
        double value;

        COINS(double v) {
            value = v;
        }

        double getValue() {
            return value;
        }
    }
    CoinBuffer coinBuffer;

    AbstractMachine() {
        holdings.put(COINS.NICKEL, 0);
        holdings.put(COINS.DIME, 0);
        holdings.put(COINS.QUARTER, 0);

        getLogFile("123");
    }

    public Location getMyLocation() {
        return myLocation;
    }

    void getMoneyAmount(){
        double total =0;
        for(Map.Entry<COINS, Integer> m : holdings.entrySet()){
            System.out.println(m.getKey() + ":\t\t" + m.getValue());
            total+= m.getKey().getValue() * m.getValue();
        }
        System.out.println("Total $:\t"+total);
    }

    void changeLocation(Location location) {
        this.myLocation = location;
    }

    String getLocation() {
        return (myLocation.getCity() + " " + myLocation.getStore() + " " + myLocation.getChain());
    }

    String getAcceptedCoins() {
        StringBuilder acceptable = new StringBuilder();
        for (COINS c : COINS.values()) {
            acceptable.append(c).append(" ");
        }
        return acceptable.toString();
    }

    public void addItem(String RowColumn, Product product) throws BADENTRY {
        char[] entry = RowColumn.toCharArray();
        int row;
        int col;


        switch (entry[0]) {
            case 'A':
                row = 0;
                break;
            case 'B':
                row = 0;
                break;
            case 'C':
                row = 0;
                break;
            case 'D':
                row = 0;
                break;
            case 'E':
                row = 0;
                break;
            default:
                throw new BADENTRY();
        }
        col = entry[1];
        machine[row][col].add(product);


    }

    public double removeItem(String RowColumn, double runningTotal) throws BADENTRY, INSUFFICIENTFUNDS{

        char[] entry = RowColumn.toCharArray();
        int row;
        int col;


        switch (entry[0]) {
            case 'A' :
                row = 0;
                break;
            case 'B':
                row = 1;
                break;
            case 'C':
                row = 2;
                break;
            case 'D':
                row = 3;
                break;
            case 'E':
                row = 4;
                break;
            default:
                throw new BADENTRY();
        }
        col = Character.getNumericValue(entry[1]);

        if((( machine[row][col].isEmpty()))){
            throw new BADENTRY();
        }

        double price = (((Product) machine[row][col].peek()).retailPrice);

        try {
            if(price>runningTotal){
                throw new INSUFFICIENTFUNDS();
            }

            machine[row][col].pop();

        }catch (ArrayIndexOutOfBoundsException ar){
            throw new BADENTRY();

        }
        return runningTotal-price;
    }

    abstract void displayInventory();

    public void getLogFile(String employeeID) {

        if (validIDS.contains(employeeID)) {

            String log;
            String OS = System.getProperty("os.name").toLowerCase();
            if(OS.contains("windows")){
                log="logs\\";
            }else
            {
                log = "logs/";

            }
            String logPathName = log + myMachineID + ".txt";

            URL url = getClass().getResource(logPathName);
            File file = new File(url.getPath());

            try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException x) {
                System.err.format("IOException: %s%n", x);
            } catch (NullPointerException n) {
                System.out.println("You must be using Windows you filthy animal?");
            }

        }

    }
    public void addQuarters(int amount){
        int currentAmount = holdings.get(COINS.QUARTER);
        int newAount = currentAmount + amount;
        holdings.replace(COINS.QUARTER, newAount);
    }
    public void addDimes(int amount){
        int currentAmount = holdings.get(COINS.DIME);
        int newAount = currentAmount + amount;
        holdings.replace(COINS.DIME, newAount);
    }
    public void addNickels(int amount){
        int currentAmount = holdings.get(COINS.NICKEL);
        int newAount = currentAmount + amount;
        holdings.replace(COINS.NICKEL, newAount);
    }

}
