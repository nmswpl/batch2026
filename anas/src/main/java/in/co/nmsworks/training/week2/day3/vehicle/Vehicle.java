package in.co.nmsworks.training.week2.day3.vehicle;

public class Vehicle {

     public Engine engine = new Engine();
     public int noOfWheels;

     public Vehicle(){}

    public Vehicle(Engine engine, int noOfWheels) {
        this.engine = engine;
        this.noOfWheels = noOfWheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                ", noOfWheels=" + noOfWheels +
                '}';
    }
}

