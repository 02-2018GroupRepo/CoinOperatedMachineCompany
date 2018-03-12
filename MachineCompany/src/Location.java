import java.util.Map;
public class Location {
    private String location;
    VendingMachine vendingMachine;


    Map<Integer,VendingMachine> machines;//Integer is for codes for each machine

    public Location(){}

    public Location(String location,Map<Integer,VendingMachine> machines){
        this.location = location;
        this.machines = machines;

    }

    public String getLocation() {
        return location;
    }



    public void setMachines(VendingMachine machine, int code){
        this.vendingMachine = machine;
        machines.put(code,vendingMachine);
    }
    public Map<Integer,VendingMachine> getMachines(){
        return machines;
    }

}
