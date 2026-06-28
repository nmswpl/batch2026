package in.co.nmsworks.training.week2.day3;

class Bike extends Vehicle {
    private String brand;
    private String model;

    public Bike(int noOfWheels, String colour, Engine engine, String brand, String model) {
        super(noOfWheels, colour, engine);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                "{ " + super.toString() +" }"+
                '}';
    }
}
