import java.util.ArrayList;
public class Company{
    //state
    private String name;
    //Manage an array list of Locations
    private ArrayList<Location> locList = new ArrayList<Location>();
    //constructor
    public Company(String name){
        this.name = name;
        setLocations();
        
    }
    public void setLocations(){
        Location loc1 = new Location("Smyrna");
        Location loc2 = new Location("Buckhead");
        Location loc3 = new Location("Marietta");
        Location loc4 = new Location("Kennesaw");
        Location loc5 = new Location("Acworth");
        locList.add(loc1);
        locList.add(loc2);
        locList.add(loc3);
        locList.add(loc4);
        locList.add(loc5);
    }

    public ArrayList<Location> ListAllLocations(){
        return this.locList;

    }

}




