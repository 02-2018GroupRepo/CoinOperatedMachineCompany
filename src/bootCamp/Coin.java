package bootCamp;

public class Coin {

    private double value;
    private String type;

    public Coin(){
        value = 0d;
        type = "default";
    }

    public Coin(double value) {
        this.value = value;
        type = "default";
    }

    public double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
