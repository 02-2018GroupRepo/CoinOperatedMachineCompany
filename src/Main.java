import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Snack Products

        Products p1 = new Products("Kit Kat", "Candy", 1, .50, 1.00);
        Products p2 = new Products("Reese's", "Candy", 2, .50, 1.00);
        Products p3 = new Products("Baby Ruth", "Candy", 3, .50, 1.00);
        Products p4 = new Products("Butterfingers", "Candy", 4, .50, 1.00);
        Products p5 = new Products("Skittles", "Candy", 5, .50, 1.00);
        Products p6 = new Products("Twix", "Candy", 6, .50, 1.00);
        Products p7 = new Products("Paydays", "Candy", 7, .50, 1.00);
        Products p8 = new Products("Starburst", "Candy", 8, .50, 1.00);
        Products p9 = new Products("Milky Way", "Candy", 9, .50, 1.00);
        Products p10 = new Products("M & M's", "Candy", 10, .50, 1.00);
        Products p11 = new Products("Nacho Cheese Doritos", "Chips", 11, .50, 1.00);
        Products p12 = new Products("Spicy Nacho Doritos", "Chips", 12, .50, 1.00);
        Products p13 = new Products("Cool Ranch Doritos", "Chips", 13, .50, 1.00);
        Products p14 = new Products("Sour Cream & Onion Chips", "Chips", 14, .50, 1.00);
        Products p15 = new Products("BBQ Chips", "Chips", 15, .50, 1.00);
        Products p16 = new Products("Salt and Vinegar Chips", "Chips", 16, .50, 1.00);
        Products p17 = new Products("Fritos", "Chips", 17, .50, 1.00);
        Products p18 = new Products("Peanut Butter Crackers", "Crackers", 18, .50, 1.00);
        Products p19 = new Products("Cheddar Cheese Crackers", "Crackers", 19, .50, 1.00);
        Products p20 = new Products("Butterscotch Krimpets", "Tasty Cakes", 20, .50, 1.00);
        Products p21 = new Products("Jelly Krimpets", "Tasty Cakes", 21, .50, 1.00);
        Products p22 = new Products("Chocolate Cupcakes", "Tasty Cakes", 22, .50, 1.00);
        Products p23 = new Products("Coffee Cakes", "Tasty Cakes", 23, .50, 1.00);
        Products p24 = new Products("Kandy Cakes", "Tasty Cakes", 24, .50, 1.00);
        Products p25 = new Products("Honey Roasted Peanuts", "Peanuts", 25, .50, 1.00);

        //Canned drink products

        Products p26 = new Products("Lemonade", "Juice", 26, .50, 1.00);
        Products p27 = new Products("Coke", "Soda", 27, .50, 1.00);
        Products p28 = new Products("Root Beer", "Soda", 28, .50, 1.00);
        Products p29 = new Products("Pepsi", "Soda", 29, .50, 1.00);
        Products p30 = new Products("Orange Fanta", "Soda", 30, .50, 1.00);
        Products p31 = new Products("Strawberry Fanta", "Soda", 31, .50, 1.00);
        Products p32 = new Products("Raspberry Fanta", "Soda", 32, .50, 1.00);
        Products p33 = new Products("Mango Fanta", "Soda", 33, .50, 1.00);
        Products p34 = new Products("Brisk Ice Tea", "Juice", 34, .50, 1.00);
        Products p35 = new Products("Brisk Raspberry Tea", "Juice", 35, .50, 1.00);
        Products p36 = new Products("Chocolate Yoo-hoo", "Milk", 36, .50, 1.00);
        Products p37 = new Products("Dr. Pepper", "Soda", 37, .50, 1.00);
        Products p38 = new Products("Sprite", "Juice", 38, .50, 1.00);
        Products p39 = new Products("Dr. Sprite", "Soda", 39, .50, 1.00);
        Products p40 = new Products("Hawaiian Fruit Punch", "Juice", 40, .50, 1.00);
        Products p41 = new Products("Mountain Dew", "Soda", 41, .50, 1.00);
        Products p42 = new Products("Cream Soda", "Soda", 42, .50, 1.00);
        Products p43 = new Products("Birch Beer", "Soda", 43, .50, 1.00);

        //Bottled drink products

        Products p44 = new Products("Cool Rush Gatorade", "Gatorade", 44, .50, 1.00);
        Products p45 = new Products("Glacier Gatorade", "Gatorade", 45, .50, 1.00);
        Products p46 = new Products("Orange Gatorade", "Gatorade", 46, .50, 1.00);
        Products p47 = new Products("Melon Gatorade", "Gatorade", 47, .50, 1.00);
        Products p48 = new Products("Mucho Mango Arizona", "Juice", 48, .50, 1.00);
        Products p49 = new Products("Fruit Punch Arizona", "Juice", 49, .50, 1.00);
        Products p50 = new Products("Half and Half Arizona", "Juice", 50, .50, 1.00);
        Products p51 = new Products("Strawberry Kiwi Mystic", "Juice", 51, .50, 1.00);
        Products p52 = new Products("Minute Maid Apple Juice", "Juice", 52, .50, 1.00);
        Products p53 = new Products("Water", "Water", 53, .50, 1.00);

        //Arraylist of products for each product in Snack Machine

        ArrayList<Products> p1List = new ArrayList<Products>();
        p1List.add(p1);
        p1List.add(p1);
        p1List.add(p1);
        p1List.add(p1);
        p1List.add(p1);
        p1List.add(p1);
        p1List.add(p1);
        p1List.add(p1);
        p1List.add(p1);
        p1List.add(p1);

        ArrayList<Products> p2List = new ArrayList<Products>();
        p1List.add(p2);
        p1List.add(p2);
        p1List.add(p2);
        p1List.add(p2);
        p1List.add(p2);
        p1List.add(p2);
        p1List.add(p2);
        p1List.add(p2);
        p1List.add(p2);
        p1List.add(p2);

        ArrayList<Products> p3List = new ArrayList<Products>();
        p1List.add(p3);
        p1List.add(p3);
        p1List.add(p3);
        p1List.add(p3);
        p1List.add(p3);
        p1List.add(p3);
        p1List.add(p3);
        p1List.add(p3);
        p1List.add(p3);
        p1List.add(p3);

        ArrayList<Products> p4List = new ArrayList<Products>();
        p1List.add(p4);
        p1List.add(p4);
        p1List.add(p4);
        p1List.add(p4);
        p1List.add(p4);
        p1List.add(p4);
        p1List.add(p4);
        p1List.add(p4);
        p1List.add(p4);
        p1List.add(p4);

        ArrayList<Products> p5List = new ArrayList<Products>();
        p1List.add(p5);
        p1List.add(p5);
        p1List.add(p5);
        p1List.add(p5);
        p1List.add(p5);
        p1List.add(p5);
        p1List.add(p5);
        p1List.add(p5);
        p1List.add(p5);
        p1List.add(p5);

        ArrayList<Products> p6List = new ArrayList<Products>();
        p1List.add(p6);
        p1List.add(p6);
        p1List.add(p6);
        p1List.add(p6);
        p1List.add(p6);
        p1List.add(p6);
        p1List.add(p6);
        p1List.add(p6);
        p1List.add(p6);
        p1List.add(p6);

        ArrayList<Products> p7List = new ArrayList<Products>();
        p1List.add(p7);
        p1List.add(p7);
        p1List.add(p7);
        p1List.add(p7);
        p1List.add(p7);
        p1List.add(p7);
        p1List.add(p7);
        p1List.add(p7);
        p1List.add(p7);
        p1List.add(p7);

        ArrayList<Products> p8List = new ArrayList<Products>();
        p1List.add(p8);
        p1List.add(p8);
        p1List.add(p8);
        p1List.add(p8);
        p1List.add(p8);
        p1List.add(p8);
        p1List.add(p8);
        p1List.add(p8);
        p1List.add(p8);
        p1List.add(p8);

        ArrayList<Products> p9List = new ArrayList<Products>();
        p1List.add(p9);
        p1List.add(p9);
        p1List.add(p9);
        p1List.add(p9);
        p1List.add(p9);
        p1List.add(p9);
        p1List.add(p9);
        p1List.add(p9);
        p1List.add(p9);
        p1List.add(p9);

        ArrayList<Products> p10List = new ArrayList<Products>();
        p1List.add(p10);
        p1List.add(p10);
        p1List.add(p10);
        p1List.add(p10);
        p1List.add(p10);
        p1List.add(p10);
        p1List.add(p10);
        p1List.add(p10);
        p1List.add(p10);
        p1List.add(p10);

        ArrayList<Products> p11List = new ArrayList<Products>();
        p1List.add(p11);
        p1List.add(p11);
        p1List.add(p11);
        p1List.add(p11);
        p1List.add(p11);
        p1List.add(p11);
        p1List.add(p11);
        p1List.add(p11);
        p1List.add(p11);
        p1List.add(p11);

        ArrayList<Products> p12List = new ArrayList<Products>();
        p1List.add(p12);
        p1List.add(p12);
        p1List.add(p12);
        p1List.add(p12);
        p1List.add(p12);
        p1List.add(p12);
        p1List.add(p12);
        p1List.add(p12);
        p1List.add(p12);
        p1List.add(p12);

        ArrayList<Products> p13List = new ArrayList<Products>();
        p1List.add(p13);
        p1List.add(p13);
        p1List.add(p13);
        p1List.add(p13);
        p1List.add(p13);
        p1List.add(p13);
        p1List.add(p13);
        p1List.add(p13);
        p1List.add(p13);
        p1List.add(p13);

        ArrayList<Products> p14List = new ArrayList<Products>();
        p1List.add(p14);
        p1List.add(p14);
        p1List.add(p14);
        p1List.add(p14);
        p1List.add(p14);
        p1List.add(p14);
        p1List.add(p14);
        p1List.add(p14);
        p1List.add(p14);
        p1List.add(p14);

        ArrayList<Products> p15List = new ArrayList<Products>();
        p1List.add(p15);
        p1List.add(p15);
        p1List.add(p15);
        p1List.add(p15);
        p1List.add(p15);
        p1List.add(p15);
        p1List.add(p15);
        p1List.add(p15);
        p1List.add(p15);
        p1List.add(p15);

        ArrayList<Products> p16List = new ArrayList<Products>();
        p1List.add(p16);
        p1List.add(p16);
        p1List.add(p16);
        p1List.add(p16);
        p1List.add(p16);
        p1List.add(p16);
        p1List.add(p16);
        p1List.add(p16);
        p1List.add(p16);
        p1List.add(p16);

        ArrayList<Products> p17List = new ArrayList<Products>();
        p1List.add(p17);
        p1List.add(p17);
        p1List.add(p17);
        p1List.add(p17);
        p1List.add(p17);
        p1List.add(p17);
        p1List.add(p17);
        p1List.add(p17);
        p1List.add(p17);
        p1List.add(p17);

        ArrayList<Products> p18List = new ArrayList<Products>();
        p1List.add(p18);
        p1List.add(p18);
        p1List.add(p18);
        p1List.add(p18);
        p1List.add(p18);
        p1List.add(p18);
        p1List.add(p18);
        p1List.add(p18);
        p1List.add(p18);
        p1List.add(p18);

        ArrayList<Products> p19List = new ArrayList<Products>();
        p1List.add(p19);
        p1List.add(p19);
        p1List.add(p19);
        p1List.add(p19);
        p1List.add(p19);
        p1List.add(p19);
        p1List.add(p19);
        p1List.add(p19);
        p1List.add(p19);
        p1List.add(p19);

        ArrayList<Products> p20List = new ArrayList<Products>();
        p1List.add(p20);
        p1List.add(p20);
        p1List.add(p20);
        p1List.add(p20);
        p1List.add(p20);
        p1List.add(p20);
        p1List.add(p20);
        p1List.add(p20);
        p1List.add(p20);
        p1List.add(p20);

        ArrayList<Products> p21List = new ArrayList<Products>();
        p1List.add(p21);
        p1List.add(p21);
        p1List.add(p21);
        p1List.add(p21);
        p1List.add(p21);
        p1List.add(p21);
        p1List.add(p21);
        p1List.add(p21);
        p1List.add(p21);
        p1List.add(p21);

        ArrayList<Products> p22List = new ArrayList<Products>();
        p1List.add(p22);
        p1List.add(p22);
        p1List.add(p22);
        p1List.add(p22);
        p1List.add(p22);
        p1List.add(p22);
        p1List.add(p22);
        p1List.add(p22);
        p1List.add(p22);
        p1List.add(p22);

        ArrayList<Products> p23List = new ArrayList<Products>();
        p1List.add(p23);
        p1List.add(p23);
        p1List.add(p23);
        p1List.add(p23);
        p1List.add(p23);
        p1List.add(p23);
        p1List.add(p23);
        p1List.add(p23);
        p1List.add(p23);
        p1List.add(p23);

        ArrayList<Products> p24List = new ArrayList<Products>();
        p1List.add(p24);
        p1List.add(p24);
        p1List.add(p24);
        p1List.add(p24);
        p1List.add(p24);
        p1List.add(p24);
        p1List.add(p24);
        p1List.add(p24);
        p1List.add(p24);
        p1List.add(p24);

        ArrayList<Products> p25List = new ArrayList<Products>();
        p1List.add(p25);
        p1List.add(p25);
        p1List.add(p25);
        p1List.add(p25);
        p1List.add(p25);
        p1List.add(p25);
        p1List.add(p25);
        p1List.add(p25);
        p1List.add(p25);
        p1List.add(p25);

        //Array list of products for each canned drink product

        ArrayList<Products> p26List = new ArrayList<Products>();
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);
        p1List.add(p26);

        ArrayList<Products> p27List = new ArrayList<Products>();
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);
        p1List.add(p27);

        ArrayList<Products> p28List = new ArrayList<Products>();
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);
        p1List.add(p28);

        ArrayList<Products> p29List = new ArrayList<Products>();
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);
        p1List.add(p29);

        ArrayList<Products> p30List = new ArrayList<Products>();
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);
        p1List.add(p30);

        ArrayList<Products> p31List = new ArrayList<Products>();
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);
        p1List.add(p31);

        ArrayList<Products> p32List = new ArrayList<Products>();
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);
        p1List.add(p32);

        ArrayList<Products> p33List = new ArrayList<Products>();
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);
        p1List.add(p33);

        ArrayList<Products> p34List = new ArrayList<Products>();
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);
        p1List.add(p34);

        ArrayList<Products> p35List = new ArrayList<Products>();
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);
        p1List.add(p35);

        ArrayList<Products> p36List = new ArrayList<Products>();
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);
        p1List.add(p36);

        ArrayList<Products> p37List = new ArrayList<Products>();
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);
        p1List.add(p37);

        ArrayList<Products> p38List = new ArrayList<Products>();
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);
        p1List.add(p38);

        ArrayList<Products> p39List = new ArrayList<Products>();
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);
        p1List.add(p39);

        ArrayList<Products> p40List = new ArrayList<Products>();
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);
        p1List.add(p40);

        ArrayList<Products> p41List = new ArrayList<Products>();
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);
        p1List.add(p41);

        ArrayList<Products> p42List = new ArrayList<Products>();
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);
        p1List.add(p42);

        ArrayList<Products> p43List = new ArrayList<Products>();
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);
        p1List.add(p43);

        //Array list of products for each bottled drink product

        ArrayList<Products> p44List = new ArrayList<Products>();
        p1List.add(p44);
        p1List.add(p44);
        p1List.add(p44);
        p1List.add(p44);
        p1List.add(p44);
        p1List.add(p44);
        p1List.add(p44);
        p1List.add(p44);

        ArrayList<Products> p45List = new ArrayList<Products>();
        p1List.add(p45);
        p1List.add(p45);
        p1List.add(p45);
        p1List.add(p45);
        p1List.add(p45);
        p1List.add(p45);
        p1List.add(p45);
        p1List.add(p45);

        ArrayList<Products> p46List = new ArrayList<Products>();
        p1List.add(p46);
        p1List.add(p46);
        p1List.add(p46);
        p1List.add(p46);
        p1List.add(p46);
        p1List.add(p46);
        p1List.add(p46);
        p1List.add(p46);

        ArrayList<Products> p47List = new ArrayList<Products>();
        p1List.add(p47);
        p1List.add(p47);
        p1List.add(p47);
        p1List.add(p47);
        p1List.add(p47);
        p1List.add(p47);
        p1List.add(p47);
        p1List.add(p47);

        ArrayList<Products> p48List = new ArrayList<Products>();
        p1List.add(p48);
        p1List.add(p48);
        p1List.add(p48);
        p1List.add(p48);
        p1List.add(p48);
        p1List.add(p48);
        p1List.add(p48);
        p1List.add(p48);

        ArrayList<Products> p49List = new ArrayList<Products>();
        p1List.add(p49);
        p1List.add(p49);
        p1List.add(p49);
        p1List.add(p49);
        p1List.add(p49);
        p1List.add(p49);
        p1List.add(p49);
        p1List.add(p49);

        ArrayList<Products> p50List = new ArrayList<Products>();
        p1List.add(p50);
        p1List.add(p50);
        p1List.add(p50);
        p1List.add(p50);
        p1List.add(p50);
        p1List.add(p50);
        p1List.add(p50);
        p1List.add(p50);

        ArrayList<Products> p51List = new ArrayList<Products>();
        p1List.add(p51);
        p1List.add(p51);
        p1List.add(p51);
        p1List.add(p51);
        p1List.add(p51);
        p1List.add(p51);
        p1List.add(p51);
        p1List.add(p51);

        ArrayList<Products> p52List = new ArrayList<Products>();
        p1List.add(p52);
        p1List.add(p52);
        p1List.add(p52);
        p1List.add(p52);
        p1List.add(p52);
        p1List.add(p52);
        p1List.add(p52);
        p1List.add(p52);

        ArrayList<Products> p53List = new ArrayList<Products>();
        p1List.add(p53);
        p1List.add(p53);
        p1List.add(p53);
        p1List.add(p53);
        p1List.add(p53);
        p1List.add(p53);
        p1List.add(p53);
        p1List.add(p53);

        //Snack Machine HashMap

        Map<String, ArrayList<Products>> snackMachine = new HashMap<String, ArrayList<Products>>();
        snackMachine.put("Kit Kat", p1List);
        snackMachine.put("Reese's", p2List);
        snackMachine.put("Baby Ruth", p3List);
        snackMachine.put("Butterfingers", p4List);
        snackMachine.put("Skittles", p5List);
        snackMachine.put("Twix", p6List);
        snackMachine.put("Paydays", p7List);
        snackMachine.put("Starburst", p8List);
        snackMachine.put("Milky Way", p9List);
        snackMachine.put("M & M's", p10List);
        snackMachine.put("Nacho Cheese Doritos", p11List);
        snackMachine.put("Spicy Nacho Doritos", p12List);
        snackMachine.put("Cool Ranch Doritos", p13List);
        snackMachine.put("Sour Cream & Onion Chips", p14List);
        snackMachine.put("BBQ Chips", p15List);
        snackMachine.put("Salt and Vinegar Chips", p16List);
        snackMachine.put("Fritos", p17List);
        snackMachine.put("Peanut Butter Crackers", p18List);
        snackMachine.put("Cheddar Cheese Crackers", p19List);
        snackMachine.put("Butterscotch Krimpets", p20List);
        snackMachine.put("Jelly Krimpets", p21List);
        snackMachine.put("Chocolate Cupcakes", p22List);
        snackMachine.put("Coffee Cakes", p23List);
        snackMachine.put("Kandy Cakes", p24List);
        snackMachine.put("Honey Roasted Peanuts", p25List);

        //Drink Machine HashMap
        Map<String, ArrayList<Products>> drinkMachine = new HashMap<String, ArrayList<Products>>();
        drinkMachine.put("Lemonade", p26List);
        drinkMachine.put("Coke", p27List);
        drinkMachine.put("Root Beer", p28List);
        drinkMachine.put("Pepsi", p29List);
        drinkMachine.put("Orange Fanta", p30List);
        drinkMachine.put("Strawberry Fanta", p31List);
        drinkMachine.put("Raspberry Fanta", p32List);
        drinkMachine.put("Mango Fanta", p33List);
        drinkMachine.put("Brisk Ice Tea", p34List);
        drinkMachine.put("Brisk Raspberry Tea", p35List);
        drinkMachine.put("Chocolate Yoo-hoo", p36List);
        drinkMachine.put("Dr. Pepper", p37List);
        drinkMachine.put("Sprite", p38List);
        drinkMachine.put("Dr. Sprite", p39List);
        drinkMachine.put("Hawaiian Fruit Punch", p40List);
        drinkMachine.put("Mountain Dew", p41List);
        drinkMachine.put("Cream Soda", p42List);
        drinkMachine.put("Birch beer", p43List);
        drinkMachine.put("Cool Rush Gatorade", p44List);
        drinkMachine.put("Glacier Gatorade", p45List);
        drinkMachine.put("Orange Gatorade", p46List);
        drinkMachine.put("Melon Gatorade", p47List);
        drinkMachine.put("Mucho Mango Arizona", p48List);
        drinkMachine.put("Fruit Punch Arizona", p49List);
        drinkMachine.put("Half and Half Arizona", p50List);
        drinkMachine.put("Strawberry Kiwi Mystic", p51List);
        drinkMachine.put("Minute Maid Apple Juice", p52List);
        drinkMachine.put("Water", p53List);


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 for Snack Machine and 2 for Drink Machine: ");
        int machineType = scan.nextInt();

        if (machineType == 1) {
            System.out.println(VendingMachine.companyName);
            System.out.println("You have entered Snack Machine");

            //print out snack hashmap here

            System.out.println("Please enter 1 to 25 for the snack you would like to purchase");
            int snack = scan.nextInt();
            switch (snack) {

                case 1:
                    System.out.println("You have selected " + p1.getNamePrice());
                    break;

                case 2:
                    System.out.println("You have selected " + p2.getNamePrice());
                    break;

                case 3:
                    System.out.println("You have selected " + p3.getNamePrice());
                    break;

                case 4:
                    System.out.println("You have selected " + p4.getNamePrice());
                    break;

                case 5:
                    System.out.println("You have selected " + p5.getNamePrice());
                    break;

                case 6:
                    System.out.println("You have selected " + p6.getNamePrice());
                    break;

                case 7:
                    System.out.println("You have selected " + p7.getNamePrice());
                    break;

                case 8:
                    System.out.println("You have selected " + p8.getNamePrice());
                    break;

                case 9:
                    System.out.println("You have selected " + p9.getNamePrice());
                    break;

                case 10:
                    System.out.println("You have selected " + p10.getNamePrice());
                    break;

                case 11:
                    System.out.println("You have selected " + p11.getNamePrice());
                    break;

                case 12:
                    System.out.println("You have selected " + p12.getNamePrice());
                    break;

                case 13:
                    System.out.println("You have selected " + p13.getNamePrice());
                    break;

                case 14:
                    System.out.println("You have selected " + p14.getNamePrice());
                    break;

                case 15:
                    System.out.println("You have selected " + p15.getNamePrice());
                    break;

                case 16:
                    System.out.println("You have selected " + p16.getNamePrice());
                    break;

                case 17:
                    System.out.println("You have selected " + p17.getNamePrice());
                    break;

                case 18:
                    System.out.println("You have selected " + p18.getNamePrice());
                    break;

                case 19:
                    System.out.println("You have selected " + p19.getNamePrice());
                    break;

                case 20:
                    System.out.println("You have selected " + p20.getNamePrice());
                    break;

                case 21:
                    System.out.println("You have selected " + p21.getNamePrice());
                    break;

                case 22:
                    System.out.println("You have selected " + p22.getNamePrice());
                    break;

                case 23:
                    System.out.println("You have selected " + p23.getNamePrice());
                    break;

                case 24:
                    System.out.println("You have selected " + p24.getNamePrice());
                    break;

                case 25:
                    System.out.println("You have selected " + p25.getNamePrice());
                    break;
                    


            }

        } else if (machineType == 2) {

            System.out.println(VendingMachine.companyName);
            System.out.println("You have entered Drink Machine");

            //print out drink hashmap here

            System.out.println("Please enter 1 to 28 for the drink you would like to purchase");
            int snack = scan.nextInt();
            switch (snack) {

                case 1:
                    System.out.println("You have selected " + p26.getNamePrice());
                    break;

                case 2:
                    System.out.println("You have selected " + p27.getNamePrice());
                    break;

                case 3:
                    System.out.println("You have selected " + p28.getNamePrice());
                    break;

                case 4:
                    System.out.println("You have selected " + p29.getNamePrice());
                    break;

                case 5:
                    System.out.println("You have selected " + p30.getNamePrice());
                    break;

                case 6:
                    System.out.println("You have selected " + p31.getNamePrice());
                    break;

                case 7:
                    System.out.println("You have selected " + p32.getNamePrice());
                    break;

                case 8:
                    System.out.println("You have selected " + p33.getNamePrice());
                    break;

                case 9:
                    System.out.println("You have selected " + p34.getNamePrice());
                    break;

                case 10:
                    System.out.println("You have selected " + p35.getNamePrice());
                    break;

                case 11:
                    System.out.println("You have selected " + p36.getNamePrice());
                    break;

                case 12:
                    System.out.println("You have selected " + p37.getNamePrice());
                    break;

                case 13:
                    System.out.println("You have selected " + p38.getNamePrice());
                    break;

                case 14:
                    System.out.println("You have selected " + p39.getNamePrice());
                    break;

                case 15:
                    System.out.println("You have selected " + p40.getNamePrice());
                    break;

                case 16:
                    System.out.println("You have selected " + p41.getNamePrice());
                    break;

                case 17:
                    System.out.println("You have selected " + p42.getNamePrice());
                    break;

                case 18:
                    System.out.println("You have selected " + p43.getNamePrice());
                    break;

                case 19:
                    System.out.println("You have selected " + p44.getNamePrice());
                    break;

                case 20:
                    System.out.println("You have selected " + p45.getNamePrice());
                    break;

                case 21:
                    System.out.println("You have selected " + p46.getNamePrice());
                    break;

                case 22:
                    System.out.println("You have selected " + p47.getNamePrice());
                    break;

                case 23:
                    System.out.println("You have selected " + p48.getNamePrice());
                    break;

                case 24:
                    System.out.println("You have selected " + p49.getNamePrice());
                    break;

                case 25:
                    System.out.println("You have selected " + p40.getNamePrice());
                    break;

                case 26:
                    System.out.println("You have selected " + p51.getNamePrice());
                    break;

                case 27:
                    System.out.println("You have selected " + p52.getNamePrice());
                    break;

                case 28:
                    System.out.println("You have selected " + p53.getNamePrice());
                    break;

            }
        }
    }
}

