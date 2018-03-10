import java.util.Random;
import java.util.ArrayList;

public class Location{
    private String name;
    private ArrayList<SnackMachines> sMList = new ArrayList<SnackMachines>();
    private ArrayList<DrinkMachines> dMList = new ArrayList<DrinkMachines>();


    public Location(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    // public void setSnackMachines(){
    //     for(int i = 0; 0 < 10; i++){
    //         new SnackMachine("Smyrna")

    //     }

    // }


    // public void setSnackMachines(){
    //     for(int i = 0; 0 < 10; i++){
            
    //     }
    // }

    // public String generateRandomString(){
    //     for(int i = 0; 0 < 5; i++){
    //         int randomInt = randomGenerator.nextInt(26)+65;
            
    //     }
    // }


}

