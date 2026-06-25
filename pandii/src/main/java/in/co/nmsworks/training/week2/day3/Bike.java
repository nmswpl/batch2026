package in.co.nmsworks.training.week2.day3;

public class Bike extends Vehicle {

    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Bike(String model, String color) {
        this.model = model;
        this.color = color;
    }

}
