import java.util.ArrayList;

public class Operator {
    private double totalAmtFromLocation;
   private double totalamtFromAllMachines;
   private  ArrayList<Location> locations;
    public Operator(){

    }
    public Operator(ArrayList<Location> locations){
        this.locations = locations;
        totalamtFromAllMachines = 0;
        totalAmtFromLocation = 0;
    }

    public void addMachine(Location location,VendingMachine machine, int code){
        location.setMachines(machine,code);
    }

    public void removeMachine(Location location,VendingMachine machine){
        location.getMachines().values().remove(machine);
    }
    public double getTotalAmtFromMachine(VendingMachine vendingMachine){
        return vendingMachine.getTotalAmtAvailableInMachine();

    }
    public void getAmtOfIndividualCoinFromMachine(VendingMachine vendingMachine){
        System.out.println("Num of quarters in machine "+vendingMachine.getNumOfQuartersInMachine()+" Num of Dimes in machine "+vendingMachine.getNumOfDimesInMachine()+
        " Num of nickels "+vendingMachine.getNumOfNickelinMachine());

    }
    public double getTotalFromAllMachines(){

        for (Location location: locations) {
            for (VendingMachine machine: location.getMachines().values()) {
                  totalamtFromAllMachines+=machine.getTotalAmtAvailableInMachine();
            }
        }

        return  totalamtFromAllMachines;
    }
    public double checkStatusOfMoneyAtLocation(Location location){
        for(VendingMachine machine : location.getMachines().values()){
            totalAmtFromLocation+= machine.getTotalAmtAvailableInMachine();
        }
        return  totalAmtFromLocation;
    }
}
