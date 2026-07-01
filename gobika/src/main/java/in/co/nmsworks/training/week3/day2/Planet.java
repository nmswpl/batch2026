package in.co.nmsworks.training.week3.day2;

import java.util.List;

public class Planet {

    private String name;
    private Integer size;
    private String color;
    private Integer noOfMoons;

    public Planet() {
    }

    public Planet(String name, Integer size, String color, Integer noOfMoons) {
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

    public Integer getNoOfMoons() {
        return noOfMoons;
    }

    public void setNoOfMoons(Integer noOfMoons) {
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
