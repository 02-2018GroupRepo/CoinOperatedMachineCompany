package bootCamp;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();
        SnackMachine snack = new SnackMachine();
        int code = 8675309;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);

        //Operator constructor requires code to instantiate
        Operator op = new Operator(code);
        String locationName = "upstairs";
        String machineName = "firstSnack";
        SnackMachine temp;

        op.makeLocation(code,locationName); //Make a location
        op.getLocation(code,locationName).setName("upstairs");
        op.getLocation(code,locationName).addSnackMachine(machineName);
        op.getLocation(code,locationName).getMachine(machineName).setName("my first snack machine");
        System.out.println("Company: " + op.getLocation(code,locationName).getMachine(machineName).getCompanyName() + ", Machine: " + op.getLocation(code,locationName).getMachine(machineName).getMachineName());
        temp = (SnackMachine)op.getLocation(code,locationName).getMachine(machineName);
        op.getLocation(code,locationName).updateMachine(temp,machineName);
        temp = (SnackMachine)op.getLocation(code,locationName).getMachine(machineName);

        for (int i = 0; i < 15; i++)
            temp.insertCoin(op.getRandomCoin());


    }
}