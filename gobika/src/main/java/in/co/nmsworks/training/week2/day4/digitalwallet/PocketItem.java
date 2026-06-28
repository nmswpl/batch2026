package in.co.nmsworks.training.week2.day4.digitalwallet;

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
    public  void  carry(){
        System.out.println("Item placed");
    }
}
