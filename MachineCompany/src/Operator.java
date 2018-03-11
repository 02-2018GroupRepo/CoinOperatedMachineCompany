import java.util.ArrayList;

public class Operator {
    double totalAmtFromLocation;
    double total;
    public Operator(){
         total = 0;
    }

    public void addMachine(Location location,VendingMachine machine, int code){
        location.setMachines(machine,code);
    }

    public void removeMachine(Location location,VendingMachine machine){
        location.getMachines().values().remove(machine);
    }
    public double getTotalAmtFromMachine(VendingMachine vendingMachine){
        return vendingMachine.getTotal();

    }
    public double getTotalFromAllMachines(ArrayList<VendingMachine> machines){

        for(VendingMachine machine : machines){
            total+= machine.getTotal();
        }
        return  total;
    }
    public double checkStatusOfMoneyAtLocation(Location location){
        for(VendingMachine machine : location.getMachines().values()){
            totalAmtFromLocation+= machine.getTotalAmtAvailableInMachine();
        }
        return  totalAmtFromLocation;
    }
}
