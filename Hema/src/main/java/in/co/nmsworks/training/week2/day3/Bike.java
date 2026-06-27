package in.co.nmsworks.training.week2.day3;

public class Bike extends Vehicle{

    private String color;
    private String bikeType;

    public Bike(int id, String name, Engine engine, String color, String bikeType) {
        super(id, name, engine);
        this.color = color;
        this.bikeType = bikeType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", bikeType='" + bikeType + '\'' +
                ", engine=" + engine +
                '}';
    }
}
