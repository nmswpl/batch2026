package in.co.nmsworks.training.week2.day3;

public class Engine {
    private int id;
    private int cc;
    private String fuelType;

    public Engine(int id, int cc, String fuelType) {
        this.id = id;
        this.cc = cc;
        this.fuelType = fuelType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", cc=" + cc +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}

