package in.co.nmsworks.training.week2.day3;

public class Vehicle{

    private int noOfWheels;
    private Engine engine;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfWheels=" + noOfWheels +
                ", engine=" + engine +
                '}';
    }
}



class Engine{
    private String fuelType;
    private int cc;
    public Engine(){

    }

    public Engine(String fuelType, int cc) {
        this.fuelType = fuelType;
        this.cc = cc;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", cc=" + cc +
                '}';
    }
}



class Ccar extends Vehicle{
    private String manufacturer;



    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Ccar{" +
                "manufacturer='" + manufacturer + '\'' +
                '}'+ super.toString();
    }
}



class Bike extends Vehicle{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Bike(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                '}'+ super.toString();
    }


}



class Cycle extends Vehicle{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cycle(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "color='" + color + '\'' +
                '}'+super.toString();
    }
}
