package in.co.nmsworks.training.week1.exam;

public class MobilePhone {
    private int id;
    private String brand;
    private String model;
    private double price;

    public MobilePhone() {
    }

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

    public void printDetails(){
        System.out.println("Id: "+this.getId());
        System.out.println("Brand: "+this.getBrand());
        System.out.println("Model: "+this.getModel());
        System.out.println("Price: "+this.getPrice());
    }
}






