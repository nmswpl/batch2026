package in.co.nmsworks.training.week2.day3;

public class Vehicle {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                '}';
    }
}
