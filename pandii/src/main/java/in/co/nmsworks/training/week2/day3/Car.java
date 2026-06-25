package in.co.nmsworks.training.week2.day3;

public class Car extends Vehicle{
    private String model;
    private String seatCapacity;

    public Car(String model, String seatCapacity) {
        this.model = model;
        this.seatCapacity = seatCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(String seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
}
