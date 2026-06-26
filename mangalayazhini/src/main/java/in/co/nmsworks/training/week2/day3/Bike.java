package in.co.nmsworks.training.week2.day3;

public class Bike extends Vehicle{

    public Bike(String companyName, String model, float price, String fuelType, int cc) {
        setPrice(price);
        setModel(model);
        setCompanyName(companyName);
        setPrice(price);

        Engine bikeEngine = new Engine(fuelType,cc);
        setVehicleEngine(bikeEngine);
    }

    public void seatingCapacity(){
        System.out.println("Bike has maximum seating capacity of two");
    }



}
