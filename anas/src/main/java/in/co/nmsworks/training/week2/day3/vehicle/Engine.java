package in.co.nmsworks.training.week2.day3.vehicle;

public class Engine {
    private int cc;
    private String fuelType;

    public Engine(){}

    public Engine(int cc, String fuelType) {
        this.cc = cc;
        this.fuelType = fuelType;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cc=" + cc +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
