import java.util.ArrayList;

public class Snack extends Product {

    private ArrayList<Product> prodArray;

    public Snack(ArrayList<Product> prodArray) {
        this.prodArray = prodArray;
    }

    public ArrayList<Product> getProdArray() {
        return prodArray;
    }
}
