package in.co.nmsworks.week2.day3;

public class Bike extends Vehicle {

    private String color;
    private Engine engine;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}