package com.company;

public class Main {

    public static void main(String[] args) {

        Snack snickers = new Snack("1231232", "snickers", "test", 2.00, 2.00);
        Snack reeses = new Snack("1231232", "reeses", "test", 2.00, 2.00);
        Snack donut = new Snack("1231232", "donut", "test", 2.00, 2.00);
        Snack snickers2 = new Snack("1231232", "snickers2", "test", 2.00, 2.00);
        Snack snickers3 = new Snack("1231232", "snickers3", "test", 2.00, 2.00);
        Snack snickers4 = new Snack("1231232", "snickers4", "test", 2.00, 2.00);
        Snack snickers5 = new Snack("1231232", "snickers5", "test", 2.00, 2.00);
        Drink pepsi = new Drink("1231232", "snickers5", "test", 2.00, 2.00, true);

        SnackMachine snackMachine = new SnackMachine("test");

        System.out.println(snackMachine.stockProduct(snickers, 10, 0, 0));

        snackMachine.stockProduct(snickers, 10, 0, 0);
        snackMachine.stockProduct(snickers2, 5, 0, 1);
        snackMachine.stockProduct(snickers3, 3, 2, 2);
        snackMachine.stockProduct(snickers4, 8, 3, 3);
        snackMachine.stockProduct(snickers5, 9, 0, 4);
        snackMachine.stockProduct(reeses, 2, 2, 4);
        snackMachine.stockProduct(pepsi, 10, 0, 0);





    }


}
