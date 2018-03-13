
public class VendingMachines {

//Created 2 static strings that each VendingMachine object will display upon being called
    private String companyTitle ="Sugar Daddy District";
    private String machineDescription;
    private String machineLocation="";
    private int machineIdNum;

    //coins
    private final int nickel = 5;
    private final int dime = 10;
    private final int quarter = 25;


//Creating a VendingMachine constructor to set each VendingMachine object with unique attributes

    public String getCompanyTitle(){
        return this.companyTitle;
    }

    public VendingMachine( int machineIdNum, String machineLocation){

        this.machineIdNum=machineIdNum;
        this.machineLocation=machineLocation;
    }

    public void setMachineIdNum(int machineIdNum){
        this.machineIdNum=machineIdNum;
    }

    public int getMachineIdNum(){
        return this.machineIdNum;
    }

    public void setMachineLocation(String machineLocation){
        this.machineLocation=machineLocation;
    }

    public String getMachineLocation(){
        return this.machineLocation;
    }

    public void setMachineDescription(String machineDescrption){
        this.machineDescription=machineDescription;
    }

    public String getMachineDescription(){
        return this.machineDescription;
    }



}
