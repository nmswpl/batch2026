package in.co.nmsworks.training.week2.day3;

public class Bicycle extends Vehicle{
    public Bicycle() {
    }
    public Bicycle(String color, String name,Integer noOfWheels) {
        setColor(color);
        setName(name);
        setNumberOfWheels(noOfWheels);
        setEngine(null);
    }

}
