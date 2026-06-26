package in.co.nmsworks.training.week2.day3;

public class Engine {

    private String fuelType ;
    private int cc ;

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

    public Engine(String fuelType, int cc){
        this.cc = cc ;
        this.fuelType = fuelType ;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", cc=" + cc +
                '}';
    }
}
