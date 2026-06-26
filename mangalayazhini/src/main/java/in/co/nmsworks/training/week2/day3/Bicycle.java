package in.co.nmsworks.training.week2.day3;

public class Bicycle extends Vehicle{

    public Bicycle(String companyName, String model, float price) {
        setPrice(price);
        setModel(model);
        setCompanyName(companyName);
        setPrice(price);

        Engine cycleEngine = null;
        setVehicleEngine(cycleEngine);
    }

    public void seatingCapacity(){
        System.out.println("Bicycle has maximum seating capacity of one");
    }

}
