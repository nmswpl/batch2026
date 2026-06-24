package in.co.nmsworks.training.week1.exams;

public class Mobiles {
    private int id;
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Mobiles(int id, String brand, String model, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Mobiles() {
    }

    public void display(){
        System.out.println("ID = "+this.getId());
        System.out.println("Brand = " +this.getBrand());
        System.out.println("Model = "+this.getModel());
        System.out.println("Price = "+this.getPrice());
    }
}

