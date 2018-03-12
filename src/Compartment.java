import java.util.ArrayList;

public class Compartment {
    private ArrayList<Products> pList = new ArrayList<Products>();
    private int size;

    public Compartment(int size, Products p){
        this.size = size;
        //calling the method inside of the constructor; automatically do will add 10 products to pList attribute
        setCompartment(p);

    }

    public void setCompartment(Products p){
        for(int i = 0 ; i < this.size ; i++){
            pList.add(p);
        }

    }

    public ArrayList<Products> getProductList(){
        return this.pList;
    }







}
