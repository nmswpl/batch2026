package in.co.nmsworks.training.week2.day3;

public class Vehicle {

    public String colour;
    public Engine engine;

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
        return "Engine :" + engine + "Colour: " + colour;
    }
}
