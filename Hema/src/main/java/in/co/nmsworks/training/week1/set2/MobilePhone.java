package in.co.nmsworks.training.week1.set2;

public class MobilePhone {
    private int id;
    private String brand;
    private String model;
    private double price;

    public MobilePhone(int id, String brand, String model, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display()
    {
        System.out.println("ID = "+this.id);
        System.out.println("Brand = "+this.brand);
        System.out.println("Model = "+this.model);
        System.out.println("Price = "+this.price);
        System.out.println();
    }

}
