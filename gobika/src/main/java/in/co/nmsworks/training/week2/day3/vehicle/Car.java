package in.co.nmsworks.training.week2.day3.vehicle;

public class Car extends Vehicle{

    private  String color;
    private int noOfWheels;

    public Car(String color, int noOfWheels) {
        this.color = color;
        this.noOfWheels = noOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", engine=" + getEngine() +
                '}';
    }




}
