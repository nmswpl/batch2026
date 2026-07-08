package in.co.nmsworks.training.week2.day3;

public class Engine {
    private String fuelType;
    private int cc;

    public Engine() {
    }

    public Engine(int cc, String fuleType) {
        this.cc = cc;
        this.fuelType = fuleType;
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
                "fuelType='" + fuelType + '\'' +
                ", cc=" + cc +
                '}';
    }
}

