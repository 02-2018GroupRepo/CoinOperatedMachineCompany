# Coin Operated Machine Company
You have just started a company that operates different types of coin operated machines. You will be writing one or more programs to perform the following activities:

1. Create a unique name for your company. Every machine should provide a way to return the name of the company.

2. All machines are coin operated and will accept one or more of the following coins: nickels, dimes, and quarters.  Each machine description will define the coins accepted by that machine.

## Machine Types

### Vending Machines
 - All vending machines can accept nickels, dimes and quarters.
 - All vending machines will have a location.  There can be more than one machine per location.
 
 - Only the item in the first compartment can be selected for purchase.  
 - Once an item is purchased, it is delivered to the customer and the item behind it will become available for purchase.
 - A customer can insert coins and select an item for purchase.
    a. If the customer has inserted enough money, the item is dispensed and the change is returned.
    b. If the customer has not inserted enough money, the coins will be returned
    
#### Operator
 - An operator can add and remove a machine from a location.
 - An operator can check the amount of money in each machine. By total amount and individual coins.
 - An operator can check the amount of money in all machines. By total amount and individual coins.
 - An operator can check the status of money in all machines at a specific location. By total amount and individuals coins.
 - An operator must enter a security code to gain access to all previous actions.

###  Snack Machine
   The snack machine provides candy and snacks for sale.  It has 5 shelves with 5 compartments on each shelf. Each compartment has 10 spaces for an individual item for sale. 
   
###  Drink machine
   The drink machine provides bottle and canned drinks for sale.  There are 3 shelves with 6 compartments on each shelf with 12 individual spaces for canned drinks.  There are 2 shelves with 5 compartments on each shelf with 8 individual spaces for bottled drinks.
    
###  Products for sale
   Each product should have a unique id, a name, a description, a wholesale price, and a retail sale price.  The vending machines will use the retail price for all items provided for sale
   
