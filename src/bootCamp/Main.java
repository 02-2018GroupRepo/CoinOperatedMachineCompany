package bootCamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs) {
        String str="  *****Welcome To LTC Company*****";
        ArrayList<String> location = new ArrayList<String>();
        ArrayList<LittleThingsCompany> locationDetails = new ArrayList<>();
        Location totalLocation = new Location();
        ArrayList<Product> productDetails = new ArrayList<>();
        Product product = new Product();
        location.add("Mid Town");
        location.add("Dunwoody");
        location.add("Smyrna");
        location.add("Buford HWY");
        LittleThingsCompany midtown = new LittleThingsCompany("Mid Town", 1, "Drink");
        LittleThingsCompany dunwoody = new LittleThingsCompany("Dunwoody", 2, "Drink");
        LittleThingsCompany symra = new LittleThingsCompany("Smyrna", 1, "Snack");
        LittleThingsCompany buford = new LittleThingsCompany("Buford HWY", 1, "Drink");
        LittleThingsCompany newLocation = new LittleThingsCompany();
        System.out.println("Location of the company: " + location);
        locationDetails.add(midtown); //adding machine to location
        locationDetails.add(dunwoody);
        locationDetails.add(symra);
        locationDetails.add(buford);
      //  locationDetails.remove(buford);//removing machine to location
       //locationDetails.add(new LittleThingsCompany("Decator", 1,"Drink"));
       totalLocation.setLocationName("Decator");
       totalLocation.addNewDrinkMachine("Decator");


        totalLocation.viewLocation(locationDetails);

//       Product granola = new Product("1", "Granola", 2.0, 1.5);
//       Product almond = new Product("2", "Almond", 2.5, 1.0);
//       Product sunchips = new Product("3", "Sun Chips", 2.0, 1.5);
//       Product cheese = new Product("4", "Cheese", 2.0, 1.5);
//       Product twix = new Product("5", "Twix", 2.0, 1.5);

       productDetails.add(new Product("1","Granola", 2.0, 1.5));
       productDetails.add(new Product("2", "Almond", 2.5, 1.0));
       productDetails.add(new Product("3", "Sun Chips", 2.0, 1.5));
       productDetails.add(new Product("4", "Cheese", 2.0, 1.5));
       productDetails.add(new Product("5", "Twix", 2.0, 1.5));
       SnackMachine sm = new SnackMachine();
       product.viewProduct(productDetails);



//        System.out.println("Enter 1 to view Little Things Locations");
//        boolean found = false;
//        int select = 1;
//        while (!found) {
//            select = sc.nextInt();
//            switch (select) {
//                case 1:
//                    if(select==1) {
//                        totalLocation.viewLocation(locationDetails);
//                    }
//                    int select1 = 1;
//
//                    while (select1 != 2) {
//                        System.out.println("Enter 1 to add machine in a location");
//
//                        select1 = sc.nextInt();
//                        switch (select1)
//                        {
//                            case 1:
//                                System.out.println("Please enter location name");
//                                String locName = sc.next();
//                                System.out.println("Please enter number of machine to add");
//                                int numOfMachine = sc.nextInt();
//                                System.out.println("Please enter type of machine");
//                                String vendType = sc.next();
//                                totalLocation.addNewMachine(locationDetails);
//                                System.out.println( totalLocation.getNumberOfVending(numOfMachine)+ " "+ totalLocation.getTypeOfVending(vendType) + " machine has been added to "+  totalLocation.getLocation(locName)+ " location");
//
//                                break;
//                            case  2:
//
//                                break;
//                        }
//
//                    }
//                    break;
//                case 2:
//                    break;
//            }
            //git add .
            //git commit -m ""
            //git push Aleya


        //}
    }


}