package in.co.nmsworks.training.week2.day3;

public class Bike extends Vehicle {
    private String model;


    public Bike(Integer vehicleNo, String name, Engine engine, String model) {
        super(vehicleNo, name, engine);
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' + super.toString() +
                '}';
    }
}
