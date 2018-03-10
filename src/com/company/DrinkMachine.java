package com.company;

public class DrinkMachine extends VendingMachine {

    public DrinkMachine (String location) {
        this.location = location;
        this.rows = 5;
        this.columns = 6;
        this.spacePerCompartment = 12;
        this.storageArray = new Product[this.rows][this.columns][this.spacePerCompartment];
    }

    @Override
    public String stockProduct(Product product, int quantity, int row, int column) {
        boolean isRowUnavailable = row > 2 ? true : false;
        boolean isColumnUnavailable = column == 4 ? true : false;
        boolean isCan = ((Drink) product).isCan();

        if (isRowUnavailable && isColumnUnavailable) {
            return "This space is unavailable";
        } else if (isRowUnavailable && quantity > 8) {
            return "This space can only hold 8 items";
        } else if (!isCan && row < 3) {
            return "Bottles must be placed on the bottom 2 rows";
        } else if (isCan && row > 2) {
            return "Cans must be placed on the top 2 rows";
        } else {
            return super.stockProduct(product, quantity, row, column);
        }
    }
}
