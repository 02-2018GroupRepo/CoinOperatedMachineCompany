
public class Product {

    private String name;
    private int id;
    private double price;
    private String description;
    private int qty;


    public Product(int id, String name, String description, double price, int qty) {
        this.id = (int) Math.floor(Math.random() * 1000);
        this.name = name;
        this.price = price;
        this.description = description;
        this.qty = qty;
    }

    public void buy() {
        if (this.qty > 0) {
            this.qty--;
            System.out.println("Enjoy!");
        } else {
            System.out.println("Out of Stock");
        }
    }

    public String getName() {
        return this.name;
    }


    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return "Product: " + getName() + "\n" +
                "Price: " + String.format("$%.2f", getPrice()) + "\n" +
                "-----------------";
    }

    public int getQty() {
        return this.qty;
    }

    public void restock(int qty) {
        this.qty = qty;
    }
}

