import java.util.Map;
public class Location {
    private String location;
    VendingMachine vendingMachine;
    private String companyName;

    Map<Integer,VendingMachine> machines;//Integer is for codes for each machine

    public Location(){}

    public Location(String location,Map<Integer,VendingMachine> machines,String companyName){
        this.location = location;
        this.machines = machines;
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setMachines(VendingMachine machine, int code){
        this.vendingMachine = machine;
        machines.put(code,vendingMachine);
    }
    public Map<Integer,VendingMachine> getMachines(){
        return machines;
    }

}
