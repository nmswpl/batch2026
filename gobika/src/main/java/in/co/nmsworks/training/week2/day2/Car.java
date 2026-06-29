package in.co.nmsworks.training.week2.day2;

public class Car {
    private String carName;

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }

    public Car(String carName) {
        this.carName = carName;
    }

    }

