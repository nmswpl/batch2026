package in.co.nmsworks.training.week2.day4;

public class PocketItem {
    String color;



    void carry(){
        System.out.println("Putting the " +color+ " wallet into your pocket...");
    }


    public PocketItem() {
    }

    public PocketItem(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "PocketItem{" +
                "color='" + color + '\'' +
                '}';
    }
}
