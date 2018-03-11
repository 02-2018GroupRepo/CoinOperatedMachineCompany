import java.util.ArrayList;

public class BottledDrink extends Product {

    private ArrayList<Product> prodArray;

    public BottledDrink(ArrayList<Product> prodArray) {
            this.prodArray = prodArray;
    }


    public ArrayList<Product> getProdArray() {
        return prodArray;
    }

}
