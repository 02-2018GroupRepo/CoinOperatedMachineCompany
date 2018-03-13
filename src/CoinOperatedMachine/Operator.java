package CoinOperatedMachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operator {
    private String securityCode;

    public Operator(String secu) {
    this.securityCode=secu;
    }

    public void switchToOperator() {
        chooseActivity();
    }

    public void chooseActivity() {
        System.out.println("What do you want to do?");
        System.out.println("1. Add a machine");
        System.out.println("2. Remove a machine");
        System.out.println("3. Check the amount of money in each machine");
        System.out.println("4. Check the amount of money in all machines");
        System.out.println("5.Check the amount of money by location");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try {
            int input = Integer.valueOf(console.readLine());
            System.out.print("You chose ");
            switch (input) {
                case 1: {
                    System.out.println("1. Add a machine");
                    addAMachine();
                    break;
                }
                case 2: {
                    System.out.println("2. Remove a machine");
                    break;
                }
                case 3: {
                    System.out.println("3. Check the amount of money in each machine");
                    break;
                }
                case 4: {
                    System.out.println("4. Check the amount of money in all machines");
                    break;
                }
                case 5: {
                    System.out.println("5.Check the amount of money by location");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                console.close();
            } catch (Exception e) {

            }
            console = null;
        }
    }
    private void addAMachine(){
        System.out.println("What kind of machine do you wand to add?");
        System.out.println("1. Snack machine");
        System.out.println("2. Drink machine");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try {
            int input = Integer.valueOf(console.readLine());

            System.out.print("You chose ");
            switch (input) {
                case 1: {
                    System.out.println("1. Snack machine");
                    Machine machine1 = new SnackVendingMachine(Location.specifyLocation());
                    Company.getMachines().add(machine1);
                    break;
                }
                case 2: {
                    System.out.println("2. Drink machine");
                    // How to avoid having to write these two lines of code repeatedly?!
                    Machine machine1 = new DrinkVendingMachine(Location.specifyLocation());
                    Company.getMachines().add(machine1);
                    break;
                }
            }


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                console.close();
            } catch (Exception e) {

            }
            console = null;
        }
    }
}
