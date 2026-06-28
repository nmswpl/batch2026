package in.co.nmsworks.training.week2.day4;

public class PocketItem {
    private String colour;

    public PocketItem() {
    }

    public PocketItem(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void carry(){
        System.out.println("Putting the Brown wallet into your pocket...");
    }
}
