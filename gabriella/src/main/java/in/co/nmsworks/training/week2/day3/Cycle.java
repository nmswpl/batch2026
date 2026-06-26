package in.co.nmsworks.training.week2.day3;

public class Cycle extends Vehicle{
    private String color;

    public Cycle(Integer vehicleNo, String name, String color) {
        super(vehicleNo, name, null);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "color='" + color + '\'' + super.toString() +
                '}';
    }
}
