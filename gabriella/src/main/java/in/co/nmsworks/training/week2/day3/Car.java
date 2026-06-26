package in.co.nmsworks.training.week2.day3;

public class Car extends Vehicle{
    private String manufacturer;
    private String color;

    public Car(Integer vehicleNo, String name, Engine engine, String model, String color) {
        super(vehicleNo, name, engine);
        this.manufacturer = model;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' + super.toString() +
                '}';
    }
}
