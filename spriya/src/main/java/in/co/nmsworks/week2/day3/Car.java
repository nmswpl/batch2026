package in.co.nmsworks.week2.day3;

public class Car extends Vehicle {

    private String manufacturer;
    private Engine engine;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", engine=" + engine +
                '}';
    }
}