package com.test;

import com.location.Location;
import com.machine.DrinkMachine;
import com.machine.Machine;
import com.machine.SnackMachine;

import java.util.*;

public class Test {

    private final static String PASSWORD = "syntel";
    private static Map<Integer, Location> locations = new TreeMap<>();
    private static int location_id = 0;

    public static void welcomeMessage() {
        System.out.print("Welcome!\nIf you are customer enter 1.\nIf you are operator enter 2.\n>> ");
    }

    public static boolean welcomeOperatorMessage(Scanner userInput) {
        System.out.print("Please enter the password to proceed >> ");
        if(getUserStr(userInput).equals(PASSWORD)) return true;
        else return false;
    }

    public static void showLocations() {
        System.out.println("Please select your location!");
        printLocations();
    }

    public static void showOpeartorOptions() {
        System.out.println("1) Add machine\n" +
                        "2) Remove machine\n" +
                        "3) Check money in machine");
    }

    public static void showMachineOptions() {
        System.out.println("1) Check one machine\n" +
                        "2) Check all machines\n" +
                        "3) Check specific location");
    }

    public static void errorMessage() {
        System.err.println("[ERROR]: INVALID INPUT");
    }

    public static void installToNewLocation(Location location) {
        locations.put(location_id, location);
        location_id++;
    }

    public static void printLocations() {
        Iterator<Map.Entry<Integer, Location>> location_iter = locations.entrySet().iterator();
        while(location_iter.hasNext()) {
            Map.Entry<Integer, Location> location_entry = location_iter.next();
            System.out.println((location_entry.getKey() + 1) + ": " + location_entry.getValue().getName());
        }
    }

    public static String getUserStr(Scanner userInput) {
        return userInput.nextLine();
    }

    public static boolean isNumeric(String str) {
        boolean numeric = true;
        try {
            Integer num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        return numeric;
    }

    public static double getLocMoney(int locNum) {
        double loc_money = 0;
        ArrayList<Machine> loc_machines = locations.get(locNum - 1).getMachine_list();
        for(int i = 0; i < loc_machines.size(); i++) {
            loc_money += loc_machines.get(i).checkCoins();
            System.out.println();
        }
        return loc_money;
    }

    public static double getTotalMoney() {
        double total_money = 0;
        Iterator<Map.Entry<Integer, Location>> loc_iter = locations.entrySet().iterator();
        while(loc_iter.hasNext()) {
            Map.Entry<Integer, Location> loc_entry = loc_iter.next();
            ArrayList<Machine> machines = loc_entry.getValue().getMachine_list();
            for(int i = 0; i < machines.size(); i++) {
                total_money += machines.get(i).checkCoins();
                System.out.println();
            }
            System.out.println();
        }
        return total_money;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Location georgia = new Location("GA");
        Location alabama = new Location("AL");
        Location n_carolina = new Location("NC");
        SnackMachine snackMachine = new SnackMachine();
        DrinkMachine drinkMachine = new DrinkMachine();
        DrinkMachine drinkMachine1 = new DrinkMachine();
        ProductGenerator.insertSnacks(snackMachine);
        ProductGenerator.insertDrinks(drinkMachine);
        ProductGenerator.insertDrinks(drinkMachine1);
        int userInt;

        georgia.addMachine(snackMachine);
        georgia.addMachine(drinkMachine1);
        alabama.addMachine(drinkMachine);

        installToNewLocation(georgia);
        installToNewLocation(alabama);
        installToNewLocation(n_carolina);

        welcomeMessage();
        userInt = userInput.nextInt();
        userInput.nextLine();

        switch(userInt) {
            case 1:
                showLocations();
                System.out.print(">> ");
                userInt = userInput.nextInt();
                userInput.nextLine();
                if(userInt - 1 < locations.size()) {
                    int index = userInt - 1;
                    locations.get(index).print();
                    System.out.print(">> ");
                    userInt = userInput.nextInt();
                    userInput.nextLine();
                    System.out.println();
                    if(userInt - 1 < locations.get(index).getMachine_list().size()) {
                        ArrayList<Machine> machine_list = locations.get(index).getMachine_list();
                        index = userInt - 1;
                        Machine machine = machine_list.get(index);
                        machine.printAvailableItems();
                        System.out.println("Enter the Item number");
                        System.out.print(">> ");
                        String userStr = getUserStr(userInput);
                        if((userStr.length() == 2) && (isNumeric(userStr))) {
                            int first = Character.getNumericValue(userStr.charAt(0));
                            int second = Character.getNumericValue(userStr.charAt(1));
                            System.out.print("Enter the amount of NICKEL >> ");
                            int num_nickel = userInput.nextInt();
                            userInput.nextLine();
                            System.out.print("Enter the amount of DIME >> ");
                            int num_dime = userInput.nextInt();
                            userInput.nextLine();
                            System.out.print("Enter the amount of QUARTER >> ");
                            int num_quarter = userInput.nextInt();
                            userInput.nextLine();
                            machine.sell(first, second, num_nickel, num_dime, num_quarter);
                        }
                    } else errorMessage();
                } else errorMessage();
                break;
            case 2:
                if(!welcomeOperatorMessage(userInput)) System.err.println("[ERROR]: FAIL TO AUTHENTICATE");
                else {
                    showOpeartorOptions();
                    System.out.print(">> ");
                    userInt = userInput.nextInt();
                    userInput.nextLine();
                    if(userInt == 1 || userInt == 2) {
                        showLocations();
                        System.out.print(">> ");
                        int locInt = userInput.nextInt();
                        userInput.nextLine();
                        if(userInt == 1) {
                            locations.get(locInt - 1).addMachine(new SnackMachine());
                        } else {
                            locations.get(locInt - 1).print();
                            System.out.print(">> ");
                            int macNum = userInput.nextInt();
                            userInput.nextLine();
                            if(macNum <= locations.get(locInt - 1).getMachine_list().size()) {
                                locations.get(locInt - 1).getMachine_list().get(macNum - 1).print();
                                locations.get(locInt - 1).removeMachine(macNum - 1);
                                System.out.println("IS REMOVED SUCCESSFULLY!");
                                locations.get(locInt - 1).print();
                            } else {
                                errorMessage();
                            }
                        }
                    } else if(userInt == 3) {
                        showMachineOptions();
                        System.out.print(">> ");
                        userInt = userInput.nextInt();
                        userInput.nextLine();
                        if(userInt == 1 || userInt == 3) {
                            showLocations();
                            System.out.print(">> ");
                            int locInt = userInput.nextInt();
                            userInput.nextLine();
                            if(userInt == 1) {
                                Location temp_location = locations.get(locInt - 1);
                                temp_location.print();
                                System.out.print(">> ");
                                int macInt = userInput.nextInt();
                                userInput.nextLine();
                                if(macInt > temp_location.getMachine_list().size()) {
                                    errorMessage();
                                } else {
                                    System.out.printf("The amount of money in this machines: $%.2f\n", temp_location.getMachine_list().get(macInt - 1).checkCoins());
                                }
                            } else {
                                System.out.printf("The amount of money in %s area: $%.2f\n", locations.get(locInt - 1).getName(), getLocMoney(locInt));
                            }
                        } else if(userInt == 2) {
                            System.out.printf("The amount of money in all machines: $%.2f\n", getTotalMoney());
                        }
                        else {
                            errorMessage();
                        }
                    } else {
                        errorMessage();
                    }
                }
                break;
            default:
                errorMessage();
        }



//        georgia.print();
//        System.out.println();
//        alabama.print();
//        System.out.println();
//        n_carolina.print();

//        snackMachine.printAvailableItems();
//        System.out.println();
//        drinkMachine.printAvailableItems();


    }
}
