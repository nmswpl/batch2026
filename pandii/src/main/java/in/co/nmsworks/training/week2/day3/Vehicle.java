package in.co.nmsworks.training.week2.day3;

public class Vehicle {
    private String vehicleType;
    private Integer noOfWheels;
    private Engine engine;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(Integer noOfWheels) {
        this.noOfWheels = noOfWheels;
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
                "vehicleType='" + vehicleType + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", engine=" + engine +
                '}';
    }
}
