package bootCamp;

import java.util.HashMap;

public class Location {

    private String name;
    private HashMap<String,Machine> machinesMap;

    public Location() {
        this.name = "default";
        machinesMap = new HashMap<String, Machine>();
    }

    public Location(String name) {
        this.name = name;
        machinesMap = new HashMap<String, Machine>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDrinkMachine(String name) {
        machinesMap.put(name, new DrinkMachine());
        machinesMap.get(name).setName(name);
    }

    public void addSnackMachine(String name) {
        machinesMap.put(name, new SnackMachine());
        machinesMap.get(name).setName(name);
    }

    public Machine getMachine(String name) { return machinesMap.get(name); }

    public DrinkMachine getDrinkMachine(String name) { return (DrinkMachine)machinesMap.get(name); }

    public SnackMachine getSnackMachine(String name) { return (SnackMachine)machinesMap.get(name); }

    public void removeMachine(String name) {
        machinesMap.remove(name);
    }

    public void updateMachine(Machine machine, String machineName) { machinesMap.put(machineName,machine); }

    public HashMap<String, Machine> getMachinesMap() {
        return machinesMap;
    }

}