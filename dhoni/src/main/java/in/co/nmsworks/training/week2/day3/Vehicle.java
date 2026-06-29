package in.co.nmsworks.training.week2.day3;


public class Vehicle {
    private boolean hasEngine;
    private Engine engine;

    public Vehicle(boolean hasEngine, Engine engine) {
        this.hasEngine = hasEngine;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "hasEngine=" + hasEngine +
                ", engine=" + engine +
                '}';
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}


class Engine{
    private Integer cc;
    private FuelType fuelType;

    public Engine(Integer cc, FuelType fuelType) {
        this.cc = cc;
        this.fuelType = fuelType;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public FuelType getFullType() {
        return fuelType;
    }

    public void setFullType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cc=" + cc +
                ", fullType=" + fuelType +
                '}';
    }
}

class Car extends Vehicle{
    private String brand;
    private int noOfWheels;

    public Car(boolean hasEngine, Engine engine, String brand, int noOfWheel) {
        super(hasEngine, engine);
        this.brand = brand;
        this.noOfWheels = noOfWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", noOfWheels=" + noOfWheels +
                '}';
    }
}

class Bike extends Vehicle{
    private String color;
    private int noOfWheels;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public Bike(boolean hasEngine, Engine engine, String color, int noOfWheels) {
        super(hasEngine, engine);
        this.color = color;
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", noOfwheels=" + noOfWheels +
                '}';
    }
}