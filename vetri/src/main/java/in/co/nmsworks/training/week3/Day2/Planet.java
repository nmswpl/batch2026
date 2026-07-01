package in.co.nmsworks.training.week3.Day2;

public class Planet {
    private String name;
    private Integer size;
    private String color;
    private Integer NumberOfMoons;

    public Planet() {
    }

    public Planet(String name, Integer size, String color, Integer numberOfMoons) {
        this.name = name;
        this.size = size;
        this.color = color;
        NumberOfMoons = numberOfMoons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumberOfMoons() {
        return NumberOfMoons;
    }

    public void setNumberOfMoons(Integer numberOfMoons) {
        NumberOfMoons = numberOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", NumberOfMoons=" + NumberOfMoons +
                '}';
    }
}
