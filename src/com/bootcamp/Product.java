public class Product {
    private String name;
    private int id;
    private String description;
    private Double wholeSalePrice;
    Double retailPrice;

    public Product(String name, int id, String description, Double wholeSalePrice, Double retailPrice) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getId() {


        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getDescription() {

        return description;
    }


    public void setDescription(String description) {

        this.description = description;
    }


    public Double getWholeSalePrice() {

        return wholeSalePrice;
    }

    public void setWholeSalePrice(Double wholeSalePrice) {

        this.wholeSalePrice = wholeSalePrice;
    }

    public Double getRetailPrice() {

        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {

        this.retailPrice = retailPrice;
    }
}
