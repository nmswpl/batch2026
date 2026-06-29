package in.co.nmsworks.training.week2.Day1.Day3.Vehicle;

public class Vehicle {

    private Integer id;
    private FuelType fuel;
    private Engine engine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Vehicle(Integer id, FuelType fuel, Engine engine) {
        this.id = id;
        this.fuel = fuel;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", fuel=" + fuel +
                ", engine=" + engine +
                '}';
    }
}



