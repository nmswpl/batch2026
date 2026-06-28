package in.co.nmsworks.training.week2.day3.vehicle;

public class Vehicle {


    private Engine engine = new Engine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "engine=" + engine +
                '}';
    }
}
