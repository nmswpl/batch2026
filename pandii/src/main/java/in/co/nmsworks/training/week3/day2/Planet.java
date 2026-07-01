package in.co.nmsworks.training.week3.day2;

public class Planet {
    private String name;
    private Integer diameter;
    private String color;
    private Integer noOfMoons;

    public Planet() {
    }

    public Planet(String name, Integer diameter, String color, Integer noOfMoons) {
        this.name = name;
        this.diameter = diameter;
        this.color = color;
        this.noOfMoons = noOfMoons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
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
                ", diameter=" + diameter +
                ", color='" + color + '\'' +
                ", noOfMoons=" + noOfMoons +
                '}';
    }
}
