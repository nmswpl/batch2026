package in.co.nmsworks.training.week2.Day3.Vehicle;

public class Bike extends Vehicle{
    private String brand;
    private String color;
    private int tyre;
    private Engine bikeEngine;

    public Bike(String brand, String color, int tyre, String fuelType,int cc ) {
        this.brand = brand;
        this.color = color;
        this.tyre = tyre;
        setEngine(new Engine(fuelType,cc));
    }

}
