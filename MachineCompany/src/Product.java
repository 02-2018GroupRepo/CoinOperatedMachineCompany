public class Product {
    private int unique_id;
    private String name;



    private  String description;
    private double wholesale_price;
    private double retail_price;

    public  Product(){}

    public Product(int unique_id,String name,String description,double wholesale_price,double retail_price) {

        this.unique_id = unique_id;
        this.description = description;
        this.wholesale_price = wholesale_price;
        this.name = name;
        this.retail_price = retail_price;
    }

    public String getName() {
        return name;
    }


    public int getUnique_id() {
        return unique_id;
    }

    public String getDescription() {
        return description;
    }

    public double getWholesale_price() {
        return wholesale_price;
    }

    public double getRetail_price() {
        return retail_price;
    }

}
