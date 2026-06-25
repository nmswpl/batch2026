package in.co.nmsworks.training.week2.day3.vehicle;

public class Bike extends Vehicle {

    public String color;

    public Bike(){}

    public Bike(Engine engine, int noOfWheels, String color) {
        super(engine, noOfWheels);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
