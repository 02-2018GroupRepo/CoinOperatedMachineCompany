package project1;

//        All vending machines can accept nickels, dimes and quarters.
//        All vending machines will have a location. There can be more than one machine per location.
//        Only the item in the first compartment can be selected for purchase.
//        Once an item is purchased,
//        it is delivered to the customer and the item behind it will become available for purchase.
//        A customer can insert coins and select an item for purchase.
//        a. If the customer has inserted enough money, the item is dispensed and the change is returned.
//        b. If the customer has not inserted enough money, the coins will be returned


public interface VendingMachine {



        public double payCoinsToMachine();

        public double getCoinsPaid(double amount);


    }


