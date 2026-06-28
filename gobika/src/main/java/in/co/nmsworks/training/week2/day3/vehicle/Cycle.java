package in.co.nmsworks.training.week2.day3.vehicle;

public class Cycle extends  Vehicle{
    private  String color;
    private int noOfWheels;

    public Cycle(String color, int noOfWheels) {
        this.color = color;
        this.noOfWheels = noOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

}
