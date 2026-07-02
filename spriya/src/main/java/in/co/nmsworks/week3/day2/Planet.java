package in.co.nmsworks.week3.day2;

public class Planet {
    private String name;
    private int size;
    private String color;
    private int noOfMoons;

    public Planet(String name, int size, String color, int noOfMoons) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.noOfMoons = noOfMoons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfMoons() {
        return noOfMoons;
    }

    public void setNoOfMoons(int noOfMoons) {
        this.noOfMoons = noOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", noOfMoons=" + noOfMoons +
                '}';
    }
}
