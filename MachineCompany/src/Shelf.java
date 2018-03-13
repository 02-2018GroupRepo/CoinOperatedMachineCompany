import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Shelf {
   private LinkedHashMap<Integer,ArrayList<Product>> shelf;//integer represents the compartmentNumber
   // private  int compartmentSize;
    private  int spaceSize;
  private ArrayList<Product> products;



    public Shelf() {
    }

    public Shelf(int spaceSize){
        shelf = new LinkedHashMap<Integer, ArrayList<Product>>();
        products = new ArrayList<Product>();
        this.spaceSize = spaceSize;


    }


    public void stockCompartment(int compartmentNumber,Product product){
        int emptySpaces = spaceSize - amountOfProductLeft();
      if(emptySpaces > 0) {
          for (int i = 0; i < emptySpaces; i++) {
              products.add(product);
          }
          shelf.put(compartmentNumber, products);
          products = new ArrayList<Product>();
      }else {
          System.out.println("Compartment is already full no need to stock ");
      }

    }

    public int amountOfProductLeft(){
        return products.size();
    }

    public void displayShelf(){

        for(Map.Entry<Integer,ArrayList<Product>> entry : shelf.entrySet()){
            System.out.println("Compartment  Number: "+entry.getKey());

            System.out.println("Price :"+entry.getValue().get(0).getRetail_price());
            //System.out.println();
            System.out.printf("Products :");
            for (Product product: shelf.get(entry.getKey())) {

                System.out.print( product.getName()+" ");

            }

            System.out.println();
        }
    }

    public LinkedHashMap<Integer, ArrayList<Product>> getShelf() {
        return shelf;
    }

}
