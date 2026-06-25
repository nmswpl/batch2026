package in.co.nmsworks.training.week2.day3;

public class Car {
    private String carName;
    private int carNo;
    private String model;

    public Car(String carName, int carNo, String model) {
        this.carName = carName;
        this.carNo = carNo;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carNo=" + carNo +
                ", model='" + model + '\'' +
                '}';
    }
}
