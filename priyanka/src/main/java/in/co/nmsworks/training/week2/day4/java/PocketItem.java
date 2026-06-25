package in.co.nmsworks.training.week2.day4.java;

public class PocketItem {
    public String color = "browm";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void carry(){
        System.out.println("Putting the " + color + " wallet in your pocket...");
    }
}
