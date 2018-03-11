import java.util.ArrayList;

public class Shelf{
    private String name; 
    private int size;
    private ArrayList<Compartment> compList = new ArrayList<Compartment>();
    private RandomStuffMaker lazily = new RandomStuffMaker();
    
    public Shelf(String name){
        this.name = name;
        setNumberOfCompartments(5);
    }

    public String getName(){
        return this.name;
    }

    public void setNumberOfCompartments(int compartment){
        for(int i = 0; i < compartment; i++){
            String numericId = lazily.getAnOrderedNumber();
            lazily.setNextAnOrderedNumber();
            (this.compList).add(new Compartment(numericId));
        }  
    }

    public ArrayList<Compartment> ListCompartments(){
        return this.compList;
    }

    public String toStringCompartment(){
        String str = "";
        for(Compartment comp : this.compList){
            str += comp.getName();
        }
        str += "\n";
        return str;
    }

    
}