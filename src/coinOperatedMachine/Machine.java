package coinOperatedMachine;
import java.text.DecimalFormat;
import java.util.*;


/**
 * This class represents the 5*5 (5 rows and 5 columns) vending machine for candy and snacks
 * Each compartment of the shelf has the capacity of 10 spaces to hold the items
 * The first item will be removed from the compartment every single time customer purchases it
 * Vending machine also has a coin cart so operator can get the total of the vending machine
 * Indices are from A0 to A4, B0 to B4, C0 to C4, D0 to D4, and E0 to E4
 * Each compartment has unique ID
 * Each compartment will hold the unique product
 */


public class Machine {

    int [][] shelvesCompartment;
    Queue<Product> queueOfItem;
    Map<Integer, Map<Integer, Queue<Product>>> mapOfIndexProduct;
    Map<Double, Integer> coins;
    String location;
    String name;

    Scanner input = new Scanner(System.in);
    DecimalFormat df2 = new DecimalFormat(".##");


    public Machine(int sizeOfShelves, int sizeOfCompartment) {
        this.shelvesCompartment = new int [sizeOfShelves][sizeOfCompartment];
        this.queueOfItem = new LinkedList<Product>();
        this.mapOfIndexProduct = new HashMap();
        this.coins = new HashMap<>();
        coins.put(0.25, 50);
        coins.put(0.10, 50);
        coins.put(0.05, 50);
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addItemToTheCompartment (String index, Product uniqueIDItem, int quantity) {

        shelvesValue();

        char [] indexArray = index.toCharArray();
        int firstChar = 0;
        int secondChar = 0;
        int totalChar = 0;

        for (int k = 0; k < indexArray.length; k++) {

            firstChar = indexArray[0] + 0;
            if (k == 1) {
                String chrStr = String.valueOf(indexArray[k]);
                secondChar = Integer.parseInt(chrStr);
            }
        }
        totalChar = firstChar + secondChar;
        System.out.println(totalChar);

        for (int i = 0; i < shelvesCompartment.length; i++) {

            if (shelvesCompartment[i][0] == firstChar) {

                for (int j = 0; j < shelvesCompartment[i].length; j++){

                    if (shelvesCompartment[i][j] == totalChar) {

                        if (mapOfIndexProduct.containsKey(totalChar)) {

                            int key = 0;
                            Map<Integer, Queue<Product>> myMAP = mapOfIndexProduct.get(totalChar);
                            for (Map.Entry<Integer, Queue<Product>> keyValueMap : myMAP.entrySet()) {
                                key = keyValueMap.getKey();
                            }

                            if (key == uniqueIDItem.getUniqueID()) {

                                if (quantity <= (10 - mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID()).size())) {

                                    for (int l = 0; l < quantity; l++) {

                                        mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID()).add(uniqueIDItem);
                                        System.out.println(mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID()).size());
                                    }
                                } else {
                                    System.out.println("There are not enough space for your item to add");
                                }
                            } else {
                                System.out.println("Other product exists in the compartment");
                            }
                        } else {

                            Queue<Product> listOfItem = new LinkedList<Product>();
                            if (quantity <= 10) {

                                for (int k = 0; k < quantity; k++) {
                                    listOfItem.add(uniqueIDItem);
                                }
                                mapOfIndexProduct.put(totalChar, new HashMap<Integer, Queue<Product>>());
                                mapOfIndexProduct.get(totalChar).put(uniqueIDItem.getUniqueID(), listOfItem);
//                            mapOfIndexProduct.get(totalChar).putIfAbsent(uniqueIDItem.getUniqueID(), new LinkedList<Product>());
//                            mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID()).add(uniqueIDItem);
                                System.out.println(" Exist" + mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID()).size());
                            } else {
                                System.out.println("There is not enough space for your item to add : Max space is 10");
                            }

                        }
                    }


                            // if (quantity <= (10 - (mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID()).size()))) {
//                            for (int k = 0; k < quantity; k++) {
//
//
//
//                               mapOfIndexProduct.put(totalChar, new HashMap<Integer, Queue<Product>>());
//                               mapOfIndexProduct.get(totalChar).putIfAbsent(uniqueIDItem.getUniqueID(), new LinkedList<Product>());
//                               mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID()).add(uniqueIDItem);
//                                //mapOfIndexProduct.put(totalChar, new HashMap(){{put(uniqueIDItem.getUniqueID(), queueOfItem.add(uniqueIDItem));}});
//                                        //new LinkedList<>().add(uniqueIDItem));}});
////                                if ((queueOfItem.peek().getUniqueID() == uniqueIDItem.getUniqueID()) || (queueOfItem.isEmpty())) {
////                                    queueOfItem.add(uniqueIDItem);
////                                }
//                                System.out.println(mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID()).toString());
//
//                            }

                        //} else {
                            //System.out.println("Compartment does not have enough space");
                        //}
                       // System.out.println(((Map)mapOfIndexProduct.get(totalChar)).get(uniqueIDItem.getUniqueID()));
                }
            }
        }

        System.out.println(mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID()).size());
        Queue<Product> my = mapOfIndexProduct.get(totalChar).get(uniqueIDItem.getUniqueID());
        for (Product pro: my) {
            System.out.println(pro.getName());
        }
    }

    public void shelvesValue() {
        char chr = 'A';
        for (int i = 0;  i < shelvesCompartment.length; i++) {
            for (int j = 0; j < shelvesCompartment[i].length; j++) {
                shelvesCompartment[i][j] = chr + j;
                //System.out.println(shelvesCompartment[i][j]);
            }
            chr = (char) (chr + 1);
        }
    }

    public void viewItem (String index) {
        shelvesValue();
        char [] indexChar = index.toCharArray();
        int firstChr = 0;
        int secondChr = 0;
        boolean found = false;

        for (int k = 0; k < indexChar.length; k++) {
            firstChr = indexChar[0] + 0;
            if (k == 1) {
                String getNum = String.valueOf(indexChar[k]);
                secondChr = Integer.parseInt(getNum);
            }
        }
       // System.out.println("Char" + firstChr);
        //System.out.println("int" + secondChr);
        int sumOfStr = firstChr + secondChr;
        //System.out.println(sumOfStr);
//        indexSum = indexSum + charNum;
//        System.out.println(indexSum);

        for (int i = 0; i < shelvesCompartment.length; i++) {

            if (shelvesCompartment[i][0] == firstChr) {

                for (int j = 0; j < shelvesCompartment[i].length; j++) {

                    if (shelvesCompartment[i][j] == sumOfStr) {
                        found = true;
                        Map<Integer, Queue<Product>> myMap = mapOfIndexProduct.get(sumOfStr);
                        if (myMap != null) {
                            for (Map.Entry<Integer, Queue<Product>> prod : myMap.entrySet()) {
                                Queue<Product> LIST = prod.getValue();
                                System.out.println("Total item in the compartment is : " + LIST.size());
                                System.out.println("The items in the compartment are  : ");
                                for (Product prd : LIST) {
                                    System.out.print(prd.getName() + " ");
                                }
                                System.out.println();
                            }
                        } else {
                            System.out.println("There are no items in the compartment");
                        }
                    }
                }
            }
        }
        if(!found) {
            System.out.println("Invalid Index");
        }
    }

    public Product removeItemFromMachine() {

        shelvesValue();

        System.out.println("Please enter index");
        String index = input.next();

        Product removeProd = null;
        char [] indexArray = index.toCharArray();
        int firstChar = 0;
        int secondChar = 0;
        int totalChar = 0;

        for (int k = 0; k < indexArray.length; k++) {

            firstChar = indexArray[0] + 0;
            if (k == 1) {
                String chrStr = String.valueOf(indexArray[k]);
                secondChar = Integer.parseInt(chrStr);
            }
        }
        totalChar = firstChar + secondChar;
        System.out.println(totalChar);

        for (int i = 0; i < shelvesCompartment.length; i++) {

            if (shelvesCompartment[i][0] == firstChar) {

                for (int j = 0; j < shelvesCompartment[i].length; j++){

                    if (shelvesCompartment[i][j] == totalChar) {

                        if (mapOfIndexProduct.containsKey(totalChar)) {

                            int numOfQuarter = 0;
                            int numOfDime = 0;
                            int numOfNickle = 0;
                            int option = 0;

                            boolean done = false;
                            while(!done) {

                                System.out.println("Please insert the coins \n 1) $0.25 \n + 2) $0.10 \n + 3) $0.05 \n 4) Exit \n");
                                option = input.nextInt();

                                switch (option) {

                                    case 1 :
                                        System.out.println("Enter the number of coins of $0.25");
                                        numOfQuarter = input.nextInt();
                                        if(coins.get(0.25) != null) {
                                            int qut = coins.get(0.25);
                                            coins.put(0.25, numOfQuarter + qut);
                                        } else {
                                            coins.put(0.25, numOfQuarter);
                                        }
                                        break;

                                    case 2 :
                                        System.out.println("Enter the number of coins of $0.10");
                                        numOfDime = input.nextInt();
                                        if (coins.get(0.10) != null) {
                                            int dim = coins.get(0.10);
                                            coins.put(0.10, dim + numOfDime);
                                        } else {
                                            coins.put(0.10, numOfDime);
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Enter the number of coins of $0.05");
                                        numOfNickle = input.nextInt();
                                        if (coins.get(0.05) != null) {
                                            int nickle = coins.get(0.05);
                                            coins.put(0.05, nickle + numOfNickle);
                                        } else {
                                            coins.put(0.05, numOfNickle);
                                        }
                                        break;

                                    case 4:
                                        System.out.println("Done inserting the coins");
                                        done = true;
                                        break;
                                }
                            }

                            double insertMoney1 = (numOfQuarter * 0.25) + (numOfDime * 0.10) + (numOfNickle * 0.05);
                            double insertMoney = Double.parseDouble(String.format("%.2f", insertMoney1));
                            System.out.println(insertMoney);

                            int key = 0;
                            Map<Integer, Queue<Product>> myMAP = mapOfIndexProduct.get(totalChar);
                            for (Map.Entry<Integer, Queue<Product>> keyValueMap : myMAP.entrySet()) {
                                key = keyValueMap.getKey();
                            }

                            Product remProd = mapOfIndexProduct.get(totalChar).get(key).peek();
                            double retailPrice1 = remProd.getRetailPrice();
                            double retailPrice = Double.parseDouble(String.format("%.2f", retailPrice1));
                            System.out.println(retailPrice);
                            int numOfQt = 0;
                            int numOfDm = 0;
                            int numOfNik = 0;

                            if (insertMoney >= retailPrice) {
                                removeProd = mapOfIndexProduct.get(totalChar).get(key).remove();
                                System.out.println(removeProd.getName());

                                boolean zero = false;
                                double changeBack1 = insertMoney - retailPrice;
                                double changeBack = Double.parseDouble(String.format("%.2f", changeBack1));
                                double changeBack2 = changeBack;
                                System.out.println("Change " + changeBack);
                                while(!zero) {

                                    if((changeBack - 0.25) >= 0.0) {
                                        numOfQt++;
                                        changeBack = (changeBack - 0.25);
                                        changeBack = Double.parseDouble(String.format("%.2f", changeBack));

                                    } else if((changeBack - 0.10) >= 0.0) {
                                        numOfDm++;
                                        changeBack = (changeBack - 0.10);
                                        changeBack = Double.parseDouble(String.format("%.2f", changeBack));

                                    } else if((changeBack - 0.05) >= 0.0) {
                                        numOfNik++;
                                        changeBack = (changeBack - 0.05);
                                        changeBack = Double.parseDouble(String.format("%.2f", changeBack));

                                    } else {
                                        zero = true;
                                    }
                                }
                                if(coins.get(0.25) != null) {
                                    coins.put(0.25, (coins.get(0.25)- numOfQt));
                                }
                                if(coins.get(0.10) != null) {
                                    coins.put(0.10, (coins.get(0.10) - numOfDm));
                                }
                                if(coins.get(0.05) != null) {
                                    coins.put(0.05, (coins.get(0.05) - numOfNik));
                                }
                                System.out.println("Please collect your change " + changeBack2);
                                System.out.println("Quarter " + numOfQt + " Dime " + numOfDm + " Nickle " + numOfNik);
                                System.out.println("Size of Compartment : " + mapOfIndexProduct.get(totalChar).get(key).size());
                                System.out.println("Remove product " + removeProd.getName());
                            } else {
                                System.out.println("Please enter sufficient funds");
                                System.out.println("Please collect your change Quarter " + numOfQuarter + " Dime " + numOfDime + " Nickle " + numOfNickle);
                                if(coins.get(0.25) != null) {
                                    coins.put(0.25, (coins.get(0.25)- numOfQuarter));
                                }
                                if(coins.get(0.10) != null) {
                                    coins.put(0.10, (coins.get(0.10) - numOfDime));
                                }
                                if(coins.get(0.05) != null) {
                                    coins.put(0.05, (coins.get(0.05) - numOfNickle));
                                }
                            }
                        } else {
                            removeProd = null;
                            System.out.println("The compartment is empty ");

                        }
                    }
                }
            }
        }
        return removeProd;
    }

    public int getSizeOfCompartment(String index) {

        shelvesValue();

        int size = 0;
        char [] indexArray = index.toCharArray();
        int firstChar = 0;
        int secondChar = 0;
        int totalChar = 0;

        for (int k = 0; k < indexArray.length; k++) {

            firstChar = indexArray[0] + 0;
            if (k == 1) {
                String chrStr = String.valueOf(indexArray[k]);
                secondChar = Integer.parseInt(chrStr);
            }
        }
        totalChar = firstChar + secondChar;
        System.out.println(totalChar);

        for (int i = 0; i < shelvesCompartment.length; i++) {

            if (shelvesCompartment[i][0] == firstChar) {

                for (int j = 0; j < shelvesCompartment[i].length; j++) {

                    if (shelvesCompartment[i][j] == totalChar) {

                        if (mapOfIndexProduct.containsKey(totalChar)) {

                            int key = 0;
                            Map<Integer, Queue<Product>> myMAP = mapOfIndexProduct.get(totalChar);
                            for (Map.Entry<Integer, Queue<Product>> keyValueMap : myMAP.entrySet()) {
                                key = keyValueMap.getKey();
                            }

                            size  = mapOfIndexProduct.get(totalChar).get(key).size();
                        } else {
                            System.out.println("The compartment is empty ");
                            size = 0;
                        }
                    }
                }
            }
        }
        return size;
    }

    public void viewCoinCart() {
        double finalTotal = 0;
        System.out.println(Collections.singletonList(coins));
        for (Map.Entry<Double, Integer> cn : coins.entrySet()) {
            double total = (cn.getKey() * cn.getValue());
            finalTotal = total + finalTotal;
        }
        finalTotal = Double.parseDouble(String.format("%.2f", finalTotal));
        System.out.println("Your vending machine has total coins of $" + finalTotal);
    }

    public double getTotal() {
        double finalTotal = 0;
        for (Map.Entry<Double, Integer> cn : coins.entrySet()) {
            double total = (cn.getKey() * cn.getValue());
            finalTotal = total + finalTotal;
        }
        finalTotal = Double.parseDouble(String.format("%.2f", finalTotal));
        return finalTotal;
    }

    public void removeItemFromMachine(String index, int quantity) {
        shelvesValue();

        Product removeProd = null;
        char [] indexArray = index.toCharArray();
        int firstChar = 0;
        int secondChar = 0;
        int totalChar = 0;

        for (int k = 0; k < indexArray.length; k++) {

            firstChar = indexArray[0] + 0;
            if (k == 1) {
                String chrStr = String.valueOf(indexArray[k]);
                secondChar = Integer.parseInt(chrStr);
            }
        }
        totalChar = firstChar + secondChar;
        System.out.println(totalChar);

        for (int i = 0; i < shelvesCompartment.length; i++) {

            if (shelvesCompartment[i][0] == firstChar) {

                for (int j = 0; j < shelvesCompartment[i].length; j++) {

                    if (shelvesCompartment[i][j] == totalChar) {

                        if (mapOfIndexProduct.containsKey(totalChar)) {

                            int key = 0;
                            Map<Integer, Queue<Product>> myMAP = mapOfIndexProduct.get(totalChar);
                            for (Map.Entry<Integer, Queue<Product>> keyValueMap : myMAP.entrySet()) {
                                key = keyValueMap.getKey();
                            }

                            Product remProd = mapOfIndexProduct.get(totalChar).get(key).peek();

                            if (quantity <= mapOfIndexProduct.get(totalChar).get(key).size()) {
                                for (int x = 0; x < quantity; x++) {
                                    removeProd = mapOfIndexProduct.get(totalChar).get(key).remove();
                                    System.out.println(removeProd.getName());
                                }
                            } else {
                                System.out.println("There are only " + mapOfIndexProduct.get(totalChar).get(key).size() + " items left ");
                                for(int y = 0; y < mapOfIndexProduct.get(totalChar).get(key).size(); y++) {
                                    removeProd = mapOfIndexProduct.get(totalChar).get(key).remove();
                                    System.out.println(removeProd.getName());
                                }
                            }
                        } else {
                            System.out.println("The compartment is empty ");
                        }
                    }
                }
            }
        }
    }

}
