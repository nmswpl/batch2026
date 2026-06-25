package in.co.nmsworks.training.week2.day3;

public class Bike extends Vehicle {
    private int bikeId;
    private String name;
    private String color;

    public Bike(int bikeId, String name, String color, Engine engine) {
        this.bikeId = bikeId;
        this.name = name;
        this.color = color;
        this.setEngine(engine);
    }

    public int getBikeId() {
        return bikeId;
    }

    public void setBikeId(int bikeId) {
        this.bikeId = bikeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + getEngine() + '\'' +
                '}';
    }
}
