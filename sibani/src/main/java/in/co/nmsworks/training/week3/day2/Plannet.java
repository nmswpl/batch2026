package in.co.nmsworks.training.week3.day2;

public class Plannet {
    private String name;
    private Integer size;
    private String colour;
    private Integer noOfMoons;

    public Plannet() {
    }

    public Plannet(String name, Integer size, String colour, Integer noOfMoons) {
        this.name = name;
        this.size = size;
        this.colour = colour;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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
                ", colour='" + colour + '\'' +
                ", noOfMoons=" + noOfMoons +
                '}';
    }
}
