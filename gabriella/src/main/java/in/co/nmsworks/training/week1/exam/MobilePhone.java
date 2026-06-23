package in.co.nmsworks.training.week1.exam;

public class MobilePhone {
    private int phoneId;
    private String brand;
    private String model;
    private double price;

    MobilePhone(int phoneId, String brand, String model, double price){
        this.phoneId = phoneId;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneID(int phoneId){
        this.phoneId = phoneId;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void printAttributes(){
        System.out.println("ID = " + phoneId);
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Price = " + price);
        System.out.println(" ");
    }
}
