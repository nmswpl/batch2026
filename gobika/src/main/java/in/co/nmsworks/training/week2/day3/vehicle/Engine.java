package in.co.nmsworks.training.week2.day3.vehicle;

public class Engine {

    private String fuelType;
    private int cc;
    public Engine() {
        this.fuelType = fuelType;
        this.cc = cc;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    @Override
    public String toString() {
        return "Engine{" +
                "fueType='" + fuelType + '\'' +
                ", cc=" + cc +
                '}';
    }

}
