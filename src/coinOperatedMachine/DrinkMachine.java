package coinOperatedMachine;

import java.util.*;

/**
 * This class represents the drink machine
 * It has 3 shelves named A, B, and C with 6 compartment on each shelf with 12 individual spaces
 * It has also 2 shelves named D and E with 5 compartment on each shelf with 8 individual spaces
 */

public class DrinkMachine {

    String name;
    Map<String, Queue<Product>> mapComtProd;
    Map<Double, Integer> coinCart;

    Scanner input = new Scanner(System.in);

    public DrinkMachine() {
        mapComtProd = new HashMap<>();
        coinCart = new HashMap<>();

        coinCart.put(0.05, 50);
        coinCart.put(0.10, 50);
        coinCart.put(0.25, 50);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItemToMachine(Product prod, String index, int quanity) {

        char firstChar = index.charAt(0);
        char secondChar = index.charAt(1);

        if (firstChar >= 70 || secondChar <= 48 || secondChar >= 55) {
            System.out.println("Invalid Index");
        } else {

            if (mapComtProd.get(index) == null) {
                Queue<Product> queProd = new LinkedList<>();
                if (firstChar == 'A' || firstChar == 'B' || firstChar == 'C') {
                    if (quanity <= 12) {
                        for (int i = 0; i < quanity; i++) {
                            queProd.add(prod);
                        }
                        mapComtProd.put(index, queProd);
                    } else {
                        System.out.println("The size of the compartment is 12");
                    }
                } else {
                    if (quanity <= 8) {
                        for (int i = 0; i < quanity; i++) {
                            queProd.add(prod);
                        }
                        mapComtProd.put(index, queProd);
                    } else {
                        System.out.println("The size of the compartment is 8");
                    }
                }
            } else {
                Queue<Product> queOfProd = mapComtProd.get(index);
                Product item = queOfProd.peek();
                if(item.getUniqueID() == prod.getUniqueID()) {

                    if (firstChar == 'A' || firstChar == 'B' || firstChar == 'C') {
                        if (quanity <= (12 - mapComtProd.get(index).size())) {
                            for (int i = 0; i < quanity; i++) {
                                queOfProd.add(prod);
                            }
                        } else {
                            System.out.println("The compartment has " + mapComtProd.get(index).size() + "  items and total space is 12");
                        }
                    } else {
                        if (quanity <= (8 - mapComtProd.get(index).size())) {
                            for (int i = 0; i < quanity; i++) {
                                queOfProd.add(prod);
                            }
                        } else {
                            System.out.println("The compartment has " + mapComtProd.get(index).size() + " items and total space is 8");
                        }
                    }
                } else {
                    System.out.println("Other product exist in the compartment");
                }
            }
        }
    }

    public void removeItem () {

        System.out.println("Please enter the index");
        String index = input.next();

        int option = 0;
        int numOfQut = 0;
        int numOfDim = 0;
        int numOfNick = 0;
        boolean done = false;

        if(mapComtProd.get(index) == null || mapComtProd.get(index).size() == 0) {
            System.out.println("The compartment is empty");
        } else {

            while(!done) {

                System.out.println("Please insert the coins \n 1) $0.25 \n 2) $0.10 \n 3) $0.05 \n 4) Exit \n");
                option = input.nextInt();

                switch (option) {

                    case 1:
                        System.out.println("Enter the number of coins $0.25");
                        numOfQut = input.nextInt();
                        if(coinCart.get(0.25) != null) {
                            int quarter = coinCart.get(0.25);
                            coinCart.put(0.25, quarter + numOfQut);
                        } else {
                            coinCart.put(0.25, numOfQut);
                        }
                        break;

                    case 2:
                        System.out.println("Enter the number of coins $0.10");
                        numOfDim = input.nextInt();
                        if(coinCart.get(0.10) != null) {
                            int dime = coinCart.get(0.10);
                            coinCart.put(0.10, dime + numOfDim);
                        } else {
                            coinCart.put(0.10, numOfDim);
                        }
                        break;

                    case 3:
                        System.out.println("Enter the number of coins $0.05");
                        numOfNick = input.nextInt();
                        if(coinCart.get(0.05) != null) {
                            int nickle = coinCart.get(0.05);
                            coinCart.put(0.05, numOfNick + nickle);
                        } else {
                            coinCart.put(0.05, numOfNick);
                        }
                        break;

                    case 4:
                        System.out.println("Done inserting the coins");
                        done = true;
                        break;
                }
            }

            Queue<Product> queOfProd = mapComtProd.get(index);
            double total = (numOfQut * 0.25) + (numOfDim * 0.10) + (numOfNick * 0.05);
            total = Double.parseDouble(String.format("%.2f", total));
            double changeBack = total - (queOfProd.peek().retailPrice);
            changeBack = Double.parseDouble(String.format("%.2f", changeBack));
            double returnCoins = Double.parseDouble(String.format("%.2f", changeBack));

            System.out.println("You have inserted " + total);
            System.out.println("Item price is " + queOfProd.peek().retailPrice);

            if(total >= queOfProd.peek().retailPrice)      {
                System.out.println("Please collect your item " + queOfProd.peek().getName());
                queOfProd.remove();
                mapComtProd.put(index, queOfProd);

                int changeQt = 0;
                int changeDm = 0;
                int changeNic = 0;
                boolean zero = false;

                while(!zero) {
                    if((changeBack - 0.25) >= 0.0) {
                        changeQt++;
                        changeBack = (changeBack - 0.25);
                        changeBack = Double.parseDouble(String.format("%.2f", changeBack));
                    } else if ((changeBack - 0.10) >= 0.0) {
                        changeDm++;
                        changeBack = (changeBack - 0.10);
                        changeBack = Double.parseDouble(String.format("%.2f", changeBack));
                    } else if ((changeBack - 0.05) >= 0.0) {
                        changeNic++;
                        changeBack = (changeBack - 0.05);
                        changeBack = Double.parseDouble(String.format("%.2f", changeBack));
                    } else {
                        zero = true;
                    }
                }
                if(coinCart.get(0.25) != null) {
                    coinCart.put(0.25, (coinCart.get(0.25) - changeQt));
                }
                if(coinCart.get(0.10) != null) {
                    coinCart.put(0.10, (coinCart.get(0.10) - changeDm));
                }
                if(coinCart.get(0.05) != null) {
                    coinCart.put(0.05, (coinCart.get(0.05) - changeNic));
                }

                System.out.println("Please collect your chnage " + returnCoins);
                System.out.println("Please collect your coins back $0.25 :" + changeQt + " $0.10 :" + changeDm + " $0.05 : " + changeNic);

            } else {
                System.out.println("Please enter sufficient fund");
                System.out.println("Please collect your coins back $0.25 - " + numOfQut + " $0.10 - " + numOfDim + " $0.05 - " + numOfNick);
                coinCart.put(0.25, coinCart.get(0.25) - numOfQut);
                coinCart.put(0.10, coinCart.get(0.10) - numOfDim);
                coinCart.put(0.05, coinCart.get(0.05) - numOfNick);
            }
        }
    }

    public void viewItem(String index) {
        if(mapComtProd.get(index) == null || mapComtProd.get(index).size() == 0) {
            System.out.println("The compartment is empty ");
        } else {
            Queue<Product> queProd = mapComtProd.get(index);
            System.out.println("The compartment has following item ");
            System.out.print("{ ");
            for (Product prd : queProd) {
                System.out.print(prd.getName() + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }

    public void getSizeOfCompt(String index) {
        if(mapComtProd.get(index) == null) {
            System.out.println("The compartment is empty");
        } else {
            System.out.println("The Size of the compartment " + index + " is " + mapComtProd.get(index).size());
        }
    }

    public void viewCoinCart() {
        double finalTotal = 0;
        System.out.println(Collections.singletonList(coinCart));
        for (Map.Entry<Double, Integer> cn : coinCart.entrySet()) {
            double total = (cn.getKey() * cn.getValue());
            finalTotal = total + finalTotal;
        }
        finalTotal = Double.parseDouble(String.format("%.2f", finalTotal));
        System.out.println("Your vending machine has total coins of $" + finalTotal);
    }
}

