package in.co.nmsworks.training.week2.day3;

public class Vehicle {
    private int noOfWheels;
    private String colour;
    private Engine engine;

    public Vehicle() {
    }

    public Vehicle(int noOfWheels, String colour, Engine engine) {
        this.noOfWheels = noOfWheels;
        this.colour = colour;
        this.engine = engine;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfWheels=" + noOfWheels +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +

                '}';
    }
}



