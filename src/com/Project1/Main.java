package com.Project1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {

        DasCompany dasCompany = new DasCompany();
        ArrayList<AbstractMachine> machines = new ArrayList<>();
        ArrayList<Location> locations = new ArrayList<>();

        Location BB542 = new Location("Atlanta", "Bobbert's Buffet","BB542");
        Location BB532 = new Location("Baltimore", "Bobbert's Buffet","BB532");
        Location EE542 = new Location("New York", "Eric's Eatery","EE542");
        Location FF42 = new Location("Seattle", "Frank Food","FF42");
        locations.add(BB542);
        locations.add(BB532);
        locations.add(EE542);
        locations.add(FF42);
        Operator smoothOperator = new Operator("Bob", "123");

        //DrinkMachine drinkMachine = new DrinkMachine(BB532);
        //drinkMachine.getMoneyAmount();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Drink or Snack?");
        try {
            String input = console.readLine();
            if (input.toUpperCase().equals("SNACK")){
                onSnackSelected(BB532);
            }
            else if(input.toUpperCase().equals("DRINK")){
                onDrinkSelected(BB532);
            }
        }catch (Exception e ){
            e.printStackTrace();
        }


        //my.displayInventory();
        //System.out.println();

       // smoothOperator.getLogFile(my);
       // machines.add(smoothOperator.addMachine(locations.get(2),"SNACKMACHINE"));
        //smoothOperator.getLogFile(locations.get(2).machines.get(0));
        //System.out.println("This Machine Accepts The Following: " +my.getAcceptedCoins());
        //System.out.println(machines.get(0).getLocation());
    }

    private static void onSnackSelected(Location loc){
        SnackMachine snackMachine = new SnackMachine( loc);


    }
    private static void onDrinkSelected(Location loc){
        DrinkMachine drinkMachine = new DrinkMachine(loc);

    }
}
