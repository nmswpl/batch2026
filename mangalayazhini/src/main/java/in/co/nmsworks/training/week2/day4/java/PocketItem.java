package in.co.nmsworks.training.week2.day4.java;

public class PocketItem {

    private String color;
    private Double price;

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void carry(){
        System.out.println("Items is carried by the Pocket item.");
    }
}
