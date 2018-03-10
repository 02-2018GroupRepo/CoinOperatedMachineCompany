import java.util.ArrayList;

public class Tester{
    public static void main(String [] args){
        
        Company severe = new Company("SevereCo");

        for( Location locationObj : severe.getLocations()){
            System.out.println(locationObj.getName());
        }

    }
}

