package in.co.nmsworks.training.week2.Day3.Inheritance;


public class Engine{
    private String fuelType;
    private int cc;

    public Engine(String fuelType, int cc) {
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
        return "Engine{" + '\'' +
                "fuelType='" + fuelType + '\'' +
                ", cc=" + cc +'\'' +
                '}';
    }
}
