package in.co.nmsworks.training.week2.day4;

public class PocketItem {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void carry()
    {
        System.out.println("Putting the "+color+"wallet into pocket...");
    }
}
