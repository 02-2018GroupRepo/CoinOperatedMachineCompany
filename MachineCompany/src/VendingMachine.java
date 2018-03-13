import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class VendingMachine {
    private int nickels;
    private int dimes;
    private ArrayList<Shelf> shelves;
    private  String machineType;
    private int numOfNickelinMachine;
    private int numOfQuartersInMachine;
    private  int numOfDimesInMachine;


    private int quarters;
    private  double total;



    private final String companyName ="The Machine Company";

     public VendingMachine(){}
    public VendingMachine( ArrayList<Shelf> shelves,String machineType){
        total = 0;
        this.machineType = machineType;
        this.shelves = shelves;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void acceptPayment(int nickels, int dimes, int quarters){
        addNickels(nickels);
        addDimes(dimes);
        addQuarters(quarters);
    }
    public void addNickels(int nickels){
        this.nickels += nickels;
    }

   /* public double getNickelValue(){
        return (this.nickels * Coins.NICKEL);
    }*/

    public void addDimes(int dimes){
        this.dimes += dimes;
    }

    public void addQuarters(int quarters){
        this.quarters += quarters;
    }

    public int getNickels() {
        return nickels;
    }

    public int getDimes() {
        return dimes;
    }

    public int getQuarters() {
        return quarters;
    }

    public double getTotal(){
        return ((nickels * Coins.NICKEL) +
                (dimes * Coins.DIME) +
                (quarters * Coins.QUARTER));
    }


    public double getTotalAmtAvailableInMachine(){

        return  total;
    }

    public int getNumOfNickelinMachine() {
        return numOfNickelinMachine;
    }

    public int getNumOfQuartersInMachine() {
        return numOfQuartersInMachine;
    }

    public int getNumOfDimesInMachine() {
        return numOfDimesInMachine;
    }

    public void balanceOfToTotalAmtAvailableInMachine(double amt){
        total+=getTotal();
        total-=amt;

    }

    public void addToNumOfNickelinMachine(int numOfNickelinMachine) {
         this.numOfNickelinMachine+=numOfNickelinMachine;
    }

    public void addToNumOfQuartersInMachine(int numOfQuartersInMachine) {
         this.numOfQuartersInMachine+=numOfQuartersInMachine;
    }

    public void addToNumOfDimesInMachine(int numOfDimesInMachine) {
         this.numOfDimesInMachine+=numOfDimesInMachine;
    }

    public double purchaseItemAndReturnChange(int shelfNumber, int compartMentNumber, Product product){//indexOf works to get shelf number
        Shelf  s1 =  shelves.get(shelfNumber);
        LinkedHashMap<Integer,ArrayList<Product>> shelf =  s1.getShelf();
        ArrayList<Integer> changeBreakdown = new ArrayList<Integer>();
        System.out.println("Enter dimes :");
        Scanner coin = new Scanner(System.in);
        int numOfDimes = coin.nextInt();
        System.out.println("Enter quarters :");
        int numOfQuaters = coin.nextInt();
        System.out.println("Enter nickels :");
        int numOfNickels = coin.nextInt();
        acceptPayment(numOfNickels,numOfDimes,numOfQuaters);
        if(getTotal() >= product.getRetail_price()){
            int countQ = 0;
            int countD = 0;
            int countN = 0;
            shelf.get(compartMentNumber).remove(product);
            double change = getTotal() - product.getRetail_price();
            double amtFromTotalinMachine = change;
            System.out.println("Your total is :"+getTotal());
            if(change == 0){
                System.out.println(" Your change is "+change);
                return change;
            }
             while(change > 0){
                 if(change >= Coins.QUARTER){
                     change-=Coins.QUARTER;
                     int availableQ = getQuarters()- 1;
                     countQ++;
                     //numOfQuatersInMachine()

                 }
                 if(change >= Coins.DIME){
                     change-=Coins.DIME;
                     countD++;
                 }
                 if(change >= Coins.NICKEL){
                     change-=Coins.NICKEL;
                 }
             }
            System.out.println("Your change is :"+countQ+" quarters "+countD+" dimes"+countN+" nickels");
            //total = getTotalAmtAvailableInMachine();
            //total-=change;
            addToNumOfQuartersInMachine(getQuarters() - countQ);
            addToNumOfDimesInMachine(getDimes() - countD);
            addToNumOfNickelinMachine(getNickels()- countN);
            balanceOfToTotalAmtAvailableInMachine(amtFromTotalinMachine);
            return  amtFromTotalinMachine;

        }else{
            double amtLeft = product.getRetail_price() - getTotal();
            System.out.println("Insufficient amount please add more coins ");
            System.out.println("You have "+amtLeft+" to pay");
            return  getTotal();
        }
    }

    public ArrayList<Shelf> getShelves() {
        return shelves;
    }

    public String getMachineType() {
        return machineType;
    }


}
