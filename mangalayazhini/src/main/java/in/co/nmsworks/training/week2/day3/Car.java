package in.co.nmsworks.training.week2.day3;

public class Car extends Vehicle {

    public Car(String companyName, String model, float price, String fuelType, int cc) {
        setPrice(price);
        setModel(model);
        setCompanyName(companyName);
        setPrice(price);


        Engine carEngine = new Engine(fuelType,cc);
        setVehicleEngine(carEngine);
    }


    public void seatingCapacity(){
        System.out.println("Car has maximum seating capacity of eight");
    }


}
