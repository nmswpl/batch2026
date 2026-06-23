package in.co.nmsworks.training.week1.exam;

public class Phone{


    private int phoneId;
    private String brand;
    private String model;
    private double price;
    public Phone() {
    }

    public Phone(int id, String brand, String model, double price) {
        this.phoneId = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
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



}
