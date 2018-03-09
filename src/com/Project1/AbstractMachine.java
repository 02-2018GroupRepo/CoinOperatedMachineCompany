package com.Project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;

public abstract class AbstractMachine {

    File log;
    Location myLocation;
    protected static int lastMachineID = 12345;
    static ArrayList<String> validIDS = new ArrayList<>();
    int myMachineID;

    protected LinkedList[][] machine;


    AbstractMachine() {
    }


    AbstractMachine(int columns, int rows) {


        validIDS.add("123");
        machine = new LinkedList[rows][columns];


        //instantiate every slot vector of the vending machine to size 0 instead of null
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                machine[i][j] = new LinkedList<Product>();
                int t = 4;
            }
        }
        hardCodedMachineFiller();

    }


    enum coins {
        NICKEL, DIME, QUARTER
    }

    void changeLocation(Location location) {
        this.myLocation = location;
    }

    String getLocatoion() {
        return (myLocation.getCity() + " " + myLocation.getStore() + " " + myLocation.getChain());
    }

    String getAcceptedCoins() {
        StringBuilder acceptable = new StringBuilder();
        for (coins c : coins.values()) {
            acceptable.append(c).append(" ");
        }
        return acceptable.toString();
    }

    public void addItem(String RowColomn, Product product) throws BADENTRY {
        char[] entry = RowColomn.toCharArray();
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

    public void displayInventory() {
        for (LinkedList[] row : machine) {
            System.out.println();
            for (LinkedList col : row) {
                if (col.size() > 0) {
                    Product p = (Product) col.peek();
                    System.out.print(p.name + " $" + p.retailPrice + " ");
                } else System.out.print("\t\t");
            }
        }
    }

    void hardCodedMachineFiller() {
        Product chips = new Product("BBQ", "patao", 3.50, 4.50);
        Product chips2 = new Product("Sea Salt", "patao", 3.50, 4.50);
        Product chips3 = new Product("Salt and Vinegar", "patao", 3.50, 4.50);
        Product chips4 = new Product("Pizza Chips", "patao", 3.50, 4.50);
        Product chips5 = new Product("Honey BBQ", "patao", 3.50, 4.50);
        Product chips6 = new Product("Plain", "patao", 3.50, 4.50);

        Product candy = new Product("Snicker", "patao", 3.50, 4.50);
        Product candy2 = new Product("Twix", "patao", 3.50, 4.50);
        Product candy3 = new Product("Dove", "patao", 3.50, 4.50);
        Product candy4 = new Product("Hersey", "patao", 3.50, 4.50);


        machine[1][3].add(chips);
        machine[1][4].add(chips2);
        machine[2][3].add(chips3);
        machine[2][4].add(chips4);
        machine[2][4].add(chips5);
        machine[4][4].add(candy2);
        machine[3][4].add(candy3);

    }

    public void getLogFile(String employeeID) {

        if (validIDS.contains(employeeID)) {


            String logPathName = "logs/" + myMachineID + ".txt";
            //log = new File(logPathName);
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




}
