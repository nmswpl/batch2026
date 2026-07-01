package in.co.nmsworks.training.week3.day2;

public class Planet {
    private String name;
    private Integer size;
    private String color;
    private Integer moons;

    public Planet(String name, Integer size, String color, Integer moons) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.moons = moons;
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

    public Integer getMoons() {
        return moons;
    }

    public void setMoons(Integer moons) {
        this.moons = moons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", moons=" + moons +
                '}';
    }
}
