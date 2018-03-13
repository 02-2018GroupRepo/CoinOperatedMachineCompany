package com.Project1;

import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class SnackMachine extends AbstractMachine {

    SnackMachine( Location location) {
        myMachineID = ++AbstractMachine.lastMachineID;
        this.myLocation= location;

        createRows();
        createLogFile();

        hardCodedMachineFiller();




        coinBuffer = new CoinBuffer(this);
        coinBuffer.initiateInterface();

    }

    public void createLogFile(){
        String machineStringID = Integer.toString(myMachineID);


        String log;
        String OS = System.getProperty("os.name").toLowerCase();
        if(OS.contains("windows")){
            log="logs\\";
        }else
        {
            log = "logs/";

        }


        URL logFolder = getClass().getResource(log);
        String machineLogPath = logFolder.getPath() + machineStringID + ".txt";

        File file = new File(machineLogPath);

        try {
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(file);
                writer.write("Created \t\t\t " + LocalDateTime.now());
                writer.flush();
                writer.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    public void displayInventory(){

        for (LinkedList[] row : machine) {
            System.out.println();
            for (LinkedList col : row) {
                if (col.size() > 0) {
                    Product p = (Product) col.peek();
                    System.out.print(p.name + " $" + p.retailPrice + " ");
                } else System.out.print("\t\t");
            }
        }
        System.out.println();

    }
    void hardCodedMachineFiller() {
        Product chips = new Product("BBQ", "patao", 3.50, .50);
        Product chips2 = new Product("Sea Salt", "patao", 3.50, .50);
        Product chips3 = new Product("Salt and Vinegar", "patao", 3.50, .50);
        Product chips4 = new Product("Pizza Chips", "patao", 3.50, .50);
        Product chips5 = new Product("Honey BBQ", "patao", 3.50, .50);
        Product chips6 = new Product("Plain", "patao", 3.50, .50);

        Product candy = new Product("Snicker", "patao", 3.50, .50);
        Product candy2 = new Product("Twix", "patao", 3.50, .50);
        Product candy3 = new Product("Dove", "patao", 3.50, .50);
        Product candy4 = new Product("Hersey", "patao", 3.50, .50);


        machine[1][3].add(chips);
        machine[1][4].add(chips2);
        machine[2][3].add(chips3);
        machine[2][4].add(chips4);
        machine[2][4].add(chips5);
        machine[4][4].add(candy2);
        machine[3][4].add(candy3);

    }
    private void createRows(){
        int rows =5;
        int columns =5;
        machine = new LinkedList[rows][columns];


        //instantiate every slot vector of the vending machine to size 0 instead of null
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                machine[i][j] = new LinkedList<Product>();
            }
        }
    }

}
