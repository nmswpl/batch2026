package in.co.nmsworks.training.week3.day2;

public class Planet {
    private Integer id;
    private String name;
    private Integer size;
    private String color;
    private Integer noOfMoons;

    public Planet() {
    }

    public Planet(Integer id, String name, Integer size, String color, Integer noOfMoons) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.color = color;
        this.noOfMoons = noOfMoons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", noOfMoons=" + noOfMoons +
                '}';
    }
}
