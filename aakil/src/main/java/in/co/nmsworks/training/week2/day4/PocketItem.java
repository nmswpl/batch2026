package in.co.nmsworks.training.week2.day4;

public class PocketItem {
    private int weight;
    private  String color;

    public PocketItem(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void carry(){
        System.out.println("Putting the " + getColor() + " wallet into your pocket...");
    }
}
