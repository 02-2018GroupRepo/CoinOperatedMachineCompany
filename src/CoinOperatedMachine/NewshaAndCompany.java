package CoinOperatedMachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NewshaAndCompany {

    public static void main(String args[]){
        System.out.println("Welcome to Newsha & Company");
        Snack sneakers = new Snack(1.0,0.5,"SN01","sneakers","sweet");
        Snack mAndm = new Snack(1.25,0.75,"MM02","m & m","coated milk chocolate");
        Drink springWater = new Drink(1.50,0.50,"SW03","Spring water","fresh water","bottle");
        Drink coce = new Drink(1.00,0.25,"CO","coce","regular","can");

        Operator theOperator = new Operator("123");
        Customer theCustomer = new Customer();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Which are you?");
            System.out.println("1. Customer");
            System.out.println("2. Operator");
            int input = Integer.valueOf(console.readLine());
         switch (input){

             case 1: theCustomer.switchToCustomer();
             break;
             case 2: theOperator.switchToOperator();
             break;
         }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try {
                console.close();
            }catch(Exception e){

            }
            console = null;
        }

    }
}
