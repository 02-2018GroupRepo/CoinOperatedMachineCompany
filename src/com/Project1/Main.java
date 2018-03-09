package com.Project1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Operator smoothOperator = new Operator("Bob", "123");

        SnackMachine my = new SnackMachine(5, 5);
        my.displayInventory();
        System.out.println();

        smoothOperator.getLogFile(my);

    }
}
