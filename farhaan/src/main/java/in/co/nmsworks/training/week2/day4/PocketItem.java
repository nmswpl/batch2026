package in.co.nmsworks.training.week2.day4;

public class PocketItem {
    public String color;
    public void carry(){
        System.out.println("Putting the "+ getColor() + " Into Your Pocket");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PocketItem(String color) {
        this.color = color;
    }
}
