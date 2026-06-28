package in.co.nmsworks.training.week2.day4;

public class PocketItem {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void carry(){
        System.out.println("Item carried is of color: " + color);
    }
}
