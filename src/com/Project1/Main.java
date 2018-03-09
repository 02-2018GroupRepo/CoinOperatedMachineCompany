package com.Project1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DasCompany dasCompany = new DasCompany();
        ArrayList<AbstractMachine> machines = new ArrayList<>();
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Atlanta", "Bobbert's Buffet","BB542"));
        locations.add(new Location("Baltimore", "Bobbert's Buffet","BB532"));
        locations.add(new Location("New York", "Eric's Eatery","EE542"));
        locations.add(new Location("Seattle", "Frank Food","FF42"));


        Operator smoothOperator = new Operator("Bob", "123");

        SnackMachine my = new SnackMachine(5, 5);
        //my.displayInventory();
        System.out.println();

        smoothOperator.getLogFile(my);
        smoothOperator.addMachine(locations.get(2),"SNACKMACHINE");
        smoothOperator.getLogFile(locations.get(2).machines.get(0));

    }
}
