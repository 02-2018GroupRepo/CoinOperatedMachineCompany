package CoinOperatedMachine;

public class Compartment {
    private int row;
    private int shelf;
    private int numberOfSpaces;
    private Product product;
    private int quantity;


    public Compartment(int row, int shelf, int numberOfSpaces) {
        this.row = row;
        this.shelf = shelf;
        this.numberOfSpaces = numberOfSpaces;
        this.quantity=0;

    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRow() {
        return row;
    }

    public int getShelf() {
        return shelf;
    }

    public int getNumberOfSpaces() {
        return numberOfSpaces;
    }


    public void addProducts(Product product, Machine machine, Integer quantity, int shelf, int row) {
        for (Compartment c : machine.getAvailableCompartments()) {
            boolean validShelfRow = false;
            int availableSpaces = 0;
            if (c.getRow() == row && c.getShelf() == shelf) {
                availableSpaces = c.getNumberOfSpaces() - c.getQuantity();
                if (quantity <= availableSpaces) {
                    if (c.getProduct()==null || c.getProduct().equals(product)) {
                        c.setProduct(product);
                        c.setQuantity(quantity);
                    } else {
                        System.out.println("The product doesn't match the existing product in the compartment");
                        System.out.println("This compartment is holding " + c.getProduct());
                    }

                } else {
                    System.out.println("There are only " + availableSpaces + " available spaces");
                }
                validShelfRow = true;
            }
            if (!validShelfRow) {
                System.out.println("invalid shelf and row combination. Please enter a valid shelf and row.");
            }

        }

    }
}
