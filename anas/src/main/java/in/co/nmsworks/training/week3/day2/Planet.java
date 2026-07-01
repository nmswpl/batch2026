package in.co.nmsworks.training.week3.day2;

public class Planet {
    String name;
    Integer diaInMiles;
    String color;
    Integer numOfMoons;

    public Planet(String name, Integer diaInMiles, String color, Integer numOfMoons) {
        this.name = name;
        this.diaInMiles = diaInMiles;
        this.color = color;
        this.numOfMoons = numOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", diaInMiles=" + diaInMiles +
                ", color='" + color + '\'' +
                ", numOfMoons=" + numOfMoons +
                '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumOfMoons() {
        return numOfMoons;
    }

    public void setNumOfMoons(Integer numOfMoons) {
        this.numOfMoons = numOfMoons;
    }
}
