package in.co.nmsworks.training.week2.Day3.Vehicle;

public class Vehicle extends Engine {
    private int id;
    private String brand;
    private String color;
    private int tyre;
    private Engine engine;

    public Vehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", tyre=" + tyre +
                ", engine=" + engine +
                '}';
    }
}
