package in.co.nmsworks.training.week2.day3;

public class Vehicle {
    private Integer vehicleNo;
    private String name;
    private Engine engine;

    public Vehicle(Integer vehicleNo, String name, Engine engine) {
        this.vehicleNo = vehicleNo;
        this.name = name;
        this.engine = engine;
    }

    public Integer getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(Integer vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "vehicleNo=" + vehicleNo +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}

