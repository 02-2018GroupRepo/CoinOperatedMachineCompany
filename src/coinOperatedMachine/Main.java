package coinOperatedMachine;

public class Main {

    public static void main (String [] args) {

        Company Syntel = new Company();

        Operator mickey = new Operator("Mayur");
        Operator mike = new Operator("Mickey");

        Machine candyMachine = new Machine(5, 5);
        Machine snackMachine = new Machine(5, 5);
        Machine chipsMachine = new Machine(5, 5);

        candyMachine.setName("Candy Machine");
        snackMachine.setName("Snack Machine");
        chipsMachine.setName("Chips Machine");

        Product snickers = new Product(1, "Snickers", "Candy", 0.90, 1.30);
        Product twix = new Product(2, "Twix", "Candy", 0.80, 1.20);
        Product kitKat = new Product(3, "Kitkat", "Candy", 0.60, 1.50);

        Syntel.setOperator(mickey);
        Syntel.setOperator(mike);

        mickey.addMachine("Dunwoody", candyMachine);
        mickey.addMachine("Atlanta", snackMachine);
        mickey.addMachine("Atlanta", chipsMachine);

        candyMachine.addItemToTheCompartment("B2", twix, 4);
        candyMachine.addItemToTheCompartment("C2", kitKat, 6);

        chipsMachine.addItemToTheCompartment("A2", kitKat, 5);
        chipsMachine.addItemToTheCompartment("C2", twix, 3);

        snackMachine.addItemToTheCompartment("A4", twix, 5);
        snackMachine.addItemToTheCompartment("C3", snickers, 5);

        System.out.println(Syntel.getOperator());

        System.out.println(mickey.getLocation(chipsMachine));
        System.out.println(mickey.getLocation(snackMachine));
        System.out.println(mickey.getLocation(candyMachine));

        System.out.println(mickey.getTotalFromMachine(chipsMachine, "Atlanta"));
        System.out.println(mickey.getTotalFromMachine(snackMachine, "Atlanta"));
        System.out.println(mickey.getTotalFromMachine(candyMachine, "Dunwoody"));

        System.out.println(mickey.getTotalFromAllMachine("Atlanta"));
        System.out.println(mickey.getTotalFromAllMachine("Dunwoody"));

//        candyMachine.removeItemFromMachine();
//        candyMachine.viewCoinCart();
//        candyMachine.viewItem("B2");
//        candyMachine.removeItemFromMachine();
//        candyMachine.viewCoinCart();

        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.setName("Drink Machine");

        drinkMachine.addItemToMachine(twix, "D1", 2);
        drinkMachine.addItemToMachine(kitKat, "A2", 4);
        //drinkMachine.addItemToMachine(twix, "D1", 3);

        //drinkMachine.viewItem("D1");
        //drinkMachine.getSizeOfCompt("D1");

         drinkMachine.removeItem();
//        drinkMachine.removeItem();

         drinkMachine.viewItem("D1");
         drinkMachine.getSizeOfCompt("D1");
         drinkMachine.viewCoinCart();

    }
}
