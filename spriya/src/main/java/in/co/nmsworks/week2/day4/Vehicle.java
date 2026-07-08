package in.co.nmsworks.week2.day4;

public class Vehicle {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("The vehicle is moving forward.");
    }
}