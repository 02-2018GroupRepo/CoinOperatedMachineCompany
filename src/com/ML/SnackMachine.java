package com.ML;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.AbstractMap;

public class SnackMachine implements VendingMachine {


    String company = "Thank you for using Lino's Coin Vending Inc.";

    public void setLocation (String location);

    public void dispenseItem (String item);

    public void returnChange (String change);


    // ArrayList snacks = new ArrayList<String>(25);
    //

    Product a1 = new Product("Resse's","chocalate", .75, .25,10);
    Product a2 = new Product("Hershey's","chocalate", .75, .25,10);
    Product a3 = new Product("Milky Way","chocalate", .75, .25,10);
    Product a4 = new Product("Butterfingers","chocalate", .75, .25,10);
    Product a5 = new Product("Almond Joys","chocalate", .75, .25,10);

    Product b1 = new Product("Trail Mix","Nuts", 1.25,.50,10);
    Product b2 = new Product("Nature Valley Bar","bar", 1.25,.50,10);
    Product b3 = new Product("Peanuts","Nuts", 1.25,.50,10);
    Product b4 = new Product("Mixed Nuts","Nuts", 1.25,.50,10);
    Product b5 = new Product("Chip Bar","Bar", 1.25,.50,10);

    Product c1 = new Product("Doritos","Chips", .50,.10,10);
    Product c2 = new Product("Cheetos","Chips", .50,.10,10);
    Product c3 = new Product("Sun Chips","Chips", .50,.10,10);
    Product c4 = new Product("Ruffles","Chips", .50,.10,10);
    Product c5 = new Product("Lays","Chips", .50,.10,10);

    Product d1 = new Product("Oreos","Cookies", .50,.10,10);
    Product d2 = new Product("Rits Bits Sandwiches","Cookies", .50,.10,10);
    Product d3 = new Product("Peanut Butter Crackers","Cookies", .50,.10,10);
    Product d4 = new Product("Oatmeal Cookies","Cookies", .50,.10,10);
    Product d5 = new Product("Chocolate Cookies","Cookies", .50,.10,10);

    Product e1 = new Product("Skittles","Candy", .50,.10,10);
    Product e2 = new Product("Starburts","Candy", .50,.10,10);
    Product e3 = new Product("M&M's","Candy", .50,.10,10);
    Product e4 = new Product("Spearmint Gum","Candy", .50,.10,10);
    Product e5 = new Product("Altoids","Candy", .50,.10,10);


    HashMap<String,Product> snacks = new HashMap<String,Product>(25);







}
