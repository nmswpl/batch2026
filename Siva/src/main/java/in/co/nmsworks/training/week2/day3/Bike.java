package in.co.nmsworks.training.week2.day3;

public class Bike extends Vehicle{

    public Bike() {
    }

    public Bike(String color, String name,Integer noOfWheels,FuelType fuelType,Integer cc) {
        setColor(color);
        setName(name);
        setNumberOfWheels(noOfWheels);
        Engine engine = new Engine(fuelType,cc);
        setEngine(engine);
    }
}
