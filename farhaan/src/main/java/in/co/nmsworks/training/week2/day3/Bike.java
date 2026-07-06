package in.co.nmsworks.training.week2.day3;

public class Bike extends Vehicle{
    public Engine engine;
    public String model;
    public String colour;

    public Bike(Engine engine, String model, String colour) {
        this.engine = engine;
        this.model = model;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
