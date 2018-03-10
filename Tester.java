import java.util.Random;
import java.util.ArrayList;
public class Tester{
    public static void main(String [] args){
        
        // Company severe = new Company("SevereCo");

        // for( Location locationObj : severe.getLocations()){
        //     System.out.println(locationObj.getName());
        // }
        Random randomGenerator = new Random();

        String str = "";
        int range = 26;
        int start = 65;
        for(int i = 0; i < 5; i++){

            int randomInt = randomGenerator.nextInt(range) + start;
            char randomChar = (char)randomInt;
            String randomString = Character.toString(randomChar);
            str += randomString;
            
        }
        System.out.println(str);

    }
}

