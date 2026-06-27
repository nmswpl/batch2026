package in.co.nmsworks.training.week2.day3;

public class Car extends Vehicle{

    private int noOfSeats;

    public Car(int id, String name, Engine engine, int noOfSeats) {
        super(id, name, engine);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfSeats=" + noOfSeats +
                ", engine=" + engine +
                '}';
    }
}
