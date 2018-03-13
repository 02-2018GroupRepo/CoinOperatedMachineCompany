import java.util.HashMap;

public class Customer {

    private int nickels;
    private int dimes;
    private int quarters;
    private HashMap<String, Integer> payment = new HashMap<>();


    public void insertMoney(int nickels, int dimes, int quarters) {
        this.nickels = nickels;
        this.dimes = dimes;
        this.quarters = quarters;
    }

    public String countPayment(String coins, Integer num) {
        this.payment.put(coins, num);
        return payment;
    }


    public void selectItem() {
//        if cost <= coins, qty --, else Machine.returnChange();
    }

}