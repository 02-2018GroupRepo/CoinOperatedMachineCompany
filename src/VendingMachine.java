import java.util.HashMap;
import java.util.Map;

// All vending machines can accept nickels, dimes and quarters.
// - All vending machines will have a location.  There can be more than one machine per location.
// - Only the item in the first compartment can be selected for purchase.
// - Once an item is purchased, it is delivered to the customer and the item behind it will become available for purchase.
// - A customer can insert coins and select an item for purchase.
//    a. If the customer has inserted enough money, the item is dispensed and the change is returned.
//    b. If the customer has not inserted enough money, the coins will be returned

public class VendingMachine {

    static final String companyName = "I'll figure this out later";
    static final String machineDesciption = "I accept nickles, dimes, and quarters";
    static final double nickle = 0.5;
    static final double dime = 0.10;
    static final double quarter = 0.25;

    Map<Integer, String> locationOfMachine = new HashMap<Integer, String>();
    Map<String, Double> locationOfItem = new HashMap<String, Double>();

    public void addNewMachineLocation(Integer key, String value) {

        locationOfMachine.put(key, value);
    }





}






