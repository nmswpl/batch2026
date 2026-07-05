package in.co.nmsworks.training.Week3.Map.Day2;

public class Planet {
    public Planet(String name, int size, String color, int moons) {
        this.name = name;
        this.size = size;
        this.color = color;
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

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }

    private String name;
    private int size;
    private String color;
    private int moons;
}
