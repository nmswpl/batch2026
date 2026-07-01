package in.co.nmsworks.training.week3.Day2;

public class Planet {
    private String name;
    private int DiameterInMiles;
    private String Color;
    private int NumberOfMoons;

    public Planet() {
    }

    public Planet(String name, int diameterInMiles, String color, int numberOfMoons) {
        this.name = name;
        DiameterInMiles = diameterInMiles;
        Color = color;
        NumberOfMoons = numberOfMoons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiameterInMiles() {
        return DiameterInMiles;
    }

    public void setDiameterInMiles(int diameterInMiles) {
        DiameterInMiles = diameterInMiles;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getNumberOfMoons() {
        return NumberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        NumberOfMoons = numberOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", DiameterInMiles=" + DiameterInMiles +
                ", Color='" + Color + '\'' +
                ", NumberOfMoons=" + NumberOfMoons +
                '}';
    }
}

