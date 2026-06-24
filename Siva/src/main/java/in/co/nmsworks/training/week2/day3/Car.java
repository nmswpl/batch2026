package in.co.nmsworks.training.week2.day3;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String color, String name,Integer noOfWheels,FuelType fuelType,Integer cc) {
        setColor(color);
        setName(name);
        setNumberOfWheels(noOfWheels);
        Engine engine = new Engine(fuelType,cc);
        setEngine(engine);
    }


}
