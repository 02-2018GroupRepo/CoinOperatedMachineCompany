import java.util.ArrayList;

public class CannedDrink extends Product{

    private ArrayList<Product> prodArray;

    public CannedDrink(ArrayList<Product> prodArray) {
        this.prodArray = prodArray;
    }

    public ArrayList<Product> getProdArray() {
        return prodArray;
    }


}
