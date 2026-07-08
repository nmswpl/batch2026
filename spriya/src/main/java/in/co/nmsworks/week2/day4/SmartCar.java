package in.co.nmsworks.week2.day4;

public class SmartCar extends Vehicle {

    private Engine engine;

    public SmartCar() {
        engine = new Engine(); // Initialize the engine
    }

    public void startCar() {
        engine.startEngine();
    }
}