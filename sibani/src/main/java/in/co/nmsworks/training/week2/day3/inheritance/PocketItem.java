package in.co.nmsworks.training.week2.day3.inheritance;

public class PocketItem {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void carry() {
        System.out.println("Colour of the wallet : " + color);
    }

    @Override
    public String toString() {
        return "PocketItem{" +
                "color='" + color + '\'' +
                '}';
    }
}
