package in.co.nmsworks.training.week2.day3;

public class Vehicle {

    private float price;
    private String companyName ;
    private String model ;
    private Engine vehicleEngine;


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getVehicleEngine() {
        return vehicleEngine;
    }

    public void setVehicleEngine(Engine vehicleEngine) {
        this.vehicleEngine = vehicleEngine;
    }

    public void printVehicleDetails(){

        System.out.println("Company  : " + companyName);
        System.out.println("Model : " + model);
        System.out.println("price : " + price);
    }

    public void seatingCapacity(){

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", companyName='" + companyName + '\'' +
                ", model='" + model + '\'' +
                ", vehicleEngine=" + vehicleEngine +
                '}';
    }
}
