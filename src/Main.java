public class Main {

    public static void main(String[] args) {

        System.out.println(VendingMachine.companyName);


        Products p1 = new Products ("Lemondade", "Juice", 1, .50, 1.00);
        Products p2 = new Products ("Coke", "Soda", 2, .50, 1.00);
        Products p3 = new Products ("Root Beer", "Soda", 3, .50, 1.00);
        Products p4 = new Products ("Kit Kat", "Candy", 4, .50, 1.00);
        Products p5 = new Products ("Reeses", "Candy", 5, .50, 1.00);
        Products p6 = new Products ("Baby Ruth", "Candy", 6, .50, 1.00);

        //create an arraylist of products
        //create a hashmap with string as the key and the arraylist of proudcs as the value
        //use a for loop/for each loop to go through the hashmap
        //array list of products for each product

        System.out.println("Please enter 1 for Snack Machine and 2 for Drink Machine: ");
        System.out.println("You have entered Snack Machine, if this is correct enter Y, otherwise press any key: ");
        System.out.println("You have entered Drink Machine, if this is correct enter Y, otherwise press any key: ");
        System.out.println("Enter 1 - 5 for the Snack Machine you would like to use: ");
        System.out.println("Enter 1 - 5 for the Drink Machine you would like to use: ");
        System.out.println("You have entered" + "Is this correct? Enter Y for yes, otherwise press any key: ");
        System.out.println("You have selected item" + "If this is correct enter Y, otherwise press any key: ");
        System.out.println("Your total is ");
        System.out.println("Please input ");
        System.out.println("Your change is ");
        System.out.println("You have not entered enough money, here is your money back ");
        System.out.println("Would you like to make another purchase? Enter Y for yes, otherwise press any key: ");




    }
}
