package in.co.nmsworks.training.week2.Day3.Inheritance;

public class Vehicle {
    private Engine engine;
    private Integer numberofWheels;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Integer getNumberofWheels() {
        return numberofWheels;
    }

    public void setNumberofWheels(Integer numberofWheels) {
        this.numberofWheels = numberofWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +'\'' +
                "engine=" + engine +'\'' +
                ", numberofWheels=" + numberofWheels +'\'' +
                '}';
    }
}
