package in.co.nmsworks.training.week2.day3;

public class Engine {
    private Integer cc;
    private String fuel;


    public Engine(Integer cc, String fuel) {
        this.cc = cc;
        this.fuel = fuel;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cc=" + cc +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
