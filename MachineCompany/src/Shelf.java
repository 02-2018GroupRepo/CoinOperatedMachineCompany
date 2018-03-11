import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shelf {
   private Map<Integer,ArrayList<Product>> shelf;
    private  int compartmentSize;
    private  int spaceSize;
    Product product;
   // ArrayList<Product> prod;

    public Shelf(int compartmentSize,int spaceSize,Product product){
        shelf = new HashMap<Integer, ArrayList<Product>>();
       // prod = new ArrayList<Product>();
        this.product = product;
        this.spaceSize = spaceSize;
        this.compartmentSize = compartmentSize;

    }

    public void stockCompartment(int compartmentNumber){
        int count = 0;
        System.out.println(compartmentSize);
        ArrayList<Product> prod = new ArrayList<Product>();//need to rework bcos arraylist of prod is always gonna be zero and wont update
        //spaces
        shelf.put(compartmentNumber,prod);
        int spaceleft = spaceSize - shelf.get(compartmentNumber).size();
        while(count < spaceleft){

           prod = shelf.get(compartmentNumber);
           prod.add(product);
         //   System.out.println(prod.get(count).getName());
           count++;
        }
        shelf.put(compartmentNumber,prod);

    }

    public void displayShelf(){

        for(Map.Entry<Integer,ArrayList<Product>> entry : shelf.entrySet()){
            System.out.println("Compartment : "+entry.getKey());
           System.out.println("Products :");
            for (Product product: shelf.get(entry.getKey())) {
                System.out.print( product.getName()+" ");

            }
        }
    }


}
