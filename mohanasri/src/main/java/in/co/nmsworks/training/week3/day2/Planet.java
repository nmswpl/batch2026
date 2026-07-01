package in.co.nmsworks.training.week3.day2;

public class Planet {
    private String name;
    private Integer diaInMiles;
    private String colour;
    private Integer noOfMoons;



    public Planet(String name, Integer diaInMiles,  String colour, Integer noOfMoons) {
        this.name = name;
        this.diaInMiles = diaInMiles;
        this.colour = colour;
        this.noOfMoons = noOfMoons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiaInMiles() {
        return diaInMiles;
    }

    public void setDiaInMiles(Integer diaInMiles) {
        this.diaInMiles = diaInMiles;
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
                ", diaInMiles=" + diaInMiles +
                ", colour='" + colour + '\'' +
                ", noOfMoons=" + noOfMoons +
                '}';
    }
}
