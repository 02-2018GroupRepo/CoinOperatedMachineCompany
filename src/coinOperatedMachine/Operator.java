package coinOperatedMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Operator {

    String name;
    Map<String, ArrayList<Machine>> locationMachine;

    public Operator (String name) {
        this.name = name;
        locationMachine = new HashMap<>();

    }

    public String getLocation(Machine machine) {
        String location = null;
        boolean found = false;
        for (Map.Entry<String, ArrayList<Machine>> machin : locationMachine.entrySet()) {
            for (Machine mc : machin.getValue()) {
                if(Objects.equals(machine, mc)) {
                    location = machin.getKey();
                    found = true;
                }
            }
         }
         if(!found) {
             System.out.println("Machine is not found");
         }
         return location;
    }

    public double getTotalFromMachine (Machine machine, String location) {
        double total = 0;
        boolean found = false;
        for (Map.Entry<String, ArrayList<Machine>> machin : locationMachine.entrySet()) {
            if (machin.getKey().equals(location)) {
                ArrayList<Machine> mcList = locationMachine.get(location);
                for (Machine mc : mcList) {
                    if (mc.equals(machine)) {
                        total = mc.getTotal();
                        found = true;
                    }
                }
            }
        }
        if(!found){
            System.out.println("Location does not exist");
        }
        return total;
    }

    public double getTotalFromAllMachine(String location) {
        double total = 0;
        boolean found = false;
        for (Map.Entry<String, ArrayList<Machine>> machin : locationMachine.entrySet()) {
            if (machin.getKey().equals(location)) {
                ArrayList<Machine> mc = locationMachine.get(location);
                for(int i = 0; i < mc.size(); i++) {
                    System.out.println(mc.get(i).name);
                    mc.get(i).viewCoinCart();
                    total = total + mc.get(i).getTotal();
                }
                found = true;
            }
        }
        if(!found) {
            System.out.println("Location is not found");
        }
        System.out.println("Your final total of all vending machines at location named " + location + " is $" + total);
        return total;
    }

    public void AddItemtoMachine(Machine machine, Product prod, int quantity, String index) {
        machine.addItemToTheCompartment(index, prod, quantity);
    }

    public void RemoveItemFromMachine(Machine machine, String index, int quantity) {
        machine.removeItemFromMachine(index, quantity);
    }

    public void viewVendingMachineList() {
        for (Map.Entry<String, ArrayList<Machine>> machin : locationMachine.entrySet()) {
            System.out.println("Name of the location " + machin.getKey());
            ArrayList<Machine> mc = machin.getValue();
            for (Machine mcn : mc) {
                System.out.print("Name of the machines " + mcn);
            }
        }
        System.out.println();
    }

    public void addMachine(String location, Machine machine) {
        if(locationMachine.get(location) != null) {
            if (locationMachine.get(location).size() != 0) {
                ArrayList<Machine> machineList = locationMachine.get(location);
                machineList.add(machine);
                locationMachine.put(location, machineList);
            }
        } else {
            ArrayList<Machine> newMachineList = new ArrayList<>();
            newMachineList.add(machine);
            locationMachine.put(location, newMachineList);
        }
    }

    public void removeMachine(String location, Machine machine) {
        if(locationMachine.get(location) != null) {
            if (locationMachine.get(location).size() != 0) {
                ArrayList<Machine> machineList = locationMachine.get(location);
                machineList.remove(machine);
                locationMachine.put(location, machineList);
            }
        } else {
            System.out.println("There are no machines at the given location");
        }
    }
}
