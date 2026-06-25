package in.co.nmsworks.training.week2.day2;

public class Car {
    private int id;
    private String brand;
    private String carName;

    public Car() {
    }

    public Car(int id, String carName, String brand) {
        this.id = id;
        this.carName = carName;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                '}';
    }
}
