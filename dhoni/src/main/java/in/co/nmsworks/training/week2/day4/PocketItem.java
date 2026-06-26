package in.co.nmsworks.training.week2.day4;

public class PocketItem {
    private String color;

    public PocketItem(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void carry(){
        System.out.println(" Putting the " + this.color +"Brown wallet into your pocket..." );
    }

    @Override
    public String toString() {
        return "PocketItem{" +
                "color='" + color + '\'' +
                '}';
    }
}
