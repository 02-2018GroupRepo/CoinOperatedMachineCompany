
// This is how I've registered my Coin Enum to
public enum Coin {
    QUARTER(.25),
    NICKEL(.05),
    DIME(.1);

    private Double value;

    Coin(Double value) {
        this.value = value;
    }

    public Double value() {
        return value;
    }
}

