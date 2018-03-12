package bootCamp;

public class Coin {
    public static final double QUARTER = 0.25;
    public static final double DIME = 0.10;
    public static final double NICKEL= 0.05;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Coin() {
    }
}
