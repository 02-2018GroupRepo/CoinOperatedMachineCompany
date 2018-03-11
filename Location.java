import java.util.Random;
import java.util.ArrayList;

public class Location{
    private String name;
    public ArrayList<SnackMachine> sMList = new ArrayList<SnackMachine>();
    private ArrayList<DrinkMachine> dMList = new ArrayList<DrinkMachine>();
    private RandomStuffMaker lazily = new RandomStuffMaker();

    public Location(String name){
        this.name = name;
        setSnackMachines();
        setDrinkMachines();
    }

    public String getName(){
        return this.name;
    }

    public void setSnackMachines(){
        for(int i = 0; i < 5; i++){
            String randStr = lazily.getRandom6Characters();
            (this.sMList).add(new SnackMachine(randStr));
        }

    }
    public void setDrinkMachines(){
        for(int i = 0; i < 5; i++){
            String randStr = lazily.getRandom6Characters();
            (this.dMList).add(new DrinkMachine(randStr));
        }   
    }
    public String toStringAllSnackMachines(){
        String str = "";
        str += "SnackMachines:";
        for(SnackMachine sMTemp : sMList){
            str += sMTemp.getId() + " ";
        }
        str += "\n";
        return str;

    }
    public String toStringAllDrinkMachines(){
        String str = "";
        str += "DrinkMachines:";
        for(DrinkMachine dMTemp : dMList){
            str += dMTemp.getId() + " ";
        }
        str += "\n";
        return str;
    }

    public ArrayList<SnackMachine> ListAllSnackMachines(){
        return this.sMList;
    }

    public ArrayList<DrinkMachine> ListAllDrinkMachines(){
        return this.dMList;
    }


    public String toStringAllMachines(){
        String str = "";
        str = toStringAllSnackMachines() + toStringAllDrinkMachines();
        return str;
    }
}

