package in.co.nmsworks.training.week2.Day1.Day3.Vehicle;

public class Bike extends Vehicle {
    private Integer no_Wheel;
    private String model;

    public Integer getNo_Wheel() {
        return no_Wheel;
    }

    public void setNo_Wheel(Integer no_Wheel) {
        this.no_Wheel = no_Wheel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Bike(Integer id, FuelType fuel, Engine engine, Integer no_Wheel, String model) {
        super(id, fuel, engine);
        this.no_Wheel = no_Wheel;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + getId() +
                ", fuel=" + getFuel() +
                ", engine=" + getEngine() +
                ", noOfWheels=" + no_Wheel +
                ", model='" + model + '\'' +
                '}';
    }
}
