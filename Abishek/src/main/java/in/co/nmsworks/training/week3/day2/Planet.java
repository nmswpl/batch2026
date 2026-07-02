package in.co.nmsworks.training.week3.day2;

public class Planet {
    private String name;
    private Integer size;
    private String colors;
    private Integer numberOfMoons;

    public Planet() {
    }

    public Planet(String name, Integer size, String colors, Integer numberOfMoons) {
        this.name = name;
        this.size = size;
        this.colors = colors;
        this.numberOfMoons = numberOfMoons;
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

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public Integer getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(Integer numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", colors='" + colors + '\'' +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }
}
