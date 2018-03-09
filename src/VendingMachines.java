import java.util.ArrayList;


public class VendingMachines {

//Created 2 static strings that each VendingMachine object will display upon being called
    String companyTitle ="Sugar Shack District";
    private String machineDescription;
    private String machineLocation="";
    private int machineIdNum;



    //coins
    private final int nickel = 5;
    private final int dime = 10;
    private final int quarter = 25;


//Creating a VendingMachine constructor to set each VendingMachine object with unique attributes
    public VendingMachine( int machineIdNum, String machineLocation), String machine;{

        this.machineIdNum=machineIdNum;
        this.machineLocation=machineLocation;
    }

    public void setMachineIdNum(int machineIdNum){
        this.machineIdNum=machineIdNum;
    }

    public int getMachineIdNum(){
        return machineIdNum;
    }

    public void setMachineLocation(String machineLocation){
        this.machineLocation=machineLocation;
    }

    public String getMachineLocation(){
        return machineLocation;
    }

    public String setMachineDescription(String machineDescrption){
        this.machineDescription=machineDescription;
    }

    public String getMachineDescription(){
        return machineDescription;
    }



}
