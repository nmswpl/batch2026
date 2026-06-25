package in.co.nmsworks.training.week2.day3;

public class Car extends Vehicle{
    private int carId;
    private String name;
    private String color;

    public Car(int carId, String name, String color, Engine engine) {
        this.carId = carId;
        this.name = name;
        this.color = color;
        setEngine(engine);
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
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
        return "Car{" +
                "carId=" + carId +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + getEngine() + '\'' +
                '}';
    }
}
