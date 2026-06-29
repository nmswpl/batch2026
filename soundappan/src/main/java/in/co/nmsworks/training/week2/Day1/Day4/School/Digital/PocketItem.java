package in.co.nmsworks.training.week2.Day1.Day4.School.Digital;

public class PocketItem extends DigitalWallet{
    public PocketItem(Coin coin, String color) {
        super(coin);
        this.color = color;
    }

    @Override
    public String toString() {
        return "PocketItem{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void carry(){
        System.out.println("Putting the "+this.color+" Wallent into your pocket");
    }

    private String color;

}
