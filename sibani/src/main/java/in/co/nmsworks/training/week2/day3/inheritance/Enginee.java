package in.co.nmsworks.training.week2.day3.inheritance;

public class Enginee {
    private Integer cc;
    private String fuelType;

    public Enginee() {
    }

    public Enginee(Integer cc, String fuelType) {
        this.cc = cc;
        this.fuelType = fuelType;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
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
        return "Enginee{" +
                "cc=" + cc +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
