package in.co.nmsworks.training.week2.day3.vehicle;

public class Bike extends Vehicle{

    private  String color;
    private int noOfWheels;

    public Bike(String color, int noOfWheels) {
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
    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", noOfWheels=" + noOfWheels + " "+
                super.toString()+
                '}';
    }

}
