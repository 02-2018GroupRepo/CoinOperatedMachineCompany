public class Tester{
    public static void main(String [] args){
        
        Company severe = new Company("SevereCo");

        for( Location locationObj : severe.getLocations()){
            System.out.println(locationObj.getName());
    
            for(SnackMachine smObj : locationObj.ListAllSnackMachines()){
                System.out.println(smObj.getId());
                System.out.println(smObj.toStringShelves());
            }
            for(DrinkMachine dmObj : locationObj.ListAllDrinkMachines()){
                System.out.println(dmObj.getId());
                System.out.println(dmObj.toStringShelves());
            }
        }
    }
}

