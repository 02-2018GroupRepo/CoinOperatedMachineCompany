package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Operator {
    private ArrayList<Location> locationsArr = new ArrayList<Location>();
    private static final String password = "on a diet";

    public ArrayList<Location> getLocationsArr() {
        System.out.println("Password: ");
        Scanner pass = new Scanner(System.in);
        if (pass.equals(password)) {
            printLocations(locationsArr);
            return locationsArr;
        }
        else{
            System.out.println("Wrong Password. Bye.");
            System.exit(0);
            return null;
        }
    }

    public void printLocations(ArrayList<Location> locations){
        System.out.println("Locations: ");
        for(int i=0; i < locations.size(); i++){
            System.out.printf(locations.get(i).getName() + " | ");
        }
        System.out.println("");
    }

    public void addToLocation(VendingMachine machine){
        locationsArr = getLocationsArr();
        System.out.println("Which location would you like to add the machine?");
        Scanner input = new Scanner(System.in);
        String loc = input.nextLine();
        for(int i=0; i < locationsArr.size(); i++){
            if (locationsArr.get(i).getName().equals(loc)){
                locationsArr.get(i).addMachine(machine);
                System.out.println("Machine added.");
            } else {
                System.out.println("Sorry that location does not exist.");
            }
        }
    }

    public void checkTotalMoney(){
        double total = 0.00;
        locationsArr = getLocationsArr();
        for (int i=0; i < locationsArr.size(); i++){
            for(int j=0; j < locationsArr.get(i).getMachines().size(); j++) {
                total += locationsArr.get(i).getMachines().get(j).getWallet().getTotal();
            }
        }
        System.out.println("Total: $" + total);
    }

    public void checkTotalCoins(){
        locationsArr = getLocationsArr();
        for (int i=0; i <locationsArr.size(); i++){
            for(int j=0; j < locationsArr.get(i).getMachines().size(); j++) {
                VendingMachine vMachine = locationsArr.get(i).getMachines().get(j);
                System.out.println("Location: " + locationsArr.get(i).getName());
                System.out.println("Nickels: " + vMachine.getWallet().getNickels());
                System.out.println("Dimes: " + vMachine.getWallet().getDimes());
                System.out.println("Quarters: " + vMachine.getWallet().getQuarters());
            }
        }
    }


    public void removeFromLocation(){
        locationsArr = getLocationsArr();
        System.out.println("Which location would you like to remove a machine?");
        Scanner input = new Scanner(System.in);
        String loc = input.nextLine();
        for(int i=0; i < locationsArr.size(); i++){
            if (locationsArr.get(i).getName().equals(loc)){
                locationsArr.get(i).printMachines();
                System.out.println("Which machine do you want to remove?");
                Scanner remP = new Scanner(System.in);
                int rem = remP.nextInt();
                locationsArr.get(i).removeMachine(rem);
                System.out.println("Machine has been removed");
            }
            else{
                System.out.println("Sorry machine does not exist.");
            }
        }
    }
}
