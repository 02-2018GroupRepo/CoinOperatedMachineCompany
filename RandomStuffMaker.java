import java.util.Random;

public class RandomStuffMaker{
    private String strChar;
    private int strInt;
    private int alphabetPosition;
    private Random randomGenerator = new Random();

    public RandomStuffMaker(){
        this.alphabetPosition = 0;
        this.strChar = "A";
        this.strInt = 1;
    }

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
    public void setNextOrderedAlphabeticalCharacter(){
        int start = 65;
        this.alphabetPosition++;
        if(this.alphabetPosition > 26){
            this.alphabetPosition = 0;   
        }
        int currentInt = this.alphabetPosition + start;
        char currentChar = (char)currentInt;
        this.strChar = Character.toString(currentChar);        
        
    }

    public String getCurrentCharacter(){
        return this.strChar;
    }


    public void setNextAnOrderedNumber(){
        this.strInt++;
    }

    public String getAnOrderedNumber(){
        return this.strInt+"";
    }

    

}
