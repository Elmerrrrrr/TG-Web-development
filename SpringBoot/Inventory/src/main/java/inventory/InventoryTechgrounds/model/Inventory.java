package inventory.InventoryTechgrounds.model;

public class Inventory {

    private String id;
    private String brand;
    private String model;
    private int price;




    public Inventory(String id, String brand, String model, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getId() {return id; }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
