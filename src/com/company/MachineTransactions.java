package com.company;

public interface MachineTransactions {

    public void loadMachine();

    public void displayVendingMenu();

    public String getProductNameFromCode (String letterIndicator, int i, int j);

    public void coinAndItemExchange (String letterIndicator, int i, int j, double moneyCustomerEntered);



}
