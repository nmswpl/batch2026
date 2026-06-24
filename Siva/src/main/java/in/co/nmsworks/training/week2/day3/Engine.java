package in.co.nmsworks.training.week2.day3;

public class Engine {
    private FuelType fuelType;
    private Integer cc;

    public Engine() {
    }

    public Engine(FuelType fuelType, Integer cc) {
        this.fuelType = fuelType;
        this.cc = cc;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType=" + fuelType +
                ", cc=" + cc +
                '}';
    }
}
