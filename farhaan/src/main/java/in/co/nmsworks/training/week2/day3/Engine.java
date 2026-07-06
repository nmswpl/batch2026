package in.co.nmsworks.training.week2.day3;

public class Engine {
    public String fuelType;
    public Integer cc;


    public Engine(String fuelType, Integer cc) {
        this.fuelType = fuelType;
        this.cc = cc;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
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
                "fuelType='" + fuelType + '\'' +
                ", cc=" + cc +
                '}';
    }
}
