public class Tester{
    public static void main(String [] args){
        
        Company severe = new Company("SevereCo");

        for(Location locationObj : severe.ListAllLocations()){
            System.out.println(locationObj.getName());
    
            for(SnackMachine smObj : locationObj.ListAllSnackMachines()){
                System.out.println(smObj.getId());
               
                for(Shelf shelf : smObj.ListAllShelves()){


                    for(Compartment comp : shelf.ListCompartments()){
                        
                        System.out.print(shelf.getName()+comp.getName()+" ");
                        if(comp.getName().equals("5")){
                            System.out.println();
                        }
                    }
                }
            }
            for(DrinkMachine dmObj : locationObj.ListAllDrinkMachines()){
                System.out.println(dmObj.getId());

                for(Shelf shelf : dmObj.ListAllShelves()){
                    

                    for(Compartment comp : shelf.ListCompartments()){
                        System.out.print(shelf.getName()+comp.getName()+" ");
                        if(comp.getName().equals("5")){
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}

