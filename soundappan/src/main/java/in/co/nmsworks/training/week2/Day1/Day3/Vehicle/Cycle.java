package in.co.nmsworks.training.week2.Day1.Day3.Vehicle;

public class Cycle extends Vehicle {
    private Integer no_wheels;
    private String type;

    public Integer getNo_wheels() {
        return no_wheels;
    }

    public void setNo_wheels(Integer no_wheels) {
        this.no_wheels = no_wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = type;
    }

    public Cycle(Integer id, FuelType fuel, Engine engine, Integer no_wheels, String type) {
        super(id, fuel, engine);
        this.no_wheels = no_wheels;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "id=" + getId() +
                ", fuel=" + getFuel() +
                ", engine=" + getEngine() +
                ", noOfWheels=" + no_wheels +
                ", type='" + type + '\'' +
                '}';
    }
}
