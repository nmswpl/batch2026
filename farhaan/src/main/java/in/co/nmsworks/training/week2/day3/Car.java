package in.co.nmsworks.training.week2.day3;

public class Car extends Vehicle{
    public String manufacturer;

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                '}';
    }
}
