package in.co.nmsworks.training.week2.day3;

public class Car extends Vehicle {
    private String carModel;
    private Integer carPrice;

    public Car() {
    }

    public Car(int noOfWheels, String colour, Engine engine, String carModel, Integer carPrice) {
        super(noOfWheels, colour, engine);
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
