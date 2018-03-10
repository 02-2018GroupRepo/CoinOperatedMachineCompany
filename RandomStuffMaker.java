import java.util.Random;

public class RandomStuffMaker{
    private String stuff;
    private Random randomGenerator = new Random();

    public String getRandom6Characters(){
        String str = "";
        int range = 26;
        int start = 65;
        for(int i = 0; i < 6; i++){

            int randomInt = randomGenerator.nextInt(range) + start;
            char randomChar = (char)randomInt;
            String randomString = Character.toString(randomChar);
            str += randomString;
            
        }
        return str;
    }

}
