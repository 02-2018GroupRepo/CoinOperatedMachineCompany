import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

//
          SnackMachine sm = new SnackMachine();
//        sm.setCompany("Grab N Geaux");
//        sm.addLocation("Marietta");
//        System.out.println(sm.getCompany());
//        SnackMachine sm = new SnackMachine();
       DrinkMachine dm = new DrinkMachine();
//        dm.displayItems();
        try (BufferedReader customer = new BufferedReader(new InputStreamReader(System.in))) {
             int vendingMachineSelection;
             double coinInsert;
            System.out.println("Choose a Vending Machine.\n" +
                            "Select 1 for Snack Machine.\n" +
                            "Select 2 for Drink Machine.");
            String input = customer.readLine();
            vendingMachineSelection = Integer.parseInt(input);

            switch(vendingMachineSelection){
                case 1 : sm.displayItems();
                    System.out.println("***************************");
                    System.out.println("Make a selection by choosing the ID\n");
                    input = customer.readLine();
                    sm.selectItem(input);
                    System.out.println("Insert Money: ");
                    input = customer.readLine();
                    coinInsert = Double.parseDouble(input);
                    sm.insertCoin(coinInsert);
                    break;
                case 2 : dm.displayItems();
                    System.out.println("***************************");
                    System.out.println("Make a selection by choosing the ID\n");
                    input = customer.readLine();
                    dm.selectItem(input);
                    System.out.println("Insert Money: ");
                    input = customer.readLine();
                    coinInsert = Double.parseDouble(input);
                    dm.insertCoin(coinInsert);
                    break;
                default :
                    System.out.println("Not A Valid Vending Machine");

            }





        }catch(Exception e) {
            System.out.println(e);
        }








    }
}
