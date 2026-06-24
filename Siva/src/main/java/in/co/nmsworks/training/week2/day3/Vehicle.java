package in.co.nmsworks.training.week2.day3;

public class Vehicle {
    private Engine engine;
    private Integer numberOfWheels;
    private String color;
    private String name;



    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                ", numberOfWheels=" + numberOfWheels +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
