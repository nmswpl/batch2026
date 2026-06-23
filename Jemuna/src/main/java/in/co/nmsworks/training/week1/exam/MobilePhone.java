package in.co.nmsworks.training.week1.exam;

public class MobilePhone {

    /**Create five MobilePhone (Phone ID, Brand, Model, Price) objects by providing the required details. Display the attributes of each phone in the following format:

     ID = 201
     Brand = Samsung
     Model = Galaxy S24
     Price = 79999.0**/

    private int id;
    private String brand;
    private String model;
    private Double price;


    public MobilePhone(){

    }

    public MobilePhone(int id, String brand, String model, Double price) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void printMobileDetails() {
        System.out.println("Printing the Mobile Phone Details");
        System.out.println("ID = "+getId());
        System.out.println("Brand = "+getBrand());
        System.out.println("Model = "+getModel());
        System.out.println("Price = "+getPrice());
    }
}
